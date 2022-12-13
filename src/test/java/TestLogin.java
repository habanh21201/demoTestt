import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
@org.testng.annotations.Test(priority = 0)
        public void TestLogin01() {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://ivymoda.com/customer/login");

        WebElement account = driver.findElement(By.name("customer_account"));
        WebElement password = driver.findElement(By.name("customer_password"));
        WebElement login =driver.findElement(By.name("but_login_email"));
        account.sendKeys("panda.toila@gmail.com"); password.sendKeys("Banh0201");
        login.click();
        String actualUrl="https://ivymoda.com/customer/info";
        String expectedUrl= driver.getCurrentUrl();
        if(actualUrl.equalsIgnoreCase(expectedUrl)) {
                System.out.println("Test passed"); }
        else {
                System.out.println("Test failed");

        driver.close();
        }
}
        @org.testng.annotations.Test(priority = 1)
        public void TestLogin02() {
                WebDriver driver;
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

                driver.manage().window().maximize();

                driver.get("https://ivymoda.com/customer/login");

                WebElement account = driver.findElement(By.name("customer_account"));
                WebElement password = driver.findElement(By.name("customer_password"));
                WebElement login =driver.findElement(By.name("but_login_email"));
                account.sendKeys("panda.toila@gmail.com"); password.sendKeys("null");
                login.click();
                String actualUrl="https://ivymoda.com/customer/login";
                String expectedUrl= driver.getCurrentUrl();
                if(actualUrl.equalsIgnoreCase(expectedUrl)) {
                        System.out.println("Tên đăng nhập hoặc mật khẩu không hợp lệ / Test Passed"); }
                else {
                        System.out.println("Test failed");

                        driver.close();
                }
        }
        @org.testng.annotations.Test(priority = 2)
        public void TestLogin03() {
                WebDriver driver;
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

                driver.manage().window().maximize();


                driver.get("https://ivymoda.com/customer/login");

                WebElement account = driver.findElement(By.name("customer_account"));
                WebElement password = driver.findElement(By.name("customer_password"));
                WebElement login =driver.findElement(By.name("but_login_email"));
                account.sendKeys("abc"); password.sendKeys("123");
                login.click();
                String actualUrl="https://ivymoda.com/customer/login";
                String expectedUrl= driver.getCurrentUrl();
                if(actualUrl.equalsIgnoreCase(expectedUrl)) {
                        System.out.println("Tên đăng nhập hoặc mật khẩu không hợp lệ / Test Passed"); }
                else {
                        System.out.println("Test failed");

                        driver.close();
                }
        }
        @org.testng.annotations.Test(priority = 3)
        public void TestLogin04() {
                WebDriver driver;
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

                driver.manage().window().maximize();


                driver.get("https://ivymoda.com/customer/login");

                WebElement account = driver.findElement(By.name("customer_account"));
                WebElement password = driver.findElement(By.name("customer_password"));
                WebElement login =driver.findElement(By.name("but_login_email"));
                account.sendKeys(" "); password.sendKeys(" ");
                login.click();
                String actualUrl="https://ivymoda.com/customer/login";
                String expectedUrl= driver.getCurrentUrl();
                        if(actualUrl.equalsIgnoreCase(expectedUrl)) {
                        System.out.println("Vui lòng nhập đầy để thông tin đăng nhập / Test Passed"); }
                        else {
                        System.out.println("Test failed");


                        driver.close();
                }
        }
}


