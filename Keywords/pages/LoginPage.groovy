package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject

import components.DropdownMenu
import components.ScrollToTop


public class LoginPage {
	@Lazy DropdownMenu dropdownMenu = new DropdownMenu()
	@Lazy ScrollToTop scrollToTop = new ScrollToTop()
	@Lazy TestObject loginButton = findTestObject('Pages/LoginPage/login_button')
	@Lazy TestObject passwordInput = findTestObject('Pages/LoginPage/password_input')
	@Lazy TestObject usernameInput = findTestObject('Pages/LoginPage/username_input')
	@Lazy TestObject authFailedMessage = findTestObject('Pages/LoginPage/auth_failed_message')
}
