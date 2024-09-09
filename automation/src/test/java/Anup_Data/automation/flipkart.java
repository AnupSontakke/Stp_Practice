package Anup_Data.automation;

public class flipkart extends dynamic_code {
public static void main(String[] args) throws InterruptedException {
	launch_Browser("edge");
	
	hiturl("https://www.flipkart.com/");
	
	 Thread.sleep(5000);
	driver.close();
	
	
}

}
