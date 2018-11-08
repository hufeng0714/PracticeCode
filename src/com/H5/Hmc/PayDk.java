package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PayDk {
	public void paydk() throws InterruptedException{
		WebDriver driver = QuDong.driver;
		
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/section[4]/ul/li[2]")).click();
		Thread.sleep(2000);
	}

}
