package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FaSongBiJiaDan {
	public void fasongbijiadan() throws InterruptedException{
		WebDriver driver = QuDong.driver;
		
		//��������ͱȼ۵���
		driver.findElement(By.xpath(".//*[@id='app']/div/footer/a")).click();
		Thread.sleep(4000);
	}

}
