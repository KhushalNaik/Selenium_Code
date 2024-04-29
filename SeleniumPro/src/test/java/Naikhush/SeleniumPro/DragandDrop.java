package Naikhush.SeleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d5 = new ChromeDriver();
//		 Actions a = new Actions(d5);
		 d5.get("C:\\Users\\KHUSHAL\\Desktop\\khush");
		 d5.manage().window().maximize();
		 d5.findElement(By.linkText("movies/")).click();
		 d5.findElement(By.linkText("[MM] Good Bye (2022) Hindi HDRip.mkv")).isSelected();

	}

}
