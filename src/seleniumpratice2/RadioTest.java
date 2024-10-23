package seleniumpratice2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class RadioTest 
{

	public static void main(String[] args) 
	{
		List<WebElement> list = new ArrayList<>();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();
		WebElement radio1 =	driver.findElement(By.xpath("//input[@value='roundtrip']"));
		WebElement radio2 =	driver.findElement(By.xpath("//input[@value='oneway']"));
		WebElement radio3 =	driver.findElement(By.xpath("//input[@value='Coach']"));
		WebElement radio4 =	driver.findElement(By.xpath("//input[@value='Business']"));
		WebElement radio5 =	driver.findElement(By.xpath("//input[@value='First']"));
		list.add(radio1);
		list.add(radio2);
		list.add(radio3);
		list.add(radio4);
		list.add(radio5);
		WebElement listradio3 = list.get(3);
		listradio3.click();
		System.out.println("Done");
	}

}
