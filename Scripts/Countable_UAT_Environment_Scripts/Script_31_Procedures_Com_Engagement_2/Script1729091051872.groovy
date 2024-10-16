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

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/Dashboard_Button'), 40)

WebUI.click(findTestObject('Create Engagement_Objects/Dashboard_Button'))

WebUI.waitForElementPresent(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 0)

WebUI.setText(findTestObject('Create Engagement_Objects/SearchBox_Dashboard'), 'COM')

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create Engagement_Objects/Comp_Engmnt_GoInside'))

WebUI.delay(5)

WebUI.click(findTestObject('Procedures_Object/Procedure_Section'))

WebUI.delay(3)

WebUI.click(findTestObject('Procedures_Object/Asset_Sub_Section'))

WebUI.delay(3)

WebUI.click(findTestObject('Procedures_Object/Liabilities_Sub_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Equity_Sub_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Revenue_Sub_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Expenses_Sub_sec'))

WebUI.delay(3)

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

try {
    WebUI.setText(findTestObject('Procedures_Object/Add_General_Note_CashnCashEqui'), 'Add General Notes Test to CnC Equivalent')

    WebUI.delay(2)

    WebUI.click(findTestObject('Procedures_Object/Save_Button'))

    WebUI.waitForElementPresent(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), 10)

    WebUI.verifyElementVisible(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), FailureHandling.CONTINUE_ON_FAILURE)

    notescreatedby = WebUI.getText(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'))

    println(notescreatedby)
}
catch (Exception e) {
    WebUI.click(findTestObject('Procedures_Object/Edit_Button'))

    WebUI.setText(findTestObject('Procedures_Object/Add_General_Note_CashnCashEqui'), 'Edit General Notes Test to CnC Equivalent')

    WebUI.delay(2)

    WebUI.click(findTestObject('Procedures_Object/Save_Button'))

    WebUI.waitForElementPresent(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), 10)

    WebUI.verifyElementVisible(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), FailureHandling.CONTINUE_ON_FAILURE)

    notescreatedby = WebUI.getText(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'))

    println(notescreatedby)
} 

WebUI.delay(5)

Total_Balance_CnC = WebUI.getText(findTestObject('Procedures_Object/Total_Bl_Procedure_cnc_equi'))

println(Total_Balance_CnC)

WebUI.verifyEqual(Total_Balance_CnC, '(269,514.43)')

WebUI.click(findTestObject('Procedures_Object/Account_Receivable_Sub_Section'))

WebUI.delay(5)

try {
    WebUI.setText(findTestObject('Procedures_Object/Add_General_Note_CashnCashEqui'), 'Add General Notes Test to Account Receivale')

    WebUI.delay(2)

    WebUI.click(findTestObject('Procedures_Object/Save_Button'))

    WebUI.waitForElementPresent(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), 10)

    WebUI.verifyElementVisible(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), FailureHandling.CONTINUE_ON_FAILURE)

    notescreatedby = WebUI.getText(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'))

    println(notescreatedby)
}
catch (Exception e) {
    WebUI.click(findTestObject('Procedures_Object/Edit_Button'))

    WebUI.setText(findTestObject('Procedures_Object/Add_General_Note_CashnCashEqui'), 'Edit General Notes Test to Account Receivale')

    WebUI.delay(2)

    WebUI.click(findTestObject('Procedures_Object/Save_Button'))

    WebUI.waitForElementPresent(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), 10)

    WebUI.verifyElementVisible(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), FailureHandling.CONTINUE_ON_FAILURE)

    notescreatedby = WebUI.getText(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'))

    println(notescreatedby)
} 

WebUI.delay(5)

Total_Balance_CnC = WebUI.getText(findTestObject('Procedures_Object/Total_Account_Recivable'))

println(Total_Balance_CnC)

WebUI.verifyEqual(Total_Balance_CnC, '799,586.79')

WebUI.click(findTestObject('Procedures_Object/Liabilities_Sub_Sec'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Current_Liabilities'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Bank_Ovr_Draft_Current_Lib_Sec'))

WebUI.delay(5)

try {
    WebUI.setText(findTestObject('Procedures_Object/Add_General_Note_CashnCashEqui'), 'Add General Notes Test to Account Receivale')

    WebUI.delay(2)

    WebUI.click(findTestObject('Procedures_Object/Save_Button'))

    WebUI.waitForElementPresent(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), 10)

    WebUI.verifyElementVisible(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), FailureHandling.CONTINUE_ON_FAILURE)

    notescreatedby = WebUI.getText(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'))

    println(notescreatedby)
}
catch (Exception e) {
    WebUI.click(findTestObject('Procedures_Object/Edit_Button'))

    WebUI.setText(findTestObject('Procedures_Object/Add_General_Note_CashnCashEqui'), 'Edit General Notes Test to Account Receivale')

    WebUI.delay(2)

    WebUI.click(findTestObject('Procedures_Object/Save_Button'))

    WebUI.waitForElementPresent(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), 10)

    WebUI.verifyElementVisible(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'), FailureHandling.CONTINUE_ON_FAILURE)

    notescreatedby = WebUI.getText(findTestObject('Procedures_Object/Verify_General_Notes_Created_By'))

    println(notescreatedby)
} 

WebUI.delay(5)

Total_Balance_CnC = WebUI.getText(findTestObject('Procedures_Object/Total_Account_Recivable'))

println(Total_Balance_CnC)

WebUI.verifyEqual(Total_Balance_CnC, '(205,487.67)')

WebUI.click(findTestObject('Procedures_Object/Add_Refrence_Action_BTN'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Documenet_Serch_Drp_Dwn'))

WebUI.delay(1)

WebUI.click(findTestObject('Procedures_Object/Add_Doc_Check_Box'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Add_Button'))

WebUI.waitForElementVisible(findTestObject('Procedures_Object/Verify_Added_Ref'), 30)

WebUI.verifyElementPresent(findTestObject('Procedures_Object/Verify_Added_Ref'), 10)

WebUI.click(findTestObject('Procedures_Object/Verify_Added_Ref'))

WebUI.delay(1)

WebUI.click(findTestObject('Procedures_Object/Delete_Referene_Button'))

