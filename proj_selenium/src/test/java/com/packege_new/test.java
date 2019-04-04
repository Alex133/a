package com.packege_new;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test {
    WebDriver wd;


    @BeforeClass
    public void setUP() {
        wd = new ChromeDriver();


    }

    @Test
    public void opengoogleTest() {
        wd.get("https://google.com/");

    }

    @AfterClass
    public void tearDown() {
        wd.quit();

    }
}
