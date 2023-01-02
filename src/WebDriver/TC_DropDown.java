package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_DropDown {
public static void mian(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
        System.out.println("login completed");
        Thread.sleep(3000);
        //Enter into Frame
        driver.switchTo().frame("rightMenu");
        Select st= new Select(driver.findElement(By.name("loc_code")));
        //st.selectByVisibleText("Emp.ID");
        //st.selectByIndex(1);
        st.selectByValue("0");
        Thread.sleep(3000);
        driver.findElement(By.name("loc_name")).sendKeys("8975");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("chkLocID[]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='Delete']")).click();
        Thread.sleep(3000);
        //Exit from Frame
        driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
        System.out.println("Logout completed");
        Thread.sleep(3000);
        driver.close();
	}
}
