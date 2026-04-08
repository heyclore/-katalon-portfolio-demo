package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject

import components.DropdownMenu
import components.ScrollToTop


public class AppointmentFormPage {
	@Lazy DropdownMenu dropdownMenu = new DropdownMenu()
	@Lazy ScrollToTop scrollToTop = new ScrollToTop()
	@Lazy TestObject apply_for_hospital_readmission_checklist = findTestObject('Pages/AppointmentFormPage/apply_for_hospital_readmission_checklist')
	@Lazy TestObject book_appointment_button = findTestObject('Pages/AppointmentFormPage/book_appointment_button')
	@Lazy TestObject comment_textarea = findTestObject('Pages/AppointmentFormPage/comment_textarea')
	@Lazy TestObject facility_dropdown_menu = findTestObject('Pages/AppointmentFormPage/facility_dropdown_menu')
	@Lazy TestObject healcare_program_label_medicaid = findTestObject('Pages/AppointmentFormPage/healcare_program_label_medicaid')
	@Lazy TestObject healcare_program_label_medicare = findTestObject('Pages/AppointmentFormPage/healcare_program_label_medicare')
	@Lazy TestObject healcare_program_label_none = findTestObject('Pages/AppointmentFormPage/healcare_program_label_none')
	@Lazy TestObject visit_date_input = findTestObject('Pages/AppointmentFormPage/visit_date_input')
}
