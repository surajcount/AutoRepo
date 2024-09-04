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

WebUI.navigateToUrl('https://uat.adinovis.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('EngagementDashboard_Page')

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Section_Icon'))

WebUI.click(findTestObject('Create Engagement_Objects/CreateEngagement_BTN_Eng_Sec'))

WebUI.delay(3)

WebUI.click(findTestObject('Create Engagement_Objects/ClientSelection_Drp_Dwn_Create_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Select_First_Client_Frm_List'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_List_Selection_DRP_DWN'))

WebUI.click(findTestObject('Create Engagement_Objects/Engagement_Type_Selection_Review'))

WebUI.click(findTestObject('Create Engagement_Objects/Proceed_BtN_Eng_Creation'))

String fontWeight = WebUI.getCSSValue(findTestObject('Create Engagement_Objects/Cimpilation_Type_AdditinalInfo_Text_Verification'), 
    'font-weight')

String fontSizeBal_Sheet = WebUI.getCSSValue(findTestObject('Create Engagement_Objects/Compilation_TypeTextVerification_BalSheet'), 
    'font-size')

println('BalFontSize:' + fontSizeBal_Sheet)

WebUI.verifyEqual(fontSizeBal_Sheet, '14px')

println('Font Weight: ' + fontWeight)

WebUI.verifyEqual(fontWeight, '600')

String ElementText1 = WebUI.getText(findTestObject('Create Engagement_Objects/Cimpilation_Type_AdditinalInfo_Text_Verification'))

println('ElementText: ' + ElementText1)

WebUI.verifyElementText(findTestObject('Create Engagement_Objects/Cimpilation_Type_AdditinalInfo_Text_Verification'), 'Balance Sheet')

WebUI.verifyElementText(findTestObject('Create Engagement_Objects/Information_CompilationType'), 'Statement of Income (Loss)')

WebUI.verifyElementText(findTestObject('Create Engagement_Objects/Information_CompilationType_1'), 'Statement of Retained Earnings (Deficit)')

WebUI.verifyElementText(findTestObject('Create Engagement_Objects/Information_Compilation_Type_Standard'), 'Statement of Income (Loss)')

WebUI.verifyElementText(findTestObject('Create Engagement_Objects/Information_Compilation_Type_Standard1'), 'Statement of Retained Earnings (Deficit)')

WebUI.click(findTestObject('Create Engagement_Objects/Compilation_Type_Drp_Dwn_Stnd_Advnc'))

WebUI.delay(1)

WebUI.click(findTestObject('Create Engagement_Objects/Comlation_Type_Standard'))

WebUI.delay(3)

WebUI.takeScreenshotAsCheckpoint('VerifyInformation_Selected_Standard_Type')

WebUI.click(findTestObject('Create Engagement_Objects/Compilation_Type_Drp_Dwn_Stnd_Advnc'))

WebUI.delay(2)

WebUI.click(findTestObject('Create Engagement_Objects/Compilation_Type_Advanced'))

WebUI.click(findTestObject('Create Engagement_Objects/template_Selection_BTN_Compliation_Engmnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Firm_Teamplate_Create_Engagement'))

WebUI.click(findTestObject('Create Engagement_Objects/Firm_Template_Created_Review_Engagement'))

WebUI.click(findTestObject('Create Engagement_Objects/Review_Template_RS_2400'))

WebUI.delay(4)

WebUI.click(findTestObject('Create Engagement_Objects/Eng_End_Date_Period_Calander'))

WebUI.click(findTestObject('Create Engagement_Objects/Eng_Period_Year_End_Date'))

WebUI.click(findTestObject('Create Engagement_Objects/Eng_DATE_End_Year_Apply_Button'))

WebUI.setText(findTestObject('Create Engagement_Objects/Set_Budget_Amount_Engagemnt'), '10000')

WebUI.click(findTestObject('Create Engagement_Objects/Add_Member_To_Engaemnt'))

WebUI.click(findTestObject('Create Engagement_Objects/Team_Meber_Selection_Drop_Down'))

WebUI.click(findTestObject('Create Engagement_Objects/Select_Firm_User_Eng_Team_Member'))

WebUI.setText(findTestObject('Create Engagement_Objects/Set_Engagement_Hourly_Rate'), '100')

WebUI.setText(findTestObject('Create Engagement_Objects/Set_Time_Allocation_Cr_Engagement'), '80')

WebUI.click(findTestObject('Create Engagement_Objects/Done_Button_Create_Engagement'))

WebUI.click(findTestObject('Create Engagement_Objects/Final_Create_Engagement_Button'))

