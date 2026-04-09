package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject

import components.DropdownMenu
import components.ScrollToTop


public class AppointmentFormPage {
	@Lazy DropdownMenu dropdownMenu = new DropdownMenu()
	@Lazy ScrollToTop scrollToTop = new ScrollToTop()
	@Lazy TestObject applyForHospitalReadmissionChecklist = findTestObject('Pages/AppointmentFormPage/apply_for_hospital_readmission_checklist')
	@Lazy TestObject bookAppointmentButton = findTestObject('Pages/AppointmentFormPage/book_appointment_button')
	@Lazy TestObject commentTextarea = findTestObject('Pages/AppointmentFormPage/comment_textarea')
	@Lazy TestObject facilityDropdownMenu = findTestObject('Pages/AppointmentFormPage/facility_dropdown_menu')
	@Lazy TestObject healcareProgramLabelMedicaid = findTestObject('Pages/AppointmentFormPage/healcare_program_label_medicaid')
	@Lazy TestObject healcarPprogramLabelMedicare = findTestObject('Pages/AppointmentFormPage/healcare_program_label_medicare')
	@Lazy TestObject healcareProgramLabelNone = findTestObject('Pages/AppointmentFormPage/healcare_program_label_none')
	@Lazy TestObject visitDateInput = findTestObject('Pages/AppointmentFormPage/visit_date_input')
	@Lazy TestObject dueDate = findTestObject('Pages/AppointmentFormPage/due_date')
}
