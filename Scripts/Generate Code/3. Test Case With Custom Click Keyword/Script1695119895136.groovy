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

/*
 * 1. Open a browser to the GlobalVariable.G_SiteURL URL
 * 2. Click the 'Page_CuraHomepage/btn_MakeAppointment' button using the 'clickElement' keyword
 * 		inside the 'MyCustomKeyword' class. The class is within the 'com.example' package
 * 3. Set the username object 'Page_Login/txt_UserName' with the 'Username' variable
 * 4. Set the password object 'Page_Login/txt_Password' with the 'Password' variable
 * 5. Click the 'Page_Login/btn_Login' login button with the same 'clickElement' custom keyword
 * 		in step 2
 * 6. Verify that the 'Page_CuraAppointment/div_Appointment' element is present with 10 seconds timeout
 * 7. Close the browser
 */
