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

WebUI.callTestCase(findTestCase('Login_TC/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10)

int numberOfRuns = 6 // Specify how many times to run

for (int i = 0; i < numberOfRuns; i++) {
    WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_List'))

    WebUI.waitForPageLoad(5)

    WebUI.click(findTestObject('Create_Engagement_Pravin/Create_engagement_button_listpage'))

    WebUI.waitForPageLoad(5)

    WebUI.click(findTestObject('Create_Engagement_Pravin/Client_Name_on_Popup'))

    WebUI.setText(findTestObject('Create_Engagement_Pravin/Search_Client'), 'client')

    WebUI.click(findTestObject('Create_Engagement_Pravin/Select_Client'))

    WebUI.click(findTestObject('Create_Engagement_Pravin/Engagement_Type'))

    WebUI.click(findTestObject('Create_Engagement_Pravin/Compilation_Type'))

    WebUI.click(findTestObject('Create_Engagement_Pravin/Proceed_on_popup'))

    WebUI.waitForPageLoad(5)

    WebUI.setText(findTestObject('Create_Engagement_Pravin/Period_Year_End_Date'), '12/31/2023')

    WebUI.setText(findTestObject('Create_Engagement_Pravin/Budget'), '2000')

    WebUI.scrollToElement(findTestObject('Create_Engagement_Pravin/Add_Engagement_Team_Member'), 0)

    WebUI.click(findTestObject('Create_Engagement_Pravin/Add_Engagement_Team_Member'))

    WebUI.click(findTestObject('Create_Engagement_Pravin/Select_Team_Option'))

    WebUI.click(findTestObject('Create_Engagement_Pravin/First_Team_Member_FromList'))

    WebUI.setText(findTestObject('Create_Engagement_Pravin/Time_Allocation'), '100')

    WebUI.click(findTestObject('Create_Engagement_Pravin/Check_Icon'))

    WebUI.click(findTestObject('Create_Engagement_Pravin/Create_engagement_button_listpage'))

    WebUI.delay(20)
}

WebUI.closeBrowser()

