package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccountCreation {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("Balaji");
		driver.findElement(By.name("lastname")).sendKeys("Sekar");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9999999990");
		
		driver.findElement(By.id("password_step_input")).sendKeys("9999999990");
		
		
		WebElement monthElement= driver.findElement(By.id("month"));
		Select month = new Select(monthElement);
		month.selectByValue("12");
		
		WebElement dayElement= driver.findElement(By.id("day"));
		Select day = new Select(dayElement);
		day.selectByValue("29");
		
		WebElement yearElement= driver.findElement(By.id("year"));
		Select year = new Select(yearElement);
		year.selectByVisibleText("1998");
		
		driver.findElement(By.xpath("//input[@value = '2']")).click();				
		

	}

}
