package tests;

import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountRegistrationTests extends BaseTest {
    @Test
    @Description("Registration Sign in")
    public void accountRegistration() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://practice.automationtesting.in/",
                "Wrong URL!");
        navPage.getMyAccountLink().click();
    }
}
