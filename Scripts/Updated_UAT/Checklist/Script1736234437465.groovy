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

WebUI.waitForElementPresent(findTestObject('Page_UAT (Countable)/EmailElement'), 5)

WebUI.setText(findTestObject('Page_UAT (Countable)/EmailElement'), EmailLogin)

WebUI.setEncryptedText(findTestObject('Page_UAT (Countable)/Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Login'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_UAT (Countable)/img'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Engagements'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Master Library'))

WebUI.click(findTestObject('Page_UAT (Countable)/span_Search_mat-mdc-button-touch-target'))

WebUI.click(findTestObject('Page_UAT (Countable)/span_Search_mat-mdc-button-touch-target'))

WebUI.setText(findTestObject('Page_UAT (Countable)/input_Search_mat-input-8'), 'con')

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/p_Compilation'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/p_Client Acceptance and Continuance'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Firm Templates'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_create a new folder'))

WebUI.setText(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_Folder name_name'), 'PravinTest 0701')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Add_mat-mdc-button-touch-target'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Checklist successfully added to firm templates'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/p_Independence'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Firm Templates'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_(1 checklists)_mat-radio-65-input'))

WebUI.click(findTestObject('Page_UAT (Countable)/span_Add_mat-mdc-button-touch-target_1'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Successfully added to firm templates'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/p_Knowledge of client business'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Firm Templates'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_(1 checklists)_mat-radio-85-input'))

WebUI.click(findTestObject('Page_UAT (Countable)/span_Add_mat-mdc-button-touch-target_1_2'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Successfully added to firm templates'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/p_Planning'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Firm Templates'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_(1 checklists)_mat-radio-105-input'))

WebUI.click(findTestObject('Page_UAT (Countable)/span_Add_mat-mdc-button-touch-target_1_2_3'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/p_Completion'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Successfully added to firm templates'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Firm Templates'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_(1 checklists)_mat-radio-149-input'))

WebUI.click(findTestObject('Page_UAT (Countable)/span_Add_mat-mdc-button-touch-target_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Successfully added to firm templates'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Firm Templates'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/p_Client Acceptance and Continuance_1'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Edit'))

WebUI.setText(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_Question here_mat-input-28'), 
    'Quality managementDetermine whether accepting this engagement would contravene any of the firm’s quality management policies.')

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_Question here_mat-input-28'))

WebUI.setText(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/textarea_radio_button_checked_mat-input-29'), 
    'Edited')

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Save'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Success'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Duplicate'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_(1 checklists)_mat-radio-202-input'))

WebUI.click(findTestObject('Page_UAT (Countable)/span_Duplicate_mat-mdc-button-touch-target'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Checklist template duplicated successfully'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/p_copy 1 Client Acceptance and Continuance'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Delete'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Delete_1'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Template checklist successfully deleted'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/p_Client Acceptance and Continuance_1'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/p_Independence_1'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/i_Add_mat-mdc-tooltip-trigger fa-regular fa_48f538'))

WebUI.setText(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_Question here_mat-input-57'), 
    'Question no. 5 in independence checklist')

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_Question here_mat-input-57'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Save'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Success'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Question no. 5 in independence checklist'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/p_Knowledge of client business_1'))

WebUI.click(findTestObject('Page_UAT (Countable)/span_Edit_mat-mdc-button-touch-target'))

WebUI.click(findTestObject('Page_UAT (Countable)/input_text'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_eventDate'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Save_1'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Success'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/p_Planning_1'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/i_Add_mat-mdc-tooltip-trigger fa-regular fa_fdbc67'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Cancel'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/i_Add_mat-mdc-tooltip-trigger fa-regular fa_48f538_1'))

WebUI.setText(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_Question here_mat-input-103'), 
    'MCQ Type question')

WebUI.setText(findTestObject('Page_UAT (Countable)/input_text'), '')

WebUI.click(findTestObject('Page_UAT (Countable)/input_text'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_check_boxMultiple Choice'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Add'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Add'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Add'))

WebUI.setText(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_check_box_mat-input-110'), 
    'Option 1')

WebUI.setText(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_check_box_mat-input-111'), 
    'Option 2')

WebUI.setText(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_check_box_mat-input-112'), 
    'Option 3')

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Save_1_2'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Success'))

WebUI.doubleClick(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_1.Minimum threshold amount which does n_78757e'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/p_Knowledge of client business_1'))

WebUI.doubleClick(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_Additional Explanation_mat-input-141'))

WebUI.setText(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_Additional Explanation_mat-input-141'), 
    'New test ')

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/i_Add_fa-regular fa-message-question blue-icons'))

WebUI.setText(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_Question here_mat-input-142'), 
    'Question 1under category')

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Save_1'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Success'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/i_Add_mat-mdc-tooltip-trigger fa-regular fa_48f538_1_2'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_(10 questions)_mat-radio-275-input'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Add to category'))

WebUI.setText(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_Question here_mat-input-150'), 
    'Question under new category')

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_Question here_mat-input-150'))

WebUI.doubleClick(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_Question here_mat-input-150'))

WebUI.setText(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_Question here_mat-input-150'), 
    'Question under existing category')

WebUI.setText(findTestObject('Page_UAT (Countable)/input_text'), '')

WebUI.click(findTestObject('Page_UAT (Countable)/input_text'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_notesLong Answer'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Save_1'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Success'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_2.Question under existing category'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Checklists'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Engagements_1'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Master Library'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/p_Compilation_1'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/p_Compilation CSRS 4200'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Firm templates (1)'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_Existing folder_mat-radio-282-input'))

WebUI.setText(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_Folder name_mat-input-160'), 
    'Pravin 0701')

WebUI.click(findTestObject('Page_UAT (Countable)/span_Add_mat-mdc-button-touch-target_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Engagement template copied successfully'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/p_Pravin 0701'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/p_Compilation CSRS 4200_1'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/i_Checklists_fa-regular fa-circle-xmark'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Map Template'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_PravinTest 0701'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Client Acceptance and Continuance'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/i_Checklists_fa-regular fa-circle-xmark'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Map Template'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_PravinTest 0701'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Independence'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/i_Checklists_fa-regular fa-circle-xmark'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Map Template'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_PravinTest 0701'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Knowledge of client business'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/i_Checklists_fa-regular fa-circle-xmark'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Map Template'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_PravinTest 0701'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Planning'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Save changes'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Changes made to the template saved succ_f5822c'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/i_Search_fas fa-ellipsis-vertical'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Compilation'))

WebUI.click(findTestObject('Page_UAT (Countable)/span_Search_mat-mdc-button-touch-target_1'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Rename'))

WebUI.setText(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_Search_mat-input-210'), 'Com default')

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/i_Search_fa-regular fa-check'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Template renamed successfully'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/img_1'))

WebUI.setText(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/input_Search engagements_mat-input-211'), 
    'com')

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_COM-AUT-Dec312023'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Replace'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Confirm'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_PravinTest 0701 (5 checklists)'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/p_Client Acceptance and Continuance_1_2'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/div_Checklist has been replaced successfully'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Delete'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/h4_Delete Template'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Delete'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_Checklist'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/span_PravinTest 0701 (5 checklists)'))

WebUI.click(findTestObject('Object Repository/Checklist_Objects/Page_UAT (Countable)/p_Client Acceptance and Continuance_1_2'))

WebUI.closeBrowser()

