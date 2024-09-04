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

/**
 * The following prompt is for generating script that creates CSV test data with StudioAssist
 * 
 * Select the prompt -> Right-click -> StudioAssist -> Generate Code
 */

/* 
 * 		- Just generate a csv file with three columns: `Facility`, `Visist_Date` and `Comment`
 *
 * 		- The file has 5 rows that comply with the rules as follows:
 * 				+ `Facility` must be one of the following values: `Tokyo CURA Healthcare Center`, `Hongkong CURA Healthcare Center`
 * 	 				and `Seoul CURA Healthcare Center`
 *				+ `Visit_Date` has the dd/mm/yyyy format
 *				+ `Comment` is one sentence describing issue regarding making appointment
 *
 * 		- Save the output to the `test_data.csv` file using the FileOutputStream libary
 *
 * 		- The file content must follow the below format:
 *
 * 			Facility,Visit_Date,Comment
 * 			<facility>,<visit date>,<comment>
 *
 */
