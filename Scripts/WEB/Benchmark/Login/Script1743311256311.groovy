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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()  

WebUI.navigateToUrl('https://humanbenchmark.com/dashboard')

WebUI.click(findTestObject('Object Repository/Page_Human Benchmark - Dashboard - Guest user/a_LOGIN'))

WebUI.setText(findTestObject('Object Repository/Page_Human Benchmark - Log in/input_Username_username'), 'Sucipto')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Human Benchmark - Log in/input_Password_password'), 'WsAFD28uUmwkZelzEgZtcQ==')

WebUI.executeJavaScript("window.scrollBy(0, 100)", null)

WebUI.click(findTestObject('Object Repository/Page_Human Benchmark - Log in/input_Password_css-z5gx6u e19owgy712'))

