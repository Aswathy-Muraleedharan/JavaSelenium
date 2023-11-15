import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");//will wait
		driver.navigate().to("https://rahulshettyacademy.com");//if basic image is found it will continue will not wait for 
		//every element to be loaded
		Thread.sleep(10000);
		driver.navigate().back();
	}

}
