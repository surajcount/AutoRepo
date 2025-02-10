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

WebUI.click(findTestObject('Notes_Firm/Template'))

WebUI.click(findTestObject('Notes_Firm/div_Engagements'))

WebUI.click(findTestObject('Checklist_Objects/Checklist_Dropdown'))

WebUI.click(findTestObject('Notes_Firm/span_Master Library'))

WebUI.click(findTestObject('Checklist_Objects/Tax_Folder_Master'))

WebUI.click(findTestObject('Checklist_Objects/Tax_Completion_Checklist'))

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

List<Map> QuesMastTax = driver.findElements(By.xpath('//div[contains(@class,\'card-body\')]'))

//CACQINMASTER- Client acceptance checklist questions in master
int TAXCOMPCQINMASTER = QuesMastTax.size()

System.out.print(('Total tax completion checklist questions in master are : ' + TAXCOMPCQINMASTER) + ' ')

WebUI.click(findTestObject('Notes_Firm/span_add Firm templates'))

WebUI.click(findTestObject('Checklist_Objects/Create_New_Folder'))

WebUI.setText(findTestObject('Notes_Firm/FolderName'), 'Tax Release')

WebUI.click(findTestObject('Notes_Firm/Add_Button'))

WebUI.verifyTextPresent('Successfully added to firm templates', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.click(findTestObject('Checklist_Objects/Firm_Templates'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Completion_Checklist_In_Firm'))

//Completion in firm template
List<Map> QuesFirmTAXCOMP = driver.findElements(By.xpath('//div[contains(@class,\'card ng-star-inserted\')]'))

//COMPCQINFIRM- Completion checklist questions in firm
int COMPCQINFIRM = QuesFirmTAXCOMP.size()

System.out.print(('Total completion checklist questions in firm templates are : ' + COMPCQINFIRM) + ' ')

if (TAXCOMPCQINMASTER == COMPCQINFIRM) {
    print(' checklist copied successfully')
} else {
    KeywordUtil.markFailed('Question in master and firm are not matching')
}

WebUI.closeBrowser()

