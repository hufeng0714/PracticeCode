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
		//���firefoxû�а�װ��Ĭ��Ŀ¼��Ҫ�ڹ���������
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//����һ��Firefox�������ʵ��
		WebDriver driver = new FirefoxDriver();
		//�����������baidu
		/*2�ַ�ʽҲ�ǿ��Ե�
		 * 
		 * driver.get("https://www.baidu.com");
		 * 
		 * driver.navigate().to("https://www.baidu.com");
		 * */
		String URL = "https://www.126.com";
		driver.get(URL);
		//��ȡ��ҳ��title
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
