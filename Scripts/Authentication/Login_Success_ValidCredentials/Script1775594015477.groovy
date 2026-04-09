import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.HomePage as HomePage
import pages.LoginPage as LoginPage

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

def homePage = new HomePage()

WebUI.click(homePage.dropdownMenu.dropdown_toggle_button)

WebUI.click(homePage.dropdownMenu.loginButton)

def loginPage = new LoginPage()

WebUI.setText(loginPage.usernameInput, 'John Doe')

WebUI.setEncryptedText(loginPage.passwordInput, 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(loginPage.loginButton)

WebUI.verifyElementVisible(homePage.appointmentButton, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()