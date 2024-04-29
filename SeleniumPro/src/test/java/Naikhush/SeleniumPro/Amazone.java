package Naikhush.SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d3 = new ChromeDriver();
		d3.manage().window().maximize();
		d3.get("https://www.amazon.in");
		//selecting  value by linktext basically  link text is displaying  text on site
		d3.findElement(By.linkText("Today's Deals")).click();
		//now using js for scroll down
		//create a object with up casting
		JavascriptExecutor js = (JavascriptExecutor) d3;
//		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("window.scrollBy(0,500)");
	
		//geting value to a scroll bar
		d3.findElement(By.linkText("Deal of the day")).click();
		
		
		

	}

}
