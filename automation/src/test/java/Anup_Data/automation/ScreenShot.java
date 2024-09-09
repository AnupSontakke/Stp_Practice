package Anup_Data.automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot extends dynamic_code {
	
		
	

	public static void main(String[] args) throws InterruptedException, IOException {
		launch_Browser("chrome");
		
		  TakesScreenshot ts=(TakesScreenshot) driver;
			
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        
	        File targate = new File("./Evedances/Browser_Launch.png");
	        
	       FileHandler.copy(source, targate);
	       

		hiturl("https://www.snapdeal.com/");
		
		
    TakesScreenshot ts1=(TakesScreenshot) driver;
		
        File source1 = ts1.getScreenshotAs(OutputType.FILE);
        
        File targate1 = new File("./Evedances/Url hit.png");
        
       FileHandler.copy(source1, targate1);
	}

}
