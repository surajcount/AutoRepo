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

WebUI.navigateToUrl(PROD)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Dashboard_Button'), 40)

WebUI.click(findTestObject('Create Engagement_Objects/Dashboard_Button'))

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 0)

WebUI.setText(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), Search_Engagement)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create Engagement_Objects/Comp_Engmnt_GoInside'))

WebUI.delay(3)

WebUI.click(findTestObject('Procedures_Object/Procedure_Section'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Asset_Sub_Section'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Liabilities_Sub_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Equity_Sub_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Revenue_Sub_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Expenses_Sub_sec'))

WebUI.delay(2)

WebUI.refresh()

WebUI.waitForElementClickable(findTestObject('Procedures_Object/Procedure_Section'), 10)

WebUI.click(findTestObject('Procedures_Object/Procedure_Section'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Asset_Sec_Toogle'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Current_Assest_Sub_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Cash_n_Cash_Equivalent_Prscdr'))

WebUI.delay(5)

if (WebUI.verifyElementVisible(findTestObject('Procedures_Object/Add_General_Note_CashnCashEqui'))) {
    WebUI.setText(findTestObject('Procedures_Object/Add_General_Note_CashnCashEqui'), 'Add General Notes Test to CNC')

    WebUI.delay(2)

    WebUI.click(findTestObject('Procedures_Object/Save_Button'))

    WebUI.waitForElementPresent(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), 10)

    WebUI.verifyElementVisible(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), FailureHandling.CONTINUE_ON_FAILURE)

    notescreatedby = WebUI.getText(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'))

    System.out.println(notescreatedby)
} else {
    WebUI.click(findTestObject('Procedures_Object/Edit_Button'))

    WebUI.setText(findTestObject('Procedures_Object/Add_General_Note_CashnCashEqui'), 'Edit General Notes Test to CNC')

    WebUI.delay(2)

    WebUI.click(findTestObject('Procedures_Object/Save_Button'))

    WebUI.waitForElementPresent(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), 10)

    WebUI.verifyElementVisible(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), FailureHandling.CONTINUE_ON_FAILURE)

    notescreatedby = WebUI.getText(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'))

    System.out.println(notescreatedby)
}

WebUI.delay(3)

Total_Balance_CnC = WebUI.getText(findTestObject('Procedures_Object/Total_Bl_Procedure_cnc_equi'))

println(Total_Balance_CnC)

WebUI.click(findTestObject('Procedures_Object/Account_Receivable_Sub_Section'))

WebUI.delay(3)

if (WebUI.verifyElementVisible(findTestObject('Procedures_Object/Add_General_Note_CashnCashEqui'))) {
    WebUI.setText(findTestObject('Procedures_Object/Add_General_Note_CashnCashEqui'), 'Add General Notes Test to A/R')

    WebUI.delay(2)

    WebUI.click(findTestObject('Procedures_Object/Save_Button'))

    WebUI.waitForElementPresent(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), 10)

    WebUI.verifyElementVisible(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), FailureHandling.CONTINUE_ON_FAILURE)

    notescreatedby = WebUI.getText(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'))

    System.out.println(notescreatedby)
} else {
    WebUI.click(findTestObject('Procedures_Object/Edit_Button'))

    WebUI.setText(findTestObject('Procedures_Object/Add_General_Note_CashnCashEqui'), 'Edit General Notes Test to A/R')

    WebUI.delay(2)

    WebUI.click(findTestObject('Procedures_Object/Save_Button'))

    WebUI.waitForElementPresent(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), 10)

    WebUI.verifyElementVisible(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), FailureHandling.CONTINUE_ON_FAILURE)

    notescreatedby = WebUI.getText(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'))

    System.out.println(notescreatedby)
}

WebUI.delay(3)

Total_Balance_CnC = WebUI.getText(findTestObject('Procedures_Object/Total_Account_Recivable'))

println(Total_Balance_CnC)

WebUI.delay(3)

