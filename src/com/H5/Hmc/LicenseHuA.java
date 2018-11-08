package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LicenseHuA {
	public void licensehua() throws InterruptedException{
		WebDriver driver = QuDong.driver;
		
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/section[3]/ul/li[1]")).click();
		Thread.sleep(2000);
	}

}
