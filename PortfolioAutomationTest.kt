package com.bryancutkelvin

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.Assert.assertEquals
import org.testng.Assert.assertTrue
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

class PortfolioAutomation {
    private var driver: WebDriver? = null

    @BeforeTest
    fun createDriver() {
        System.setProperty("webdriver.chrome.driver", "/home/mrbcut/intellij/chromedriver")
        driver = ChromeDriver()
    }

    @AfterTest
    fun tearDown() {
        driver!!.quit()
    }

    @Test
    fun testLoadHomePage() {
        val url = "https://bryancutkelvin.com/"
        driver!!.get(url)
        assertEquals(driver!!.currentUrl, url, "Portfolio Home page url not correct")
    }

    @Test
    fun testMainHeaderTextAppears()
    {
        val headerText = By.cssSelector(".jumbotron" )
        val headerTextElement: WebElement = driver!!.findElement(( headerText))
        assertTrue( headerTextElement.isDisplayed, "Header text did not display")
    }

    @Test
    fun testMainHeaderTextIsCorrect()
    {
        val headerTextSelector = ".jumbotron"
        val headerTextElement:WebElement = driver!!.findElement(By.cssSelector(headerTextSelector))
        val expectedHeaderTextElement = "bryancutkelvin.com"
        assertEquals(headerTextElement.text, expectedHeaderTextElement, "Header Text string not correct")
    }
}