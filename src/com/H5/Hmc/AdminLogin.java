package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//AdminLogin类继承RegisterLogin类，直接使用phoneRan变量，这里无需再定义这个变量
public class AdminLogin extends RegisterLogin{
	static String verifyCode = "";
	
	public void loginadmin() throws InterruptedException{
		WebDriver driver1 = new FirefoxDriver();
		
         driver1.get("http://oms-test.haomaiche.com/admin/login.html");
		
		
		Thread.sleep(2000);
		driver1.findElement(By.xpath(".//*[@id='userCode']")).sendKeys("admin");
		Thread.sleep(2000);
		driver1.findElement(By.xpath(".//*[@id='userPassword']")).sendKeys("Hmc1234");
		Thread.sleep(5000);
		driver1.findElement(By.xpath(".//*[@id='submit']/img")).click();
		Thread.sleep(5000);
		
		driver1.findElement(By.xpath(".//*[@id='ad']/div[10]/div[1]/div[1]")).click();
		Thread.sleep(5000);
		driver1.findElement(By.xpath(".//*[@id='ad']/div[10]/div[2]/ul[1]/li/div/span[3]/a")).click();
		Thread.sleep(8000);
		
		driver1.switchTo().frame("webPlatformDataGridIframe");
		
		Thread.sleep(5000);
		driver1.findElement(By.xpath(".//*[@id='mtMobile']")).sendKeys(phoneRan);
		driver1.findElement(By.xpath(".//*[@id='outboxSearch']/span/span")).click();
		Thread.sleep(5000);
		
		WebElement text1 = driver1.findElement(By.xpath(".//*[@id='datagrid-row-r1-2-0']/td[2]/div"));
		String CodeTips = text1.getText();
		System.out.println(CodeTips);
		verifyCode = CodeTips.substring(5, 9);
		System.out.println("验证码为："+CodeTips.substring(5, 9));
		driver1.close();
		
	}
		
	}


