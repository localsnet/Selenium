import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewEmptyJUnitTest {
     //@Test
  //public void hello() {
public static String chromeDriverPath = "/usr/bin/chromedriver";
    public static void main(String[] args) {



System.setProperty("webdriver.chrome.driver", chromeDriverPath);

WebDriver driver = new ChromeDriver();
  //@Test
  //public void hello() {
   // public static void main(String[] args) {
   // WebDriver driver  = new ChromeDriver();
    
/* driver.navigate().to("http://softwaretestingbooks.com/");
 
String appTitle = driver.getTitle();
 
System.out.println("Application title is : "+appTitle);
    driver.quit();*/

//Pasted retrieving part

//Open 'Home' Page
		driver.get("http://book.theautomatedtester.co.uk");
		//Maximize the Browser window
		driver.manage().window().maximize();
		//Retrieve the Heading elements text and store the retrieved text in a string object
		String heading_text = driver.findElement(By.className("mainheading")).getText();
                System.out.println("Printing " + heading_text);
                driver.quit();
  }
}