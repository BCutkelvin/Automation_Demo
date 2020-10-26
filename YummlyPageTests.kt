package bryancutkelvin

import com.bryancutkelvin.page.HomePage
import com.bryancutkelvin.page.YummlyPage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.Assert.assertEquals
import org.testng.Assert.assertTrue
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

class YummlyPageTests {
    private var driver: WebDriver? = null
    private var HomePage: HomePage? = null
    private var YummlyPage: YummlyPage? = null

    //see Page Object (YummlyPage.kt) for CSS selector definitions
    private val homePageUrl = "https://bryancutkelvin.com"
    private val portfolioYummlyPageUrl = "https://bryancutkelvin.com/yummly.html"

    @BeforeTest
    fun createDriver() {
        System.setProperty("webdriver.chrome.driver", "/home/mrbcut/intellij/chromedriver")
        driver = ChromeDriver()
        HomePage = HomePage(driver!!)
        YummlyPage = YummlyPage(driver!!)
    }

    @AfterTest
    fun tearDown() {
        driver!!.quit()
    }

    @Test
    fun testLoadYummlyCareerPage() {
        driver!!.get(homePageUrl)
        driver!!.findElement(HomePage!!.yummlyHeaderButton).click()
        val actualYummlyCareerParallax1Text = driver!!.findElement(YummlyPage!!.parallaxParagraph1).text
        assertTrue(
            actualYummlyCareerParallax1Text!! == "Yummly is the world's #1 recipe engine and cooking " +
                    "recommendation site. There you will find many wonderful recipes, diets, grocery ordering, blogs, " +
                    "articles and even cooking instructions even by professional chefs!",
            "Yummly parallax 1 paragraph did not display")
        assertEquals(driver!!.currentUrl,  portfolioYummlyPageUrl, "Portfolio Yummly career page url not correct")
    }
}