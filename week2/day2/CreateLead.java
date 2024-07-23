package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();	
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test-Lead");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balaji");
			
			//Selection Source dropdown using index
			WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));		
			Select sourceDD = new Select(sourceElement);
			sourceDD.selectByIndex(2);
			
			//Selecting market camping using visible text
			WebElement markCampingElement = driver.findElement(By.id("createLeadForm_marketingCampaignId"));		
			Select markCampingDD = new Select(markCampingElement);
			markCampingDD.selectByVisibleText("Automobile");
			
			//Selecting ownership using
			WebElement ownershipElement = driver.findElement(By.id("createLeadForm_ownershipEnumId"));		
			Select ownershipDD = new Select(ownershipElement);
			ownershipDD.selectByValue("OWN_CCORP");
			
			driver.findElement(By.name("submitButton")).click();
			
			

			
			
			
	}

}
