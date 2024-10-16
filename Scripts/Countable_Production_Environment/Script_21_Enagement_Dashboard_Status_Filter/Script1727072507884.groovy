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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import org.openqa.selenium.WebElement as WebElement

'This scripts valiadte the data fetched after applying filter on Status Column in \r\nEngagement Section for Completed/New/In Progress/Archieved engagement.'
WebUI.openBrowser('')

WebUI.navigateToUrl('https://platform.countable.co/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('EngagementDashboard_Page')

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Section_Icon'))

WebUI.delay(10)

WebUI.mouseOver(findTestObject('Create Engagement_Objects/Status_Coulmn_Engagement_Dashboard'))

WebUI.click(findTestObject('Create Engagement_Objects/Filter_Button_Status_Clmn'))

WebUI.click(findTestObject('Create Engagement_Objects/Status_Completed_Checkbox'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Create Engagement_Objects/Status_Completed_Checkbox'), Keys.chord(Keys.ESCAPE))

TestObject completedElements = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//p[@title=\'Completed\']')

List<WebElement> elements = WebUI.findWebElements(completedElements, 10)

int elementCount = elements.size()

println(('The element with title \'Completed\' appears ' + elementCount) + ' times on the page.')

WebUI.mouseOver(findTestObject('Create Engagement_Objects/Status_Coulmn_Engagement_Dashboard'))

WebUI.click(findTestObject('Create Engagement_Objects/Filter_Button_Status_Clmn'))

WebUI.click(findTestObject('Create Engagement_Objects/Clear_All_Filter_Eng_Status'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Engagement_Objects/Eng_Status_Filter_New_State_cb'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Create Engagement_Objects/Eng_Status_Filter_New_State_cb'), Keys.chord(Keys.ESCAPE))

TestObject newElements1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//p[@title=\'New\']')

List<WebElement> elements1 = WebUI.findWebElements(newElements1, 10)

int elementCount1 = elements1.size()

println(('The element with title \'New\' appears ' + elementCount1) + ' times on the page.')

WebUI.mouseOver(findTestObject('Create Engagement_Objects/Status_Coulmn_Engagement_Dashboard'))

WebUI.click(findTestObject('Create Engagement_Objects/Filter_Button_Status_Clmn'))

WebUI.click(findTestObject('Create Engagement_Objects/Clear_All_Filter_Eng_Status'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Engagement_Objects/Engmnt_Status_Filter_InProgress_CB'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Create Engagement_Objects/Engmnt_Status_Filter_InProgress_CB'), Keys.chord(Keys.ESCAPE))

TestObject inprogressElements = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//p[@title=\'In Progress\']')

List<WebElement> elements2 = WebUI.findWebElements(inprogressElements, 10)

int elementCount2 = elements2.size()

println(('The element with title \'Inprogress\' appears ' + elementCount2) + ' times on the page.')

WebUI.mouseOver(findTestObject('Create Engagement_Objects/Status_Coulmn_Engagement_Dashboard'))

WebUI.click(findTestObject('Create Engagement_Objects/Filter_Button_Status_Clmn'))

WebUI.click(findTestObject('Create Engagement_Objects/Clear_All_Filter_Eng_Status'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Status_Filter_Archieved'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Create Engagement_Objects/Engagement_Status_Filter_Archieved'), Keys.chord(Keys.ESCAPE))

TestObject archievedElements = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//p[@title=\'Archived\']')

List<WebElement> elements3 = WebUI.findWebElements(archievedElements, 10)

int elementCount3 = elements3.size()

println(('The element with title \'Archived\' appears ' + elementCount3) + ' times on the page.')

