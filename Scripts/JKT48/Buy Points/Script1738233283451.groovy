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

WebUI.callTestCase(findTestCase('JKT48/Login'), [('IsLogin') : true], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_JKT48  My Page/li_JKT48 POINTS                   Cara Beli_4f8a00'))

WebUI.click(findTestObject('Object Repository/Page_JKT48  My Page/a_Beli JKT48 Points'))

WebUI.navigateToUrl('https://jkt48.com/jktpoints/form?lang=id')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_JKT48  Formulir Pembelian JKT48 Points/select_----    20,000 P    50,000 P    100,_b89db7'), 
    '100000', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_JKT48  Formulir Pembelian JKT48 Points/select_----    OVO    Transfer Bank    Kart_4cc8d2'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Page_JKT48  Formulir Pembelian JKT48 Points/label_Menyetujui syarat dan ketentuan'))

WebUI.click(findTestObject('Object Repository/Page_JKT48  Formulir Pembelian JKT48 Points/button_Konfirmasi'))

