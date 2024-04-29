package Naikhush.SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shift_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d4 = new ChromeDriver();
		//creating action class and using for keyboard  keys 
		Actions ac = new Actions(d4);
		d4.get("https://mail.rediff.com/cgi-bin/login.cgi");
		d4.manage().window().maximize();
		WebElement username = d4.findElement(By.id("login1"));
				ac.keyDown(username,Keys.SHIFT).sendKeys("khushal").build().perform();
				d4.findElement(By.xpath("//input[@id='password']")).sendKeys("naik");
	
			d4.findElement(By.id("eyeicon")).click();
			d4.findElement(By.name("proceed")).click();
		

	}
}
