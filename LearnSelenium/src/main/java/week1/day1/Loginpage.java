package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Loginpage {

	public static void main(String[] args) {
	
		//ChromeDriver driver=new ChromeDriver();
		EdgeDriver d=new EdgeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		String title=d.getTitle();
		System.out.println(title);
		d.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		WebElement pwd=d.findElement(By.id("pass"));
		pwd.sendKeys("Tuna@321");
		if(pwd.equals(pwd))
		{
			System.out.println("Password is Successful");
		}
		else
		{
			System.out.println("Password is not Successful");
		}
		d.findElement( By.id("loginbutton")).click();
		//d.findElement(By.partialLinkText("CRM")).click();
	

	}

}
