import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Actions as Actions

WebUI.callTestCase(findTestCase('WEB/Benchmark/Typing Test/Open'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Human Benchmark - Dashboard - Sucipto/a_Play'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Human Benchmark - Typing Test - WPM/div_The summer evenings were long. It was n_3d4cdf'),
	10)

// Get and print the text
String text = WebUI.getText(findTestObject('Object Repository/Page_Human Benchmark - Typing Test - WPM/div_The summer evenings were long. It was n_3d4cdf'))

println('--- Text Content ---')

println(text)

WebDriver driver = DriverFactory.getWebDriver()

Actions actions = new Actions(driver)

for (char c : text.toCharArray()) {
	actions.sendKeys(String.valueOf(c)).perform()

	//Thread.sleep(80)
}

WebUI.executeJavaScript("window.scrollBy(0, 200)", null)

WebUI.click(findTestObject('Object Repository/Page_Human Benchmark - Typing Test - WPM/button_Save score'))

Thread.sleep(80)

WebUI.closeBrowser()


