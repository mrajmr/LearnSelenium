package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSubmitForm {
	
	@Test
	public void doSubmit()
	{

	//public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,50);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Raj");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("766767676");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rm@gmail.com");
		
		//driver.findElement(By.xpath("//select[@name='country']")).sendKeys("United States");
		Select select = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		select.selectByValue("United States");
		
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Coppell");
		
		//WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
		//wait.until(ExpectedConditions.elementToBeSelected(ele));
		//wait.until(ExpectedConditions.visibilityOf(ele));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@type='text']")));
		
		//Thread.sleep(2000);
		
		WebElement m = driver.findElement(By.xpath("//input[@type='text']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", m);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("username");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pwd");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
