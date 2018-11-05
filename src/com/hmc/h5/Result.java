package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Result {
	public boolean result(){
		WebDriver driver = QuDong.driver;
		//询价成功标识
		String tipsSuccTO = "恭喜您询价成功!";
		//实际询价成功取得的标识
		WebElement text1 = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div[1]"));
		String tipsSuccRO = text1.getText();
		System.out.println("询价成功标识："+tipsSuccRO);
		
		//判断是否询价成功
		boolean isright = tipsSuccTO.equals(tipsSuccRO);
		System.out.println("isright="+tipsSuccTO.equals(tipsSuccRO));
		return isright;
		
	}

}