WebUI.click(findTestObject('Procedures_Object/Liabilities_Sub_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Current_Liabilities'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/AccountsPayable'))

WebUI.delay(2)

if (WebUI.verifyElementVisible(findTestObject('Procedures_Object/Add_General_Note_CashnCashEqui'))) {
    WebUI.setText(findTestObject('Procedures_Object/Add_General_Note_CashnCashEqui'), 'Add General Notes Test to A/P')

    WebUI.delay(2)

    WebUI.click(findTestObject('Procedures_Object/Save_Button'))

    WebUI.waitForElementPresent(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), 10)

    WebUI.verifyElementVisible(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), FailureHandling.CONTINUE_ON_FAILURE)

    notescreatedby = WebUI.getText(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'))

    System.out.println(notescreatedby)
} else {
    WebUI.click(findTestObject('Procedures_Object/Edit_Button'))

    WebUI.setText(findTestObject('Procedures_Object/Add_General_Note_CashnCashEqui'), 'Edit General Notes Test to A/P')

    WebUI.delay(2)

    WebUI.click(findTestObject('Procedures_Object/Save_Button'))

    WebUI.waitForElementPresent(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), 10)

    WebUI.verifyElementVisible(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), FailureHandling.CONTINUE_ON_FAILURE)

    notescreatedby = WebUI.getText(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'))

    System.out.println(notescreatedby)
}

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Procedures_Object/Cash_n_Cash_Equivalent_Prscdr'))

WebUI.click(findTestObject('Procedures_Object/CashAndCash_Kebab'))

WebUI.click(findTestObject('Procedures_Object/Add_Document_Kebab'))

