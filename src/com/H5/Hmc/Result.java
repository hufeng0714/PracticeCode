package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Result {
	public boolean result(){
		WebDriver driver = QuDong.driver;
		//ѯ�۳ɹ���ʶ
		String tipsSuccTO = "��ϲ��ѯ�۳ɹ�!";
		//ʵ��ѯ�۳ɹ�ȡ�õı�ʶ
		WebElement text1 = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div/div[1]"));
		String tipsSuccRO = text1.getText();
		System.out.println("ѯ�۳ɹ���ʶ��"+tipsSuccRO);
		
		//�ж��Ƿ�ѯ�۳ɹ�
		boolean isright = tipsSuccTO.equals(tipsSuccRO);
		System.out.println("isright="+tipsSuccTO.equals(tipsSuccRO));
		return isright;
		
	}

}
