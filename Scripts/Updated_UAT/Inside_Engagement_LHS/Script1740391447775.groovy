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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import javax.xml.crypto.dsig.keyinfo.KeyValue as KeyValue
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.builtin.FindWebElementKeyword as FindWebElementKeyword
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import java.util.List as List
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.junit.Assert as Assert

WebUI.openBrowser('')

WebUI.navigateToUrl(UAT)

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

WebUI.mouseOver(findTestObject('User_Access/Client_Onboarding'))

WebUI.click(findTestObject('User_Access/Kebab_CO'))

WebDriver driver = DriverFactory.getWebDriver()

List<Map> elements = driver.findElements(By.xpath('//div/div[@role=\'menu\']/div/button'))

// Expected values for comparison
String[] expectedValues = ['Raise a request', 'Raise issue', 'Add comment', 'Add Section']

// Iterate through each WebElement and compare with expected values
for (int i = 0; i < elements.size(); i++) {
    String actualValue = elements.get(i).getText()

    String expectedValue = expectedValues[i]

    System.out.print(('Kebab values are : ' + actualValue) + ' ')

    // Assert that the actual value matches the expected value
    Assert.assertEquals('Mismatch at index ' + i, expectedValue, actualValue)
}

WebUI.click(findTestObject('User_Access/Raise_Request_Kebab_Option'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/SubFolder_RHS_List_Arrow'))

WebUI.delay(1)

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/Sub_Folder_CLI_Acpt_RHS'))

WebUI.delay(1)

WebUI.setText(findTestObject('Procedures_Object/Document_name'), 'Automation documents required')

WebUI.setText(findTestObject('Procedures_Object/Document_Description'), 'Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.')

WebUI.scrollToElement(findTestObject('Procedures_Object/Request_Due_Date'), 5)

WebUI.click(findTestObject('Procedures_Object/Request_Due_Date'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Procedures_Object/Current_Date_Procedures'))

WebUI.click(findTestObject('Procedures_Object/Send_Request_button'))

WebUI.click(findTestObject('Procedures_Object/Send_Now'))

WebUI.verifyTextPresent('Document request created successfully', false)

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Client_Onboarding'))

WebUI.delay(2)

WebUI.click(findTestObject('LHS_InsideEngagement/Engagement_Letter_Kebab'))

WebUI.click(findTestObject('LHS_InsideEngagement/Raise_Issue_LHS'))

WebUI.setText(findTestObject('Procedures_Object/Issue_Title'), 'Issue created using automation')

WebUI.setText(findTestObject('Procedures_Object/Issue_Description'), 'An object of a dynamically formed class is called an array in Java. Java arrays implement the Serializable and Cloneable interfaces and derive from the Object class')

WebUI.click(findTestObject('LHS_InsideEngagement/Assigned_To'))

WebUI.click(findTestObject('LHS_InsideEngagement/Assigned_to_All'))

WebUI.click(findTestObject('Procedures_Object/Due_Date'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Procedures_Object/Current_Date_Procedures'))

WebUI.click(findTestObject('Engagement_Section_LHS/Submit_BTN_Raise_Issue'))

WebUI.verifyTextPresent('New issue created successfully', false)

WebUI.delay(3)

WebUI.click(findTestObject('LHS_InsideEngagement/Documents_Folder'))

WebUI.delay(1)

WebUI.click(findTestObject('LHS_InsideEngagement/Shareholder_Docs_Kebab'))

WebUI.delay(1)

WebUI.click(findTestObject('LHS_InsideEngagement/Add_Documents_Kebab'))

WebUI.delay(1)

WebUI.uploadFile(findTestObject('Procedures_Object/Upload_Documents'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\PDFDocs.pdf')

WebUI.uploadFile(findTestObject('Procedures_Object/Upload_Documents'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\WordDocs.doc')

WebUI.uploadFile(findTestObject('Procedures_Object/Upload_Documents'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\XLDocs.xlsx')

WebUI.uploadFile(findTestObject('Procedures_Object/Upload_Documents'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\PPTDocs.pptx')

WebUI.delay(3)

WebUI.click(findTestObject('Procedures_Object/Add_Button'))

WebUI.delay(3)

WebUI.click(findTestObject('LHS_InsideEngagement/Shareholder_Docs_Kebab'))

List<Map> kebabelements = driver.findElements(By.xpath('//div/div[@role=\'menu\']/div/button'))

// Expected values for comparison
String[] kebabexpectedValues = ['Reorder', 'Renumber', 'Reorder sections', 'Raise a request', 'Raise issue', 'Add comment'
    , 'Add document', 'Rename', 'Delete']

// Iterate through each WebElement and compare with expected values
for (int i = 0; i < kebabelements.size(); i++) {
    String kebabactualValue = kebabelements.get(i).getText()

    String kebabexpectedValue = kebabexpectedValues[i]

    System.out.print(('Kebab values are : ' + kebabactualValue) + ' ')

    // Assert that the actual value matches the expected value
    Assert.assertEquals('Mismatch at index ' + i, kebabexpectedValue, kebabactualValue)
}

WebUI.click(findTestObject('LHS_InsideEngagement/Reorder'))

WebUI.click(findTestObject('LHS_InsideEngagement/3rd_Docs'))

WebUI.click(findTestObject('LHS_InsideEngagement/UP_Arrow'))

WebUI.click(findTestObject('LHS_InsideEngagement/Save_Reorder'))

WebUI.verifyTextPresent('Document reordered successfully', false)

WebUI.delay(3)

WebUI.click(findTestObject('LHS_InsideEngagement/Shareholder_Docs_Kebab'))

WebUI.click(findTestObject('LHS_InsideEngagement/Renumber'))

WebUI.verifyTextPresent('Renumber Documents', false)

WebUI.verifyTextPresent('Your are attempting to renumber the documents', false)

WebUI.verifyTextPresent('Note: Kindly modify references within the financial statements or other relevant sections before renumbering, as it will affect all linked references.', 
    false)

WebUI.click(findTestObject('LHS_InsideEngagement/Renumber'))

WebUI.verifyTextPresent('Document renumbered successfully', false)

WebUI.delay(3)

WebUI.click(findTestObject('LHS_InsideEngagement/Incorporation_Folder'))

WebUI.click(findTestObject('LHS_InsideEngagement/Delete_LHS_Folder'))

WebUI.click(findTestObject('LHS_InsideEngagement/Delete_on_popup_container'))

WebUI.verifyTextPresent('Folder deleted successfully', false)

WebUI.delay(3)

WebUI.click(findTestObject('LHS_InsideEngagement/Banking_Folder'))

WebUI.click(findTestObject('LHS_InsideEngagement/Rename_LHS'))

WebUI.setText(findTestObject('LHS_InsideEngagement/Banking_Rename_TextBox'), 'Banking Test')

WebUI.click(findTestObject('Notes_Firm/Rename_Tick'))

WebUI.verifyTextPresent('Folder updated successfully', false)

WebUI.delay(3)

WebUI.click(findTestObject('LHS_InsideEngagement/Trial_Balance_Kebab'))

WebUI.click(findTestObject('LHS_InsideEngagement/Raise_Issue_LHS'))

WebUI.setText(findTestObject('Procedures_Object/Issue_Title'), 'Issue created using automation LHS script')

WebUI.setText(findTestObject('Procedures_Object/Issue_Description'), 'An object of a dynamically formed class is called an array in Java. Java arrays implement the Serializable and Cloneable interfaces and derive from the Object class')

WebUI.click(findTestObject('LHS_InsideEngagement/Assigned_To'))

WebUI.click(findTestObject('LHS_InsideEngagement/Assigned_to_All'))

WebUI.click(findTestObject('Procedures_Object/Due_Date'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Procedures_Object/Current_Date_Procedures'))

WebUI.click(findTestObject('Engagement_Section_LHS/Submit_BTN_Raise_Issue'))

WebUI.verifyTextPresent('New issue created successfully', false)

WebUI.delay(3)

WebUI.click(findTestObject('Procedures_Object/Procedure_Section'))

WebUI.delay(2)

WebUI.click(findTestObject('Procedures_Object/Expenses_Sub_sec'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('LHS_InsideEngagement/Operating_Expenses_Folder'), 0)

WebUI.click(findTestObject('LHS_InsideEngagement/Operating_Expenses_Folder'))

WebUI.scrollToElement(findTestObject('LHS_InsideEngagement/Operating_Expenses_subfolder'), 0)

WebUI.click(findTestObject('LHS_InsideEngagement/Operating_Expenses_subfolder'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('LHS_InsideEngagement/Operating_Expenses_subfolder'))

WebUI.delay(2)

WebUI.click(findTestObject('LHS_InsideEngagement/Operating_Expenses_Kebab'))

WebUI.click(findTestObject('LHS_InsideEngagement/Add_comment_LHS_Kebab'))

WebUI.click(findTestObject('LHS_InsideEngagement/Select_LeadSheet'))

WebUI.delay(2)

WebUI.click(findTestObject('LHS_InsideEngagement/40_Expenses'))

WebUI.delay(2)

WebUI.setText(findTestObject('Procedures_Object/Comment_Desc_Procedures'), 'Comment added under operating expenses')

WebUI.click(findTestObject('Engagement_Section_LHS/Submit_BTN_Raise_Issue'))

WebUI.verifyTextPresent('New comment created successfully', false)

WebUI.delay(3)

WebUI.dragAndDropToObject(findTestObject('LHS_InsideEngagement/Source_File'), findTestObject('LHS_InsideEngagement/Add_Reference'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('LHS_InsideEngagement/Financial_Statements'), 0)

WebUI.click(findTestObject('LHS_InsideEngagement/Financial_Statements'))

WebUI.mouseOver(findTestObject('LHS_InsideEngagement/Financial_Statements'))

WebUI.click(findTestObject('LHS_InsideEngagement/FS_Kebab'))

WebUI.delay(3)

List<Map> FSelements = driver.findElements(By.xpath('//div/div[@role=\'menu\']/div/button'))

// Expected values for comparison
String[] FSexpectedValues = ['Raise a request', 'Raise issue', 'Add comment']

// Iterate through each WebElement and compare with expected values
for (int i = 0; i < FSelements.size(); i++) {
    String FSactualValue = FSelements.get(i).getText()

    String fsexpectedValue = FSexpectedValues[i]

    System.out.print(('Kebab values are : ' + FSactualValue) + ' ')

    // Assert that the actual value matches the expected value
    Assert.assertEquals('Mismatch at index ' + i, fsexpectedValue, FSactualValue)
}

WebUI.click(findTestObject('LHS_InsideEngagement/Add_comment_LHS_Kebab'))

WebUI.click(findTestObject('RHS_Objects_Client_Dashborad_Login/SubFolder_RHS_List_Arrow'))

WebUI.click(findTestObject('LHS_InsideEngagement/Compilation_Report_Subfolder'))

WebUI.click(findTestObject('LHS_InsideEngagement/Assigned_To'))

WebUI.click(findTestObject('LHS_InsideEngagement/Assigned_to_All'))

WebUI.setText(findTestObject('Procedures_Object/Comment_Desc_Procedures'), 'Comment added under Financial statements')

WebUI.click(findTestObject('Engagement_Section_LHS/Submit_BTN_Raise_Issue'))

WebUI.verifyTextPresent('New comment created successfully', false)

WebUI.delay(3)

WebUI.click(findTestObject('LHS_InsideEngagement/FS_Folder'))

WebUI.setText(findTestObject('LHS_InsideEngagement/Folder_Name'), 'Folder under FS statements')

WebUI.click(findTestObject('LHS_InsideEngagement/Create_Folder_button'))

WebUI.verifyTextPresent('Folder created successfully', false)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('LHS_InsideEngagement/Newly_Created_Folder'), 0)

WebUI.click(findTestObject('LHS_InsideEngagement/New_Folder_Kebab'))

List<Map> FSfelements = driver.findElements(By.xpath('//div/div[@role=\'menu\']/div/button'))

// Expected values for comparison
String[] FSfexpectedValues = ['Reorder', 'Renumber', 'Raise a request', 'Raise issue', 'Add comment', 'Add document', 'renameDocumentDoc'
    , 'Delete']

// Iterate through each WebElement and compare with expected values
for (int i = 0; i < FSfelements.size(); i++) {
    String FSfactualValue = FSfelements.get(i).getText()

    String fsfexpectedValue = FSfexpectedValues[i]

    System.out.print(('Kebab values are : ' + FSfactualValue) + ' ')

    // Assert that the actual value matches the expected value
    Assert.assertEquals('Mismatch at index ' + i, fsfexpectedValue, FSfactualValue)
}

WebUI.click(findTestObject('LHS_InsideEngagement/Add_Documents_Kebab'))

WebUI.uploadFile(findTestObject('Procedures_Object/Upload_Documents'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\FSNewPDF.pdf')

WebUI.uploadFile(findTestObject('Procedures_Object/Upload_Documents'), 'C:\\Users\\Admin\\Desktop\\Upload_Functions_Test\\FSNewWord.doc')

WebUI.delay(3)

WebUI.click(findTestObject('Procedures_Object/Add_Button'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Sign-Offs_FinalReview_Object/CompletionAndSignoff'), 0)

WebUI.click(findTestObject('Sign-Offs_FinalReview_Object/CompletionAndSignoff'))

WebUI.mouseOver(findTestObject('Sign-Offs_FinalReview_Object/CompletionAndSignoff'))

WebUI.click(findTestObject('LHS_InsideEngagement/CompletionANDSignoffs_Kebab'))

List<Map> CASSelements = driver.findElements(By.xpath('//div/div[@role=\'menu\']/div/button'))

String[] CASexpectedValues = ['Raise a request', 'Raise issue', 'Add comment', 'Add Section']

for (int i = 0; i < CASSelements.size(); i++) {
    String CASactualValue = CASSelements.get(i).getText()

    String casexpectedValue = CASexpectedValues[i]

    System.out.print(('Kebab values are : ' + CASactualValue) + ' ')

    Assert.assertEquals('Mismatch at index ' + i, casexpectedValue, CASactualValue)
}

WebUI.delay(2)

WebUI.click(findTestObject('LHS_InsideEngagement/Add_Section_LHS'))

WebUI.setText(findTestObject('LHS_InsideEngagement/Section_Name'), 'Check Comp')

WebUI.click(findTestObject('LHS_InsideEngagement/Section_Category'))

WebUI.click(findTestObject('LHS_InsideEngagement/Checklist_Category'))

WebUI.click(findTestObject('LHS_InsideEngagement/Add_Button'))

WebUI.verifyTextPresent('Section added successfully', false)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('LHS_InsideEngagement/New_Section'), 0)

WebUI.mouseOver(findTestObject('LHS_InsideEngagement/New_Section'))

WebUI.click(findTestObject('LHS_InsideEngagement/New_Section_Kebab'))

WebUI.delay(3)

List<Map> NSelements = driver.findElements(By.xpath('//div/div[@role=\'menu\']/div/button'))

String[] NsexpectedValues = ['Reorder sections', 'Reorder', 'Renumber', 'Raise a request', 'Raise issue', 'Add comment', 'Add document'
    , 'Rename', 'Delete']

for (int i = 0; i < NSelements.size(); i++) {
    String NSactualValue = NSelements.get(i).getText()

    String nsexpectedValue = NsexpectedValues[i]

    System.out.print(('Kebab values are : ' + NSactualValue) + ' ')

    Assert.assertEquals('Mismatch at index ' + i, nsexpectedValue, NSactualValue)
}

WebUI.delay(2)

WebUI.click(findTestObject('LHS_InsideEngagement/Reorder_Sections'))

WebUI.click(findTestObject('LHS_InsideEngagement/Select_section_to_reorder'))

WebUI.click(findTestObject('LHS_InsideEngagement/UP_Arrow'))

WebUI.click(findTestObject('LHS_InsideEngagement/Save_Reorder_Sections'))

WebUI.verifyTextPresent('Section reordered successfully', false)

WebUI.scrollToElement(findTestObject('LHS_InsideEngagement/New_Section'), 0)

WebUI.click(findTestObject('LHS_InsideEngagement/New_Section'))

WebUI.click(findTestObject('Checklist_Objects/AddChecklist_button'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Checklist_Objects/Expand_Last_Folder'), 0)

WebUI.click(findTestObject('Checklist_Objects/Expand_Last_Folder'))

WebUI.delay(5)

WebUI.click(findTestObject('LHS_InsideEngagement/Last_Checklist'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('LHS_InsideEngagement/Signoff_Section'), 0)

WebUI.mouseOver(findTestObject('LHS_InsideEngagement/Signoff_Section'))

WebUI.click(findTestObject('LHS_InsideEngagement/Signoffs_Kebab'))

List<Map> signelements = driver.findElements(By.xpath('//div/div[@role=\'menu\']/div/button'))

String[] SignexpectedValues = ['Reorder sections', 'Reorder', 'Renumber', 'Raise issue', 'Add comment']

for (int i = 0; i < signelements.size(); i++) {
    String signactualValue = signelements.get(i).getText()

    String signexpectedValue = SignexpectedValues[i]

    System.out.print(('Kebab values are : ' + signactualValue) + ' ')

    Assert.assertEquals('Mismatch at index ' + i, signexpectedValue, signactualValue)
}

WebUI.click(findTestObject('LHS_InsideEngagement/Raise_Issue_LHS'))

WebUI.setText(findTestObject('Procedures_Object/Issue_Title'), 'Issue created using automation')

WebUI.setText(findTestObject('Procedures_Object/Issue_Description'), 'An object of a dynamically formed class is called an array in Java. Java arrays implement the Serializable and Cloneable interfaces and derive from the Object class')

WebUI.click(findTestObject('LHS_InsideEngagement/Assigned_To'))

WebUI.click(findTestObject('LHS_InsideEngagement/Assigned_to_All'))

WebUI.click(findTestObject('Procedures_Object/Due_Date'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Procedures_Object/Current_Date_Procedures'))

WebUI.click(findTestObject('Engagement_Section_LHS/Submit_BTN_Raise_Issue'))

WebUI.verifyTextPresent('New issue created successfully', false)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('LHS_InsideEngagement/Signoff_Section'), 0)

WebUI.mouseOver(findTestObject('LHS_InsideEngagement/Signoff_Section'))

WebUI.click(findTestObject('LHS_InsideEngagement/Signoffs_Kebab'))

WebUI.click(findTestObject('LHS_InsideEngagement/Add_comment_LHS_Kebab'))

WebUI.delay(2)

WebUI.click(findTestObject('LHS_InsideEngagement/Assigned_To'))

WebUI.click(findTestObject('LHS_InsideEngagement/Assigned_to_All'))

WebUI.setText(findTestObject('Procedures_Object/Comment_Desc_Procedures'), 'Comment added under Signoff section')

WebUI.click(findTestObject('Engagement_Section_LHS/Submit_BTN_Raise_Issue'))

WebUI.verifyTextPresent('New comment created successfully', false)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('LHS_InsideEngagement/Final_Review'), 3)

WebUI.mouseOver(findTestObject('LHS_InsideEngagement/Final_Review'))

WebUI.click(findTestObject('LHS_InsideEngagement/Final_Review_Kebab'))

List<Map> finelements = driver.findElements(By.xpath('//div/div[@role=\'menu\']/div/button'))

String[] FinexpectedValues = ['Reorder sections', 'Reorder', 'Renumber', 'Raise issue', 'Add comment']

for (int i = 0; i < finelements.size(); i++) {
    String finactualValue = finelements.get(i).getText()

    String finexpectedValue = FinexpectedValues[i]

    System.out.print(('Kebab values are : ' + finactualValue) + ' ')

    Assert.assertEquals('Mismatch at index ' + i, finexpectedValue, finactualValue)
}

WebUI.click(findTestObject('LHS_InsideEngagement/Add_comment_LHS_Kebab'))

WebUI.delay(2)

WebUI.click(findTestObject('LHS_InsideEngagement/Assigned_To'))

WebUI.click(findTestObject('LHS_InsideEngagement/Assigned_to_All'))

WebUI.setText(findTestObject('Procedures_Object/Comment_Desc_Procedures'), 'Comment added under Final review')

WebUI.click(findTestObject('Engagement_Section_LHS/Submit_BTN_Raise_Issue'))

WebUI.verifyTextPresent('New comment created successfully', false)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('LHS_InsideEngagement/Final_Review'), 3)

WebUI.mouseOver(findTestObject('LHS_InsideEngagement/Final_Review'))

WebUI.click(findTestObject('LHS_InsideEngagement/Final_Review_Kebab'))

WebUI.click(findTestObject('LHS_InsideEngagement/Raise_Issue_LHS'))

WebUI.setText(findTestObject('Procedures_Object/Issue_Title'), 'Issue created using automation under Final review')

WebUI.setText(findTestObject('Procedures_Object/Issue_Description'), 'An object of a dynamically formed class is called an array in Java. Java arrays implement the Serializable and Cloneable interfaces and derive from the Object class')

WebUI.click(findTestObject('LHS_InsideEngagement/Assigned_To'))

WebUI.click(findTestObject('LHS_InsideEngagement/Assigned_to_All'))

WebUI.click(findTestObject('Procedures_Object/Due_Date'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Procedures_Object/Current_Date_Procedures'))

WebUI.click(findTestObject('Engagement_Section_LHS/Submit_BTN_Raise_Issue'))

WebUI.verifyTextPresent('New issue created successfully', false)

WebUI.delay(3)

