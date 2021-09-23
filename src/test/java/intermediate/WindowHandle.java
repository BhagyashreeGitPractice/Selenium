package intermediate;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle<List> {
	
	@Test
	public void windowHandle() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagy\\Desktop\\BhagyaGitProjects\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	driver.findElement(By.id("windowButton")).click();
	String mainWindow = driver.getWindowHandle();
	Set<String> windows = driver.getWindowHandles();
	
	Iterator<String> iter = windows.iterator();
	if(iter.hasNext()) {
		if(mainWindow != iter.next()) {
			driver.switchTo().window(iter.next());
			WebElement element = driver.findElement(By.id("sampleHeading"));
			System.out.println(element.getText());
				
			
		}
	}
	
	
}
}