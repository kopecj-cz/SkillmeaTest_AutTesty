import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.FormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FormularBDD {
    private WebDriver driver;
    private FormPage formPage;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        formPage = new FormPage(driver);
    }

    @After
    public void CleanUp() {
        driver.close();
        driver.quit();
    }

    @Given("Uzivatel je na strance s formularem")
    public void uzivatelJeNaStranceSFormularem() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
    }

    @When("Uzivatel napise do input jmeno {string}")
    public void uzivatelNapiseDoInputJmeno(String name) {
        driver.findElement(By.id("name")).sendKeys(name);
    }

    @And("Uzivatel napise do input email {string}")
    public void uzivatelNapiseDoInputEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    @Then("Uzivatel vidi zaskrtnuty radiobutton Female")
    public void uzivatelVidiZaskrtnutyRadiobuttonFemale() {
        assertTrue(formPage.isFemaleRadioButtonChecked());
    }

    @And("Uzivatel vidi odskrtnuty radiobutton Male")
    public void uzivatelVidiOdskrtnutyRadiobuttonMale() {
        assertFalse(driver.findElement(By.id("gender")).isSelected());
    }

    @And("Uzivatel klikne na radiobutton {string}")
    public void uzivatelKlikneNaRadiobutton(String pohlavi) {
        if (pohlavi.equals("male")) {
            formPage.clickOnMaleRadioButton();
        }
        else if (pohlavi.equals("female")) {
            formPage.clickOnFemaleRadioButton();
        }
    }
}
