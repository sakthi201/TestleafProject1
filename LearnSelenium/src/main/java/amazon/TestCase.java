package amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) {
		
//login
				ChromeDriver d=new ChromeDriver();
				d.get("https://www.amazon.in/");
				d.manage().window().maximize();
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//search
				WebElement SearchBox=d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
				SearchBox.sendKeys("Bags for Boys");
				SearchBox.submit();
				
//click	
				WebElement Checkbox1= d.findElement(By.xpath("(//input[@type='checkbox']/following-sibling::i)[7]"));
				Checkbox1.click();
				
				WebElement Checkbox2= d.findElement(By.xpath("(//input[@type='checkbox']/following-sibling::i)[6]"));
				Checkbox2.click();
//text	
				String text= d.findElement(By.xpath("(//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/descendant::span)[1]")).getText();
				
				System.out.println("Result After Search:"+text);
				
				
//link			
				
				d.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[4]")).click();
				
				
//Name of the product		
				
	            String itemname= d.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[4]/descendant::span")).getText();
				
				System.out.println("Name of the Product:"+itemname);
				
//price
                String Price= d.findElement(By.xpath("(//a[@aria-describedby='price-link'])[4]/descendant::span[5]")).getText();
				
				System.out.println("Price of the Product:"+Price);
				
//Discount
				
				String Discount= d.findElement(By.xpath("(//span[@class='a-letter-space'])[4]/following::span[1]")).getText();
					
				System.out.println("Discount of the Product:"+Discount);
				
//add to cart				
				d.findElement(By.xpath("(//button[contains(text(),'Add to cart')])[4]")).click();
				d.findElement(By.xpath("(//div[@id='ewc-compact-actions-container']/descendant::a)[2]")).click();
//Title
				
				String Title= d.getTitle();
				
				System.out.println("Current Title:"+Title);
				
				
//Quit
				d.close();
				
				
}

}
