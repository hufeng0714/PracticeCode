package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarModelXfl {
	public void carmodelxfl() throws InterruptedException{
		WebDriver driver = QuDong.driver;
		
		//ѡ�����-2018�� 330T ˫�������-���ѡ���ȼ�
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div[6]/dl[1]/dd[1]/div[2]/a")).click();
		Thread.sleep(2000);
	}

}
