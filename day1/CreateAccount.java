package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account1");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Cognizant");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("DLF");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("10000000");
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));	//to handle dropdown	
		Select aa=new Select(industry);  //Selenium Select Class
		aa.selectByIndex(3); 
		
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select bb=new Select(ownership);
		bb.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select cc=new Select(source);
		cc.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketCamp = driver.findElement(By.id("marketingCampaignId"));
		Select dd = new Select(marketCamp);
		dd.selectByIndex(6);
		
		WebElement stateProvince = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select ee=new Select(stateProvince);
		ee.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
