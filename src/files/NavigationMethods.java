package files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {
    public void workingWithNavigations(String Url) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get(Url);
        driver.findElement(By.id("APjFqb")).sendKeys("Hello"); //google.com search bar id //Searches for hello
        Thread.sleep(1000);
        driver.findElement(By.id("APjFqb")).submit(); //Enter to submit mode submit and search bar in same element
        Thread.sleep(1000);
        driver.navigate().to("https://www.facebook.com/"); //navigates to facebook.com from Url bar (Browser url bar)
        Thread.sleep(1000);
        driver.navigate().refresh(); //refreshes page
        Thread.sleep(1000);
        driver.navigate().back();  //goes back to google search hello page
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000); //goes again to fb.com
    }
}
