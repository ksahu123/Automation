package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Frame {
public static void main(String args[]) throws Exception{
 System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");	
 WebDriver driver = new ChromeDriver();
 driver.navigate().to("http://183.82.103.245/nareshit/login.php");
 driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
 driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
 driver.findElement(By.name("Submit")).click();
 System.out.println("Login complete");
 Thread.sleep(4000);
 driver.switchTo().frame("rightMenu");
 driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
 Thread.sleep(3000);
 driver.findElement(By.name("txtEmpFirstName")).sendKeys("krishna");
 driver.findElement(By.name("txtEmpLastName")).sendKeys("sahu");
 driver.findElement(By.id("btnEdit")).click();
 Thread.sleep(3000);
 System.out.println("New emp added");
 //Exit from frame
 driver.switchTo().defaultContent();
 driver.findElement(By.linkText("Logout")).click();
 System.out.println("Logout completed");
 driver.close();
 
}

}
