package com.mypro.jase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baidu2 {

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
		String URL = "https://www.baidu.com";
		driver.get(URL);
		//��ȡ��ҳ��title
		String title = driver.getTitle();
		System.out.println(title);
		//ͨ��id�ҵ�input��DOM���ĵ�����ģ�ͣ�Document Object Model�����DOM����
		WebElement element = driver.findElement(By.id("kw"));
		//����ؼ���
		element.sendKeys("selenium java");
		//�ύelement���ڵ�form
		element.submit();
		
		//ͨ���ж�title���ݵȴ�����ҳ�������ϣ�timeoutʱ�����ó�10��
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
