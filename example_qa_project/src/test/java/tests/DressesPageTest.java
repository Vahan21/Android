package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.DressesPageObject;
import utils.ApplicationProperties;

/**
 * This class executes tests to ensure the 'dresses' section of the page of the website works as expected.
 */
public class DressesPageTest {
    private DressesPageObject dressesPageObject;
    private WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setupTestBeforeClass() {
        driver = new ChromeDriver();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownTestAfterClass() {
        driver = null;
    }

    @BeforeMethod(alwaysRun = true)
    public void setupTestBeforeMethod() {
        dressesPageObject = new DressesPageObject(driver);
        driver.navigate().to(ApplicationProperties.webPageURL);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownTestAfterMethod() {
        driver.quit();
    }

    /**
     * This case verifies the subcategories of dresses are displayed.
     */
    @Test(groups = {"smoke"})
    public void verifySubcategories() {
        System.out.println("==========================");
        System.out.println("verifySubcategories");
        System.out.println("==========================");
        dressesPageObject.navigateToDressesSection();

        boolean isSubcategoriesDisplayed = dressesPageObject.isSubcategoriesDisplayed();
        Assert.assertTrue(isSubcategoriesDisplayed, ApplicationProperties.SUBCATEGORIES_ARE_NOT_DISPLAYED_PROPERLY);
    }

    /**
     * This case verifies the subcategories of dresses are displayed.
     */
    @Test
    public void verifyPopularDresses() {
        System.out.println("==========================");
        System.out.println("verifyPopularDresses");
        System.out.println("==========================");
        dressesPageObject.navigateToDressesSection();

        boolean isPopularDressesDisplayed = dressesPageObject.isDressesCategoriesDisplayed();
        Assert.assertTrue(isPopularDressesDisplayed, ApplicationProperties.CATEGORIES_ARE_NOT_DISPLAYED_PROPERLY);
    }
}