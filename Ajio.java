package week3.day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		WebElement search = driver.findElement(By.name("searchVal"));
		search.sendKeys("bags");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"facets\"]/div[2]/ul/li[2]/div/div[2]/ul/li[3]/div/div/label")).click();
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total Items: " + totalItems);
		List<WebElement> totalBrands = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("LIST OF BRANDS:");
		for (WebElement brand : totalBrands) {
			System.out.println(brand.getText());
		}
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='name']"));
		System.out.println("BAG NAMES:");
		for (WebElement name1 : names) {
			System.out.println(name1.getText());
		}
	}

}

//*NOTE: Java code is attached for your reference.*
//
//1. Launch the URL https://www.ajio.com/
//2. In the search box, type as "bags" and press enter
//3. To the left  of the screen under " Gender" click the "Men"
//4. Under "Category" click "Fashion Bags"
//5. Print the count of the items Found. 
//6. Get the list of brand of the products displayed in the page and print the list.
//7. Get the list of names of the bags and print it