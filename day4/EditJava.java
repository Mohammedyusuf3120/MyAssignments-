package week1.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditJava {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CognizantTech");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("MohammedYusuf");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mohammedyusuf3120@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7299219658");
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("CTS");
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(6000);		
		driver.close();
		
	}

}
