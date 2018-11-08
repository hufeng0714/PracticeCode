package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarModelXfl {
	public void carmodelxfl() throws InterruptedException{
		WebDriver driver = QuDong.driver;
		
		//选择款型-2018款 330T 双离合铉峰版-点击选定比价
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div[6]/dl[1]/dd[1]/div[2]/a")).click();
		Thread.sleep(2000);
	}

}
