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


//Need to modify the test cases as per notes to fs Table variations
WebUI.callTestCase(findTestCase('Login_TC/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Notes_Firm/Template'))

WebUI.click(findTestObject('Notes_Firm/div_Engagements'))

WebUI.click(findTestObject('Notes_Firm/div_Notes to Financial Statements'))

WebUI.click(findTestObject('Notes_Firm/CreateFolder'))

WebUI.setText(findTestObject('Notes_Firm/FolderName'), 'Folder Created in Firm')

WebUI.click(findTestObject('Notes_Firm/ConfirmFolderName'))

WebUI.click(findTestObject('Notes_Firm/Kebab/KebabOfFolder'))

WebUI.click(findTestObject('Notes_Firm/Create_Note'))

WebUI.setText(findTestObject('Notes_Firm/Note_Name'), 'Automated Column')

WebUI.click(findTestObject('Notes_Firm/Add_Note'))

WebUI.click(findTestObject('Notes_Firm/Add_Type'))

WebUI.click(findTestObject('Notes_Firm/Select_Table'))

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.click(findTestObject('Notes_Firm/Current_Year_Column'))

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.click(findTestObject('Notes_Firm/Prior_Year_Column'))

WebUI.click(findTestObject('Notes_Firm/Add_Column'))

WebUI.click(findTestObject('Notes_Firm/Total_Column'))

WebUI.mouseOver(findTestObject('Notes_Firm/Row1_Hover'))

WebUI.click(findTestObject('Notes_Firm/Row1_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Row_Edit'))

WebUI.setText(findTestObject('Notes_Firm/Row_Name'), 'srh vs lsg')

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

WebUI.click(findTestObject('Notes_Firm/Kebab/KebabOfFolder'))

WebUI.click(findTestObject('Notes_Firm/Create_Note'))

WebUI.setText(findTestObject('Notes_Firm/Note_Name'), 'Manual Column')

WebUI.click(findTestObject('Notes_Firm/Add_Note'))

WebUI.click(findTestObject('Notes_Firm/Add_Type'))

WebUI.click(findTestObject('Notes_Firm/Select_Table'))

for (int i = 0; i <= 4; i++) {
    WebUI.click(findTestObject('Notes_Firm/Add_Column'))

    WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/Manual_Column'))
}

WebUI.mouseOver(findTestObject('Notes_Firm/Table_Header'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/Manual_Colm1_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/Man_Col_Rename'))

WebUI.waitForElementClickable(findTestObject('Notes_Firm/Remove_Manual_Text'), 10)

WebUI.clearText(findTestObject('Notes_Firm/Remove_Manual_Text'))

WebUI.setText(findTestObject('Notes_Firm/Remove_Manual_Text'), 'Long term liabilities')

WebUI.click(findTestObject('Notes_Firm/Rename_Tick'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/Manual_Colm2_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/Man_Col_Rename'))

WebUI.clearText(findTestObject('Notes_Firm/Remove_Manual_Text'))

WebUI.setText(findTestObject('Notes_Firm/Remove_Manual_Text'), 'Capital Assets')

WebUI.click(findTestObject('Notes_Firm/Rename_Tick'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/Manual_Colm3_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/Man_Col_Rename'))

WebUI.clearText(findTestObject('Notes_Firm/Remove_Manual_Text'))

WebUI.setText(findTestObject('Notes_Firm/Remove_Manual_Text'), 'Long term Assets')

WebUI.click(findTestObject('Notes_Firm/Rename_Tick'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/Manual_Colm4_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/Man_Col_Rename'))

WebUI.clearText(findTestObject('Notes_Firm/Remove_Manual_Text'))

WebUI.setText(findTestObject('Notes_Firm/Remove_Manual_Text'), 'Net Book Value')

WebUI.click(findTestObject('Notes_Firm/Rename_Tick'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/Manual_Colm5_Kebab'))

WebUI.click(findTestObject('Notes_Firm/Manual_Column_Data/Man_Col_Rename'))

WebUI.clearText(findTestObject('Notes_Firm/Remove_Manual_Text'))

WebUI.setText(findTestObject('Notes_Firm/Remove_Manual_Text'), 'Equipment and Fixtures ')

WebUI.click(findTestObject('Notes_Firm/Rename_Tick'))

WebUI.click(findTestObject('Notes_Firm/Save_Table'))

