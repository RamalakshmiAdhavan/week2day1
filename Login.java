package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static void main(String[] args) {
		
		// TODO setup the driver 
		WebDriverManager.chromedriver().setup();
		
		// Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//load the url
		
		driver.get("http://Leaftaps.com/opentaps/");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//get the title 
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Enter the username 
		WebElement userName=driver.findElement(By.id("username"));
		userName.sendKeys("DemoCSR",Keys.TAB);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	    //click on login button
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("MNC");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramu");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Aadhav");
	    driver.findElement(By.name("submitButton")).sendKeys("MNC");
	    




	    
	    
	
		
		

	}

}
