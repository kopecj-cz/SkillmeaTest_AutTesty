package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class Form {
        private static WebDriver driver;

        @BeforeEach
        public void setUp() {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        @Test
        public void formTest() {
            driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
            driver.findElement(By.id("name")).sendKeys("Jakub Kopec");
            driver.findElement(By.id("email")).sendKeys("hill@email.com");
            driver.findElement(By.id("gender")).click();
            driver.findElement(By.xpath("//*[@id=\"practiceForm\"]/div[3]/div/div/div[2]/input")).click();

            assertTrue(driver.findElement(By.xpath("//*[@id=\"practiceForm\"]/div[3]/div/div/div[2]/input")).isSelected());
            assertFalse(driver.findElement(By.id("gender")).isSelected(), "Je to porouchané");


        }





    }