WebUI.uploadFile(findTestObject('Procedures_Object/Upload_Documents'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\AddedPDF.pdf')

WebUI.uploadFile(findTestObject('Procedures_Object/Upload_Documents'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\adj entry prod.doc')

WebUI.uploadFile(findTestObject('Procedures_Object/Upload_Documents'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\Trial Balance Grouping (89).xlsx')

WebUI.delay(3)

WebUI.click(findTestObject('Procedures_Object/Add_Button'))

WebUI.click(findTestObject('Procedures_Object/Add_Refrence_Action_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Expand_Collapse_Doc_Arrow'))

WebUI.delay(1)

WebUI.click(findTestObject('Procedures_Object/Add_Doc_Check_Box'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Expand_Collapse_Doc_Arrow'))

WebUI.click(findTestObject('Procedures_Object/Add_Button'))

WebUI.waitForElementVisible(findTestObject('Procedures_Object/Verify_Added_Ref'), 30)

WebUI.verifyElementPresent(findTestObject('Procedures_Object/Verify_Added_Ref'), 10)

WebUI.click(findTestObject('Procedures_Object/Verify_Added_Ref'))

WebUI.click(findTestObject('Procedures_Object/Delete_Referene_Button'))

WebUI.verifyTextPresent('Document deleted successfully', false)

WebUI.delay(3)

WebUI.click(findTestObject('Procedures_Object/Note1_Icon'))

WebUI.setText(findTestObject('Procedures_Object/Note_Text'), 'Note added using automation')

WebUI.click(findTestObject('Procedures_Object/Save_Button'))

WebUI.verifyTextPresent('Added note successfully', false)

WebUI.click(findTestObject('Procedures_Object/Note1_Icon'))

WebUI.mouseOver(findTestObject('Procedures_Object/Created_Note'))

WebUI.click(findTestObject('Procedures_Object/Note_Kebab'))

WebUI.click(findTestObject('Procedures_Object/Edit_Note_Procedure'))

WebUI.clearText(findTestObject('Procedures_Object/Note_Text'))

WebUI.setText(findTestObject('Procedures_Object/Note_Text'), 'Note edited')

WebUI.click(findTestObject('Procedures_Object/Save_Button'))

WebUI.verifyTextPresent('Saved note successfully', false)

WebUI.click(findTestObject('Procedures_Object/Note1_Icon'))

WebUI.mouseOver(findTestObject('Procedures_Object/Created_Note'))

WebUI.click(findTestObject('Procedures_Object/Note_Kebab'))

WebUI.click(findTestObject('Procedures_Object/Delete_Note_Procedures'))

WebUI.click(findTestObject('Notes_Firm/Delete_on_popup'))

WebUI.verifyTextPresent('Deleted note successfully', false)

WebUI.delay(3)

WebUI.click(findTestObject('Procedures_Object/Comment_procedure_icon'))

WebUI.setText(findTestObject('Procedures_Object/Comment_Desc_Procedures'), 'Java array is an object which contains elements of a similar data type. Additionally, The elements of an array are stored in a contiguous memory location.')

WebUI.click(findTestObject('Engagement_Section_LHS/Submit_BTN_Raise_Issue'))

WebUI.verifyTextPresent('New comment created successfully', false)

WebUI.delay(3)

WebUI.click(findTestObject('Procedures_Object/Issue_Procedures_icon'))

WebUI.setText(findTestObject('Procedures_Object/Issue_Title'), 'Issue created using automation')

WebUI.setText(findTestObject('Procedures_Object/Issue_Description'), 'An object of a dynamically formed class is called an array in Java. Java arrays implement the Serializable and Cloneable interfaces and derive from the Object class')

WebUI.click(findTestObject('Procedures_Object/Due_Date'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Procedures_Object/Current_Date_Procedures'))

WebUI.click(findTestObject('Engagement_Section_LHS/Submit_BTN_Raise_Issue'))

WebUI.verifyTextPresent('New issue created successfully', false)

WebUI.delay(3)

WebUI.click(findTestObject('Procedures_Object/New_Doc_Request_icon'))

WebUI.setText(findTestObject('Procedures_Object/Document_name'), 'Automation documents required')

WebUI.setText(findTestObject('Procedures_Object/Document_Description'), 'Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.')

WebUI.scrollToElement(findTestObject('Procedures_Object/Request_Due_Date'), 5)

WebUI.click(findTestObject('Procedures_Object/Request_Due_Date'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Procedures_Object/Current_Date_Procedures'))

WebUI.click(findTestObject('Procedures_Object/Send_Request_button'))

WebUI.click(findTestObject('Procedures_Object/Send_Now'))

WebUI.verifyTextPresent('Document request created successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Cash_n_Cash_Equivalent_Prscdr'))

WebUI.delay(5)

WebUI.click(findTestObject('Procedures_Object/Adj_1st_Procedures'))

WebUI.switchToWindowIndex(1)

WebUI.delay(3)

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.click(findTestObject('Procedures_Object/Select_Adj_Account'))

WebUI.click(findTestObject('Procedures_Object/Select_1st_Account_ADJ'))

WebUI.setText(findTestObject('Procedures_Object/1st_Debit_box_ADJ'), '500')

WebUI.setText(findTestObject('Procedures_Object/2nd_Credit_Boc_ADJ'), '500')

WebUI.setText(findTestObject('Procedures_Object/Notes_Adjusting_Entry'), 'Adjusting entry created from procedure section')

WebUI.delay(3)

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

WebUI.delay(5)

WebUI.switchToWindowIndex(0)

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/AccountsPayable'))

WebUI.click(findTestObject('Procedures_Object/Add_Refrence_Action_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Expand_Collapse_Doc_Arrow'))

WebUI.delay(1)

WebUI.click(findTestObject('Procedures_Object/Add_Doc_Check_Box'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Expand_Collapse_Doc_Arrow'))

WebUI.click(findTestObject('Procedures_Object/Add_Button'))

WebUI.click(findTestObject('Procedures_Object/Verify_Added_Ref'))

WebUI.click(findTestObject('Procedures_Object/Open_Reference'))

WebUI.switchToWindowIndex(1)

WebUI.delay(5)

WebUI.closeWindowIndex(1)

WebUI.delay(1)

