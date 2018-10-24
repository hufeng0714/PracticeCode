package com.mypro.jase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\selenium2\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://admin.haomaiche.com/admin/login.html";
		
		driver.get(URL);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement elementU = driver.findElement(By.id("userCode"));
		elementU.sendKeys("victorwu");
		
		WebElement elementP = driver.findElement(By.id("userPassword"));
		elementP.sendKeys("Victor123");
		
		WebElement elementS = driver.findElement(By.id("submit"));
		elementS.submit();
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.quit();
	}

}
