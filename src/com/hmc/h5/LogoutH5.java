package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutH5 {
	
	public void logout() throws InterruptedException{
		WebDriver driver = QuDong.driver;
		//���ʸ�������
		driver.get("http://ma-test.haomaiche.com/sh/userCenter/myInfo");
		Thread.sleep(2000);
		//�˳�
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div[1]/div[2]/button")).click();
		Thread.sleep(2000);
			
		
	}
	
		
		

}
