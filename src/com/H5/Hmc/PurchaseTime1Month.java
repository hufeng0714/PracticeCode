package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchaseTime1Month {
	public void purchasetime1month() throws InterruptedException{
		WebDriver driver = QuDong.driver;
		
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/section[5]/ul/li[3]")).click();
		Thread.sleep(2000);
	}

}
