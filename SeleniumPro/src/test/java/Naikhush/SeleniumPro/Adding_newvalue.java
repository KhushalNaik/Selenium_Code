package Naikhush.SeleniumPro;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adding_newvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.facebook.com");
		//maximize screen size
		d1.manage().window().maximize();
		//adding values in text box
		d1.findElement(By.xpath("//input[@id='email']")).sendKeys("mrmonster");
		d1.findElement(By.xpath("//input[@id='pass']")).sendKeys("mrmonster@55");
		//d1.findElement(By.xpath("//div[@id='u_0_4_tW']")).click();
		d1.findElement(By.name("login")).click();
		//successfully entering the value and click on login button 
		

	}

}
