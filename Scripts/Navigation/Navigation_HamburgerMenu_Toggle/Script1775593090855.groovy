import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import pages.HomePage as HomePage

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

def homePage = new HomePage()

WebUI.click(homePage.dropdownMenu.dropdown_toggle_button)

WebUI.verifyElementVisible(homePage.dropdownMenu.homeButton, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(homePage.dropdownMenu.loginButton, FailureHandling.STOP_ON_FAILURE)

WebUI.click(homePage.dropdownMenu.dropdown_toggle_button)

WebUI.verifyElementNotVisible(homePage.dropdownMenu.homeButton, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(homePage.dropdownMenu.loginButton, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()