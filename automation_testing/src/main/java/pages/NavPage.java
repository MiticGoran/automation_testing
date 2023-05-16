package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavPage extends BasePage {
    public NavPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getShopLink() {
        return driver.findElement(By.id("menu-item-40"));
    }
    public WebElement getMyAccountLink() {
        return driver.findElement(By.id("menu-item-50"));
    }
    public WebElement getTestCasesLink() {
        return driver.findElement(By.id("menu-item-224"));
    }
    public WebElement getATSiteLink() {
        return driver.findElement(By.id("menu-item-244"));
    }
    public WebElement getCartLink() {
        return driver.findElement(By.id("menu-item-251"));
    }
    public WebElement getDemoSiteLink() {
        return driver.findElement(By.id("wpmenucartli"));
    }
    public WebElement getSearchLink() {
        return driver.findElement(By.id("s"));
    }
}
