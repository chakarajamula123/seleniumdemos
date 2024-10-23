package seleniumpratice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo1
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		WebElement checkbox = driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
		
		boolean actualcheckboxisdisplayed=checkbox.isDisplayed();
		System.out.println("actualcheckboxisdisplayed :"+actualcheckboxisdisplayed);
		boolean expectedcheckboxisdisplayed=true;
		if(actualcheckboxisdisplayed==expectedcheckboxisdisplayed)
		{
			System.out.println("checkbox is displayed");

		}
		else
		{
			System.out.println("checkbox is not displayed");
		}
		boolean actualcheckboxisenabled=checkbox.isEnabled();
		System.out.println("actualcheckboxisenabled :"+actualcheckboxisenabled);
		boolean expectedcheckboxisenabled=true;
		if(actualcheckboxisenabled==expectedcheckboxisenabled)
		{
			System.out.println("checkbox is enabled");
		}
		else
		{
			System.out.println("checkbox is not enabled");
		}

		boolean actualcheckboxisselected=checkbox.isSelected();
		System.out.println("actualcheckboxisselected :"+actualcheckboxisselected);
		boolean expectedcheckboxisselected=true;
		if(actualcheckboxisselected==expectedcheckboxisselected)
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox is not selected");
		}
		checkbox .click();
		
		
		boolean actualcheckboxisselectedforafterclick=checkbox.isSelected();
		System.out.println("actualcheckboxisselectedforafterclick :"+actualcheckboxisselectedforafterclick);

		boolean expectedcheckboxisselectedforafterclick=true;
		if(actualcheckboxisselectedforafterclick==expectedcheckboxisselectedforafterclick)
		{
			System.out.println("checkbox is selectedforafterclick");
		
		}
		else
		{
			System.out.println("checkbox is not selectedforafterclick");
	}
	

	}

}
