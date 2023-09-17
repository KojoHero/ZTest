package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AccountsPage;

public class AccountsTest {
    static WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.zenithbank.com/");
    }

    @Test
    public void testCurrentAccount() {
        AccountsPage accountsPage = new AccountsPage(driver);
        accountsPage.clickContinueButton();
        accountsPage.hoverOverPersonalBanking();
        accountsPage.clickCurrentAccountLink();
        accountsPage.clickFeaturesAndBenefits();
        accountsPage.validatePresence("Zero account opening balance");
        accountsPage.validatePresence("Internet Banking");
        accountsPage.validatePresence("Zenith Mobile Banking app");
        accountsPage.validatePresence("*966# Eazybanking");
        accountsPage.validatePresence("MasterCard/Visa/Verve debit card");
        accountsPage.validatePresence("Email/SMS Alertz");
        accountsPage.validatePresence("Cheque book");
        
        accountsPage.clickRequirements();
        accountsPage.validatePresence("Account opening form duly completed");
        accountsPage.validatePresence("One recent clear passport photograph of signatory");
        accountsPage.validatePresence("Identification of signatories (Driver’s License, International Passport");
        accountsPage.validatePresence("Residence permit (where applicable)");
        accountsPage.validatePresence("Two independent and satisfactory references");
        accountsPage.validatePresence("Public Utility Receipt dated within the last three months (PHCN bill, water rate bill, tenement rate, rent");

        accountsPage.clickAvailableChannels();
        accountsPage.validatePresence("In-branch at any Zenith Bank branch");
        accountsPage.validatePresence("Zenith Bank ATM nation-wide – free cash withdrawal");
        accountsPage.validatePresence("Zenith Internet Banking");
        accountsPage.validatePresence("Zenith Mobile Banking App – 24/7 on your smart phone");
        accountsPage.validatePresence("*966# Eazybanking");
        accountsPage.validatePresence("ZenithDirect – our 24/7 telephone banking");
        accountsPage.validatePresence("Access your account using your Zenith Bank debit card at participating merchant stores for payment of goods");
    }

    @AfterSuite
    public void teardown() {
        driver.close();
    }
}
