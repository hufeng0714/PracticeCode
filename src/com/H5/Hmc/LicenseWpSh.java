package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LicenseWpSh {
	public void licensewpsh() throws InterruptedException{
		WebDriver driver = QuDong.driver;
		
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/section[3]/ul/li[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[3]/div/div/div/div/div/div[1]/span[2]")).click();
		Thread.sleep(2000);
	}

}
