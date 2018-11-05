package com.H5.Hmc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterLogin {
	static String phoneRan = "";
	public void registerlogin() throws InterruptedException{
		WebDriver driver = QuDong.driver;
		
		//注册登录
		java.util.Random random = new java.util.Random();
		int randomNum = random.nextInt(9000) + 1000;
		System.out.println("随机数为："+randomNum);
		String qiqi = "1772000";
		phoneRan = qiqi+randomNum;
		//phoneRan = "15800732429";
		System.out.println("手机号码为："+phoneRan);
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div[2]/input")).sendKeys(phoneRan);
		WebElement text = driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div[1]"));
		String userTips = text.getText();
		System.out.println(userTips);
		
		//老用户提示语
		String olduserTips = "欢迎回来，尊敬的好买车用户！";
		
		//判断是否是老用户
		boolean isolduser;
		System.out.println("isolduser="+userTips.equals(olduserTips));
		
		//点击发送验证码按钮
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div[3]/button")).click();
		
		AdminLogin adminlogin = new AdminLogin();
		adminlogin.loginadmin();
		
		//输入验证码
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div[3]/input")).click();
		Thread.sleep(4000);
		System.out.println("从admin中获得的验证码是："+adminlogin.verifyCode);
		driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div[3]/input")).sendKeys(adminlogin.verifyCode);
		Thread.sleep(2000);
		
		//判断新老用户
		if(isolduser=false){
			driver.findElement(By.xpath(".//*[@id='app']/div/div/div/button")).click();
			System.out.println("这是老用户");
		}else{
			//输入昵称
			driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div[4]/input")).sendKeys("自动化测试");
			System.out.println("这是新用户");
			driver.findElement(By.xpath(".//*[@id='app']/div/div/div/button")).click();
		}
		Thread.sleep(4000);
		//driver.close();
	}
      
}
