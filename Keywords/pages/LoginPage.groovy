package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject

import components.DropdownMenu
import components.ScrollToTop


public class LoginPage {
	@Lazy DropdownMenu dropdownMenu = new DropdownMenu()
	@Lazy ScrollToTop scrollToTop = new ScrollToTop()
	@Lazy TestObject login_button = findTestObject('Pages/LoginPage/login_button')
	@Lazy TestObject password_input = findTestObject('Pages/LoginPage/password_input')
	@Lazy TestObject username_input = findTestObject('Pages/LoginPage/username_input')
}
