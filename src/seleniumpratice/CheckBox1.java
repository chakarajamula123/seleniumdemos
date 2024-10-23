package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
       WebElement checkbox =  driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
       checkbox.click();
       boolean actualcheckboxisselected = checkbox.isSelected();
       System.out.println("actualcheckboxisselected : "+actualcheckboxisselected);
       boolean exceptedcheckboxisselected = true;
       if(actualcheckboxisselected == exceptedcheckboxisselected)
       {
    	   System.out.println("checkbox is selected");
       }
       else
       {
    	   System.out.println("checkbox is not selected");
       }
 
	}

}
