import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Actions as Actions

WebUI.callTestCase(findTestCase('RegressionTestCase-UAT-Env/LoginCountable'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('DraganddropObj/testXlsxedit/img_Go_To_Engagement'))

WebUI.click(findTestObject('DraganddropObj/testXlsxedit/input_Search_mat-input-56'))

WebUI.setText(findTestObject('DraganddropObj/testXlsxedit/input_Search_mat-input-56'), 'COM-UAT-Dec312')

WebUI.click(findTestObject('DraganddropObj/testXlsxedit/Engagement_COM-UAT-Dec312021'))

WebUI.click(findTestObject('DraganddropObj/div_Document Repository'))

WebUI.click(findTestObject('DraganddropObj/img_menu_click'))

WebUI.click(findTestObject('DraganddropObj/testXlsxedit/span_Excel'))

WebDriver driver = DriverFactory.getWebDriver()

Actions actions = new Actions(driver)

actions.sendKeys(Keys.ESCAPE).perform()

WebUI.click(findTestObject('DraganddropObj/testXlsxedit/img_SearchButton_DocumentRepo'))

WebUI.click(findTestObject('DraganddropObj/testXlsxedit/input_Search_docSearchEle'))

WebUI.setText(findTestObject('DraganddropObj/testXlsxedit/input_Search_docSearchEle'), 'test.xlsx')

WebUI.click(findTestObject('DraganddropObj/testXlsxedit/span_test.xlsx'))

WebUI.switchToWindowUrl('https://uat.adinovis.com/file-preview/ms/false/4ac7e4bf-c934-4358-87e2-077c20ddd69d/view/false')

WebUI.click(findTestObject('DraganddropObj/testXlsxedit/svg_exceleditprmison_Button'))

WebUI.delay(2)

actions.sendKeys(Keys.ARROW_UP).perform()

actions.sendKeys(Keys.ARROW_UP).perform()

actions.sendKeys(Keys.ENTER).perform()

WebUI.delay(3)

actions.keyDown(Keys.CONTROL).sendKeys('a').keyUp(Keys.CONTROL).perform()

WebUI.click(findTestObject('DraganddropObj/testXlsxedit/svg_Fill_Colour'))

WebUI.delay(2)

actions.sendKeys(Keys.ARROW_DOWN).perform()

actions.sendKeys(Keys.ARROW_DOWN).perform()

actions.sendKeys(Keys.ARROW_DOWN).perform()

actions.sendKeys(Keys.ENTER).perform()

WebUI.delay(2)

WebUI.closeWindowUrl('https://uat.adinovis.com/file-preview/ms/false/4ac7e4bf-c934-4358-87e2-077c20ddd69d/view/false')

WebUI.switchToWindowTitle('UAT (Countable)')

WebUI.click(findTestObject('DraganddropObj/testXlsxedit/span_test.xlsx'))

WebUI.switchToWindowUrl('https://uat.adinovis.com/file-preview/ms/false/4ac7e4bf-c934-4358-87e2-077c20ddd69d/view/false')

WebUI.click(findTestObject('DraganddropObj/testXlsxedit/svg_exceleditprmison_Button'))

WebUI.delay(2)

actions.sendKeys(Keys.ARROW_UP).perform()

actions.sendKeys(Keys.ARROW_UP).perform()

actions.sendKeys(Keys.ENTER).perform()

WebUI.delay(3)

actions.keyDown(Keys.CONTROL).sendKeys('a').keyUp(Keys.CONTROL).perform()

WebUI.click(findTestObject('DraganddropObj/testXlsxedit/svg_Fill_Colour'))

WebUI.delay(2)

actions.sendKeys(Keys.ARROW_DOWN).perform()

actions.sendKeys(Keys.ARROW_DOWN).perform()

actions.sendKeys(Keys.ARROW_DOWN).perform()

actions.sendKeys(Keys.ARROW_DOWN).perform()

actions.sendKeys(Keys.ARROW_DOWN).perform()

actions.sendKeys(Keys.ENTER).perform()

WebUI.delay(2)

WebUI.closeWindowUrl('https://uat.adinovis.com/file-preview/ms/false/4ac7e4bf-c934-4358-87e2-077c20ddd69d/view/false')

