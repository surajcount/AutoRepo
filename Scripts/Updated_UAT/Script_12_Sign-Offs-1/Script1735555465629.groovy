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

WebUI.setText(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 'COM')

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create Engagement_Objects/Comp_Engmnt_GoInside'))

WebUI.delay(5)

WebUI.click(findTestObject('Engagement_Section_LHS/ClientOnbrding_Chk_List'))

WebUI.waitForElementClickable(findTestObject('Sign-Offs_FinalReview_Object/Engagement Letter_CA'), 20)

WebUI.delay(2)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Engagement Letter_CA'))

WebUI.delay(2)

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

'New Xpath to be define\r\n'
WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Signature_Apply_From_EL'), 50)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Signature_Apply_From_EL'))

WebUI.delay(2)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Drp_Dwn_Select_Sign_EL'))

WebUI.delay(2)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Select_Sign_EL'))

WebUI.delay(2)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Sign_Letter_BTN'))

String eldate = WebUI.getText(findTestObject('Sign-Offs_FinalReview_Object/Engagement_Letter_Date_Element'))

println(eldate)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Final_Review_Sec'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Eldate_Final_Review'), 10)

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Eldate_Final_Review'), 50)

String eldatefr = WebUI.getText(findTestObject('Sign-Offs_FinalReview_Object/Eldate_Final_Review'))

println(eldatefr)

WebUI.verifyEqual(eldate, eldatefr, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Toogle_Finacial_Statement'), 5)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Toogle_Finacial_Statement'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Toogle_Financial_St_Doc'), 4)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Toogle_Financial_St_Doc'))

WebUI.waitForElementClickable(findTestObject('Sign-Offs_FinalReview_Object/Comp-Copilation_Report'), 4)

'object spelling is R for prod and r for UAt'
WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Comp-Copilation_Report'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Scroll_Dwn_Compilation_Rep'), 4)

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Scroll_Dwn_Compilation_Rep'), 20)

WebUI.delay(2)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Final_Review_Sec'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Eldate_Final_Review'), 10)

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Eldate_Final_Review'), 50)

WebUI.delay(1)

SimpleDateFormat inputFormat = new SimpleDateFormat('MMMM dd, yyyy')

Date parsedDate = inputFormat.parse(eldate)

SimpleDateFormat outputFormat = new SimpleDateFormat('MM/dd/yyyy')

String formattedDate = outputFormat.format(parsedDate)

WebUI.sendKeys(findTestObject('Sign-Offs_FinalReview_Object/formatteddateddmmyyyy'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Sign-Offs_FinalReview_Object/formatteddateddmmyyyy'), Keys.chord(Keys.DELETE))

WebUI.delay(2)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/formatteddateddmmyyyy'))

WebUI.setText(findTestObject('Sign-Offs_FinalReview_Object/formatteddateddmmyyyy'), formattedDate)

WebUI.sendKeys(findTestObject('Sign-Offs_FinalReview_Object/formatteddateddmmyyyy'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Sign-Offs_FinalReview_Object/formatteddateddmmyyyy'), Keys.chord(Keys.DELETE))

WebUI.delay(2)

Calendar calendar = Calendar.getInstance()

calendar.setTime(parsedDate)

println(formattedDate)

println(parsedDate)

// Add 5 days to the date
calendar.add(Calendar.DATE, 5)

Date datePlusFive = calendar.getTime()

// Reset the calendar to the original date before subtracting
calendar.setTime(parsedDate)

// Subtract 5 days from the date
calendar.add(Calendar.DATE, -5)

Date dateMinusFive = calendar.getTime()

// Format the new dates to MM/DD/YYYY
String formattedDatePlusFive = outputFormat.format(datePlusFive)

String formattedDateMinusFive = outputFormat.format(dateMinusFive)

println(formattedDatePlusFive)

println(formattedDateMinusFive)

WebUI.setText(findTestObject('Sign-Offs_FinalReview_Object/formatteddateddmmyyyy'), formattedDate)

WebUI.clearText(findTestObject('Sign-Offs_FinalReview_Object/formatteddateddmmyyyy'))

WebUI.sendKeys(findTestObject('Sign-Offs_FinalReview_Object/formatteddateddmmyyyy'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Sign-Offs_FinalReview_Object/formatteddateddmmyyyy'), Keys.chord(Keys.DELETE))

WebUI.delay(2)

WebUI.setText(findTestObject('Sign-Offs_FinalReview_Object/formatteddateddmmyyyy'), formattedDatePlusFive)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Sign-Offs_FinalReview_Object/formatteddateddmmyyyy'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Sign-Offs_FinalReview_Object/formatteddateddmmyyyy'), Keys.chord(Keys.DELETE))

WebUI.delay(2)

WebUI.setText(findTestObject('Sign-Offs_FinalReview_Object/formatteddateddmmyyyy'), formattedDateMinusFive)

String getcolor = WebUI.getCSSValue(findTestObject('Sign-Offs_FinalReview_Object/Report_dt_valdation_lessthan_eldate'), 
    'color')

println(getcolor)

String expectedColor = 'rgba(217, 45, 32, 1)'

WebUI.verifyEqual(getcolor, expectedColor)

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Validation_Message_ELgrtlessthan_rprtdate'), 10)

String txtlsesseldate = WebUI.getText(findTestObject('Sign-Offs_FinalReview_Object/Validation_Message_ELgrtlessthan_rprtdate'))

String valdtxt = 'Report Date should be after Engagement letter date'

WebUI.verifyEqual(txtlsesseldate, valdtxt)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Choose_Signature_Drop_Dwn'))

WebUI.delay(3)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Select_Signature_Drp_Dwn_Sign_off'))

WebUI.delay(1)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Apply_Button_Sign_Off'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Sign_Off_Apply_Pop_Message'), 10)

WebUI.verifyElementText(findTestObject('Sign-Offs_FinalReview_Object/Sign_Off_Apply_Pop_Message'), 'Date & Signature for finalized report applied successfully')

WebUI.sendKeys(findTestObject('Sign-Offs_FinalReview_Object/formatteddateddmmyyyy'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Sign-Offs_FinalReview_Object/formatteddateddmmyyyy'), Keys.chord(Keys.DELETE))

WebUI.delay(2)

WebUI.setText(findTestObject('Sign-Offs_FinalReview_Object/formatteddateddmmyyyy'), formattedDatePlusFive)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Apply_Button_Sign_Off'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Sign_Off_Apply_Pop_Message'), 10)

WebUI.verifyElementText(findTestObject('Sign-Offs_FinalReview_Object/Sign_Off_Apply_Pop_Message'), 'Date & Signature for finalized report applied successfully')

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/FS_Cover_Page'), 10)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/FS_Cover_Page'))

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Sign_Off_Buton'))

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/FS_Sign_Off_Calander'))

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Sign_Off_Cancel_BTN'))

