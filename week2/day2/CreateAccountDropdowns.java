package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountDropdowns {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();	
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	
	
	driver.findElement(By.id("accountName")).sendKeys("Test-Balaji Sekar");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
	//Selecting industry from dropdown
	WebElement industryElement = driver.findElement(By.name("industryEnumId"));
	Select industrySelect = new Select(industryElement);
	industrySelect.selectByVisibleText("Computer Software");
	
	//Selecting Ownership from dropdown
	WebElement ownershipElement = driver.findElement(By.name("ownershipEnumId"));
	Select ownershipSelect = new Select(ownershipElement);
	ownershipSelect.selectByVisibleText("S-Corporation");
	
	//Selecting Source dropdown
	WebElement dataSourceElement = driver.findElement(By.name("dataSourceId"));
	Select dataSourceSelect = new Select(dataSourceElement);
	dataSourceSelect.selectByValue("LEAD_EMPLOYEE");
	
	
	//Selecting market camping
	WebElement marketingCampaignElement = driver.findElement(By.name("marketingCampaignId"));
	Select marketingCampaignSelect = new Select(marketingCampaignElement);
	marketingCampaignSelect.selectByIndex(6);
	
	//Selecting Country
	WebElement countryElement = driver.findElement(By.name("generalCountryGeoId"));
	Select countrySelect = new Select(countryElement);
	countrySelect.selectByVisibleText("United States");
	
	//Selecting state/province
	WebElement stateElement = driver.findElement(By.name("generalStateProvinceGeoId"));
	Select stateSelect = new Select(stateElement);
	stateSelect.selectByValue("TX");
	
	driver.findElement(By.className("smallSubmit")).click();
	
	String title = driver.getTitle();
	System.out.println(title);
	
	//driver.close();
	
	
	
	
	
	//driver.close();
	}

}
