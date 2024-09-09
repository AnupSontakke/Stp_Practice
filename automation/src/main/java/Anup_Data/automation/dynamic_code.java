package Anup_Data.automation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dynamic_code {
	public static WebDriver driver;
	
	
	public static void launch_Browser(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
			}
		
		 else if(browser.equalsIgnoreCase("edge")) {
			 driver=new EdgeDriver();
			
		}
		
		 else if(browser.equalsIgnoreCase("firefox")) {
			  driver=new FirefoxDriver();
		 }
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("launch Brower is:"+browser);
		
	}
	
	public static void hiturl(String url) {
		driver.get(url);
		System.out.println(driver.getTitle());
		
	}
	

}
