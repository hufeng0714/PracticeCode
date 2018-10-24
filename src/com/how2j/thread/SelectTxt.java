package com.how2j.thread;

import java.io.File;

public class SelectTxt {

	public static void main(String[] args) {

		File file = new File("E:/filetest-Thread");
		SelectThread itThread = new SelectThread(file);
		itThread.start();
	}

}
