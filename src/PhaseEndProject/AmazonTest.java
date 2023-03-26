package PhaseEndProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step-1:Launch the browser,		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.amazon.in/");
		
		//Step-2:Maximise the browser.		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Samsung Mobile");
		
		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		searchbutton.click();
		
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='a-section']//h2//span"));
		List<WebElement> currency = driver.findElements(By.xpath("//div[@class='sg-row']//span[@class='a-price-symbol']"));	
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='sg-row']//span[@class='a-price-whole']"));
		
		
		for(int i=0; i<name.size();i++) {
			System.out.println("The total number of Samsung Mobile " + name.get(i).getText());			
			System.out.println("The Price of Samsung Mobile " + currency.get(i).getText() + " " + price.get(i).getText());
		}
		
		////div[@class='sg-row']//span[@class='a-price-symbol']
		

		
		

	}

}
