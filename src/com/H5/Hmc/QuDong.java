package com.H5.Hmc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class QuDong {
	 public static final WebDriver driver=getDriver();
	 
	public static WebDriver getDriver(){
		System.setProperty("webdriver.chrome.driver", "E:\\Page\\chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("user-data-dir=C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\User");
		WebDriver driver = new ChromeDriver(Options);
		return driver;
		
	}

}
