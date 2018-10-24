package com.mypro.jase;

//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	/**
	* setSize() 设置浏览器宽高
	* maximize() 设置浏览器最大化
	*/
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium2\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().setSize(new Dimension(480,800));
		driver.manage().window().maximize();
		String URL = "http://m.haomaiche.com";
		driver.get(URL);
		driver.close();

	}

}
