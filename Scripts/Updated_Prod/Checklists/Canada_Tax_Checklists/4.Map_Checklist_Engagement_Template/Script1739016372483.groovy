import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.xml.crypto.dsig.keyinfo.KeyValue as KeyValue
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.builtin.FindWebElementKeyword as FindWebElementKeyword
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.console.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.Select as Select
import java.util.List as List
import org.openqa.selenium.WebDriver as WebDriver
import org.junit.Assert as Assert

WebUI.openBrowser('')

WebUI.navigateToUrl(PROD)

WebUI.setText(findTestObject('LoginPage/User_Email'), LoginEmail)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Notes_Firm/Template'))

WebUI.click(findTestObject('Notes_Firm/span_Master Library'))

WebUI.click(findTestObject('Checklist_Objects/Tax_Folder_Master'))

WebUI.click(findTestObject('Checklist_Objects/T2_Template'))

WebUI.delay(2)

WebUI.click(findTestObject('Notes_Firm/span_add Firm templates'))

WebUI.click(findTestObject('Checklist_Objects/Create_New_Folder'))

WebUI.setText(findTestObject('Notes_Firm/FolderName'), 'CA Tax Test')

WebUI.click(findTestObject('Notes_Firm/Add_Button'))

WebUI.verifyTextPresent('Engagement template copied successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Expand_Last_Folder'))

WebUI.click(findTestObject('Checklist_Objects/T2_Template'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Checklist_Objects/Completion_Mapped'), 0)

WebUI.mouseOver(findTestObject('Checklist_Objects/Completion_Mapped'))

WebUI.click(findTestObject('Checklist_Objects/Cross_Completion'))

WebUI.click(findTestObject('Checklist_Objects/Map_Template'))

WebUI.click(findTestObject('Checklist_Objects/Expand_Last_Folder'))

WebUI.click(findTestObject('Checklist_Objects/Completion_On_Map_Template'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Save_Changes'))

WebUI.verifyTextPresent('Changes made to the template saved successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Kebab_Engagement_Template'))

WebUI.click(findTestObject('Checklist_Objects/Set_as_default'))

WebUI.click(findTestObject('Checklist_Objects/T2_Template_Set_as_Default'))

WebUI.verifyTextPresent('Default template configured successfully', false)

WebUI.closeBrowser()

