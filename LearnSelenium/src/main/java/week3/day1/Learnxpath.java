package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnxpath {

	public static void main(String[] args) {
		
		ChromeDriver d=new ChromeDriver();
		d.get("http://leaftaps.com/opentaps/control/main");
		d.manage().window().maximize();
		String title=d.getTitle();
		System.out.println(title);
		//Attribute based xpath
		d.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		d.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//Partial xpath
		d.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		//Text based xpath
		
		d.findElement((By.xpath("//a[text()='Leads']"))).click();
		
		//collection xpath
		//d.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("demosalesmanager");
		
		//Avanced xpath
	  //	d.findElement(By.xpath("//form[@id='login']/p[2]"));
		
		
		
		//Grantparent to child
		
		//d.findElement(By.xpath("//form[@id='login']//label)[1]"));
		
		
		//Grandchild to Grandparent
		
		//d.findElement(By.xpath("//input[@id='username']/anchestor::form"));
		
		
		
		

	}

}
