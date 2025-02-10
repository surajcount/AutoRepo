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

WebUI.openBrowser('')

'This is Script is designed to Create Compolation/Review and Tax Engagement.\r\nPlease note as we are creating around 9 Engagement of all types in this script so,\r\nUser mush have Acelarate plan Purchased prior running this script completely. '
WebUI.navigateToUrl(PROD)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('EngagementDashboard_Page')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_List'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Create_Engagement_Pravin/Create_engagement_button_listpage'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Create_Engagement_Pravin/Client_Name_on_Popup'))

WebUI.click(findTestObject('Create Engagement_Objects/Select_First_Client_Frm_List'))

//WebUI.setText(findTestObject('Create_Engagement_Pravin/Search_Client'), 'Automation')
//WebUI.click(findTestObject('Create_Engagement_Pravin/Select_Client'))
WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_Type'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_Selection_Review'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Proceed_on_popup'))

WebUI.waitForPageLoad(3)

WebUI.setText(findTestObject('Create_Engagement_Pravin/Period_Year_End_Date'), Eng_Year_End_Date)

WebUI.setText(findTestObject('Create_Engagement_Pravin/Budget'), '2000')

WebUI.scrollToElement(findTestObject('Create_Engagement_Pravin/Add_Engagement_Team_Member'), 0)

WebUI.click(findTestObject('Create_Engagement_Pravin/Add_Engagement_Team_Member'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Select_Team_Option'))

WebUI.click(findTestObject('Create_Engagement_Pravin/First_Team_Member_FromList'))

WebUI.setText(findTestObject('Create_Engagement_Pravin/Time_Allocation'), '100')

WebUI.click(findTestObject('Create_Engagement_Pravin/Check_Icon'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Create_engagement_button_listpage'))

WebUI.verifyTextPresent('Engagement created successfully', false)

WebUI.delay(100)

