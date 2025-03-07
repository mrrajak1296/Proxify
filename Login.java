package proxify;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://proxify.gg/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String win =driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("name1@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("a1n2i3l4");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[normalize-space()='Plans']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Invoices']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Referrals']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Claim']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Copy Link']")).click();
		
		driver.findElement(By.xpath("//div[normalize-space()='Switch to Admin']")).click();
		
		//driver.findElement(By.xpath("//a[normalize-space()='Invoices']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@placeholder='Search invoices...']")).sendKeys("user");
		
		driver.findElement(By.xpath("//a[normalize-space()='Packages']")).click();
		
		driver.findElement(By.xpath("//div[normalize-space()='Create Plan']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Title']")).sendKeys("QA");
		
		driver.findElement(By.xpath("//input[@id='Description']")).sendKeys("Team work");
		Thread.sleep(3000);
//		WebElement ans= driver.findElement(By.xpath("//button[@role=\"combobox\"]"));
//		Select ele = new Select(ans);
//		ele.selectByVisibleText("TLIsp");
		
		driver.findElement(By.xpath("//input[@id='Price']")).sendKeys("2");
		
		driver.findElement(By.xpath("//input[@id='Duration']")).sendKeys("5");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Bandwidth']")).sendKeys("1");
		
		driver.findElement(By.xpath("//input[@id='Threads']")).sendKeys("0.03");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[normalize-space()='Create']")).click();
		
//		driver.findElement(By.xpath("//a[normalize-space()='Topup']")).click();
//		
//		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("2");
//		Thread.sleep(3000);
//		 driver.findElement(By.xpath("//div[contains(text(),'Continue to Payment')]")).click();
//		String win1 =new String();
//		driver.switchTo().window(win);
		
		


	}

}
