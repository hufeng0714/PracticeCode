package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarBrandLuHu {
	public void carbrandluhu() throws InterruptedException{
		WebDriver driver = QuDong.driver;
		
		//���·��ͼ��
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/dl[8]/dd[3]/img")).click();
		Thread.sleep(4000);
		//ѡ��·������ͼ��-��������
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/dl[1]/dd[1]/img")).click();
		Thread.sleep(2000);
	}

}
