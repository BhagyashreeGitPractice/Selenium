package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserCommands {
@Test
public void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\bhagy\\\\Desktop\\\\BhagyaGitProjects\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("http://automationpractice.com/index.php");

driver.findElement(By.xpath("//a[@title='Women']")).click();

//working with Check Boxes
driver.findElement(By.id("uniform-layered_category_4")).click();
driver.findElement(By.id("uniform-layered_category_8")).click();
WebElement checkBox =driver.findElement(By.cssSelector("label[for='layered_id_attribute_group_1']"));
if(!checkBox.isSelected())
{
	checkBox.click();
}

 


}
}
