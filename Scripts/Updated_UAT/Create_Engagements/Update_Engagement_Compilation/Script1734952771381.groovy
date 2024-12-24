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
WebUI.navigateToUrl(UAT)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_List'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Create Engagement_Objects/Edit_1st_InProgress_Engagement'))

WebUI.delay(5)

WebUI.click(findTestObject('Create Engagement_Objects/Edit_EngagementID'))

WebUI.delay(2)

WebUI.setText(findTestObject('Create Engagement_Objects/EngagementID_3Letters_Edit'), 'PSP')

WebUI.click(findTestObject('Create_Engagement_Pravin/Check_Icon'))

WebUI.clearText(findTestObject('Create_Engagement_Pravin/Budget'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Create_Engagement_Pravin/Budget'), '2000')

WebUI.scrollToElement(findTestObject('Create_Engagement_Pravin/Add_Engagement_Team_Member'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Create Engagement_Objects/Edit_EngagementTeamMember'))

WebUI.delay(2)

WebUI.click(findTestObject('Create_Engagement_Pravin/Select_Team_Option'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Engagement_Objects/Second_Team_Member_FromList'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Check_Icon'))

WebUI.click(findTestObject('Create Engagement_Objects/Update_Engagement'))

WebUI.verifyTextPresent('Engagement updated successfully', false)

WebUI.waitForPageLoad(20)

