package com.mypro.jase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chrome {

	public static void main(String[] args) {
		
		//锟斤拷锟絚hrome没锟叫帮拷装锟斤拷默锟斤拷目录锟斤拷要锟节癸拷锟斤拷锟斤拷锟斤拷锟�

		System.setProperty("webdriver.chrome.driver", "F:\\selenium2\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions Options = new ChromeOptions();
		
		Options.addArguments("user-data-dir=C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\User");
		
		//锟斤拷锟斤拷一锟斤拷ChromeDriver锟侥接口ｏ拷锟斤拷锟斤拷锟斤拷锟斤拷chrome
		//锟斤拷锟斤拷一锟斤拷chrome锟斤拷锟斤拷锟斤拷锟绞碉拷锟�

		
		
		WebDriver driver = new ChromeDriver(Options);
		

		//锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟絙aidu
		/*2锟街凤拷式也锟角匡拷锟皆碉拷
		 * 
		 * driver.get("https://www.baidu.com");
		 * 
		 * driver.navigate().to("https://www.baidu.com");
		 * */

		String URL = "https://www.baidu.com";
		driver.get(URL);
		
		//锟斤拷取锟斤拷页锟斤拷title
		String title = driver.getTitle();
		System.out.println(title);
		//通锟斤拷id锟揭碉拷input锟斤拷DOM锟斤拷锟侥碉拷锟斤拷锟斤拷模锟酵ｏ拷Document Object Model锟斤拷锟斤拷锟紻OM锟斤拷锟斤拷
		WebElement element = driver.findElement(By.id("kw"));
		sleepTime();
		//锟斤拷锟斤拷丶锟斤拷锟�
		element.sendKeys("selenium java");
		//锟结交element锟斤拷锟节碉拷form
		element.submit();
		
		//通锟斤拷锟叫讹拷title锟斤拷锟捷等达拷锟斤拷锟斤拷页锟斤拷锟斤拷锟斤拷锟较ｏ拷timeout时锟斤拷锟斤拷锟矫筹拷10锟斤拷
		(new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver d){
				return d.getTitle().toLowerCase().startsWith("selenium");
			}
		});
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		sleepTime();
		driver.quit();		
	}

	public static void sleepTime(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
