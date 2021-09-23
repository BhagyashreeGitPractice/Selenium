package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectPractice {
	@Test
	public void Example1ToolsQA() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhagy\\Desktop\\BhagyaGitProjects\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				driver.get("https://demoqa.com/select-menu");
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		if(!select.isMultiple()) {
			List<WebElement> s=select.getOptions();
		for(WebElement element:s)
			System.out.println(element.getText());
		
		//select purple
		select.selectByIndex(4);
		Thread.sleep(4000);
		//select Magenta
		select.selectByVisibleText("Magenta");
		Thread.sleep(4000);
		//select White
		select.selectByValue("6");
		Thread.sleep(4000);
		}
		
	}
	
	@Test
	public void Example2ToolsQA() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhagy\\Desktop\\BhagyaGitProjects\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Select sel = new Select(driver.findElement(By.id("cars")));
		
		if(sel.isMultiple()) {
			//opel select and deselct
			sel.selectByIndex(2);
			sel.deselectByIndex(2);
		
			//Saab select n deselect
			sel.selectByValue("saab");
			sel.deselectByValue("saab");
		}

}
}