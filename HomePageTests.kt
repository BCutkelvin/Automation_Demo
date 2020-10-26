package bryancutkelvin

import com.bryancutkelvin.page.HomePage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.Assert
import org.testng.Assert.assertTrue
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

class HomePageTests
{
    private var driver: WebDriver? = null
    private var HomePage: HomePage? = null

    //see Page Object (HomePage.kt) for CSS selector definitions

    private val homePageUrl = "https://bryancutkelvin.com/"

    @BeforeTest
    fun createDriver() {
        System.setProperty("webdriver.chrome.driver", "/home/mrbcut/intellij/chromedriver")
        driver = ChromeDriver()
        HomePage = HomePage(driver!!)
    }

    @AfterTest
    fun tearDown() {
        driver!!.quit()
    }

    @Test
    fun testLoadHomePage() {
        driver!!.get(homePageUrl)
        Assert.assertEquals(driver!!.currentUrl, homePageUrl, "Portfolio Home page url not correct")
    }

    @Test
    fun testMainHeaderTextIsCorrect()
    {
        driver!!.get(homePageUrl)
        val expectedHeaderTextElement = "bryancutkelvin.com"
        val actualHeaderTextElement = driver!!.findElement(HomePage!!.headerText).text
        Assert.assertEquals(actualHeaderTextElement, expectedHeaderTextElement, "Header Text string not correct")
    }

    @Test
    fun testMainHeaderTextAppears()
    {
        driver!!.get(homePageUrl)
        val actualHeaderTextElement = driver!!.findElement(HomePage!!.headerText)
        assertTrue(actualHeaderTextElement.isDisplayed, "Header text did not display")
    }

    @Test
    fun testYummlyHeaderButtonAppears()
    {
        driver!!.get(homePageUrl)
        val yummlyHeaderButtonElement = driver!!.findElement( HomePage!!.yummlyHeaderButton)
        assertTrue(yummlyHeaderButtonElement.isDisplayed, "Yummly Header button did not display")
    }

    @Test
    fun testPlaystationHeaderButtonAppears()
    {
        driver!!.get(homePageUrl)
        val playstationHeaderButtonElement = driver!!.findElement( HomePage!!.playStationHeaderButton)
        assertTrue(playstationHeaderButtonElement.isDisplayed, "PlayStation Header button did not display")
    }

    @Test
    fun testPerfectWorldHeaderButtonAppears()
    {
        driver!!.get(homePageUrl)
        val perfectworldHeaderButtonElement = driver!!.findElement( HomePage!!.perfectWorldHeaderButton)
        assertTrue(perfectworldHeaderButtonElement.isDisplayed, "PerfectWorld Header button did not display")
    }

    @Test
    fun testElectronicArtsHeaderButtonAppears()
    {
        driver!!.get(homePageUrl)
        val electronicArtsHeaderButtonElement = driver!!.findElement( HomePage!!.electronicArtsHeaderButton)
        assertTrue( electronicArtsHeaderButtonElement.isDisplayed, "Electronic Arts Header button did not display" )
    }
}