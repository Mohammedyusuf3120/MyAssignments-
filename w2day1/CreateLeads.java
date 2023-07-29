package week2.w2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeads {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abdul");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Basith");
		
		WebElement marketingCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select aa=new Select(marketingCamp);	
		aa.selectByValue("9001");
		
		WebElement ownershipEnumId = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select bb=new Select(ownershipEnumId);
		bb.selectByIndex(5);
		
		
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select cc=new Select(country);
		cc.selectByVisibleText("India");
		
		driver.findElement(By.name("submitButton")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);

	}

}
