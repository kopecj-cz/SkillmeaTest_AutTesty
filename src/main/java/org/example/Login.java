package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;


public class Login {
  private static WebDriver driver;

  @BeforeEach
  public void setUp() {
    /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\42077\\IdeaProjects\\SkillmeaSelenium\\src\\main\\resources\\chromedriver.exe");
    driver = new ChromeDriver();*/

    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
  }

  @Test
  public void testLogin() {
    driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
    driver.findElement(By.id("password")).sendKeys("test123");
    driver.findElement(By.id("email")).sendKeys("MasterChief@email.cz");
    driver.findElement(By.xpath("//input[@value='Login']")).click();
    assertEquals("Welcome, Login In", driver.findElement(By.xpath("//*[@id=\"signInForm\"]/h1")).getText());
  }




}
