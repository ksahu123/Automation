package WebDriver;

import org.sikuli.script.Screen;

public class Sikuli {
	public static void main(String args[])throws Exception{
		//Test steps
		Screen obj = new Screen();
		obj.click("D:\\Image folder\\min.png");
		Thread.sleep(4000);
		obj.doubleClick("D:\\Image folder\\Edit.png");
		Thread.sleep(4000);
		obj.click("D:\\Image folder\\Close.png");
		Thread.sleep(4000);
		obj.doubleClick("‪D:\\Image folder\\pc.png");
		Thread.sleep(4000);
		obj.click("D:\\Image folder\\pcclose.png");
	}
}
