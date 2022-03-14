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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.guru99)

WebUI.click(findTestObject('Object Repository/Page_GTPL Bank Home Page/div_Demo account_input-group'))

WebUI.setText(findTestObject('Object Repository/Page_GTPL Bank Home Page/input_Username_username'), 'khac vu')

WebDriver driver = DriverFactory.getWebDriver()

String kiemtra

kiemtra = driver.findElement(By.xpath('//input[@name=\'username\']')).getAttribute('value')

println(kiemtra)

WebUI.getAttribute(findTestObject('Page_GTPL Bank Home Page/input_Username_username'), 'id')

WebUI.doubleClick(findTestObject('Object Repository/Page_GTPL Bank Home Page/input_Demo account_form-control'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_GTPL Bank Home Page/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Page_GTPL Bank Home Page/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_GTPL Bank Home Page/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.verifyOptionSelectedByValue(findTestObject('Page_GTPL Bank Home Page/facility'), 'Hongkong CURA Healthcare Center', 
    false, 0)

WebUI.verifyOptionSelectedByValue(findTestObject('Page_GTPL Bank Home Page/facility'), 'Tokyo CURA Healthcare Center', false, 
    0)

WebUI.closeBrowser()

