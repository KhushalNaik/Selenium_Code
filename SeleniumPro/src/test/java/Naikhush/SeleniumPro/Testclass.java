package Naikhush.SeleniumPro;
//write by own  next line 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//addding maven rpo in pom.xml file and open a browser by giving cmd 
		WebDriver de = new ChromeDriver();
		de.get("https://www.youtube.com");

	}

}
