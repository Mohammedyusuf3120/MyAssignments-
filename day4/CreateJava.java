package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateJava {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohammed");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mohammedyusuf3120@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7299219658");
		driver.findElement(By.name("submitButton")).click();
	}

}
