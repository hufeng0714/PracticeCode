package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarColorLuHu {
	public void carcolorluhu() throws InterruptedException{
        WebDriver driver = QuDong.driver;
		
		//ѡ����ɫ-��ʿ��
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div/section[2]/ul/li[3]/span")).click();
		Thread.sleep(2000);
	}

}
