package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day2 {
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\bhagy\\\\Desktop\\\\BhagyaGitProjects\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/");
		driver.findElement(By.xpath("//img[@alt='Selenium Online Training']")).click();
		//img[@alt='Selenium Online Training']
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		
	}

}
