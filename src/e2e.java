import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Chromedriver\\\\chromedriver-win64\\\\chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).sendKeys("delhi");
//css-76zvg2 r-1srvcxg
		driver.findElement(By.xpath("//div[@data-testid='css-76zvg2 r-1srvcxg']")).click();
	}
}
