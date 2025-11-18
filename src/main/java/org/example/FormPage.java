package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage {
    private WebDriver driver;

    private final By formName = By.id("name");
    private final By femaleRadioButton = By.xpath("//*[@id=\"practiceForm\"]/div[3]/div/div/div[2]/input");
    private final By maleRadioButton = By.id("gender");

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnFemaleRadioButton() {
        driver.findElement(femaleRadioButton).click();
    }

    public void clickOnMaleRadioButton() {
        driver.findElement(maleRadioButton).click();
    }

    public boolean isFemaleRadioButtonChecked() {
        return driver.findElement(femaleRadioButton).isSelected();
    }
}
