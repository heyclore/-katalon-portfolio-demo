# Katalon Studio Automation Project Portfolio

This project showcases a comprehensive test automation suite developed using **Katalon Studio**. It is designed to highlight proficiency in building robust, maintainable, and scalable automated testing solutions for web applications. The suite covers critical functionalities, emphasizing best practices in test design, keyword-driven testing, and object-oriented principles.

## Project Overview

This repository contains a collection of automated test cases and supporting scripts for a sample web application, focusing on key user flows. The primary goal is to demonstrate expertise in leveraging Katalon Studio's features to create efficient and reliable automated tests.

## Key Features Tested

The automation suite covers the following core application functionalities:

*   **User Authentication:**
    *   Successful login with valid credentials.
    *   Validation of login failures due to empty or invalid credentials.
    *   Secure logout functionality.
*   **Appointment Management:**
    *   End-to-end process of booking an appointment (requiring prior authentication).
    *   Verification of appointment confirmation details.
*   **Navigation:**
    *   Testing basic UI navigation elements, such as toggling a hamburger menu.

## Technologies Used

*   **Katalon Studio:** The primary automation tool for test creation, execution, and management.
*   **Groovy:** The scripting language used for custom keywords and test logic within Katalon Studio.

## Project Structure

The project follows a structured organization to ensure maintainability and reusability:

*   `Keywords/`: Contains custom Groovy classes that encapsulate reusable testing actions and logic, promoting a keyword-driven testing approach.
*   `Object Repository/`: Stores UI element locators (e.g., `LoginPage/username_input.rs`). This organized repository ensures that UI elements are managed centrally, making tests easier to update if the UI changes.
*   `Scripts/`: Houses Groovy scripts that orchestrate test execution, often calling custom keywords or defining more complex test flows.
*   `Test Cases/`: Contains individual test scenarios (`.tc` files), each designed to validate a specific feature or user story.
*   `Test Suites/`: Groups multiple test cases together for execution in a defined order or with specific configurations, allowing for focused testing cycles (e.g., Regression Suite, Smoke Test Suite).
*   `Profiles/`: Includes global configurations, such as `default.glbl` for global variables that can be accessed across test scripts.
*   `settings/`: Katalon Studio project configuration files.

## Design Approach & Best Practices

This project adheres to several key principles for effective test automation:

*   **Modularity:** Breaking down complex test scenarios into smaller, manageable, and reusable components (keywords and functions).
*   **Maintainability:** Employing a clear separation of concerns, with UI elements defined in the Object Repository and reusable actions encapsulated in Custom Keywords.
*   **Reusability:** Maximizing the use of custom keywords and shared scripts to avoid code duplication and simplify test maintenance.
*   **Readability:** Writing clear, concise, and well-commented code (where necessary) in test cases and scripts for easy understanding by other team members.
*   **Data-Driven Testing (Implicit):** While not explicitly detailed here, the structure allows for easy integration of data-driven testing approaches.

## Portfolio Value

This project demonstrates the ability to:

*   Design, develop, and execute end-to-end automated test scripts using Katalon Studio.
*   Implement and utilize custom keywords for enhanced reusability and maintainability.
*   Effectively manage UI element locators through Katalon's Object Repository.
*   Structure a test automation project logically for scalability and ease of maintenance.
*   Understand and apply core concepts of test automation frameworks.

## Project Tree
```tree
.
├── Include
│   ├── config
│   │   └── log.properties
│   ├── features
│   └── scripts
│       └── groovy
├── Keywords
│   ├── components
│   │   ├── DropdownMenu.groovy
│   │   └── ScrollToTop.groovy
│   └── pages
│       ├── AppointmentConfirmationPage.groovy
│       ├── AppointmentFormPage.groovy
│       ├── HomePage.groovy
│       └── LoginPage.groovy
├── Object Repository
│   ├── Components
│   │   ├── DropdownMenu
│   │   │   ├── dropdown_toggle_button.rs
│   │   │   ├── history_button.rs
│   │   │   ├── home_button.rs
│   │   │   ├── login_button.rs
│   │   │   ├── logout_button.rs
│   │   │   └── profile_button.rs
│   │   └── ScrollToTop
│   │       └── scroll_to_top_button.rs
│   └── Pages
│       ├── AppointmentConfirmationPage
│       │   ├── confirmation_title.rs
│       │   └── go_to_homepage_button.rs
│       ├── AppointmentFormPage
│       │   ├── apply_for_hospital_readmission_checklist.rs
│       │   ├── book_appointment_button.rs
│       │   ├── comment_textarea.rs
│       │   ├── due_date.rs
│       │   ├── facility_dropdown_menu.rs
│       │   ├── healcare_program_label_medicaid.rs
│       │   ├── healcare_program_label_medicare.rs
│       │   ├── healcare_program_label_none.rs
│       │   └── visit_date_input.rs
│       ├── HomePage
│       │   ├── appointment_button.rs
│       │   └── homepage_title.rs
│       └── LoginPage
│           ├── auth_failed_message.rs
│           ├── login_button.rs
│           ├── password_input.rs
│           └── username_input.rs
├── Profiles
│   └── default.glbl
├── README.md
├── Scripts
│   ├── Appointment
│   │   ├── MakeAppointment_RequiresLogin
│   │   │   └── Script1775592772471.groovy
│   │   └── MakeAppointment_Success
│   │       └── Script1775594816768.groovy
│   ├── Authentication
│   │   ├── Login_Fail_EmptyCredentials
│   │   │   └── Script1775593733629.groovy
│   │   ├── Login_Fail_InvalidCredentials
│   │   │   └── Script1775593873898.groovy
│   │   ├── Login_Success_ValidCredentials
│   │   │   └── Script1775594015477.groovy
│   │   └── Logout_Success
│   │       └── Script1775594317881.groovy
│   └── Navigation
│       └── Navigation_HamburgerMenu_Toggle
│           └── Script1775593090855.groovy
├── Test Cases
│   ├── Appointment
│   │   ├── MakeAppointment_RequiresLogin.tc
│   │   └── MakeAppointment_Success.tc
│   ├── Authentication
│   │   ├── Login_Fail_EmptyCredentials.tc
│   │   ├── Login_Fail_InvalidCredentials.tc
│   │   ├── Login_Success_ValidCredentials.tc
│   │   └── Logout_Success.tc
│   └── Navigation
│       └── Navigation_HamburgerMenu_Toggle.tc
├── Test Suites
├── build.gradle
├── console.properties
├── demo.prj
└── settings
    └── internal
        ├── com.katalon.cucumber.properties
        ├── com.kms.katalon.composer.project.properties
        ├── com.kms.katalon.composer.testcase.properties
        ├── com.kms.katalon.composer.testcase.settings.properties
        ├── com.kms.katalon.execution.mobile.properties
        ├── com.kms.katalon.execution.properties
        ├── com.kms.katalon.execution.webservice.properties
        ├── com.kms.katalon.execution.webui.properties
        ├── com.kms.katalon.execution.windows.properties
        └── com.kms.katalon.integration.analytics.properties
```

## Quick Test Overview
```typescript
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

```
```typescript
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

```
---

Feel free to reach out if you have any questions or would like to discuss this project further.
