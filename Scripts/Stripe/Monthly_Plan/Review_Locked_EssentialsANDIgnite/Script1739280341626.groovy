import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(UAT)

WebUI.setText(findTestObject('LoginPage/User_Email'), LoginEmail)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('Stripe/Billing'))

WebUI.delay(3)

String CurrentPlan = WebUI.getText(findTestObject('Stripe/Plan_Name'))

WebUI.comment(('Current plan is ' + CurrentPlan) + ' ')

if (CurrentPlan.contains('Essentials Plan')) {
    WebUI.click(findTestObject('Notes_Firm/Template'))

    WebUI.click(findTestObject('Notes_Firm/span_Master Library'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Stripe/Expand_All'))

    WebUI.verifyElementPresent(findTestObject('Stripe/Review_Lock_Icon'), 1)

    WebUI.click(findTestObject('Stripe/Review_Lock_Icon'))

    WebUI.verifyTextPresent('Update your plan', false)

    WebUI.verifyTextPresent('To unlock the review documents, please', false)

    WebUI.verifyTextPresent('upgrade to Accelerate plan', false)

    WebUI.click(findTestObject('Stripe/Cancel_Button'))

    WebUI.click(findTestObject('Notes_Firm/div_Engagements'))

    WebUI.click(findTestObject('Stripe/Letters_Templates_Dropdown'))

    WebUI.click(findTestObject('Stripe/Expand_All'))

    WebUI.verifyElementPresent(findTestObject('Stripe/Review_Lock_Icon'), 1)

    WebUI.click(findTestObject('Stripe/Review_Lock_Icon'))

    WebUI.verifyTextPresent('Update your plan', false)

    WebUI.verifyTextPresent('To unlock the review documents, please', false)

    WebUI.verifyTextPresent('upgrade to Accelerate plan', false)

    WebUI.click(findTestObject('Stripe/Cancel_Button'))

    WebUI.click(findTestObject('Notes_Firm/div_Engagements'))

    WebUI.click(findTestObject('Checklist_Objects/Checklist_Dropdown'))

    WebUI.click(findTestObject('Stripe/Expand_All'))

    WebUI.verifyElementPresent(findTestObject('Stripe/Review_Lock_Icon'), 1)

    WebUI.click(findTestObject('Stripe/Review_Lock_Icon'))

    WebUI.verifyTextPresent('Update your plan', false)

    WebUI.verifyTextPresent('To unlock the review documents, please', false)

    WebUI.verifyTextPresent('upgrade to Accelerate plan', false)

    WebUI.click(findTestObject('Stripe/Cancel_Button'))

    WebUI.click(findTestObject('Notes_Firm/div_Engagements'))

    WebUI.click(findTestObject('Stripe/Reports_Template_Dropdown'))

    WebUI.click(findTestObject('Stripe/Expand_All'))

    WebUI.verifyElementPresent(findTestObject('Stripe/Review_Lock_Icon'), 1)

    WebUI.click(findTestObject('Stripe/Review_Lock_Icon'))

    WebUI.verifyTextPresent('Update your plan', false)

    WebUI.verifyTextPresent('To unlock the review documents, please', false)

    WebUI.verifyTextPresent('upgrade to Accelerate plan', false)

    WebUI.click(findTestObject('Stripe/Cancel_Button'))

    WebUI.click(findTestObject('Notes_Firm/div_Engagements'))

    WebUI.click(findTestObject('Stripe/Worksheets'))

    WebUI.click(findTestObject('Stripe/Expand_All'))

    WebUI.verifyElementPresent(findTestObject('Stripe/Review_Lock_Icon'), 1)

    WebUI.click(findTestObject('Stripe/Review_Lock_Icon'))

    WebUI.verifyTextPresent('Update your plan', false)

    WebUI.verifyTextPresent('To unlock the review documents, please', false)

    WebUI.verifyTextPresent('upgrade to Accelerate plan', false)

    WebUI.click(findTestObject('Stripe/Cancel_Button'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_List'))

    WebUI.waitForPageLoad(5)

    WebUI.click(findTestObject('Create_Engagement_Pravin/Create_engagement_button_listpage'))

    WebUI.waitForPageLoad(5)

    WebUI.click(findTestObject('Create_Engagement_Pravin/Client_Name_on_Popup'))

    WebUI.click(findTestObject('Create Engagement_Objects/Select_First_Client_Frm_List'))

    WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_Type'))

    WebUI.verifyElementNotPresent(findTestObject('Create Engagement Suraj/Engagement_Type_Selection_Review'), 0)

    WebUI.click(findTestObject('Create_Engagement_Pravin/Compilation_Type'))

    WebUI.click(findTestObject('Create_Engagement_Pravin/Proceed_on_popup'))

    WebUI.waitForPageLoad(3)

    WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_Template'))

    WebUI.click(findTestObject('Notes_Firm/span_Master Library'))

    WebUI.click(findTestObject('Create Engagement_Objects/Review_TEMPLATE_Eng_Creation'))

    WebUI.verifyElementPresent(findTestObject('Stripe/Review_Lock_Icon'), 1)

    WebUI.click(findTestObject('Stripe/Cross_Template'))

    WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_List'))
} else if (CurrentPlan.contains('Accelerate Plan')) {
    WebUI.click(findTestObject('Notes_Firm/Template'))

    WebUI.click(findTestObject('Notes_Firm/span_Master Library'))

    WebUI.click(findTestObject('Stripe/Expand_All'))

    WebUI.verifyElementNotPresent(findTestObject('Stripe/Review_Lock_Icon'), 1)

    WebUI.click(findTestObject('Notes_Firm/div_Engagements'))

    WebUI.click(findTestObject('Stripe/Letters_Templates_Dropdown'))

    WebUI.click(findTestObject('Stripe/Expand_All'))

    WebUI.verifyElementNotPresent(findTestObject('Stripe/Review_Lock_Icon'), 1)

    WebUI.click(findTestObject('Notes_Firm/div_Engagements'))

    WebUI.click(findTestObject('Checklist_Objects/Checklist_Dropdown'))

    WebUI.click(findTestObject('Stripe/Expand_All'))

    WebUI.verifyElementNotPresent(findTestObject('Stripe/Review_Lock_Icon'), 1)

    WebUI.click(findTestObject('Notes_Firm/div_Engagements'))

    WebUI.click(findTestObject('Stripe/Reports_Template_Dropdown'))

    WebUI.click(findTestObject('Stripe/Expand_All'))

    WebUI.verifyElementNotPresent(findTestObject('Stripe/Review_Lock_Icon'), 1)

    WebUI.click(findTestObject('Notes_Firm/div_Engagements'))

    WebUI.click(findTestObject('Stripe/Worksheets'))

    WebUI.click(findTestObject('Stripe/Expand_All'))

    WebUI.verifyElementNotPresent(findTestObject('Stripe/Review_Lock_Icon'), 1)

    WebUI.delay(5)

    WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_List'))

    WebUI.waitForPageLoad(5)

    WebUI.click(findTestObject('Create_Engagement_Pravin/Create_engagement_button_listpage'))

    WebUI.waitForPageLoad(5)

    WebUI.click(findTestObject('Create_Engagement_Pravin/Client_Name_on_Popup'))

    WebUI.click(findTestObject('Create Engagement_Objects/Select_First_Client_Frm_List'))

    WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_Type'))

    WebUI.verifyElementPresent(findTestObject('Create Engagement Suraj/Engagement_Type_Selection_Review'), 0)

    WebUI.click(findTestObject('Create Engagement Suraj/Engagement_Type_Selection_Review'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Create_Engagement_Pravin/Proceed_on_popup'))

    WebUI.waitForPageLoad(3)

    WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_Template'))

    WebUI.click(findTestObject('Notes_Firm/span_Master Library'))

    WebUI.click(findTestObject('Create Engagement_Objects/Review_TEMPLATE_Eng_Creation'))

    WebUI.click(findTestObject('Create Engagement_Objects/Review_Template'))

    WebUI.setText(findTestObject('Create_Engagement_Pravin/Period_Year_End_Date'), Eng_Year_End_Date)

    WebUI.setText(findTestObject('Create_Engagement_Pravin/Budget'), '2000')

    WebUI.scrollToElement(findTestObject('Create_Engagement_Pravin/Add_Engagement_Team_Member'), 0)

    WebUI.click(findTestObject('Create_Engagement_Pravin/Add_Engagement_Team_Member'))

    WebUI.click(findTestObject('Create_Engagement_Pravin/Select_Team_Option'))

    WebUI.click(findTestObject('Create_Engagement_Pravin/First_Team_Member_FromList'))

    WebUI.setText(findTestObject('Create_Engagement_Pravin/Time_Allocation'), '100')

    WebUI.click(findTestObject('Create_Engagement_Pravin/Check_Icon'))

    WebUI.click(findTestObject('Create_Engagement_Pravin/Create_engagement_button_listpage'))

    WebUI.waitForPageLoad(60)
} else if (CurrentPlan.contains('Ignite Plan')) {
    WebUI.click(findTestObject('Notes_Firm/Template'))

    WebUI.click(findTestObject('Notes_Firm/span_Master Library'))

    WebUI.click(findTestObject('Stripe/Expand_All'))

    WebUI.verifyElementPresent(findTestObject('Stripe/Review_Lock_Icon'), 1)

    WebUI.click(findTestObject('Stripe/Review_Lock_Icon'))

    WebUI.verifyTextPresent('Update your plan', false)

    WebUI.verifyTextPresent('To unlock the review documents, please', false)

    WebUI.verifyTextPresent('upgrade to Accelerate plan', false)

    WebUI.click(findTestObject('Stripe/Cancel_Button'))

    WebUI.click(findTestObject('Notes_Firm/div_Engagements'))

    WebUI.click(findTestObject('Stripe/Letters_Templates_Dropdown'))

    WebUI.click(findTestObject('Stripe/Expand_All'))

    WebUI.verifyElementPresent(findTestObject('Stripe/Review_Lock_Icon'), 1)

    WebUI.click(findTestObject('Stripe/Review_Lock_Icon'))

    WebUI.verifyTextPresent('Update your plan', false)

    WebUI.verifyTextPresent('To unlock the review documents, please', false)

    WebUI.verifyTextPresent('upgrade to Accelerate plan', false)

    WebUI.click(findTestObject('Stripe/Cancel_Button'))

    WebUI.click(findTestObject('Notes_Firm/div_Engagements'))

    WebUI.click(findTestObject('Checklist_Objects/Checklist_Dropdown'))

    WebUI.click(findTestObject('Stripe/Expand_All'))

    WebUI.verifyElementPresent(findTestObject('Stripe/Review_Lock_Icon'), 1)

    WebUI.click(findTestObject('Stripe/Review_Lock_Icon'))

    WebUI.verifyTextPresent('Update your plan', false)

    WebUI.verifyTextPresent('To unlock the review documents, please', false)

    WebUI.verifyTextPresent('upgrade to Accelerate plan', false)

    WebUI.click(findTestObject('Stripe/Cancel_Button'))

    WebUI.click(findTestObject('Notes_Firm/div_Engagements'))

    WebUI.click(findTestObject('Stripe/Reports_Template_Dropdown'))

    WebUI.click(findTestObject('Stripe/Expand_All'))

    WebUI.verifyElementPresent(findTestObject('Stripe/Review_Lock_Icon'), 1)

    WebUI.click(findTestObject('Stripe/Review_Lock_Icon'))

    WebUI.verifyTextPresent('Update your plan', false)

    WebUI.verifyTextPresent('To unlock the review documents, please', false)

    WebUI.verifyTextPresent('upgrade to Accelerate plan', false)

    WebUI.click(findTestObject('Stripe/Cancel_Button'))

    WebUI.click(findTestObject('Notes_Firm/div_Engagements'))

    WebUI.click(findTestObject('Stripe/Worksheets'))

    WebUI.click(findTestObject('Stripe/Expand_All'))

    WebUI.verifyElementPresent(findTestObject('Stripe/Review_Lock_Icon'), 1)

    WebUI.click(findTestObject('Stripe/Review_Lock_Icon'))

    WebUI.verifyTextPresent('Update your plan', false)

    WebUI.verifyTextPresent('To unlock the review documents, please', false)

    WebUI.verifyTextPresent('upgrade to Accelerate plan', false)

    WebUI.click(findTestObject('Stripe/Cancel_Button'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_List'))

    WebUI.waitForPageLoad(5)

    WebUI.click(findTestObject('Create_Engagement_Pravin/Create_engagement_button_listpage'))

    WebUI.waitForPageLoad(5)

    WebUI.click(findTestObject('Create_Engagement_Pravin/Client_Name_on_Popup'))

    WebUI.click(findTestObject('Create Engagement_Objects/Select_First_Client_Frm_List'))

    WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_Type'))

    WebUI.verifyElementNotPresent(findTestObject('Create Engagement Suraj/Engagement_Type_Selection_Review'), 0)

    WebUI.click(findTestObject('Create_Engagement_Pravin/Compilation_Type'))

    WebUI.click(findTestObject('Create_Engagement_Pravin/Proceed_on_popup'))

    WebUI.waitForPageLoad(3)

    WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_Template'))

    WebUI.click(findTestObject('Notes_Firm/span_Master Library'))

    WebUI.click(findTestObject('Create Engagement_Objects/Review_TEMPLATE_Eng_Creation'))

    WebUI.verifyElementPresent(findTestObject('Stripe/Review_Lock_Icon'), 1)

    WebUI.click(findTestObject('Stripe/Cross_Template'))

    WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_List'))
}

WebUI.delay(2)

WebUI.closeBrowser()

