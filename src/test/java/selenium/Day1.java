package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Day1 {
@Test
	public void Start() {
	System.out.println("Now atleast this First for today should work");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bhagy\\Desktop\\BhagyaGitProjects\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/");
    driver.quit();
	}
}