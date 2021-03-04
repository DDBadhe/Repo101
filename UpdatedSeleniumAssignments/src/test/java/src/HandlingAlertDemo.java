package src;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAlertDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php");		
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("78785");
		driver.findElement(By.name("submit")).submit();
		
		Alert alert = driver.switchTo().alert();
		String alertMesage = alert.getText();
		System.out.println(alertMesage);
		Thread.sleep(5000);
		alert.accept();
	}
}
