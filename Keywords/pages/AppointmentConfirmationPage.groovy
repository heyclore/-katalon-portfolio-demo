package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject

import components.DropdownMenu
import components.ScrollToTop



public class AppointmentConfirmationPage {
	@Lazy DropdownMenu dropdownMenu = new DropdownMenu()
	@Lazy ScrollToTop scrollToTop = new ScrollToTop()
	@Lazy TestObject confirmation_title = findTestObject('Pages/AppointmentConfirmationPage/confirmation_title')
	@Lazy TestObject go_to_homepage_button = findTestObject('Pages/AppointmentConfirmationPage/go_to_homepage_button')
}
