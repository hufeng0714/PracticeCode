package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterLogin {
	static String phoneRan = "";
	public void registerlogin() throws InterruptedException{
		WebDriver driver = QuDong.driver;
		
		//ע���¼
		java.util.Random random = new java.util.Random();
		int randomNum = random.nextInt(9000) + 1000;
		System.out.println("�����Ϊ��"+randomNum);
		String qiqi = "1772000";
		phoneRan = qiqi+randomNum;
		//phoneRan = "15800732429";
		System.out.println("�ֻ�����Ϊ��"+phoneRan);
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div[2]/input")).sendKeys(phoneRan);
		WebElement text = driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div[1]"));
		String userTips = text.getText();
		System.out.println(userTips);
		
		//���û���ʾ��
		String olduserTips = "��ӭ�������𾴵ĺ����û���";
		
		//�ж��Ƿ������û�
		boolean isolduser;
		System.out.println("isolduser="+userTips.equals(olduserTips));
		
		//���������֤�밴ť
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div[3]/button")).click();
		
		AdminLogin adminlogin = new AdminLogin();
		adminlogin.loginadmin();
		
		//������֤��
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div[3]/input")).click();
		Thread.sleep(4000);
		System.out.println("��admin�л�õ���֤���ǣ�"+adminlogin.verifyCode);
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div[3]/input")).sendKeys(adminlogin.verifyCode);
		Thread.sleep(2000);
		
		//�ж������û�
		if(isolduser=false){
			driver.findElement(By.xpath(".//*[@id='app']/div/div/div/button")).click();
			System.out.println("�������û�");
		}else{
			//�����ǳ�
			driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div[4]/input")).sendKeys("�Զ�������");
			System.out.println("�������û�");
			driver.findElement(By.xpath(".//*[@id='app']/div/div/div/button")).click();
		}
		Thread.sleep(4000);
		//driver.close();
	}
      
}
