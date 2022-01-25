package SeleniumDemo;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * SeleniumDemo
 *
 * @author yuhl
 * @date 2022/1/25
 */
public class DriverDemo1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\test\\chromedriver.exe");//下载的chromedriver位置
        WebDriver driver = new ChromeDriver();//实例化ChromeDriver对象
        String url = "http://192.168.30.236:8000/user/login";

//        driver.findElement(By.id("userName")).click();
//        driver.findElement(By.id("userName")).sendKeys("admin");
//        driver.findElement(By.id("password")).click();
//        driver.findElement(By.id("password")).sendKeys("zs@2022");
        driver.manage().window().maximize();//最大化窗口
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//查找元素最大等待时间
        driver.get(url);//打开指定网站
        System.out.println(driver.manage().getCookies());

        Cookie c1 =new Cookie("JSESSIONID","WsARcr8H2Uzto8b1cWCpi4fsbI8Ot-1teGCBpX23");
        Cookie c2 =new Cookie("OAUTH2SESSION","11kbZ26r4GIJq2WwDsyFIynRGnP7SHtnd4ciYsVG");


        driver.manage().addCookie(c1);
        driver.manage().addCookie(c2);

        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("localStorage.setItem('access_token','7bab0ec1-19e5-4cc2-85ff-ba84b7b467ea')");
        driver.get(url);//打开指定网站
        driver.navigate().refresh();
        Thread.sleep(2000);
    }

}
