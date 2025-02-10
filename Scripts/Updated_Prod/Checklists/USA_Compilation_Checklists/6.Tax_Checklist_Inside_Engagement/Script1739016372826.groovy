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

WebUI.navigateToUrl(UAT)

WebUI.setText(findTestObject('LoginPage/User_Email'), LoginEmail)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_List'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Checklist_Objects/1st_Engagement'))

WebUI.delay(6)

WebDriver driver = DriverFactory.getWebDriver()

List<Map> CAQInsideeng = driver.findElements(By.xpath('//div[contains(@class,\'card ng-star-inserted\')]'))

//CACQINSIDE- Client acceptance checklist questions in master library
int CACQINSIDE = CAQInsideeng.size()

print(('Total no. of question in client acceptance checklist are :' + CACQINSIDE) + ' ')

if (CACQINSIDE == 13) {
    print('Test Passed')
} else {
    KeywordUtil.markFailed('Checklist questions in firm and master are not matching ')
}

WebUI.click(findTestObject('Notes_Inside_Engagement/Client_Onboarding'))

WebUI.click(findTestObject('Checklist_Objects/Client Acceptance Checklist'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Delete_Checklist_popup'))

WebUI.click(findTestObject('Checklist_Objects/Delete_Checklist_popup'))

WebUI.verifyTextPresent('Checklist deleted successfully', false)

WebUI.delay(5)

WebUI.click(findTestObject('Checklist_Objects/AddChecklist_button'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Checklist_Objects/Expand_Last_Folder'), 0)

WebUI.click(findTestObject('Checklist_Objects/Expand_Last_Folder'))

WebUI.delay(7)

WebUI.scrollToElement(findTestObject('Checklist_Objects/Client_Acceptance_FirmTemplate'), 0)

WebUI.click(findTestObject('Checklist_Objects/Client_Acceptance_FirmTemplate'))

WebUI.delay(5)

WebUI.click(findTestObject('Checklist_Objects/1st_Radio_Inside_Eng'))

WebUI.setText(findTestObject('Checklist_Objects/1st_Additional_Explaination'), 'The first() function exists in some XPath implementations (like XSLT 2.0 functions), but not in standard XPath queries used in Selenium or XML parsing.')

WebUI.click(findTestObject('Checklist_Objects/Save_Checklist_Inside'))

WebUI.verifyTextPresent('Checklist saved successfully', false)

//Independence Checklist
WebUI.click(findTestObject('Checklist_Objects/Independence_Checklist'))

WebUI.delay(5)

List<Map> INDnsideeng = driver.findElements(By.xpath('//div[contains(@class,\'card ng-star-inserted\')]'))

//CACQINSIDE- Client acceptance checklist questions in master library
int INDCQINSIDE = INDnsideeng.size()

print(('Total no. of question in independence checklist are :' + INDCQINSIDE) + ' ')

if (INDCQINSIDE == 5) {
    print('Test Passed')
} else {
    KeywordUtil.markFailed('Checklist questions in firm and master are not matching ')
}

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Delete_Checklist_popup'))

WebUI.click(findTestObject('Checklist_Objects/Delete_Checklist_popup'))

WebUI.verifyTextPresent('Checklist deleted successfully', false)

WebUI.delay(5)

WebUI.click(findTestObject('Checklist_Objects/AddChecklist_button'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Checklist_Objects/Expand_Last_Folder'), 0)

WebUI.click(findTestObject('Checklist_Objects/Expand_Last_Folder'))

WebUI.delay(7)

WebUI.scrollToElement(findTestObject('Checklist_Objects/Independance_In_Firm'), 0)

WebUI.click(findTestObject('Checklist_Objects/Independance_In_Firm'))

WebUI.delay(5)

WebUI.click(findTestObject('Checklist_Objects/1st_Radio_Inside_Eng'))

WebUI.setText(findTestObject('Checklist_Objects/1st_Additional_Explaination'), 'The first() function exists in some XPath implementations (like XSLT 2.0 functions), but not in standard XPath queries used in Selenium or XML parsing.')

WebUI.click(findTestObject('Checklist_Objects/Save_Checklist_Inside'))

WebUI.verifyTextPresent('Checklist saved successfully', false)

WebUI.click(findTestObject('Checklist_Objects/Knowledge_Checklist'))

WebUI.delay(5)

List<Map> KNOWnsideeng = driver.findElements(By.xpath('//div[contains(@class,\'card ng-star-inserted\')]'))

//CACQINSIDE- Client acceptance checklist questions in master library
int KNOWCQINSIDE = KNOWnsideeng.size()

print(('Total no. of question in knowledge checklist are :' + KNOWCQINSIDE) + ' ')

if (KNOWCQINSIDE == 24) {
    print('Test Passed')
} else {
    KeywordUtil.markFailed('Checklist questions in firm and master are not matching ')
}

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Delete_Checklist_popup'))

WebUI.click(findTestObject('Checklist_Objects/Delete_Checklist_popup'))

WebUI.verifyTextPresent('Checklist deleted successfully', false)

WebUI.delay(5)

WebUI.click(findTestObject('Checklist_Objects/AddChecklist_button'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Checklist_Objects/Expand_Last_Folder'), 0)

WebUI.click(findTestObject('Checklist_Objects/Expand_Last_Folder'))

WebUI.delay(7)

WebUI.scrollToElement(findTestObject('Checklist_Objects/Knowledge_Checklist_In_Firm_Template'), 0)

WebUI.click(findTestObject('Checklist_Objects/Knowledge_Checklist_In_Firm_Template'))

WebUI.delay(5)

WebUI.click(findTestObject('Checklist_Objects/Open_Calendar'))

WebUI.click(findTestObject('Checklist_Objects/Current_Date'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Checklist_Objects/Save_Checklist_Inside'))

WebUI.verifyTextPresent('Checklist saved successfully', false)

WebUI.click(findTestObject('Checklist_Objects/Planning_Checklist'))

WebUI.delay(5)

List<Map> PLANnsideeng = driver.findElements(By.xpath('//div[contains(@class,\'card-header\')]'))

//CACQINSIDE- Client acceptance checklist questions in master library
int PLACQINSIDE = PLANnsideeng.size()

print(('Total no. of question in planning checklist are :' + PLACQINSIDE) + ' ')

if (PLACQINSIDE == 1) {
    print('Test Passed')
} else {
    KeywordUtil.markFailed('Checklist questions in firm and master are not matching ')
}

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Delete_Checklist_popup'))

WebUI.click(findTestObject('Checklist_Objects/Delete_Checklist_popup'))

WebUI.verifyTextPresent('Checklist deleted successfully', false)

WebUI.delay(5)

WebUI.click(findTestObject('Checklist_Objects/AddChecklist_button'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Checklist_Objects/Expand_Last_Folder'), 0)

WebUI.click(findTestObject('Checklist_Objects/Expand_Last_Folder'))

WebUI.delay(7)

WebUI.scrollToElement(findTestObject('Checklist_Objects/Planning_In_FirmTemplate'), 0)

WebUI.click(findTestObject('Checklist_Objects/Planning_In_FirmTemplate'))

WebUI.delay(5)

WebUI.setText(findTestObject('Checklist_Objects/1st_Additional_Explaination'), 'The first() function exists in some XPath implementations (like XSLT 2.0 functions), but not in standard XPath queries used in Selenium or XML parsing.')

WebUI.click(findTestObject('Checklist_Objects/Save_Checklist_Inside'))

WebUI.verifyTextPresent('Checklist saved successfully', false)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/CompletionAndSignoff'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Completion_Checklist'))

WebUI.delay(5)

List<Map> COMPnsideeng = driver.findElements(By.xpath('//div[contains(@class,\'card-header\')]'))

//CACQINSIDE- Client acceptance checklist questions in master library
int COMPCQINSIDE = COMPnsideeng.size()

print(('Total no. of question in planning checklist are :' + COMPCQINSIDE) + ' ')

if (COMPCQINSIDE == 12) {
    print('Test Passed')
} else {
    KeywordUtil.markFailed('Checklist questions in firm and master are not matching ')
}

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Delete_Checklist_popup'))

WebUI.click(findTestObject('Checklist_Objects/Delete_Checklist_popup'))

WebUI.verifyTextPresent('Checklist deleted successfully', false)

WebUI.delay(5)

WebUI.click(findTestObject('Checklist_Objects/AddChecklist_button'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Checklist_Objects/Expand_Last_Folder'), 0)

WebUI.click(findTestObject('Checklist_Objects/Expand_Last_Folder'))

WebUI.delay(7)

WebUI.scrollToElement(findTestObject('Checklist_Objects/Completion_Checklist_In_Firm'), 0)

WebUI.click(findTestObject('Checklist_Objects/Completion_Checklist_In_Firm'))

WebUI.delay(5)

WebUI.click(findTestObject('Checklist_Objects/1st_Radio_Inside_Eng'))

WebUI.setText(findTestObject('Checklist_Objects/1st_Additional_Explaination'), 'The first() function exists in some XPath implementations (like XSLT 2.0 functions), but not in standard XPath queries used in Selenium or XML parsing.')

WebUI.click(findTestObject('Checklist_Objects/Save_Checklist_Inside'))

WebUI.verifyTextPresent('Checklist saved successfully', false)

WebUI.delay(5)

WebUI.closeBrowser()

