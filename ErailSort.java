package week3.day2;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		driver.findElement(By.id("txtStationFrom")).clear();
		WebElement from=driver.findElement(By.id("txtStationFrom"));
		from.sendKeys("MS");
		from.sendKeys(Keys.TAB);
		driver.findElement(By.id("txtStationTo")).clear();
		WebElement To=driver.findElement(By.id("txtStationTo"));
		To.sendKeys("BCT");
		To.sendKeys(Keys.TAB);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		List<WebElement>trainNames=(driver.findElements(By.xpath("//*[@id=\"divTrainsList\"]/table[1]/tbody/tr[1]/td[2]/a")));
		int size=trainNames.size();
		System.out.println("Number of Train Names: " +size);
		for(int i=0;i<size;i++) {
			String trainNam=trainNames.get(i).getText();
			System.out.println("Train Name: " +trainNam);}
		for(WebElement trname:trainNames) {
			System.out.println("Train Names: " +trname.getText());
		}
	}

}

//public class ErailSort {
//
//	public static void main(String[] args) throws InterruptedException {
//		Launch the browser
		
//		Launch the URL - https://erail.in/
		
//		Uncheck the check box - sort on date
		
//		clear and type in the source station 
		
//		clear and type in the destination station
		
//		Find all the train names using xpath and store it in a list
		
//		Use Java Collections sort to sort it and then print it
		
//	}