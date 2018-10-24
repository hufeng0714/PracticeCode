package com.mypro.jase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

class Baidu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start selenium...0");
			
		System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		
		System.out.println("start selenium...1");
		WebDriver driver = new FirefoxDriver();
		System.out.println("start selenium...2");
		String URL = "https://www.baidu.com/";
		driver.get(URL);
		System.out.println("start selenium...3");
		
		//driver.findElement(By.id("kw")).sendKeys("selenium java");
		driver.findElement(By.id("kw")).sendKeys(new String[]{"selenium java"});
		System.out.println("start selenium...4");
		driver.findElement(By.id("su")).click();
		System.out.println("start selenium...5");
		driver.close();
		
		System.out.println("end selenium...6");
	}

}