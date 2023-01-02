package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseOver {
	//Test Data or Input Data
	   static String url = ("http://183.82.103.245/nareshit/login.php");
	   static String title1 = ("OrangeHRM - New Level of HR Management");
	   static String username = ("nareshit");
	   static String password = ("nareshit");
	   static String title2 = ("OrangeHRM");


	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		if(driver.getTitle().equals(title1)) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
			System.out.println("driver.getitle");
		}
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		Thread.sleep(3000);
	    driver.findElement(By.name("Submit")).click();
	    System.out.println("Login completed");
	    Thread.sleep(3000);
	    if(driver.getTitle().equals(title2)) {
	    	System.out.println("Title matched");
	    }
	    else {
	    	System.out.println("Title not matched");
	    	System.out.println("driver.getTitle");
	    }
	    Actions ac = new Actions(driver);
	    ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
	    System.out.println("Mouseover completed");
	    driver.findElement(By.linkText("Add Employee")).click();
	    
	    Thread.sleep(300);
	    System.out.println("Clicked on Submenu");
        Thread.sleep(3000);
	    driver.findElement(By.linkText("Logout")).click();
	    System.out.println("Logout completed");
	    Thread.sleep(4000);
	    driver.close();

	}	    
}
