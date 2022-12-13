import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFind {
    @Test(priority = 0)
    public void testFind1() {
            WebDriver driver;
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("https://ivymoda.com/");
            WebElement find = driver.findElement(By.name("q"));
            WebElement clickFind = driver.findElement(By.className("submit"));
            find.sendKeys("Dress");
            clickFind.click();
            String actualUrl="https://ivymoda.com/tim-kiem?q=Dress";
            String expectedUrl= driver.getCurrentUrl();
            if(actualUrl.equalsIgnoreCase(expectedUrl)) {
            System.out.println("Test passed");
            } else { System.out.println("Test failed");


            driver.close();
        }

        }
    @Test(priority = 1)
    public void testFind2() {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://ivymoda.com/");
        WebElement find = driver.findElement(By.name("q"));
        WebElement clickFind = driver.findElement(By.className("submit"));
        find.sendKeys("null");
        clickFind.click();
        String actualUrl="https://ivymoda.com/tim-kiem?q=null";
        String expectedUrl= driver.getCurrentUrl();
        if(actualUrl.equalsIgnoreCase(expectedUrl)) {
            System.out.println("Không tìm thấy kết quả phù hợp / Test passed");
        } else {
            System.out.println("Test failed");

            driver.close();
        }
    }
}

