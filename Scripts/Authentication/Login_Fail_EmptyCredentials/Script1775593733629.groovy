import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage as HomePage
import pages.LoginPage as LoginPage

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

def homePage = new HomePage()

WebUI.click(homePage.dropdownMenu.dropdown_toggle_button)

WebUI.click(homePage.dropdownMenu.loginButton)

def loginPage = new LoginPage()

WebUI.click(loginPage.loginButton)

WebUI.verifyElementText(loginPage.authFailedMessage, 'Login failed! Please ensure the username and password are valid.')

WebUI.closeBrowser()