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

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.click(findTestObject('Negative/Page_Facebook log in or sign up/button_Log In'))

WebUI.verifyElementPresent(findTestObject('Negative/Page_Facebook log in or sign up/div_The email address or mobile number you entered isnt connected to an account. Find your account and log in'), 
    0)

WebUI.setText(findTestObject('Negative/Page_Facebook log in or sign up/input_Facebook helps you connect and share _ccef60'), 
    'ibnu1590@yahoo.com')

WebUI.setText(findTestObject('Negative/Page_Facebook log in or sign up/input_Facebook helps you connect and share _ab63fc'), 
    'salah')

WebUI.click(findTestObject('Negative/Page_Facebook log in or sign up/button_Log In'))

WebUI.verifyElementPresent(findTestObject('Negative/Page_Facebook log in or sign up/div_The password that youve entered is incorrect. Forgotten password'), 
    0)

WebUI.setText(findTestObject('Negative/Page_Facebook log in or sign up/input_Facebook helps you connect and share _ab63fc'), 
    'b1sm1ll4h')

WebUI.click(findTestObject('Negative/Page_Facebook log in or sign up/button_Log In'))

