package com.bryancutkelvin.page

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

class YummlyPage(val driver: WebDriver)
{
    //css selector definitions
    val homeFooterButton: By = By.cssSelector( ".glyphicon.glyphicon-home")
    val topFooterButton: By = By.cssSelector( ".glyphicon.glyphicon-arrow-up")

    val parallaxParagraph1: By = By.cssSelector("body p:nth-child(2)" )
    val parallaxParagraph2: By = By.cssSelector("body p:nth-child(4)" )
    val parallaxParagraph3: By = By.cssSelector("body p:nth-child(6)" )
}