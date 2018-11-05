package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarColorMaZiDa {
	public void carcolormazida() throws InterruptedException{
		WebDriver driver = QuDong.driver;
		
		//Ñ¡ÔñÑÕÉ«-¼«Ò¹ºÚ
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/section[2]/ul/li[1]/span")).click();
		Thread.sleep(2000);
	}

}
