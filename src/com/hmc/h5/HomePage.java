package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	
	public void homepage() throws InterruptedException{
		WebDriver driver = QuDong.driver;//这个是调用
		
		driver.manage().window().setSize(new Dimension(480,800));
		driver.get("http://ma-test.haomaiche.com/sh");
		Thread.sleep(2000);
		//选定去比价
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div[1]/div/a[1]")).click();
		
		

	}
	

}
