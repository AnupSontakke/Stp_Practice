package Anup_Data.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver= new ChromeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Driver.get("https://www.flipkart.com/");
		
		System.out.println(Driver.getTitle());
		WebElement search = Driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		
		search.click();
		Thread.sleep(3000);
		search.sendKeys("chay");
		
		Thread.sleep(3000);
		search.clear();
		search.sendKeys("books");
		
		System.out.println(search.getAttribute("value"));
		
		
		
		System.out.println(search.getLocation().x+"X axis");
		System.out.println(search.getLocation().y+"y axis");
		
		//get size
		System.out.println(search.getSize());
		
		
		//get tagname
		
		System.out.println(search.getTagName());
		
		
		
		//is displayed
		
		System.out.println(search.isDisplayed());
		//is enabled
		System.out.println(search.isEnabled());
		// selected
		
		System.out.println(search.isSelected());
		
		Thread.sleep(3000);
		
		Driver.findElement(By.className("wsejfv")).click();
		
		
		Thread.sleep(6000);
		 
		Driver.close();
	}

}
