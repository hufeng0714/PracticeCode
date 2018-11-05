package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarModelMaZiDa {
	public void carmodelmazida() throws InterruptedException{
		WebDriver driver = QuDong.driver;
		
		//选择款型-精英版-点击选定比价
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div[6]/dl/dd[1]/div[2]/a")).click();
		Thread.sleep(3000);
	}

}
