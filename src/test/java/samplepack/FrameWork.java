package samplepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameWork {
	@Test
	void meth1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1555g\\Downloads\\Seleniumdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php/");
	}
	@Test
	void meth2() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1555g\\Downloads\\Seleniumdriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/samples.php/");
	}
}
