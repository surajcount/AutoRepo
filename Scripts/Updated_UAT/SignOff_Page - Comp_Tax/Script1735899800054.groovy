import java.sql.Driver as Driver
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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.util.Calendar as Calendar

WebUI.openBrowser('')

'This script covers sign-off functinality new. It also check the validation kept among date \r\ncriteria/sign-off date/ report date and signature applied on report.\r\nIt covers sign-off and unsign-off happy flow also.'
WebUI.navigateToUrl(UAT)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Dashboard_Button'), 40)

WebUI.click(findTestObject('Create Engagement_Objects/Dashboard_Button'))

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 5)

WebUI.setText(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), SearchEntity_Type)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create Engagement_Objects/Comp_Engmnt_GoInside'))

WebUI.delay(5)

WebUI.click(findTestObject('Engagement_Section_LHS/ClientOnbrding_Chk_List'))

//Client Onboarding
String s = '//mat-expansion-panel[contains(@class,\'client-onboarding-panel\')]/div/div/mat-expansion-panel'

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> elements = driver.findElements(By.xpath(s))

int Ccount = elements.size()

println('Number of items in client onboarding: ' + Ccount)

////Engagement Letter
//String EL = '(//ul[@class=\'templates-list-items list-style-none ng-star-inserted\'])[1]/li'
//
//List<WebElement> ELs = driver.findElements(By.xpath(EL))
//
//int ELcount = ELs.size()
//
//println('Number of elements matching the EL: ' + ELcount)
//
//int CL_Items = Ccount + ELcount
//
//println('Number of items available under client onboarding section: ' + CL_Items)
//Documents
String DocsF = '//mat-expansion-panel[contains(@class,\'documents-panel\')]/div/div/mat-expansion-panel'

List<WebElement> DocsFolder = driver.findElements(By.xpath(DocsF))

int countDocsFolder = DocsFolder.size()

println('Number of folders Available in Documents: ' + countDocsFolder)

//Procedures
String ProceduresFold = '//mat-expansion-panel[contains(@class,\'procedures-main\')]/div/div/mat-expansion-panel'

List<WebElement> ProceFolder = driver.findElements(By.xpath(ProceduresFold))

int countProceFolder = ProceFolder.size()

println('Number of folders Available in Procedures: ' + countProceFolder)

//Procecures_subfolder
String ProceduresSubFold = '//mat-expansion-panel[contains(@class,\'procedures-main\')]/div/div/mat-expansion-panel/div/div/mat-expansion-panel'

List<WebElement> ProceSubFolder = driver.findElements(By.xpath(ProceduresSubFold))

int countProceSubFolder = ProceSubFolder.size()

println('Number of Sub-folders Available in Procedures: ' + countProceSubFolder)

//LSCount_Procedures
String ProceduresLS = '//mat-expansion-panel[contains(@class,\'procedures-main\')]/div/div/mat-expansion-panel/div/div/mat-expansion-panel/div/div/mat-expansion-panel'

List<WebElement> LSCount = driver.findElements(By.xpath(ProceduresLS))

int TotLS = LSCount.size()

println('Number of Lead Sheets Available in Procedures: ' + TotLS)

int proc_items = (countProceFolder + countProceSubFolder) + TotLS

println('Number of Items Available in Procedures: ' + proc_items)

//Financial_Statement_Items
String FSItems = '//mat-expansion-panel/div/div/ul/li'

List<WebElement> FS = driver.findElements(By.xpath(FSItems))

int FSItemsCount = FS.size()

println('Number of Items Available in FS: ' + FSItemsCount)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/CompletionAndSignoff'))

//Completion&Signoff
String Comp = '//mat-expansion-panel[contains(@class,\'completion-signoff\')]/div/div/mat-expansion-panel'

List<WebElement> ComplSign = driver.findElements(By.xpath(Comp))

int CompSignCount = ComplSign.size()

println('Number of Items Available in Completion and Signoff: ' + CompSignCount)

//Total Items in LHS Count
int TotalItemsinLHS = (((Ccount + countDocsFolder) + proc_items) + FSItemsCount) + CompSignCount

println('Number of Items Available in LHS: ' + TotalItemsinLHS)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Signoffs'))

WebUI.delay(2)

//Checkboxes on signoff page
String SignCheck = '//li[1]/div/div[@class=\'custom-checkbox\']'

List<WebElement> SignCheckboxes = driver.findElements(By.xpath(SignCheck))

int CheckboxCount = SignCheckboxes.size()

println('Number of checkboxes Available in Signoff page: ' + CheckboxCount)

if (TotalItemsinLHS == CheckboxCount) {
    println('Test Passed: LHS and Signoff pages are matching')
} else {

    KeywordUtil.markFailed("Test Fail: LHS and Signoff page are not matching. LHS Items= "+TotalItemsinLHS+" And "+" Checkboxes on signoff page= "+CheckboxCount)
}

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Client_Onboarding_Signoffs'))

WebUI.delay(2)

WebUI.verifyTextPresent('Section signed off successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Documents_section_signoffs'))

WebUI.delay(2)

WebUI.verifyTextPresent('Section signed off successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Procedures_section_signoffs'))

WebUI.delay(2)

WebUI.verifyTextPresent('Section signed off successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Financial_Statements_signoffs'))

WebUI.delay(2)

WebUI.verifyTextPresent('Section signed off successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/CompletionSignoff_section_signoffs'))

WebUI.delay(2)

WebUI.verifyTextPresent('Section signed off successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Signoffs_All'))

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/First_TeamM_SignoffsAll'))

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Signoff_All_sections'))

WebUI.delay(3)

WebUI.verifyTextPresent('Successfully signed off all sections', false)

