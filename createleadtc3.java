package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createleadtc3 {

	private static final String Testing = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
        //Enter UserName and Password 	  
		WebElement userName=driver.findElement(By.id("username"));
	    userName.sendKeys("DemoCSR",Keys.TAB);
	    WebElement password =driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		 //Click on Login Button
		driver.findElement(By.className("decorativeSubmit")).click();    
		//Click on CRM/SFA Link	
	     driver.findElement(By.linkText("CRM/SFA")).click();
		//  Click on Leads Button	
	     driver.findElement(By.linkText("Leads")).click();
		// Click on create Lead Button	  
		driver.findElement(By.linkText("Create Lead")).click();
		// enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS technologies");
		// enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramalakshmi");
		// enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Adhavan");
		// select source
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(source);
		dropdown.selectByVisibleText("Direct Mail");
		WebElement company = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select option = new Select(company);
		option.selectByValue("9000");
		//option.selectByIndex(1);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Rama");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Lakshmi");		
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("12/04/1989");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("641036");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
        driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("01");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Ramu");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ammu.ramu4@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Ramu");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.url.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Ramu");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Adhavan");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("25");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("nethaji nagar");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Ramanathapuram");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("641036");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("1234");
		//driver.findElement(By.id("generalStateProvinceGeoId")).sendKeys("Arizona");	
		WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select code = new Select(state);
		code.selectByVisibleText("California");
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select countrycode = new Select(country);
		countrycode.selectByVisibleText("United States");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
	
		
	}
}
