package seleniumpratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox2 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		List<WebElement>checkbox= driver.findElements(By.xpath("//input[@type='checkbox']"));
		int allboxes=checkbox.size();
		
		for(int i=0;i<=allboxes;i++)
		{
			checkbox.get(i).click();
		}
		for(WebElement chec:checkbox)
		{
			chec.click();
		}
	}
	
//		boolean actualcheckbosisselected = checkbox.isSelected();
//		boolean exceptedcheckbosisselected = true;
//		if(actualcheckbosisselected == exceptedcheckbosisselected)
//		{
//			System.out.println("checkbox is selected");
//		}
//		else
//		{
//			System.out.println("checkbox is not selected");
//		}
//		checkbox.click();
//		boolean actualcheckboxisselectedafterclick = checkbox.isSelected();
//		boolean exceptedcheckboxisselectedafterclick = true;
//		if(actualcheckboxisselectedafterclick == exceptedcheckboxisselectedafterclick)
//		{
//			System.out.println("checkbox is selected");
//		}
//		else
//		{
//			System.out.println("checkbox is not selected");
//		}
//		
//	}
	

}