WebUI.setText(findTestObject('Sign-Offs_FinalReview_Object/Sign-off-datefield'), formattedDateMinusFive)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/FS_Sign_Off_Calander'))

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Apply_BTN_Client_Sign_offDate'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Sign_off_date_message'), 6)

WebUI.verifyElementText(findTestObject('Sign-Offs_FinalReview_Object/Sign_off_date_message'), 'Client Signoff date updated successfully.')

WebUI.waitForElementVisible(findTestObject('Sign-Offs_FinalReview_Object/Unsign_Button'), 10)

unsignbtncolor = WebUI.getCSSValue(findTestObject('Sign-Offs_FinalReview_Object/Unsign_Button'), 'color')

fsizeunsignbtn = WebUI.getCSSValue(findTestObject('Sign-Offs_FinalReview_Object/Unsign_Button'), 'font-size')

println(fsizeunsignbtn)

WebUI.verifyEqual(unsignbtncolor, 'rgba(255, 255, 255, 1)')

WebUI.verifyEqual(fsizeunsignbtn, '14px')

WebUI.waitForElementVisible(findTestObject('Sign-Offs_FinalReview_Object/Verify_Signed_Date_Applied'), 10)

String sign_off_date = WebUI.getText(findTestObject('Sign-Offs_FinalReview_Object/Verify_Signed_Date_Applied'))

println(sign_off_date)

SimpleDateFormat input_sign_off_date = new SimpleDateFormat('MMMM dd, yyyy')

Date parsedsignoffDate = input_sign_off_date.parse(sign_off_date)

SimpleDateFormat outputFormatsignoffdate = new SimpleDateFormat('MM/dd/yyyy')

String formattedsignoffDate = outputFormat.format(parsedsignoffDate)

println(parsedsignoffDate)

println(formattedsignoffDate)

WebUI.verifyEqual(formattedsignoffDate, formattedDateMinusFive)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Final_Review_Sec'))

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Client_Sign_off_Calander_BTN'), 20)

clsignoffdate = WebUI.getText(findTestObject('Sign-Offs_FinalReview_Object/ClientSignoffdateapplied'))

println(clsignoffdate)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/ClienSign_Date_Validation'), 20)

WebUI.verifyElementText(findTestObject('Sign-Offs_FinalReview_Object/ClienSign_Date_Validation'), 'Client Signoff Date should be after Engagement Letter signoff date')

WebUI.delay(2)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Comp-Copilation_Report'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Scroll_Dwn_Compilation_Rep'), 4)

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Scroll_Dwn_Compilation_Rep'), 20)

WebUI.delay(2)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Unsign_Button_Text'))

WebUI.waitForElementPresent(findTestObject('Sign-Offs_FinalReview_Object/Unsign_Toaster_Message'), 10)

WebUI.verifyElementText(findTestObject('Sign-Offs_FinalReview_Object/Unsign_Toaster_Message'), 'Client Signoff signature removed successfully.')

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/Final_Review_Sec'))

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Client_Sign_off_Calander_BTN'), 20)

clsignoffdate = WebUI.getText(findTestObject('Sign-Offs_FinalReview_Object/ClientSignoffdateapplied'))

println(clsignoffdate)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/Eldate_Final_Review'), 50)

WebUI.delay(2)

WebUI.closeBrowser()

