package seleniumpratice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("RBG technologies");
	}

}
