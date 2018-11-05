package com.H5.Hmc;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarBrandMaZiDa{
	public void carbrandmazida() throws InterruptedException{
		WebDriver driver = QuDong.driver;
		
		//点击马自达8图标
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/dl[9]/dd[1]/img")).click();
		Thread.sleep(4000);
		//选择马自达8车型
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/dl[1]/dd[3]/div")).click();
		Thread.sleep(4000);
		
	}
	
	
	

}
