import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")));
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("checkBoxOption1")));
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
	}
}
