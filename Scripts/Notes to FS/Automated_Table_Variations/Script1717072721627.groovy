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

WebUI.callTestCase(findTestCase('Notes to FS/Navigate to Notes to FS Firm template'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Notes_Firm/CreateFolder'))

WebUI.setText(findTestObject('Object Repository/NotesToFS_Table_Variations/input_Folder name_name'), 'Automated Table Variations test')

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Confirm'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Automated Table Variations test'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Automated Table Variations test_mat-md_c1d485'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Create note'))

WebUI.setText(findTestObject('Object Repository/NotesToFS_Table_Variations/input_Note Title_name'), 'Automated Table')

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Create_mat-mdc-button-touch-target'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Add Type'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Table'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/i_keyboard_arrow_down'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Prior Year'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Add Column'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Current Year'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Add Column'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Total'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_MON DD, 20XX'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Current YearMON DD, 20XX'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Current YearMON DD, 20XX'))

WebUI.doubleClick(findTestObject('Object Repository/NotesToFS_Table_Variations/span_MON DD, 20XX'))

WebUI.doubleClick(findTestObject('Object Repository/NotesToFS_Table_Variations/span_MON DD, 20XX'))

WebUI.doubleClick(findTestObject('Object Repository/NotesToFS_Table_Variations/span_MON DD, 20XX'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_MON DD, 20XX'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/img'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Long Format (Month DD, 20XX)'))

WebUI.doubleClick(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Month DD, 20XX'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Month DD, 20XX'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/img'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Year Only (20XX)'))

WebUI.doubleClick(findTestObject('Object Repository/NotesToFS_Table_Variations/span_20XX'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/img'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Short Format (MON DD, 20XX)'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/div_Column(s) updated successfully'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/img'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/div_Format'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/img_Save_activatedBtnFormat'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/img_1'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Apply'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/div_Column(s) updated successfully'))

WebUI.doubleClick(findTestObject('Object Repository/NotesToFS_Table_Variations/span_MON DD, 20XX'))

WebUI.doubleClick(findTestObject('Object Repository/NotesToFS_Table_Variations/span_MON DD, 20XX'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_MON DD, 20XX'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/img'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/div_Format'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/img_Save_activatedBtnFormat'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/img_1'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Apply'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/div_Column(s) updated successfully'))

WebUI.doubleClick(findTestObject('Object Repository/NotesToFS_Table_Variations/span_MON DD, 20XX'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_MON DD, 20XX'))

WebUI.doubleClick(findTestObject('Object Repository/NotesToFS_Table_Variations/pre_Prior Year'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/pre_Prior Year'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/img'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/div_clear_cdk-overlay-backdrop cdk-overlay-_6ddd51'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/span_Save'))

WebUI.click(findTestObject('Object Repository/NotesToFS_Table_Variations/div_Saved Automated Table successfully'))

