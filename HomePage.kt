package com.bryancutkelvin.page

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

class HomePage(val driver: WebDriver)
{
    //css selector definitions
    val headerText: By = By.cssSelector(".jumbotron" )
    val yummlyHeaderButton: By = By.cssSelector(".orange.btn-lg.white-background" )
    val playStationHeaderButton: By = By.cssSelector("a[href\$=\"./playstation.html\"]" )
    val perfectWorldHeaderButton: By = By.cssSelector("a[href\$=\"./perfectworld.html\"] " )
    val electronicArtsHeaderButton: By = By.cssSelector(".btn-primary.btn-lg.btn-dark-green" )

    private val gamingPullDown: By = By.cssSelector("#dropdownMenu1 > span")
    private val awsPullDown: By = By.cssSelector(".btn-primary.btn-lg.btn-warning > span")
    private val aboutmePullDown: By = By.cssSelector(".btn-default.btn-lg > span")

    fun getGamingHeaderButtonLinks(): List<WebElement>
    {
        return driver.findElements(gamingPullDown )
    }

    fun getAwsHeaderButtonLinks(): List<WebElement>
    {
        return driver.findElements(awsPullDown )
    }

    fun getAboutmeHeaderButtonLinks(): List<WebElement>
    {
        return driver.findElements(aboutmePullDown )
    }
}