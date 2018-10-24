package com.mypro.jase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login126 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//如果firefox没有安装在默认目录，要在过程中设置
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//创建一个Firefox的浏览器实例
		WebDriver driver = new FirefoxDriver();
		//让浏览器访问baidu
		/*2种方式也是可以的
		 * 
		 * driver.get("https://www.baidu.com");
		 * 
		 * driver.navigate().to("https://www.baidu.com");
		 * */
		String URL = "https://www.126.com";
		driver.get(URL);
		//获取网页的title
		String title = driver.getTitle();
		System.out.println(title);
		sleepTime();
		WebElement element = 
		driver.findElement(By.xpath("//div[@id='account-box']/div[2]/input"));
	}
	
	public static void sleepTime(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
