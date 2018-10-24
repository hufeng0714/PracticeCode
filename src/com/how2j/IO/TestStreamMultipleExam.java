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
	//�����ļ��ǳ�����IO������������·�����ʵ�ָ���Դ�ļ�srcFile��Ŀ���ļ�destFile
	//�����ļ�
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
	
	//�����ļ���,ʵ�����·�������Դ�ļ��������е��ļ� ���Ƶ�Ŀ���ļ�����(�������ļ���)
	//�����ļ���
	public static void copyFolder(String srcFolder, String destFolder){
			//�ļ�
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
					//�ȴ���Ŀ¼
					if(!test.exists())
						test.mkdirs();
					System.out.println("test is exists? " + test.getAbsolutePath());
					ergodic(f1.getAbsolutePath(),test.getAbsolutePath());
				}
			}
	}
	
	//�����ļ���
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
	
	
	//�����ļ���--����2
	
	/**
     * ��Դ�ļ��������е��ļ� ���Ƶ�Ŀ���ļ�����(�������ļ���)
     * ˼·���ȴ����ļ��У������ļ����´����ļ�
     * @param srcFolder
     * @param destFolder
     */
	public static void copyFolder2(String srcFolder, String destFolder){
		//�ļ�
		File srcF = new File(srcFolder);
		File destF = new File(destFolder);
		//Ŀ��Ŀ¼���ڣ���ɾ���ٴ���
		if(destF.exists()){
			//����ɾ���ļ��м���Ŀ¼
			deleteAll(destF);
			destF.mkdirs();
		}else{
			destF.mkdirs();
		}
		//����ԴĿ¼���ݵ�Ŀ��Ŀ¼
		
		if(srcF.exists()){
			copyAll(srcF,destF);
		}else{
			System.out.println("ԴĿ¼�����ڣ������Ը��ƣ�");
		}
}
	
	//����ɾ��Ŀ¼�����е��ļ�
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

	//����Ŀ¼�µ������ļ���Ŀ¼�ķ���
	public static void copyAll(File srcF, File destF){
		
		for(File f:srcF.listFiles()){
			if(f.isDirectory()){
				// ��destF��Ϊ��Ŀ¼�����ļ�����
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
	
//  ���������ĿĿ¼�� e:/project���������Ŀ¼�����е�java�ļ����������ļ��У����ҳ��ļ����ݰ��� Magic����Щ�ļ�������ӡ������
    public static void search(File folder,String str) {
        for(File each : folder.listFiles()) {   //����Ŀ���ļ���
            if(each.isDirectory()) {
                search(each,str);
            }
            else {
                if((each.toString()).endsWith(".txt")) {    //�����.txt�ļ�����Ѱ����
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
		
		//���Ը����ļ�
		String srcFile = "E:/filetest/template.txt";
		String destFile = "E:/template.txt";
		
		tsme.copyFile(srcFile, destFile);
		
		
		//���Ը����ļ���
		String srcFolder = "E:/filetest";
		String destFolder = "E:/filetestcopy";
		tsme.copyFolder(srcFolder, destFolder);
		
		//���Ը����ļ���2
		String srcF = "E:/filetest";
		String destF = "E:/filetestcopy2";
		tsme.copyFolder2(srcF, destF);
		
		File folder = new File(destF);
		String str = "@class@";
		
		tsme.search(folder, str);
		
	}

}
