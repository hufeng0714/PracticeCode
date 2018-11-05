package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Area {
	public void area() throws InterruptedException{
		WebDriver driver = QuDong.driver;
		
		//选择区域和商圈
		driver.findElement(By.xpath(".//*[@id='app']/div/div/ul[1]/li[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='app']/div/div/ul[2]/li[2]/ul/li[1]")).click();
		Thread.sleep(2000);
	}

}
