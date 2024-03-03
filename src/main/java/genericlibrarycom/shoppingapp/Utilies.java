package genericlibrarycom.shoppingapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utilies {
	/**
	 * To handle the WebElements
	 * @param driver
	 */
	
	public static void dropDown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public static void mouseHover(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public static void doubleClick(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public static void alert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public static void draganddrop(WebDriver driver,WebElement src,WebElement dest) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src,dest).perform();
	}
	
	public static void robot() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
	}
	
	public static void switchWindow(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		}
	}

}



