package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarModelLuHu {
	public void carmodelluhu() throws InterruptedException{
		WebDriver driver = QuDong.driver;
		
		//ѡ�����-2018�� 200PS PURE��-���ѡ���ȼ�
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div[6]/dl[1]/dd/div[2]/a")).click();
		Thread.sleep(2000);
	}

}
