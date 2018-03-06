package mar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Vincent {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "E:\\Edge\\EDGE OLD\\Selenium Folder\\Gecko\\geckodriver.exe");
	WebDriver d=new FirefoxDriver();
d.manage().window().maximize();
d.get("http://newtours.demoaut.com");
d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

d.findElement(By.name("userName")).sendKeys("Admin");
d.findElement(By.name("password")).sendKeys("mercury");
d.findElement(By.name("login")).click();

String expval="Find a Flight: Mercury Tours";
String acval=d.getTitle();



	
}
}
