package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarBrandXfl {
	public void carbrandxfl() throws InterruptedException{
		WebDriver driver = QuDong.driver;
		
		//点击雪佛兰图标
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/dl[15]/dd[2]/img")).click();
		Thread.sleep(4000);
		//选择雪佛兰车型图标-科鲁兹
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/dl[1]/dd[5]/img")).click();
		Thread.sleep(2000);
	}

}
