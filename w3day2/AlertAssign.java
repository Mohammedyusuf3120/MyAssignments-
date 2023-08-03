package week3.w3day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAssign {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//ALertSD
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		WebElement alertSD = driver.findElement(By.xpath("//span[@id='simple_result']"));
		System.out.println(alertSD.getText());
		Thread.sleep(1000);
		
		//AlertCD
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		System.out.println(alert.getText());
		alert.dismiss();
		WebElement alertCD = driver.findElement(By.xpath("//span[@id='result']"));
		System.out.println(alertCD.getText());
		Thread.sleep(1000);
		
		//SweetAlertSD
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		System.out.println("Sweet alert SD clicked");
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		Thread.sleep(1000);
		
		//sweetModelDialog
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		Thread.sleep(2000);
		System.out.println("Sweet model dialig clicked");
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		System.out.println("Sweet model dialig closed");
		
		
		//AlertPD
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		alert.sendKeys("Alert Prompt Dialog");
		alert.accept();
		WebElement alertPD = driver.findElement(By.xpath("//span[@id='confirm_result']"));
		System.out.println(alertPD.getText());
		Thread.sleep(1000);
		
		//SweetAlertC
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		System.out.println("Sweet Alert Deleted");
		
		//Minimize and Maximize
		driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-extlink']")).click();
		/*
		 * WebElement titletext =
		 * driver.findElement(By.xpath("(//span[@class='ui-dialog-title'])[3]"));
		 * System.out.println(titletext.getText());
		 * 
		 * WebElement bodytext =
		 * driver.findElement(By.xpath("//p[contains(text(),'maximized or minimized')]")
		 * ); System.out.println(bodytext.getText()); Thread.sleep(2000);
		 */
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
		Thread.sleep(2000);
	
		driver.close();
	}

}
