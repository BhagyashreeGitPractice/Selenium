package intermediate;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindow {
	
	@Test
	public void multipleWindow() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhagy\\Desktop\\BhagyaGitProjects\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
	
	  // Opening all the child window
    driver.findElement(By.id("windowButton")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("messageWindowButton")).click();
    Thread.sleep(5000);
    String MainWindow = driver.getWindowHandle();
    System.out.println("Main window handle is " + MainWindow);

    // To handle all new opened window
    Set<String> s1 = driver.getWindowHandles();
    System.out.println("Child window handle is" + s1);
    Iterator<String> i1 = s1.iterator();

    // Here we will check if child window has other child windows and when child window
    //is the main window it will come out of loop.
      while (i1.hasNext()) {
          String ChildWindow = i1.next();
          if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
              driver.switchTo().window(ChildWindow);
              driver.close();
              Thread.sleep(5000);
              System.out.println("Child window closed");
           }

}
}
}