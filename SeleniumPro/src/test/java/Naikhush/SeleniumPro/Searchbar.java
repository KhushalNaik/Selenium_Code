package Naikhush.SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//entering value in search bar  
		WebDriver d2 = new ChromeDriver();
		d2.manage().window().maximize();
		d2.get("https://www.google.com");
		d2.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Khushal Naik",Keys.ENTER);
		///this use adfter search to the enter
		

	}

}
