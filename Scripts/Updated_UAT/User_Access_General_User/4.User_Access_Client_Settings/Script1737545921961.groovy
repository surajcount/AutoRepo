import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.xml.crypto.dsig.keyinfo.KeyValue as KeyValue
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.builtin.FindWebElementKeyword as FindWebElementKeyword
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

'This Script Covers addition and updating team member info for firm user.\r\nThis script have adding client through file upload flow where validation of \r\nduplicate/existing and incoorect file format has done.\r\nEnsure to have the respective data in corresponding uploaded file.\r\nUpdate the variable used for adding team member.'
WebUI.navigateToUrl(UAT)

WebUI.setText(findTestObject('LoginPage/User_Email'), LoginEmail)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('Stripe/Billing'))

WebUI.click(findTestObject('User_Access/User_And_Access'))

WebUI.delay(2)

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Edit_Button_Team_Staff_Sec'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('User_Access/Client_Settings'), 0)

WebUI.click(findTestObject('User_Access/Can add clients'))

WebUI.click(findTestObject('User_Access/Can view clients'))

WebUI.verifyTextPresent('Modify Client View Access', false)

WebUI.click(findTestObject('User_Access/View_Client_Access'))

WebUI.delay(3)

WebUI.click(findTestObject('User_Access/First_Client_Access'))

WebUI.click(findTestObject('User_Access/Second_Client_Access'))

WebUI.delay(3)

WebUI.click(findTestObject('User_Access/Back_To_UA_Page'))

WebUI.scrollToElement(findTestObject('User_Access/Client_Settings'), 0)

WebUI.click(findTestObject('User_Access/Can delete clients'))

WebUI.delay(2)

WebUI.click(findTestObject('User_Access/Save_Team_Details'))

WebUI.click(findTestObject('User_Access/Save_Changes_Popup'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Login/User_profile'))

WebUI.click(findTestObject('OnboardingObjects/Page_UAT (Countable)/span_Log out'))

WebUI.delay(2)

WebUI.setText(findTestObject('LoginPage/User_Email'), General_TeamMember)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.delay(3)

WebUI.click(findTestObject('User_Access/Clients_Page'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('User_Access/Total_Clients_Access'), '2')

WebUI.click(findTestObject('Client_Section_Object/Tab_All Clients'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Edit_Button_Team_Staff_Sec'))

WebUI.clearText(findTestObject('User_Access/Cellphone'))

WebUI.setText(findTestObject('User_Access/Cellphone'), '9865321470')

WebUI.click(findTestObject('User_Access/Save_Team_Details'))

WebUI.verifyTextPresent('Client record updated successfully', false)

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.delay(3)

WebUI.click(findTestObject('Client_All_RegressionCase/AddClient_Button'))

WebUI.delay(3)

WebUI.click(findTestObject('Client_All_RegressionCase/AddNewClient_Manually'))

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_EntityName'), Entity_Name)

WebUI.click(findTestObject('Client_All_RegressionCase/AddNewClient_EntityType_DropDwn'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Client_All_RegressionCase/AddClient_Entity_Selection_Corp'))

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_IncopDate'), '05/22/2024')

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_FirstName'), 'General')

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_LastName'), 'Add')

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_Email'), NewClientEmail)

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_Address'), 'F.G.Bradley\'s')

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_City'), 'Toronto')

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_Province_State'), 'Ontario')

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_Country'), 'Canada')

WebUI.setText(findTestObject('Client_All_RegressionCase/AddNewClient_PinCode'), 'M9C 4Y1')

WebUI.click(findTestObject('Client_All_RegressionCase/AddNewClient_Eng_Partnr_Dropdwn'))

WebUI.click(findTestObject('User_Access/Logged_in_user_as_partner'))

WebUI.click(findTestObject('Client_All_RegressionCase/AddNewClient_FinalAdd_Button'))

WebUI.click(findTestObject('Notes_Firm/Toast_Container'))

WebUI.delay(2)

WebUI.click(findTestObject('Client_Section_Object/Tab_All Clients'))

WebUI.click(findTestObject('AddTeam_AllRegression_Dashboard/Additional AddTeamCase/Delete_Button_AllTeam_Sec'))

WebUI.click(findTestObject('Notes_Firm/Delete_on_popup'))

WebUI.verifyTextPresent('Client record deleted successfully', false)

