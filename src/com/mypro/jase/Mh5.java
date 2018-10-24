package com.mypro.jase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mh5 {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "F:\\selenium2\\chromedriver.exe");
		//System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		String URL = "http://m.haomaiche.com/sh/";
		driver.get(URL);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement element = driver.findElement(By.xpath("//button[contains(@class,'btn-primary btn-lg ')]"));
		sleepTime();
		element.click();
		System.err.println("----");
		sleepTime();
		String title2 = driver.getTitle();
		System.out.println(title2);
		System.err.println("----");
		
		WebElement element2 = driver.findElement(By.xpath("//dd[contains(.,'°ÂµÏ')]"));
		
		String aodiText = element2.getText();
		
		String aodiTest ="°ÂµÏ";
		
		if(aodiTest.equals(aodiText)){
			System.out.println("pass");
		}else{
			System.out.println("failed");
		}		
		
		driver.close();

	}
	
	public static void sleepTime(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
