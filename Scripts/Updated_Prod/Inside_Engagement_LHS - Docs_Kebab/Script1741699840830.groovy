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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import javax.xml.crypto.dsig.keyinfo.KeyValue as KeyValue
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.builtin.FindWebElementKeyword as FindWebElementKeyword
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import java.util.List as List
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.junit.Assert as Assert

WebUI.openBrowser('')

WebUI.navigateToUrl(PROD)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Dashboard_Button'), 40)

WebUI.click(findTestObject('Create Engagement_Objects/Dashboard_Button'))

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 0)

WebUI.setText(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), Search_Engagement)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create Engagement_Objects/Comp_Engmnt_GoInside'))

WebUI.delay(3)

WebUI.click(findTestObject('LHS_InsideEngagement/Expand_Collapse_LHS_All'))

//WebUI.scrollToElement(findTestObject('LHS_InsideEngagement/1st_Document'), 3)
WebUI.delay(2)

WebUI.click(findTestObject('LHS_InsideEngagement/1st_Document_Kebab'))

WebDriver driver = DriverFactory.getWebDriver()

List<Map> docselements = driver.findElements(By.xpath('//div/div[@role=\'menu\']/div/button'))

String[] docsexpectedValues = ['Rename', 'Move', 'Download', 'Delete']

List<Map> docsactualValues = new ArrayList()

for (int i = 0; i < docselements.size(); i++) {
    String docsactualValue = docselements.get(i).getText()

    docsactualValues.add(docsactualValue)

    System.out.println('Kebab values are : ' + docsactualValue)
}

Assert.assertEquals('Mismatch in size of elements', docsexpectedValues.length, docsactualValues.size())

for (String expected : docsexpectedValues) {
    Assert.assertTrue('Expected value not found: ' + expected, docsactualValues.contains(expected))
}

WebUI.click(findTestObject('LHS_InsideEngagement/Rename_Doc'))

WebUI.clearText(findTestObject('LHS_InsideEngagement/Rename_LHS_Folder'))

WebUI.setText(findTestObject('LHS_InsideEngagement/Rename_LHS_Folder'), 'PSP Test')

WebUI.click(findTestObject('Stripe/Yes_button'))

WebUI.verifyTextPresent('Document Renamed Successfully', false)

//WebUI.scrollToElement(findTestObject('LHS_InsideEngagement/1st_Document'), 3)
WebUI.delay(2)

WebUI.click(findTestObject('LHS_InsideEngagement/1st_Document_Kebab'))

WebUI.click(findTestObject('LHS_InsideEngagement/Move_Doc_Kebab'))

WebUI.click(findTestObject('LHS_InsideEngagement/Expand-Collapse_On_Popup'))

WebUI.delay(4)

WebUI.click(findTestObject('LHS_InsideEngagement/CNC_Radio_Move'))

WebUI.click(findTestObject('LHS_InsideEngagement/Move_Doc_Kebab'))

WebUI.verifyTextPresent('Document moved successfully', false)

WebUI.delay(3)

//WebUI.scrollToElement(findTestObject('LHS_InsideEngagement/1st_Document'), 3)
WebUI.click(findTestObject('LHS_InsideEngagement/1st_Document_Kebab'))

WebUI.click(findTestObject('LHS_InsideEngagement/Download_Kebab'))

WebUI.delay(3)

//WebUI.scrollToElement(findTestObject('LHS_InsideEngagement/1st_Document'), 3)
WebUI.click(findTestObject('LHS_InsideEngagement/1st_Document_Kebab'))

WebUI.click(findTestObject('LHS_InsideEngagement/Delete_LHS_Folder'))

WebUI.click(findTestObject('LHS_InsideEngagement/Delete_on_popup_container'))

WebUI.verifyTextPresent('Document deleted successfully', false)

WebUI.delay(3)

