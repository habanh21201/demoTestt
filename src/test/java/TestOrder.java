import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class TestOrder {
    @org.testng.annotations.Test(priority = 0)
    public void TestOder01() {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://ivymoda.com/customer/login");
        driver.findElement(By.name("customer_account")).sendKeys("panda.toila@gmail.com");
        driver.findElement(By.name("customer_password")).sendKeys("Banh0201");
        driver.findElement(By.name("but_login_email")).click();
        driver.findElement(By.name("q")).sendKeys("Áo len");
        driver.findElement(By.className("submit")).click();
        driver.findElement(By.xpath("//*[@class=\"products\"]/div/div/div[2]/div/div[5]/div/div[1]/div[1]/a")).click();




        String actualUrl = "https://ivymoda.com/thanhtoan/giohang";
        String expectedUrl = driver.getCurrentUrl();
        if (actualUrl.equalsIgnoreCase(expectedUrl)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");


            driver.close();
        }
    }
}