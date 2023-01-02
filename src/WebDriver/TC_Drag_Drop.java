package WebDriver;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.testng.Assert.assertEquals;
public class TC_Drag_Drop {
public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/&quot");
    Thread.sleep(3000);
	//Verify Title-stop exe - cond:failed
	assertEquals(driver.getTitle(),"Droppable | jQuery UI");
	System.out.println("Title Matched");
    driver.switchTo().frame(0);
	Actions ac = new Actions(driver);
	ac.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
	System.out.println("Drag&DropCompleted");
	Thread.sleep(3000);
	driver.switchTo().defaultContent();
	driver.close();
}


}
