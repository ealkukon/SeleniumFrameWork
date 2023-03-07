package genericlibrarycom.shoppingapp;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo implements Autoconstant {
	/**
	 * To read the data fromproPertyfile
	 * @param driver
	 * @param name
	 * @return
	 * @throws IOException
	 */
	
	public static String getPhoto(WebDriver driver,String name) throws IOException {
		Date d=new Date();
		String date = d.toString().replace(":","-");
		
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File(photopath+date+name+".png");
		FileUtils.copyFile(src, dest);
		return date;
		
	}

}



