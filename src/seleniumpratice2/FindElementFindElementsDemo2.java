package seleniumpratice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementFindElementsDemo2 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
	List<WebElement> list =	driver.findElements(By.xpath("//input[@id='RBG']"));
	int size = list.size();
	System.out.println("size: "+size);
		System.out.println("Done");

	}

}
