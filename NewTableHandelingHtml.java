import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewTableHandelingHtml {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		chromeOptions.addArguments("disable-notifications");
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://htmlcolorcodes.com/colors/shades-of-red/");
		driver.manage().window().maximize();

		List<WebElement> element = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		System.out.println(element.size());

		//Thread.sleep(50);
		//for (WebElement webElement : element) {
		for(int i=0;i<element.size();i++) {
			 System.out.println(element.get(i).getText());
			
			if(element.get(i).getText().equalsIgnoreCase("Marsala")) {
				
				WebElement element2 = driver.findElement(By.xpath("//a[.='Marsala']"));
				
				element2.click();
//				JavascriptExecutor js = (JavascriptExecutor)driver;
//				js.executeScript("arguments[0].click()", element);
				break;
			}
		}

	}
}
