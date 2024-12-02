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
        driver.get(url); //opens the url
        Thread.sleep(3000); //Make the code run after 3 sec i.e slow down the process
//        highlight(driver,driver.findElement(By.id("login_field"))); //Id locator
//        Thread.sleep(3000);
//        highlight(driver,driver.findElement(By.name("password"))); // Name Locator
//        Thread.sleep(3000);
//        highlight(driver,driver.findElement(By.className("header-logo"))); // class locator
//        Thread.sleep(3000);
//        highlight(driver,driver.findElement(By.linkText("Forgot password?")));// link Text locator
//        Thread.sleep(3000);
//        highlight(driver,driver.findElement(By.partialLinkText("Create an")));// partial link text locator
//        Thread.sleep(3000);
//        highlight(driver,driver.findElement(By.tagName("h1")));// tag name locator use only unique tag-names

        //Reading And Giving Input to Text Boxes
        workingWithTextBoxes(driver,driver.findElement(By.id("login_field")));


    }
    public void highlight(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background:yellow')", element);
    }

    public void workingWithTextBoxes(WebDriver driver, WebElement element) throws InterruptedException {
        if(element.isDisplayed()){
            if(element.isEnabled()){
                element.sendKeys("Akhil");
                String username=element.getAttribute("value");
                System.out.println(username);
                Thread.sleep(3000);
                element.clear();
                Thread.sleep(1000);
                driver.close();
            }else{
                System.err.println("Element is not Enabled");
            }
        }else{
            System.err.println("Element is not displayed");
        }
    }

}
