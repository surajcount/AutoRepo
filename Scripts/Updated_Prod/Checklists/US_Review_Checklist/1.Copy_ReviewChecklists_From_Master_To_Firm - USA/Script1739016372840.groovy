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

WebUI.click(findTestObject('Checklist_Objects/Review_Checklist_Master'))

WebUI.click(findTestObject('Checklist_Objects/New_Acceptance_Checklist'))

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

List<Map> QuesMastNAC = driver.findElements(By.xpath('//div[contains(@class,\'card-body\')]'))

//CACQINMASTER- Client acceptance checklist questions in master
int NACQINMASTER = QuesMastNAC.size()

System.out.print(('Total New acceptance checklist questions in master are : ' + NACQINMASTER) + ' ')

WebUI.click(findTestObject('Notes_Firm/span_add Firm templates'))

WebUI.click(findTestObject('Checklist_Objects/Create_New_Folder'))

WebUI.setText(findTestObject('Notes_Firm/FolderName'), 'Review Checklists')

WebUI.click(findTestObject('Notes_Firm/Add_Button'))

WebUI.verifyTextPresent('Successfully added to firm templates', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.delay(2)

//WebUI.click(findTestObject('Checklist_Objects/CompChecklist_Master_Library'))
WebUI.click(findTestObject('Checklist_Objects/Existing_Engagement_Checklist'))

List<Map> QuesMastExi = driver.findElements(By.xpath('//div[contains(@class,\'card-body\')]'))

//INDCQINMASTER- Independance checklist questions in master
int EXICQINMASTER = QuesMastExi.size()

System.out.print(('Total existing engagement checklist questions in master are : ' + EXICQINMASTER) + ' ')

WebUI.click(findTestObject('Notes_Firm/span_add Firm templates'))

WebUI.click(findTestObject('Checklist_Objects/Review_Checklist_Folder'))

WebUI.click(findTestObject('Notes_Firm/Add_Button'))

WebUI.verifyTextPresent('Successfully added to firm templates', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.delay(2)

//Knowledge checklist
WebUI.click(findTestObject('Checklist_Objects/Understanding_Basics_Checklist'))

List<Map> QuesMastBasics = driver.findElements(By.xpath('//div[contains(@class,\'card-body\')]'))

//KNOWCQINMASTER- Knowledge checklist questions in master
int BASICCQINMASTER = QuesMastBasics.size()

System.out.print(('Total Understanding basics checklist questions in master are : ' + BASICCQINMASTER) + ' ')

WebUI.click(findTestObject('Notes_Firm/span_add Firm templates'))

WebUI.click(findTestObject('Checklist_Objects/Review_Checklist_Folder'))

WebUI.click(findTestObject('Notes_Firm/Add_Button'))

WebUI.verifyTextPresent('Successfully added to firm templates', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.delay(2)

//Planning checklist
WebUI.click(findTestObject('Checklist_Objects/Understanding_System_Checklist'))

List<Map> QuesMastSystem = driver.findElements(By.xpath('//div[contains(@class,\'card-body\')]'))

//PLANCQINMASTER- Planning checklist questions in master
int SYSCQINMASTER = QuesMastSystem.size()

System.out.print(('Total Understanding system checklist questions in master are : ' + SYSCQINMASTER) + ' ')

WebUI.click(findTestObject('Notes_Firm/span_add Firm templates'))

WebUI.click(findTestObject('Checklist_Objects/Review_Checklist_Folder'))

WebUI.click(findTestObject('Notes_Firm/Add_Button'))

WebUI.verifyTextPresent('Successfully added to firm templates', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.delay(2)

//Completion Checklist
WebUI.click(findTestObject('Checklist_Objects/Engagement_Planning'))

List<Map> QuesMastEngPlan = driver.findElements(By.xpath('//div[contains(@class,\'card-body\')]'))

//COMPCQINMASTER- Completion checklist questions in master
int ENGPLCQINMASTER = QuesMastEngPlan.size()

System.out.print(('Total Engagement planning checklist questions in master are : ' + ENGPLCQINMASTER) + ' ')

WebUI.click(findTestObject('Notes_Firm/span_add Firm templates'))

WebUI.click(findTestObject('Checklist_Objects/Review_Checklist_Folder'))

WebUI.click(findTestObject('Notes_Firm/Add_Button'))

//Navigate to firm Template
WebUI.verifyTextPresent('Successfully added to firm templates', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.delay(2)

//Completion Checklist
WebUI.click(findTestObject('Checklist_Objects/Review_Completion'))

List<Map> QuesMastEngCompl = driver.findElements(By.xpath('//div[contains(@class,\'card-body\')]'))

//COMPCQINMASTER- Completion checklist questions in master
int COMPCQINMASTER = QuesMastEngCompl.size()

System.out.print(('Total Engagement Review completion checklist questions in master are : ' + COMPCQINMASTER) + ' ')

WebUI.click(findTestObject('Notes_Firm/span_add Firm templates'))

WebUI.click(findTestObject('Checklist_Objects/Review_Checklist_Folder'))

WebUI.click(findTestObject('Notes_Firm/Add_Button'))

//Navigate to firm Template
WebUI.verifyTextPresent('Successfully added to firm templates', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Review_Checklist_Master'))

WebUI.delay(2)

//Completion Checklist
WebUI.click(findTestObject('Checklist_Objects/SubSequent_Event'))

List<Map> QuesMastSubEvent = driver.findElements(By.xpath('//div[contains(@class,\'card-body\')]'))

//COMPCQINMASTER- Completion checklist questions in master
int SUBEVCQINMASTER = QuesMastSubEvent.size()

System.out.print(('Total Engagement Subsequent event checklist questions in master are : ' + SUBEVCQINMASTER) + ' ')

WebUI.click(findTestObject('Notes_Firm/span_add Firm templates'))

WebUI.click(findTestObject('Checklist_Objects/Review_Checklist_Folder'))

WebUI.click(findTestObject('Notes_Firm/Add_Button'))

//Navigate to firm Template
WebUI.verifyTextPresent('Successfully added to firm templates', false)

WebUI.click(findTestObject('Checklist_Objects/Checklist_Container'))

WebUI.click(findTestObject('Checklist_Objects/Firm_Templates'))

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/New_Acceptance_Checklist'))

//Client Acceptance in firm template
List<Map> QuesFirmNAC = driver.findElements(By.xpath('//div[contains(@class,\'card-body\')]'))

//CACQINFIRM- Client acceptance checklist questions in firm
int NACQINFIRM = QuesFirmNAC.size()

System.out.print(('Total client acceptance checklist questions in firm templates are : ' + NACQINFIRM) + ' ')

if (NACQINMASTER == NACQINFIRM) {
    print('Client acceptance checklist copied successfully')
} else {
    KeywordUtil.markFailed('Question in master and firm are not matching')
}

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Existing_Engagement_Checklist'))

//Independance in firm template
List<Map> QuesFirmEXI = driver.findElements(By.xpath('//div[contains(@class,\'card-body\')]'))

//INDQINFIRM- Independance checklist questions in firm
int EXICQINFIRM = QuesFirmEXI.size()

System.out.print(('Total client Independance checklist questions in firm templates are : ' + EXICQINFIRM) + ' ')

if (EXICQINMASTER == EXICQINFIRM) {
    print(' checklist copied successfully')
} else {
    KeywordUtil.markFailed('Question in master and firm are not matching')
}

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Understanding_Basics_Checklist'))

//Knowledge in firm template
List<Map> QuesFirmBasic = driver.findElements(By.xpath('//div[contains(@class,\'card-body\')]'))

//KNOWCQINFIRM- Knowledge checklist questions in firm
int BASICCQINFIRM = QuesFirmBasic.size()

System.out.print(('Total Basics checklist questions in firm templates are : ' + BASICCQINFIRM) + ' ')

if (BASICCQINMASTER == BASICCQINFIRM) {
    print(' checklist copied successfully')
} else {
    KeywordUtil.markFailed(((('Question in master and firm are not matching' + 'Question in Master: ') + BASICCQINMASTER) + 
        ' Question in firm: ') + BASICCQINFIRM)
}

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Understanding_System_Checklist'))

//Planning in firm template
List<Map> QuesFirmSystem = driver.findElements(By.xpath('//div[contains(@class,\'card-body\')]'))

//PLANCQINFIRM- Planning checklist questions in firm
int SYSTCQINFIRM = QuesFirmSystem.size()

System.out.print(('Total System checklist questions in firm templates are : ' + SYSTCQINFIRM) + ' ')

if (SYSCQINMASTER == SYSTCQINFIRM) {
    print(' checklist copied successfully')
} else {
    KeywordUtil.markFailed('Question in master and firm are not matching')
}

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Engagement_Planning'))

//Completion in firm template
List<Map> QuesFirmENGPL = driver.findElements(By.xpath('//div[contains(@class,\'card-body\')]'))

//COMPCQINFIRM- Completion checklist questions in firm
int ENGPLACQINFIRM = QuesFirmENGPL.size()

System.out.print(('Total engagement planning checklist questions in firm templates are : ' + ENGPLACQINFIRM) + ' ')

if (ENGPLCQINMASTER == ENGPLACQINFIRM) {
    print(' checklist copied successfully')
} else {
    KeywordUtil.markFailed('Question in master and firm are not matching')
}

WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/Completion_Checklist_In_Firm'))

//Completion in firm template
List<Map> QuesFirmCOMPRE = driver.findElements(By.xpath('//div[contains(@class,\'card ng-star-inserted\')]'))

//COMPCQINFIRM- Completion checklist questions in firm
int COMPREVICQINFIRM = QuesFirmCOMPRE.size()

System.out.print(('Total review completion checklist questions in firm templates are : ' + COMPREVICQINFIRM) + ' ')

if (COMPCQINMASTER == COMPREVICQINFIRM) {
    print(' checklist copied successfully')
} else {
    KeywordUtil.markFailed('Question in master and firm are not matching')
}

//SUBEVCQINMASTER
WebUI.delay(2)

WebUI.click(findTestObject('Checklist_Objects/SubSequent_Event'))

//Completion in firm template
List<Map> QuesFirmSUBS = driver.findElements(By.xpath('//div[contains(@class,\'card-body\')]'))

//COMPCQINFIRM- Completion checklist questions in firm
int SUBSREVICQINFIRM = QuesFirmSUBS.size()

System.out.print(('Total review completion checklist questions in firm templates are : ' + SUBSREVICQINFIRM) + ' ')

if (SUBEVCQINMASTER == SUBSREVICQINFIRM) {
    print(' checklist copied successfully')
} else {
    KeywordUtil.markFailed('Question in master and firm are not matching')
}

WebUI.closeBrowser()

