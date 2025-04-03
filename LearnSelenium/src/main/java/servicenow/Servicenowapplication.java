package servicenow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class Servicenowapplication {

	public static void main(String[] args) {
		
		//Launch the browser
				ChromeDriver d=new ChromeDriver();
				d.get("https://dev186929.service-now.com/");
				d.manage().window().maximize();
		//Title
				String Title=d.getTitle();
				System.out.println(Title);
				
		//Timeouts
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		//Login info
				d.findElement(By.id("user_name")).sendKeys("admin");
				d.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		//button click		
				d.findElement(By.id("sysverb_login")).click();
		//shadow root
				Shadow shadow=new Shadow(d);
				shadow.setImplicitWait(20);
		//ALL 
				shadow.findElementByXPath("//div[@id='d6e462a5c3533010cbd77096e940dd8c']").click();
				shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		
				
				d.switchTo().frame("gsft_main");
				
				
				//WebElement Scroll=shadow.findElementByXPath("//span[text()='Service Catalog']");
				//Actions u=new Actions(d);
				//u.scrollToElement(Scroll).perform();
				//String text=Scroll.getText();
				//System.out.println(text);
				
			    
			  d.findElement(By.xpath("//a[text()='Mobiles']")).click();
			 
			  
			    
				
	
			    
	}

}



