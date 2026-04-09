import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import pages.AppointmentConfirmationPage as AppointmentConfirmationPage
import pages.AppointmentFormPage as AppointmentFormPage
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

WebUI.click(homePage.appointmentButton)

def appointmentFormPage = new AppointmentFormPage()

WebUI.selectOptionByValue(appointmentFormPage.facilityDropdownMenu, 'Hongkong CURA Healthcare Center', true)

WebUI.click(appointmentFormPage.applyForHospitalReadmissionChecklist)

WebUI.click(appointmentFormPage.healcareProgramLabelMedicaid)

WebUI.click(appointmentFormPage.visitDateInput)

WebUI.click(appointmentFormPage.dueDate)

WebUI.setText(appointmentFormPage.commentTextarea, 'Lorem ipsum dolor sir amet')

WebUI.click(appointmentFormPage.bookAppointmentButton)

def appointmentConfirmationPage = new AppointmentConfirmationPage()

WebUI.verifyElementText(appointmentConfirmationPage.confirmationTitle, 'Appointment Confirmation')

WebUI.verifyElementVisible(appointmentConfirmationPage.goToHomepageButton, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()