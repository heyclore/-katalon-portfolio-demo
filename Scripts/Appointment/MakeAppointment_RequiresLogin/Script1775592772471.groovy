import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage as HomePage
import pages.LoginPage as LoginPage

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

def homePage = new HomePage()

WebUI.click(homePage.appointmentButton)

def loginPage = new LoginPage()

WebUI.verifyElementVisible(loginPage.loginButton, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()