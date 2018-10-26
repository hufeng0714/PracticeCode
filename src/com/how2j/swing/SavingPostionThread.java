package com.how2j.swing;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFrame;

		/**
		 * 保存的位置信息
		 * 
		 比如这次使用这个窗口(TestGUI01.java)，导致窗口被移动到了右下角。 关闭这个窗口，下一次再启动的时候，就会自动出现在右下角。
		
		思路提示： 
		启动一个线程，每个100毫秒读取当前的位置信息，保存在文件中，比如location.txt文件。 
		启动的时候，从这个文件中读取位置信息，如果是空的，就使用默认位置，如果不是空的，就把位置信息设置在窗口上。
		读取位置信息的办法： f.getX() 读取横坐标信息，f.getY()读取纵坐标信息。
		
		注：这个练习要求使用多线程来完成。 还有另一个思路来完成，就是使用监听器，因为刚开始学习GUI，还没有掌握监听器的使用，所以暂时使用多线程来完成这个功能。
		 
		 */

public class SavingPostionThread extends Thread{

	private JFrame f;
	File file = new File("D:\\EcliWorkSpace201809\\mypro\\src\\com\\how2j\\swing\\location.txt");
	
	SavingPostionThread(JFrame f){
		this.f = f;
	}
	
	public void run() {
		while(true) {
			int x = f.getX();
			int y = f.getY();
			
			try(FileOutputStream fos = new FileOutputStream(file);
				DataOutputStream dos = new DataOutputStream(fos);
				) {
				dos.writeInt(x);
				dos.writeInt(y);				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
