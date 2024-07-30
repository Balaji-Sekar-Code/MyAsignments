package week3.Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;



public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		WebElement searchWordKey = driver.findElement(By.name("searchVal"));
		searchWordKey.sendKeys("bags");
		searchWordKey.sendKeys(Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript(null, args);
		
		WebElement filterSelection = driver.findElement(By.xpath("//input[(@name = 'genderfilter') and (@id='Men')]"));
		js.executeScript("arguments[0].click()", filterSelection);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		WebElement element = driver.findElement(By.xpath("//div[@class='length']"));
	System.out.println(element.getAttribute("aria-label"));
		
			List<WebElement> brands = driver.findElements(By.xpath("//div[@class='ReactVirtualized__Grid__innerScrollContainer']//div[@class='brand']"));
			List<WebElement> bagsType = driver.findElements(By.xpath("//div[@class='ReactVirtualized__Grid__innerScrollContainer']//div[@class='nameCls']"));
			
			System.out.println("Size:"+brands.size());
			for(int i=0;i<brands.size();i++) {
				
				System.out.print(brands.get(i).getAttribute("aria-label") + "|");
				System.out.println(bagsType.get(i).getAttribute("aria-label"));
			}
		
	}

}
