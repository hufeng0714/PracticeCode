package com.mypro.jase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baidu2 {

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
		String URL = "https://www.baidu.com";
		driver.get(URL);
		//获取网页的title
		String title = driver.getTitle();
		System.out.println(title);
		//通过id找到input的DOM（文档对象模型（Document Object Model，简称DOM））
		WebElement element = driver.findElement(By.id("kw"));
		//输入关键字
		element.sendKeys("selenium java");
		//提交element所在的form
		element.submit();
		
		//通过判断title内容等待搜索页面加载完毕，timeout时间设置成10秒
		(new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver d){
				return d.getTitle().toLowerCase().startsWith("selenium");
			}
		});
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		driver.quit();
		
		
	}

}
