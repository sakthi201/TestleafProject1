package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) 
	
	{
		ChromeDriver d=new ChromeDriver();
		d.get("http://leaftaps.com/opentaps/control/main");
		d.manage().window().maximize();
		String title=d.getTitle();
		System.out.println(title);
		d.findElement(By.id("username")).sendKeys("demosalesmanager");
		d.findElement(By.id("password")).sendKeys("crmsfa");
		d.findElement(By.className("decorativeSubmit")).click();
		d.findElement(By.partialLinkText("CRM")).click();
		d.findElement(By.linkText("Leads")).click();
		d.findElement(By.linkText("Create Lead")).click();
		
		d.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		d.findElement(By.id("createLeadForm_firstName")).sendKeys("Sakthi");
		d.findElement(By.id("createLeadForm_lastName")).sendKeys("Anand");
		//dropdown
		
		WebElement r=d.findElement(By.id("createLeadForm_dataSourceId"));
		Select l=new Select(r);
		l.selectByIndex(2);
		
		WebElement k=d.findElement(By.id("createLeadForm_industryEnumId"));
		Select j=new Select(k);
		j.selectByValue("IND_FINANCE");
		
		
		
		

}
}
