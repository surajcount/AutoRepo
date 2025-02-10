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

WebUI.setText(findTestObject('LoginPage/User_Email'), LoginEmail)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_List'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Create_Engagement_Pravin/Create_engagement_button_listpage'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Create_Engagement_Pravin/Client_Name_on_Popup'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Select_Client'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_Type'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Compilation_Type'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Proceed_on_popup'))

WebUI.waitForPageLoad(3)

WebUI.setText(findTestObject('Create_Engagement_Pravin/Period_Year_End_Date'), '12/31/2023')

WebUI.setText(findTestObject('Create_Engagement_Pravin/Budget'), '1000')

WebUI.scrollToElement(findTestObject('Create_Engagement_Pravin/Add_Engagement_Team_Member'), 0)

WebUI.click(findTestObject('Create_Engagement_Pravin/Add_Engagement_Team_Member'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Select_Team_Option'))

WebUI.click(findTestObject('Create_Engagement_Pravin/First_Team_Member_FromList'))

WebUI.setText(findTestObject('Create_Engagement_Pravin/Time_Allocation'), '100')

WebUI.click(findTestObject('Create_Engagement_Pravin/Check_Icon'))

WebUI.click(findTestObject('Create_Engagement_Pravin/Create_engagement_button_listpage'))

WebUI.verifyTextPresent('Engagement created successfully', false)

WebUI.waitForPageLoad(20)

