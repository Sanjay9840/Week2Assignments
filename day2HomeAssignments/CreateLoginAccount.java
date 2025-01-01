package week2.day2HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLoginAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver(); //Creating a chromdriver class
		
		driver.get("http://leaftaps.com/opentaps/"); //navigate to url
		
		driver.manage().window().maximize(); //maximize the browser window
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); //to push the user name
		
		driver.findElement(By.id("password")).sendKeys("crmsfa"); // to push the password
		
		driver.findElement(By.className("decorativeSubmit")).click(); // to click the login button
		
		driver.findElement(By.linkText("CRM/SFA")).click(); // to click the "CRM/SFA"
		
		driver.findElement(By.linkText("Create Account")).click(); // to click the create acc button
		
		driver.findElement(By.id("accountName")).sendKeys("Sanjay"); // to create an acc name
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester."); //to add description.
		
		//to choose the "computer software" option from industry, creating the select class to choose the computer software from dropdown.
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select options = new Select(industryDD);
		options.selectByIndex(3);
		
		//Select "S-Corporation" as ownership using SelectByVisibleText
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select options1 = new Select(ownershipDD);
		options1.selectByVisibleText("S-Corporation");
		
		
		//Select "Employee" as the source using SelectByValue
		WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
		Select options2 = new Select(sourceDD);
		options2.selectByValue("LEAD_EMPLOYEE");
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		WebElement marketingCampaignDD = driver.findElement(By.id("marketingCampaignId"));
		Select options3 = new Select(marketingCampaignDD);
		options3.selectByIndex(6);
		
		//Select "Texas" as the state/province using SelectByValue
		WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select options4 = new Select(stateDD);
		options4.selectByValue("TX");
		
		//Click the "Create Account" button
		driver.findElement(By.className("smallSubmit")).click();
		

		//Close the browser window
		driver.close();
		


	}

}
