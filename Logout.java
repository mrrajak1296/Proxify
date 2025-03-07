package proxify;

import java.net.http.WebSocket;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Logout {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://proxify.gg/dashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//button[@type="button"]
		
		WebElement out= driver.findElement(By.xpath("//button[@type=\"button\"]"));
		out.click();
		
		driver.findElement(By.xpath("//div[normalize-space()='Log out']")).click();

	}

}
