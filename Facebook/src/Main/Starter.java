package Main;

import ObjectRepo.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Starter {

	public Properties p = new Properties();
	public WebDriver driver;

	@BeforeTest
	public void Setup() throws IOException {

		Properties p = new Properties();
		FileInputStream f = new FileInputStream("/home/harish/Desktop/\\/Facebook/prop.properties");
		p.load(f);

		System.setProperty("webdriver.chrome.driver", p.getProperty("cpath"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	}

	@Test
	public void Login() throws IOException {
		FileInputStream f = new FileInputStream("/home/harish/Desktop/\\/Facebook/prop.properties");
		Properties g = new Properties();
		g.load(f);
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		Login_objects lo = new Login_objects(driver);
		lo.email().sendKeys(g.getProperty("email"));
		lo.pass().sendKeys(g.getProperty("pass"));
		lo.submit().click();
		System.out.println(lo.pagetitle());
	}

	@Test
	public void more() {
		
		Home_page hp = new Home_page(driver);
		WebElement s;
		s = hp.seemore();
		
//		
//		hp.seemore().click();
//		
		System.out.println(s.isDisplayed());

		System.out.println(s.isEnabled());
	}

	@AfterTest
	public void Teardown() {

		driver.close();
	}

}