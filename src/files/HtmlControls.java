package files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlControls {
    public void workingWithHtmlControls(String url) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //Text Boxes
        WebElement firstName=driver.findElement(By.id("firstName"));
        WebElement lastName=driver.findElement(By.id("lastName"));
        TextBoxes(driver,firstName,"Akhil");
        Thread.sleep(2000);
        TextBoxes(driver,lastName,"Madineni");
        Thread.sleep(2000);

        WebElement maleGenderRadio=driver.findElement(By.id("malerb"));
        WebElement femaleGenderRadio=driver.findElement(By.id("femalerb"));
        radioButtons(driver,maleGenderRadio);
        Thread.sleep(2000);
        radioButtons(driver,femaleGenderRadio);
        WebElement checkBox=driver.findElement(By.id("englishchbx"));
        radioButtons(driver,checkBox);
        W


    }

    public void TextBoxes(WebDriver driver, WebElement element, String input) throws InterruptedException {
        if(element.isDisplayed()){
            if(element.isEnabled()){
                element.sendKeys(input);
                String username=element.getAttribute("value");
                System.out.println(username);
                Thread.sleep(3000);
//                element.clear();
            }else{
                System.err.println("Element is not Enabled");
            }
        }else{
            System.err.println("Element is not displayed");
        }
    }

    public  void radioButtons(WebDriver driver,WebElement element){
        element.click();
    }
}
