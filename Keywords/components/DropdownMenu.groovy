package components

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject

public class DropdownMenu {
	@Lazy def TestObject dropdown_toggle_button = findTestObject('Components/DropdownMenu/dropdown_toggle_button')
	@Lazy def TestObject historyButton = findTestObject('Components/DropdownMenu/history_button')
	@Lazy def TestObject homeButton = findTestObject('Components/DropdownMenu/home_button')
	@Lazy def TestObject loginButton = findTestObject('Components/DropdownMenu/login_button')
	@Lazy def TestObject logoutButton = findTestObject('Components/DropdownMenu/logout_button')
	@Lazy def TestObject profileButton = findTestObject('Components/DropdownMenu/profile_button')
}
