import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test {  public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.meevo.com/");
    driver.manage().window().maximize();
    System.out.println("Open Website");

    Thread.sleep(3000);
    WebElement buttonAgree = driver.findElement(By.className("css-47sehv"));
    buttonAgree.click();
    System.out.println("Clicked Agree");

    Thread.sleep(3000);
    WebElement company = driver.findElement(By.xpath("//nav//a[text()='Company']"));
    company.click();
    System.out.println("Opened Company Menu");

    Thread.sleep(3000);
    WebDriverWait waitForCareers = new WebDriverWait(driver, Duration.ofSeconds(15));
    WebElement careers = waitForCareers.until(ExpectedConditions.elementToBeClickable(By.xpath("//nav//a[text()='Careers']")));
    careers.click();
    System.out.println("Opened Careers Page");

    Thread.sleep(3000);
    WebElement buttonPositions = driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[2]/main[1]/section[8]/div[1]/div[1]/article[1]/p[1]/a[1]/strong[1]"));
    Actions scrollDown = new Actions(driver);
    scrollDown.moveToElement(buttonPositions).perform();
    Thread.sleep(3000);
    buttonPositions.click();
    System.out.println("Scrolled down and clicked See All Open Positions");

    Thread.sleep(3000);
    String originalTab = driver.getWindowHandle();
    for (String newTab : driver.getWindowHandles()) {
        if (!newTab.equals(originalTab)) {
            driver.switchTo().window(newTab);
            break;
        }
    }

    String pageText= driver.getPageSource();
    assertTrue(pageText.contains("Current Openings"));
    System.out.println("We are on correct page");

    Thread.sleep(3000);
    driver.quit();
    System.out.println("Closed Browser");

}
}
