import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormularBDD {
    private static WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterEach
    public void CleanUp() {
        driver.close(); // jen uzavře okno prohlížeče
        driver.quit();  // zrušení objektu driver
    }






    @Given("Uzivatel je na strance s formularem")
    public void uzivatelJeNaStranceSFormularem() {

    }

    @When("Uzivatel napise do input jmeno {string}")
    public void uzivatelNapiseDoInputJmeno(String name) {

    }

    @And("Uzivatel napise do input email {string}")
    public void uzivatelNapiseDoInputEmail(String email) {

    }

    @And("Uzivatel klikne na radiobutton Male")
    public void uzivatelKlikneNaRadiobuttonMale() {

    }

    @And("Uzivatel klikne na radiobutton Female")
    public void uzivatelKlikneNaRadiobuttonFemale() {

    }

    @Then("Uzivatel vidi zaskrtnuty radiobutton Female")
    public void uzivatelVidiZaskrtnutyRadiobuttonFemale() {

    }

    @And("Uzivatel vidi odskrtnuty radiobutton Male")
    public void uzivatelVidiOdskrtnutyRadiobuttonMale() {

    }
}
