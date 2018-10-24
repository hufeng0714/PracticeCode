package com.how2j.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestStreamMultipleExam {

	/**
	 * @param args
	 */
	//复制文件是常见的IO操作，设计如下方法，实现复制源文件srcFile到目标文件destFile
	//复制文件
	public static void copyFile(String srcFile, String destFile){
		try(	BufferedReader br = new BufferedReader(new FileReader(srcFile));
				PrintWriter pw = new PrintWriter(new FileWriter(destFile));){	
			while(true){
				String line = br.readLine();
				if(line == null)
					break;
				pw.write(line);
				System.out.println(line);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	//复制文件夹,实现如下方法，把源文件夹下所有的文件 复制到目标文件夹下(包括子文件夹)
	//复制文件夹
	public static void copyFolder(String srcFolder, String destFolder){
			//文件
			File srcfolder = new File(srcFolder);
			System.out.println("++++++");
			File[] f = srcfolder.listFiles();
			File test = null;
			for(File f1:f){
				if(f1.isFile()){
					copyFile(f1.getAbsolutePath(),new File(destFolder,f1.getName()).getAbsolutePath());
				}
				else{
					test = new File(destFolder,f1.getName());
					System.out.println("test: " + test.getAbsolutePath());
					System.out.println("test is exists? " + test.exists());
					//先创建目录
					if(!test.exists())
						test.mkdirs();
					System.out.println("test is exists? " + test.getAbsolutePath());
					ergodic(f1.getAbsolutePath(),test.getAbsolutePath());
				}
			}
	}
	
	//遍历文件夹
	private static void ergodic(String srcFile, String destFile) {
		File srcfile = new File(srcFile);
		File[] f = srcfile.listFiles();
		File test = null;
		for(File f1:f){
			if(f1.isFile()){
				copyFile(f1.getAbsolutePath(),new File(destFile,f1.getName()).getAbsolutePath());
			}else{
				test = new File(destFile,f1.getName());
				if(!test.exists()){
					test.mkdirs();
					ergodic(f1.getAbsolutePath(),test.getAbsolutePath());
				}
			}
		}
		
	}
	
	
	//复制文件夹--方法2
	
	/**
     * 把源文件夹下所有的文件 复制到目标文件夹下(包括子文件夹)
     * 思路：先创建文件夹，再在文件夹下创建文件
     * @param srcFolder
     * @param destFolder
     */
	public static void copyFolder2(String srcFolder, String destFolder){
		//文件
		File srcF = new File(srcFolder);
		File destF = new File(destFolder);
		//目标目录存在，先删除再创建
		if(destF.exists()){
			//遍历删除文件夹及子目录
			deleteAll(destF);
			destF.mkdirs();
		}else{
			destF.mkdirs();
		}
		//复制源目录内容到目标目录
		
		if(srcF.exists()){
			copyAll(srcF,destF);
		}else{
			System.out.println("源目录不存在，不可以复制！");
		}
}
	
	//遍历删除目录下所有的文件
	private static void deleteAll(File destF) {

		if(destF.exists()){
			for(File f1:destF.listFiles()){
				if(f1.exists()){
					f1.delete();
				}else if(f1.isDirectory()){
					deleteAll(f1);
					f1.delete();
				}
			}
			destF.delete();
		}
	}

	//复制目录下的所有文件和目录的方法
	public static void copyAll(File srcF, File destF){
		
		for(File f:srcF.listFiles()){
			if(f.isDirectory()){
				// 把destF作为父目录创建文件对象
				File newFolder = new File(destF,f.getName());
				newFolder.mkdirs();
				copyAll(f,newFolder);
			}else if(f.isFile()){
				File newFile = new File(destF,f.getName());
				try{
					newFile.createNewFile();
				}catch(IOException  e){
					e.printStackTrace();
				}
				copyFile(f.toString(),newFile.toString());
			}
		}
		
	}
	
//  假设你的项目目录是 e:/project，遍历这个目录下所有的java文件（包括子文件夹），找出文件内容包括 Magic的那些文件，并打印出来。
    public static void search(File folder,String str) {
        for(File each : folder.listFiles()) {   //遍历目标文件夹
            if(each.isDirectory()) {
                search(each,str);
            }
            else {
                if((each.toString()).endsWith(".txt")) {    //如果是.txt文件，搜寻内容
                    File searchFile = new File(each.toString());
                    try(
                            FileReader fr = new FileReader(searchFile);
                            BufferedReader br = new BufferedReader(fr);
                        )
                    {
                        while(true) {
                            String s = br.readLine();
                            if(s == null)
                                break;
                            if(s.contains(str))
                                System.out.println(each.toString());
                        }
                    }
                    catch(IOException e) {
                        e.printStackTrace();
                    }
                }
            }
             
        }
    }

	public static void main(String[] args) {
		
		TestStreamMultipleExam tsme = new TestStreamMultipleExam();
		
		//测试复制文件
		String srcFile = "E:/filetest/template.txt";
		String destFile = "E:/template.txt";
		
		tsme.copyFile(srcFile, destFile);
		
		
		//测试复制文件夹
		String srcFolder = "E:/filetest";
		String destFolder = "E:/filetestcopy";
		tsme.copyFolder(srcFolder, destFolder);
		
		//测试复制文件夹2
		String srcF = "E:/filetest";
		String destF = "E:/filetestcopy2";
		tsme.copyFolder2(srcF, destF);
		
		File folder = new File(destF);
		String str = "@class@";
		
		tsme.search(folder, str);
		
	}

}
