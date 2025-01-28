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

WebUI.click(findTestObject('Checklist_Objects/CompChecklist_Master_Library'))

WebUI.click(findTestObject('Checklist_Objects/Client Acceptance Checklist'))

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

List<Map> QuesMastCA = driver.findElements(By.xpath('//div[contains(@class,\'card-body\')]'))

//CACQINMASTER- Client acceptance checklist questions in master
int CACQINMASTER = QuesMastCA.size()

System.out.print(('Total client acceptance checklist questions in master are : ' + CACQINMASTER) + ' ')

WebUI.click(findTestObject('Notes_Firm/span_add Firm templates'))

WebUI.click(findTestObject('Checklist_Objects/Create_New_Folder'))

WebUI.setText(findTestObject('Notes_Firm/FolderName'), 'Release V34')

WebUI.click(findTestObject('Notes_Firm/Add_Button'))

WebUI.verifyTextPresent('Checklist successfully added to firm templates', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.delay(2)

//WebUI.click(findTestObject('Checklist_Objects/CompChecklist_Master_Library'))
WebUI.click(findTestObject('Checklist_Objects/Independence_Checklist'))

List<Map> QuesMastind = driver.findElements(By.xpath('//div[contains(@class,\'card-body\')]'))

//INDCQINMASTER- Independance checklist questions in master
int INDCQINMASTER = QuesMastind.size()

System.out.print(('Total independence checklist questions in master are : ' + INDCQINMASTER) + ' ')

WebUI.click(findTestObject('Notes_Firm/span_add Firm templates'))

WebUI.click(findTestObject('Checklist_Objects/Select_Checklist_Folder'))

WebUI.click(findTestObject('Notes_Firm/Add_Button'))

WebUI.verifyTextPresent('Successfully added to firm templates', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.delay(2)

//Knowledge checklist
WebUI.click(findTestObject('Checklist_Objects/Knowledge_Checklist'))

List<Map> QuesMastKno = driver.findElements(By.xpath('//div[contains(@class,\'card-body\')]'))

//KNOWCQINMASTER- Knowledge checklist questions in master
int KNOWCQINMASTER = QuesMastKno.size()

System.out.print(('Total Knowledge checklist questions in master are : ' + KNOWCQINMASTER) + ' ')

WebUI.click(findTestObject('Notes_Firm/span_add Firm templates'))

WebUI.click(findTestObject('Checklist_Objects/Select_Checklist_Folder'))

WebUI.click(findTestObject('Notes_Firm/Add_Button'))

WebUI.verifyTextPresent('Successfully added to firm templates', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.delay(2)

//Planning checklist
WebUI.click(findTestObject('Checklist_Objects/Planning_Checklist'))

List<Map> QuesMastpla = driver.findElements(By.xpath('//div[contains(@class,\'card-body\')]'))

//PLANCQINMASTER- Planning checklist questions in master
int PLANCQINMASTER = QuesMastpla.size()

System.out.print(('Total Planning checklist questions in master are : ' + PLANCQINMASTER) + ' ')

WebUI.click(findTestObject('Notes_Firm/span_add Firm templates'))

WebUI.click(findTestObject('Checklist_Objects/Select_Checklist_Folder'))

WebUI.click(findTestObject('Notes_Firm/Add_Button'))

WebUI.verifyTextPresent('Successfully added to firm templates', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.delay(2)

//Completion Checklist
WebUI.click(findTestObject('Checklist_Objects/Completion_Compilation_Checklist'))

List<Map> QuesMastCom = driver.findElements(By.xpath('//div[contains(@class,\'card-body\')]'))

//COMPCQINMASTER- Completion checklist questions in master
int COMPCQINMASTER = QuesMastCom.size()

System.out.print(('Total Compeletion checklist questions in master are : ' + COMPCQINMASTER) + ' ')

WebUI.click(findTestObject('Notes_Firm/span_add Firm templates'))

WebUI.click(findTestObject('Checklist_Objects/Select_Checklist_Folder'))

WebUI.click(findTestObject('Notes_Firm/Add_Button'))

//Navigate to firm Template
WebUI.verifyTextPresent('Successfully added to firm templates', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.click(findTestObject('Checklist_Objects/Firm_Templates'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Client_Acceptance_FirmTemplate'))

//Client Acceptance in firm template
List<Map> QuesFirmCA = driver.findElements(By.xpath('//div[contains(@class,\'card\')]'))

//CACQINFIRM- Client acceptance checklist questions in firm
int CACQINFIRM = QuesFirmCA.size()

System.out.print(('Total client acceptance checklist questions in firm templates are : ' + CACQINFIRM) + ' ')

if (CACQINMASTER == CACQINFIRM) {
    print('Client acceptance checklist copied successfully')
} else {
    KeywordUtil.markFailed('Question in master and firm are not matching')
}
WebUI.delay(2)
WebUI.click(findTestObject('Checklist_Objects/Independance_In_Firm'))

//Independance in firm template
List<Map> QuesFirmIND = driver.findElements(By.xpath('//div[contains(@class,\'card\')]'))

//INDQINFIRM- Independance checklist questions in firm
int INDCQINFIRM = QuesFirmIND.size()

System.out.print(('Total client Independance checklist questions in firm templates are : ' + INDCQINFIRM) + ' ')

if (INDCQINMASTER == INDCQINFIRM) {
    print(' checklist copied successfully')
} else {
    KeywordUtil.markFailed('Question in master and firm are not matching')
}
WebUI.delay(2)
WebUI.click(findTestObject('Checklist_Objects/Knowledge_Checklist_In_Firm_Template'))

//Knowledge in firm template
List<Map> QuesFirmKNOW = driver.findElements(By.xpath('//div[contains(@class,\'card ng-star-inserted\')]'))

//KNOWCQINFIRM- Knowledge checklist questions in firm
int KNOWCQINFIRM = QuesFirmKNOW.size()

System.out.print(('Total Knowledge checklist questions in firm templates are : ' + KNOWCQINFIRM) + ' ')

if (KNOWCQINMASTER == KNOWCQINFIRM) {
    print(' checklist copied successfully')
} else {
    KeywordUtil.markFailed('Question in master and firm are not matching'+'Question in Master: '+KNOWCQINMASTER+' Question in firm: '+KNOWCQINFIRM)
}
WebUI.delay(2)
WebUI.click(findTestObject('Checklist_Objects/Planning_In_FirmTemplate'))

//Planning in firm template
List<Map> QuesFirmPlan = driver.findElements(By.xpath('//div[contains(@class,\'card\')]'))

//PLANCQINFIRM- Planning checklist questions in firm
int PLANCQINFIRM = QuesFirmPlan.size()

System.out.print(('Total Planning checklist questions in firm templates are : ' + PLANCQINFIRM) + ' ')

if (PLANCQINMASTER == PLANCQINFIRM) {
    print(' checklist copied successfully')
} else {
    KeywordUtil.markFailed('Question in master and firm are not matching')
}
WebUI.delay(2)
WebUI.click(findTestObject('Checklist_Objects/Completion_Checklist_In_Firm'))

//Completion in firm template
List<Map> QuesFirmCOMP = driver.findElements(By.xpath('//div[contains(@class,\'card\')]'))

//COMPCQINFIRM- Completion checklist questions in firm
int COMPCQINFIRM = QuesFirmCOMP.size()

System.out.print(('Total completion checklist questions in firm templates are : ' + COMPCQINFIRM) + ' ')

if (COMPCQINMASTER == COMPCQINFIRM) {
    print(' checklist copied successfully')
} else {
    KeywordUtil.markFailed('Question in master and firm are not matching')
}

