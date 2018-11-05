package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XiYiBu {
	public void xiyibu() throws InterruptedException{
		WebDriver driver = QuDong.driver;
		
		//点击【下一步：价比三家】和【选择您的区域】
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/footer/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/a")).click();
		Thread.sleep(2000);
	}

}
