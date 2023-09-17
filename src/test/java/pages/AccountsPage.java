package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountsPage {
    private final WebDriver driver;

    public AccountsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickContinueButton() {
        driver.findElement(By.id("continue-button")).click();
    }

    public void hoverOverPersonalBanking() {
    	WebElement elementToHover = driver.findElement(By.cssSelector(".mega.menu-item-1162"));
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(elementToHover));
        actions.moveToElement(elementToHover).perform();
    }

    public void clickCurrentAccountLink() {
    	WebElement subMenu = driver.findElement(By.xpath("//li[@class='lvl3menu-item 1640']//a[normalize-space()='Current Account']"));
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(subMenu));
    	actions.moveToElement(subMenu);
    	actions.click().build().perform();
    }

    public void clickFeaturesAndBenefits() {
        driver.findElement(By.id("#features-and-benefits")).click();
    }

    public void clickRequirements() {
        driver.findElement(By.id("#requirements")).click();
    }

    public void clickAvailableChannels() {
        driver.findElement(By.id("#available-channels")).click();
    }

    public void validatePresence(String item) {
        WebElement element = driver.findElement(By.xpath("//*[contains(text(), '" + item + "')]"));
        if (element.isDisplayed()) {
            System.out.println(item + " is present on the page.");
        } else {
            System.out.println(item + " is not present on the page.");
        }
    }
}
