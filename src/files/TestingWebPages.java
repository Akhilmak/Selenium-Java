package files;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingWebPages {
    public  void  testPage(String url) throws InterruptedException {

        // all these are for github login page only
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(3000); //Make the code run after 3 sec i.e slow down the process
        highlight(driver,driver.findElement(By.id("login_field"))); //Id locator
        Thread.sleep(3000);
        highlight(driver,driver.findElement(By.name("password"))); // Name Locator
        Thread.sleep(3000);
        highlight(driver,driver.findElement(By.className("header-logo"))); // class locator
        Thread.sleep(3000);
        highlight(driver,driver.findElement(By.linkText("Forgot password?")));// link Text locator
        Thread.sleep(3000);
        highlight(driver,driver.findElement(By.partialLinkText("Create an")));// partial link text locator
        Thread.sleep(3000);
        highlight(driver,driver.findElement(By.tagName("h1")));// tag name locator use only unique tag-names
    }
    public void highlight(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background:yellow')", element);
    }
}
