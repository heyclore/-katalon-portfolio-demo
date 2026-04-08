package components

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject

public class ScrollToTop {
	@Lazy def TestObject scroll_to_top_button = findTestObject('Components/ScrollToTop/scroll_to_top_button')
}
