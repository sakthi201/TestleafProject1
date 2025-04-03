package week5;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {


		ChromeDriver d=new ChromeDriver();
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.switchTo().frame("iframeResult");
		d.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert i=d.switchTo().alert();
		String u=i.getText();
		System.out.println(u);
	    i.accept();
		
	
		

	}

}
