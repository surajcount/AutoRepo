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

'This script covers the functionality of onboarding a Firm/Team/Client in country as USA.\r\nIn this script the user filled the address manally not through auto-fetched.'
WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.adinovis.com/login')

WebUI.takeScreenshotAsCheckpoint('LoginPageUI')

WebUI.findWebElement(findTestObject('Page_UAT (Countable)/EmailElement'), 0)

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), LoginEmail_USA)

WebUI.findWebElement(findTestObject('Page_UAT (Countable)/Password'), 5)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/Button_Onboard Your Firm Now'))

WebUI.setText(findTestObject('Page_UAT (Countable)/input_Firm_Address'), 'Bakersfield College')

WebUI.setText(findTestObject('Page_UAT (Countable)/input_Firm_City'), 'Bakersfield')

WebUI.setText(findTestObject('Page_UAT (Countable)/input_Firm_ProvinceState'), 'California')

WebUI.setText(findTestObject('Page_UAT (Countable)/input_Firm_Country'), 'United States')

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Firm_PostalZipCode'), '93305')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Firm_Title'), 'Partner')

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Firm_First Name'), 'Satya')

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/div_Member IDLicense NoFirst NameLast NameB_75727a'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/Go to Step 2'))

WebUI.delay(3)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/Upload_R_Btn_Team_member'))

WebUI.delay(1)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/Downld_Tmp_Ad_Team_BTN'))

WebUI.delay(4)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/Guide_To_Crt_Temp_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/Guide_Pop_Up_Close_BTN'))

WebUI.delay(1)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/Guide_To_Crt_Temp_BTN'))

WebUI.delay(1)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/Downld_PDF_Guide_Ad_Team'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.uploadFile(findTestObject('OnboardingObjects/Page_UAT (Countable)/Upload_Team_Membr_Data_Btn_onbr'), 'C:\\Users\\Admin\\Downloads\\AccountTeamImport (17).csv')

WebUI.waitForElementPresent(findTestObject('Client_All_RegressionCase/UploadCSV_Client/Cancel_Import_Button'), 30)

WebUI.click(findTestObject('Client_All_RegressionCase/UploadCSV_Client/Cancel_Import_Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('OnboardingObjects/Page_UAT (Countable)/Upload_Team_Membr_Data_Btn_onbr'), 'C:\\Users\\Admin\\Downloads\\AccountTeamImport (17).csv')

WebUI.delay(4)

WebUI.waitForElementPresent(findTestObject('AddTeam_AllRegression_Dashboard/Data_Upload_Btn'), 10)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Data_Upload_Btn'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_UAT (Countable)/Go to Step 3'), 10)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/input_Point of Contact_Partner_r_btn_addtTeam'))

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_First name_AddTeam'), 'Sarya')

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Last name_AddTeam'), 'kumar')

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Email_AddTeamMember'), TeamMem_Email_USA)

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Title_AddTeamMember'), 'Partn')

WebUI.click(findTestObject('Page_UAT (Countable)/ng-arrow-wrapper_access_type_addteam'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/span_Super Admin'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/FinalButton_Add Team Member'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/Go to Step 3'))

WebUI.delay(1)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/Import_Client_Radio_BTN_Onbrd'))

WebUI.delay(2)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/Guide_Templ_Cli_Obrd'))

WebUI.delay(4)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/Guide_Pop_Up_Close_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/Guide_Templ_Cli_Obrd'))

WebUI.delay(2)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/Downld_PDF_Guide_Ad_Team'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('OnboardingObjects/Page_UAT (Countable)/UplodClient_Data_Onboarding_Import'), 'C:\\Users\\Admin\\Downloads\\AccountClientImport_USA (3).csv')

WebUI.waitForElementPresent(findTestObject('Client_All_RegressionCase/UploadCSV_Client/Cancel_Import_Button'), 30)

WebUI.click(findTestObject('Client_All_RegressionCase/UploadCSV_Client/Cancel_Import_Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('OnboardingObjects/Page_UAT (Countable)/UplodClient_Data_Onboarding_Import'), 'C:\\Users\\Admin\\Downloads\\AccountClientImport_USA (3).csv')

WebUI.delay(4)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Data_Upload_Btn'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Entity Name_addClient'), 'Cleitreg')

WebUI.click(findTestObject('Page_UAT (Countable)/ng-arrow_entity_type_addClient'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_UAT (Countable)/Entitytype_Corporation_selection'))

WebUI.click(findTestObject('Page_UAT (Countable)/Page_UAT (Countable)/span__ng-arrow-Entity_SubType_USA'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_UAT (Countable)/Page_UAT (Countable)/Entity_Sub_Type_SelectC - Corp'))

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_First Name_addclient'), 'cli')

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Last Name_addclient'), 'reg')

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Email_addclient'), ClientEmail_USA)

WebUI.click(findTestObject('Page_UAT (Countable)/ng-arrow-engpartner_addclient'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_UAT (Countable)/SelectionEng_Partner_Suraj Agnihotry'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/Button_Add Client Member'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/Go to Step 4'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/Button_Finish'))

