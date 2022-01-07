package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findcontacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();		
		//Open the browser
		ChromeDriver driver= new ChromeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the browser
		driver.manage().window().maximize();		
		//Enter UserName
		WebElement userName =driver.findElement(By.id("username"));
	    userName.sendKeys("DemoCSR",Keys.TAB);
		//Enter Password
		WebElement password =driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		//Click Login
	     driver.findElement(By.className("decorativeSubmit")).click();
	    //Click CRM/SFA
	     driver.findElement(By.linkText("CRM/SFA")).click();
		//Click Contacts Tab
	     driver.findElement(By.linkText("Contacts")).click();
		//Click Find Contacts
	     driver.findElement(By.linkText("Find Contacts")).click();
		//Click Email Tab
		driver.findElement(By.linkText("Email")).click();
	     //Type email as ramalaxmi8986@gmail.com
		driver.findElement(By.name("emailAddress")).sendKeys("ramalaxmi8986@gmail.com");
		//Click Find Contacts
	     driver.findElement(By.linkText("Find Contacts")).click();
		//Close the browser
	     driver.close();

	}

}
