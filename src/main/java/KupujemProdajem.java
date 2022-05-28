import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KupujemProdajem {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("http://kupujemprodajem.com/");

        WebElement popout = driver.findElement(By.xpath("//*[@id=\"bodyTag\"]/div[9]/div/div[2]"));
        popout.click();

        WebElement search = driver.findElement(By.xpath("//*[@id=\"searchKeywordsInput\"]"));
        search.sendKeys("iphone 13");
        search.sendKeys(Keys.ENTER);

        WebElement firstAd = driver.findElement(By.xpath("//*[@id=\"adDescription7321776\"]/div/section[2]/div[1]/div[1]/a"));

        WebElement expectedFirstAd = driver.findElement(By.xpath("//*[@id=\"adDescription7321776\"]/div/section[2]/div[1]/div[1]/a"));

        if(firstAd.equals(expectedFirstAd)) {
            System.out.println("Valid!");
        }

    }
}
