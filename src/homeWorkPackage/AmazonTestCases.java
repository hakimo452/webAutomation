package homeWorkPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonTestCases {


    //We declared the Url :
    static String AmazonUrl ="https://www.amazon.com/";

    // Static WebDriver ;
    static WebDriver driver;




    public static void main(String[] args) throws InterruptedException {
        getUrl();
        NavigateTo();
        SignIn();
        enterEmail();
        SearchBox();
        clickSearch();
        SelectCologne();
        AmazonPrime();
        AddToCart();
        Checkout();


    }

    // 1st test case :
    public static void getUrl(){
        System.setProperty("webdriver.chrome.driver","browserDriver/macBrowser/chromedriver");
        WebDriver driver1 = new ChromeDriver();
        driver1.get(AmazonUrl);


    }

    // 2nd test case :
    public static void NavigateTo() throws InterruptedException {
        // We set the path of the chrome Driver
        System.setProperty("webdriver.chrome.driver","browserDriver/macBrowser/chromedriver");
        // we declared the web driver reference variable
        driver = new ChromeDriver();
        driver.get(AmazonUrl);
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println("Amazon.com");

        if (title.equals("Amazon.com")){
            System.out.println("title is correct");
        }else {
            System.out.println("the title is not correct");
        }
        driver.close();

    }


    // 3rd test case :
    public static void SignIn() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","browserDriver/macBrowser/chromedriver");
        driver = new ChromeDriver();
        driver.get(AmazonUrl);
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.close();


    }

    // 4th test case :
    public static void enterEmail(){
        System.setProperty("webdriver.chrome.driver","browserDriver/macBrowser/chromedriver");
        driver = new ChromeDriver();
        driver.get(AmazonUrl);
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("hakimrai@live.fr");

    }

    // 5th test case :
    public static void SearchBox(){

        System.setProperty("webdriver.chrome.driver","browserDriver/macBrowser/chromedriver");
        driver = new ChromeDriver();
        driver.get(AmazonUrl);
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("colognes");
        driver.close();

    }


    // 6th test case :
    public static void clickSearch(){
        System.setProperty("webdriver.chrome.driver","browserDriver/macBrowser/chromedriver");
        driver = new ChromeDriver();
        driver.get(AmazonUrl);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("colognes");
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        driver.close();
    }



    // 7th test case :

    public static void SelectCologne(){
        System.setProperty("webdriver.chrome.driver","browserDriver/macBrowser/chromedriver");
        driver= new ChromeDriver();
        driver.get(AmazonUrl);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("colognes for men");
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        driver.findElement(By.cssSelector("#b6988f18-132d-4b2f-988f-18132ddb2f5e > div > div.sb_2vdjSJEF > div.sb_Azvq332I.sb_ji55L-0S.sb_1-64HM9_ > div > div > a:nth-child(1) > span > span")).click();
        driver.close();

    }

    // 8th test case :

    public static void AmazonPrime(){
        System.setProperty("webdriver.chrome.driver","browserDriver/macBrowser/chromedriver");
        driver = new ChromeDriver();
        driver.get(AmazonUrl);
        driver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a[2]")).click();
        driver.close();

    }

    // 9th test case :
    public static void AddToCart(){
        System.setProperty("webdriver.chrome.driver","browserDriver/macBrowser/chromedriver");
        driver = new ChromeDriver();
        driver.get(AmazonUrl);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("colognes for men");
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        driver.findElement(By.xpath("//*[@id=\"8921dbd2-0f9e-468b-a1db-d20f9ec68b96\"]/div/div[2]/div[2]/div/div/a[1]/span/span")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        //driver.close();

    }

    // 10th test case :
    public static void Checkout() throws InterruptedException {
        driver= new ChromeDriver();
        driver.get(AmazonUrl);
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("colognes for men");
        driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"8921dbd2-0f9e-468b-a1db-d20f9ec68b96\"]/div/div[2]/div[2]/div/div/a[1]/span/span")).click();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        driver.findElement(By.cssSelector("#hlb-ptc-btn-native")).click();
       // driver.close();
       // driver.quit();

    }







}