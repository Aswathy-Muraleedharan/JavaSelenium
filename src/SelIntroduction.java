import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {
	public static void main(String[] args)
	{
	// Invoking browser
		//chrome - ChromeDriver - >Methods
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AswathyM\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());// print the title in the console
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
		
	}
}