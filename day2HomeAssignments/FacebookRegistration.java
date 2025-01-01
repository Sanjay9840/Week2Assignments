package week2.day2HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver(); //Creating a chromdriver class
		
		driver.get("https://en-gb.facebook.com/"); //navigate to url
		
		driver.manage().window().maximize();
		
		//Click on the Create new account button.
		driver.findElement(By.linkText("Create new account")).click();
		
		// Enter the First name.
		driver.findElement(By.name("firstname")).sendKeys("Sanjay");
		
		// Enter the Surname.
		driver.findElement(By.name("lastname")).sendKeys("Purushothaman");
		
		//Enter the Mobile number or email address.
		driver.findElement(By.name("reg_email__")).sendKeys("1234569871");
		
		// Enter the New password.
		driver.findElement(By.id("password_step_input")).sendKeys("sanjay");
		
		// Handle all three dropdowns in Date of birth
		WebElement dayDD = driver.findElement(By.id("day"));
		Select options = new Select(dayDD);
		options.selectByIndex(8);
		
		WebElement monthDD = driver.findElement(By.id("month"));
		Select options1 = new Select(monthDD);
		options1.selectByValue("9");
		
		WebElement yearDD = driver.findElement(By.id("year"));
		Select options2 = new Select(yearDD);
		options2.selectByVisibleText("1998");
		
		 //Select the radio button in Gender.
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		driver.close();
	}

}
