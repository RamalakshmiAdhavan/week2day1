package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontacts {

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
		WebElement userName=driver.findElement(By.id("username"));
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
		//Click Create Contact
	     driver.findElement(By.linkText("Create Contact")).click();
	    //Type First Name
	     driver.findElement(By.id("firstNameField")).sendKeys("Ramalakshmi");	     
		//Type Last Name
	     driver.findElement(By.id("lastNameField")).sendKeys("Adhavan");
	     System.out.println(driver.findElement(By.id("firstNameField")).getAttribute("value"));
	     //Click Create Contact Button
	     driver.findElement(By.name("submitButton")).click();	     
		//Print the first name and browser title 
	     String title = driver.getTitle();
	    System.out.println(title);
		//Close the browser
	    driver.close();


	}

}
