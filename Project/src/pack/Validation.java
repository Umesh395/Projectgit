package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91880\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.imdb.com/title/tt9389998/");
		
		WebElement date = driver.findElement(By.xpath("(//a[@href='/title/tt9389998/releaseinfo?ref_=tt_dt_rdat'])[2]"));
		String text = date.getText();
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.xpath("//a[@href='/search/title/?country_of_origin=IN&ref_=tt_dt_cn']"));
		String text1=country.getText();
		
		driver.navigate().to("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		
		Thread.sleep(3000);
		WebElement date1 = driver.findElement(By.xpath("(//div[@class='plainlist']) [4]"));
		Thread.sleep(3000);
		String text2=date1.getText();
		WebElement country1 = driver.findElement(By.xpath("//td[text()='India']"));
		String text3=country1.getText(); 
		
				if(text.equals(text2)){
					
				    System.out.println("Pass");
				}
				else
				{
					System.out.println("Fail");
				}
				
				if(text1.equals(text3))
				{ 
					System.out.println("Pass");
				}
				else
				{
				    System.out.println("Fail");
				}
	}
	
	
}
