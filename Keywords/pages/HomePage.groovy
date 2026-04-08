package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject

import components.DropdownMenu
import components.ScrollToTop


public class HomePage {
	@Lazy DropdownMenu dropdownMenu = new DropdownMenu()
	@Lazy ScrollToTop scrollToTop = new ScrollToTop()
	@Lazy TestObject appointment_button = findTestObject('Pages/HomePage/appointment_button')
	@Lazy TestObject homepage_title = findTestObject('Pages/HomePage/homepage_title')
}
