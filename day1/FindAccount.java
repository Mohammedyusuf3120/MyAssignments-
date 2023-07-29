package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Find Accounts")).click();

		// driver.findElement(By.name("accountName")).sendKeys("Credit Limited
		// Account"); //Cannot use this way bcoz of duplicate value
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
		driver.findElement(By.linkText("Credit Limited Account")).click();
		driver.findElement(By.linkText("Edit")).click();		
		WebElement accName = driver.findElement(By.xpath("(//input[@name='accountName'])[2]"));
		String name = accName.getAttribute("value");
		System.out.println(name);
		
		if(name.equals("Credit Limited Account")) {
			System.out.println("Correct");
		}
		else {
			System.out.println("Wrong");
		}
		
		WebElement desc = driver.findElement(By.xpath("//textarea[contains(text(),'Sales account with a credit limit of $100 USD')]"));
		String dd = desc.getText();
		System.out.println(dd);
		
		String title1 = driver.getTitle();
		System.out.println(title1);
		if(title1.equals("Edit Account | opentaps CRM")) {
			System.out.println("The page landed correctly " +title1);
		}
		else {
			System.out.println("Wrong page landed "+title1);
		}
		driver.close();
		
	}

}
