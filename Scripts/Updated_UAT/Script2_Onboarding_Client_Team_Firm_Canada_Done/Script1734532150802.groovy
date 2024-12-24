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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver

'The Script is designed to onboard new firm , add team member and client. \r\nThis script also require to upload file in various steps while adding team member and \r\nclient through file upload. You need to have correct file as given in file path or you \r\ncan chose your file at any location but ensure you have the file in place.\r\nFor respective sign-up user provide same email variable for login and continue onboarding\r\n firm.\r\nAlso it has few variable email of team memeber and client to add. \r\nThis script also cover\'s login and invite of team and client onboarding. '
WebUI.openBrowser('')

WebUI.navigateToUrl(UAT)

WebUI.takeScreenshotAsCheckpoint('LoginPageUI')

WebUI.findWebElement(findTestObject('Page_UAT (Countable)/EmailElement'), 0)

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), LoginEmail_CANADA)

WebUI.findWebElement(findTestObject('Page_UAT (Countable)/Password'), 5)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/Button_Onboard Your Firm Now'))

WebUI.setText(findTestObject('Page_UAT (Countable)/input_Firm_Address'), 'Taber')

WebUI.setText(findTestObject('Page_UAT (Countable)/input_Firm_City'), 'Taber')

WebUI.setText(findTestObject('Page_UAT (Countable)/input_Firm_ProvinceState'), 'BC')

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Firm_PostalZipCode'), 'Y1A 9Z9')

WebUI.setText(findTestObject('Page_UAT (Countable)/input_Firm_Country'), 'Canada')

WebUI.click(findTestObject('Page_UAT (Countable)/ng-arrow-peg_pact'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Page_UAT (Countable)/div_No'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Firm_Title'), 'Partner')

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Firm_First Name'), 'Jervin')

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

WebUI.uploadFile(findTestObject('OnboardingObjects/Page_UAT (Countable)/Upload_Team_Membr_Data_Btn_onbr'), Onboard_Team)

WebUI.waitForElementPresent(findTestObject('Client_All_RegressionCase/UploadCSV_Client/Cancel_Import_Button'), 30)

WebUI.click(findTestObject('Client_All_RegressionCase/UploadCSV_Client/Cancel_Import_Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.uploadFile(findTestObject('OnboardingObjects/Page_UAT (Countable)/Upload_Team_Membr_Data_Btn_onbr'), Onboard_Team)

WebUI.delay(4)

WebUI.waitForElementPresent(findTestObject('AddTeam_AllRegression_Dashboard/Data_Upload_Btn'), 10)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Data_Upload_Btn'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_UAT (Countable)/Go to Step 3'), 10)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/input_Point of Contact_Partner_r_btn_addtTeam'))

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_First name_AddTeam'), 'Tech')

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Last name_AddTeam'), 'Team')

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Email_AddTeamMember'), TeamMem_Email_CANADA)

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

WebUI.uploadFile(findTestObject('OnboardingObjects/Page_UAT (Countable)/UplodClient_Data_Onboarding_Import'), ClientUpload)

WebUI.waitForElementPresent(findTestObject('Client_All_RegressionCase/UploadCSV_Client/Cancel_Import_Button'), 30)

WebUI.click(findTestObject('Client_All_RegressionCase/UploadCSV_Client/Cancel_Import_Button'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.uploadFile(findTestObject('OnboardingObjects/Page_UAT (Countable)/UplodClient_Data_Onboarding_Import'), ClientUpload)

WebUI.delay(4)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Data_Upload_Btn'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Entity Name_addClient'), EntityName)

WebUI.click(findTestObject('Page_UAT (Countable)/ng-arrow_entity_type_addClient'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_UAT (Countable)/Entitytype_Corporation_selection'))

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_First Name_addclient'), 'cliAmol')

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Last Name_addclient'), 'regPravin')

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/AddClientAddress_Onboard/ClientAddress'), 'Taber')

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/AddClientAddress_Onboard/ClientAddress - City'), 'ABCTaber')

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/AddClientAddress_Onboard/ClientAddress_Country'), 'Canada')

WebUI.setText(findTestObject('AddTeam_AllRegression_Dashboard/AddClientAddress_Onboard/ClientAddress_ProvienceState'), 'BC')

WebUI.setText(findTestObject('Object Repository/Page_UAT (Countable)/input_Email_addclient'), ClientEmail_CANADA)

WebUI.click(findTestObject('Page_UAT (Countable)/ng-arrow-engpartner_addclient'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_UAT (Countable)/SelectionEng_Partner_Suraj Agnihotry'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/Button_Add Client Member'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/Go to Step 4'))

WebUI.click(findTestObject('Object Repository/Page_UAT (Countable)/Button_Finish'))

JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

js.executeScript('window.open()')

WebUI.switchToWindowIndex(1)

WebUI.navigateToUrl('https://yopmail.com/')

WebUI.setText(findTestObject('Object Repository/OnboardingObjects/Page_YOPmail - Disposable Email Address - A_32619f/input_Type the Email name of your choice_login'), 
    team_Memb_yopMail)

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_YOPmail - Disposable Email Address - A_32619f/i_'))

WebUI.click(findTestObject('Page_Inbox/a_Verify'))

WebUI.switchToWindowIndex(2)

WebUI.setEncryptedText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/input_Password_password'), 
    '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.setEncryptedText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/input_Re-enter Password_confirmPassword'), 
    '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/input_Re-enter Password_mat-mdc-checkbox-1-input'))

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/span_Set Password'))

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/span_Login Now'))

WebUI.setText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/input_Email_mat-input-3'), TeamMem_Email_CANADA)

WebUI.setEncryptedText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/input_Password_mat-input-4'), 
    '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/span_Login_mat-mdc-button-touch-target'))

WebUI.delay(2)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/Keep_Default_timezone'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_Section_Object/Dashboard_Client_Sec'))

WebUI.click(findTestObject('Client_Section_Object/Tab_All Clients'))

WebUI.click(findTestObject('Client_Section_Object/inviteEmail'))

js.executeScript('window.open()')

WebUI.switchToWindowIndex(3)

WebUI.navigateToUrl('https://yopmail.com/')

WebUI.setText(findTestObject('Object Repository/OnboardingObjects/Page_YOPmail - Disposable Email Address - A_32619f/input_Type the Email name of your choice_login'), 
    Client_Memb_yopMail)

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_YOPmail - Disposable Email Address - A_32619f/i_'))

WebUI.click(findTestObject('Page_Inbox/a_Verify'))

WebUI.switchToWindowIndex(4)

WebUI.setEncryptedText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/input_Password_password'), 
    '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.setEncryptedText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/input_Re-enter Password_confirmPassword'), 
    '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/input_Re-enter Password_mat-mdc-checkbox-1-input'))

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/span_Set Password'))

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/span_Login Now'))

WebUI.setText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/input_Email_mat-input-3'), ClientEmail_CANADA)

WebUI.setEncryptedText(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/input_Password_mat-input-4'), 
    '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Object Repository/OnboardingObjects/Page_UAT (Countable)/span_Login_mat-mdc-button-touch-target'))

WebUI.delay(2)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/ExpandList_Onbording_Client_Complete'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/Save_BTN_Complete_CLI_Onbrding'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/Client_Integration_Skip_BTN_Onbording'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/Complete_Cli_Onbording_BTN'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('OnboardingObjects/Page_UAT (Countable)/TermsAcceptanceBTN_CLI_Obording'), 60, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/TermsAcceptanceBTN_CLI_Obording'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

