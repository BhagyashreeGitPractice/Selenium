package intermediate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts {
	
	@Test
	public void alertTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagy\\Desktop\\BhagyaGitProjects\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		//Simple Alert
		driver.findElement(By.id("alertButton")).click();
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(5000);
		simpleAlert.accept();
		
		//Pop Up alert		
		  WebElement element =driver.findElement(By.id("promtButton"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		   Alert promptAlert  = driver.switchTo().alert();
		   String alertText = promptAlert.getText();
		   Thread.sleep(5000);
		   System.out.println("Alert text is " + alertText);
		  //Send some text to the alert
		   Thread.sleep(5000);
		   promptAlert.sendKeys("Test User");
		   Thread.sleep(5000);
		   promptAlert.accept();
		   
		
		   
		   // This step will result in an alert on screen
		   WebElement element1 = driver.findElement(By.id("confirmButton"));
		   ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element1);
		   Alert confirmationAlert = driver.switchTo().alert();
		   String alertText1 = confirmationAlert.getText();
		   Thread.sleep(5000);
		   System.out.println("Alert text is " + alertText1);
		   confirmationAlert.accept();
		   Thread.sleep(5000);
		   
		   
	}

}
