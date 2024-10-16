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

'This Script is designed to verify the content of Engagement Letter.\r\nIn case if contenet of Engagement Letter_Get Changed the expected contenet need to be modify.'
WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.adinovis.com/login')

println(expectedEltext)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Dashboard_Button'), 40)

WebUI.click(findTestObject('Create Engagement_Objects/Dashboard_Button'))

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 5)

WebUI.setText(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 'COM')

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create Engagement_Objects/Comp_Engmnt_GoInside'))

WebUI.delay(5)

WebUI.click(findTestObject('Engagement_Section_LHS/ClientOnbrding_Chk_List'))

WebUI.waitForElementClickable(findTestObject('Sign-Offs_FinalReview_Object/Engagement Letter_CA'), 20)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Engagement Letter_CA'))

WebUI.waitForElementClickable(findTestObject('Sign-Offs_FinalReview_Object/ComSign-Off_Tootgle'), 10)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/ComSign-Off_Tootgle'))

WebUI.waitForElementClickable(findTestObject('Sign-Offs_FinalReview_Object/Final_Review_Sec'), 5)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Final_Review_Sec'))

WebUI.waitForElementVisible(findTestObject('Sign-Offs_FinalReview_Object/Verify Final_Review_Heading'), 10)

WebUI.verifyElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Client_Onboarding_Checklist'), 5)

WebUI.verifyElementClickable(findTestObject('Sign-Offs_FinalReview_Object/CL_Chklist_1st'))

WebUI.verifyElementPresent(findTestObject('Sign-Offs_FinalReview_Object/CL_Checklist_2'), 10)

WebUI.verifyElementClickable(findTestObject('Sign-Offs_FinalReview_Object/CL_Chk_List3'))

WebUI.verifyElementPresent(findTestObject('Sign-Offs_FinalReview_Object/CL-Chk_list4'), 10)

WebUI.verifyElementNotChecked(findTestObject('Sign-Offs_FinalReview_Object/CL-Chck_List5'), 10)

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Client_Sign_off_date_label_Format_Verfication'), 10)

WebUI.verifyElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Client_Sign_off_date_label_Format_Verfication'), 
    5)

WebUI.verifyElementVisible(findTestObject('Sign-Offs_FinalReview_Object/Sign_Off_Disclamer'))

WebUI.verifyElementText(findTestObject('Sign-Offs_FinalReview_Object/Sign_Off_disclamer_content'), 'By signing off below, you are agreeing to this statement that you have reviewed all the relevant associated working papers and cleared all your queries and documented the matters appropriately that may cause the financial statements and note disclosures, if applicable, to be false and/or misleading')

WebUI.verifyElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Verify_Sign_Off_User_Completion_Surya'), 10)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Assign_Packager_List_Drp_Dwn'))

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Assign_Packager_As_Surya_LoggedIn'))

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Due_Date_Packaging_disabled'), 10)

'Verify Element is Disabled for assign packager as logged in user.'
WebUI.verifyElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Assign_button_Packager'), 5)

'Verify Element is Disabled for assign packager as logged in user.'
WebUI.verifyElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Due_Date_Packaging_disabled'), 4)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Assign_button_Packager'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Packager_Assign_Toaster_Message'), 10)

String abc = WebUI.getText(findTestObject('Sign-Offs_FinalReview_Object/Packager_Assign_Toaster_Message'))

println(abc)

WebUI.verifyEqual(abc, 'Packager assigned as self successfully')

WebUI.verifyElementVisible(findTestObject('Sign-Offs_FinalReview_Object/Verify_Finalize_Report_Heading'))

String finlz_rep_descrip = WebUI.getText(findTestObject('Sign-Offs_FinalReview_Object/Verify_Finalize_Report_Desription'))

println(finlz_rep_descrip)

WebUI.verifyEqual(finlz_rep_descrip, 'Please click on the signoff date and the signature that would apply to the respective report on the financial statements section')

String finlz_rep_note = WebUI.getText(findTestObject('Sign-Offs_FinalReview_Object/Finalize_Report_Imp_Note'))

println(finlz_rep_note)

WebUI.verifyEqual(finlz_rep_note, 'Important: The ‘Client Signoff’ and the ‘Report Date’ are expected to match.')

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Engagement Letter_CA'))

WebUI.waitForElementClickable(findTestObject('Sign-Offs_FinalReview_Object/Open_Engagement_Letter'), 10)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Open_Engagement_Letter'))

WebUI.delay(4)

String eltext = WebUI.getText(findTestObject('El_text_Verification'))

eltext = eltext.replaceAll('\\s+', '')

println(eltext)

println(expectedEltext)

WebUI.verifyEqual(expectedEltext, eltext)

