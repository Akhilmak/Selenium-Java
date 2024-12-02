import files.HtmlControls;
import files.TestingWebPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver(); //ChromeDriver ->chrome, GeckoDriver-> Firefox,->edgeDriver -> Edge
//        driver.get("https://www.google.com");

//        TestingWebPages testingWebPages = new TestingWebPages();
//        testingWebPages.testPage("https://github.com/login"); // for github login page

        HtmlControls controls = new HtmlControls();
        controls.workingWithHtmlControls("https://www.hyrtutorials.com/p/basic-controls.html");
    }
}