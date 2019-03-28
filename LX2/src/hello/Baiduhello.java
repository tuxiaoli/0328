package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Baiduhello {
	@Test
	public void OpenFireFox(){
		System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver driver=new FirefoxDriver();	
		String url1="http://www.baidu.com";
		driver.get(url1);
		driver.findElement(By.cssSelector("#kw")).sendKeys("hello");
	}
}
