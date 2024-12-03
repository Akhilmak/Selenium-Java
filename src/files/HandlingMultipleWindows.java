package files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandlingMultipleWindows {

    public void windowsHandler(String url) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        System.out.println(driver.getTitle()+"..."+driver.getWindowHandle());
        Thread.sleep(1000);
        driver.findElement(By.id("newWindowBtn")).click();
        Set<String> windowHandles=driver.getWindowHandles();
        for(String windowHandle:windowHandles){
            System.out.println(windowHandle+"..."+driver.getTitle()+"..."+driver.getWindowHandle());
            Thread.sleep(1000);
        }
        driver.close();

    }
}
