package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DragAndDropOperation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");		
		
		Actions act = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement from=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement to=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(from, to).perform();

//		act.dragAndDropBy(driver.findElement(By.xpath("//div[@id='draggable']")), 90, 90).perform();
		driver.close();
		
	}
}