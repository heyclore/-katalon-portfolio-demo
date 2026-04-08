package components

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject

public class DropdownMenu {
	@Lazy def TestObject dropdown_toggle_button = findTestObject('Components/DropdownMenu/dropdown_toggle_button')
	@Lazy def TestObject history_button = findTestObject('Components/DropdownMenu/history_button')
	@Lazy def TestObject home_button = findTestObject('Components/DropdownMenu/home_button')
	@Lazy def TestObject login_button = findTestObject('Components/DropdownMenu/login_button')
	@Lazy def TestObject logout_button = findTestObject('Components/DropdownMenu/logout_button')
	@Lazy def TestObject profile_button = findTestObject('Components/DropdownMenu/profile_button')
}
