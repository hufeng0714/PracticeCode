package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarColorXfl {
	public void carcolorxfl() throws InterruptedException{
        WebDriver driver = QuDong.driver;
		
		//Ñ¡ÔñÑÕÉ«-îÑ½ð»Ò
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/section[2]/ul/li[6]/span")).click();
		Thread.sleep(2000);
	}

}
