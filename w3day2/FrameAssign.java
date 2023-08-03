package week3.w3day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssign {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriver frame = driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//button[text()='Click Me'])[1]")).click();
		WebElement insideframe = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']"));
		String text = insideframe.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		List<WebElement> iframecount = driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames : " +iframecount.size());
		
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("(//button[text()='Click Me'])")).click();
		WebElement nestFrame = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']"));
		String text1 = nestFrame.getText();
		System.out.println(text1);
		
		
	}

}
