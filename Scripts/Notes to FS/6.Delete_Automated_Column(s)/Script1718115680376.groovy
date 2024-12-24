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

WebUI.callTestCase(findTestCase('Notes to FS/5.Automated_Column_Format'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Notes_Firm/Table_Header'))

WebUI.mouseOver(findTestObject('Notes_Firm/Table_Header'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Current_Year_Kebab'))

WebUI.mouseOver(findTestObject('Notes_Firm/Delete_Column_expansion'))

WebUI.click(findTestObject('Notes_Firm/Delete_Column'))

WebUI.verifyTextPresent('Deleting the column will permanently erase the data', false)

WebUI.click(findTestObject('Notes_Firm/Delete_on_popup'))

WebUI.verifyTextPresent('Column(s) deleted successfully', false)

WebUI.mouseOver(findTestObject('Notes_Firm/Table_Header'))

WebUI.click(findTestObject('Notes_Firm/Kebab/Prior_Year_Kebab'))

WebUI.mouseOver(findTestObject('Notes_Firm/Delete_Column_expansion'))

WebUI.click(findTestObject('Notes_Firm/Delete_All_Columns'))

WebUI.verifyTextPresent('Deleting the column will permanently erase the data', false)

WebUI.click(findTestObject('Notes_Firm/Delete_on_popup'))

WebUI.verifyTextPresent('Column(s) deleted successfully', false)

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

WebUI.verifyTextPresent('Add column to enable action', false)

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.click(findTestObject('Notes_Firm/Current_Year_Column'))

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.click(findTestObject('Notes_Firm/Prior_Year_Column'))

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.click(findTestObject('Notes_Firm/Total_Column'))

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

