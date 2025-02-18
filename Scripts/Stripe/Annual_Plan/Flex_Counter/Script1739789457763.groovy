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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(UAT)

WebUI.setText(findTestObject('LoginPage/User_Email'), LoginEmail)

WebUI.setEncryptedText(findTestObject('LoginPage/User_Password'), '0yu2BuhvF5H+L+Dr3iRPjA==')

WebUI.click(findTestObject('LoginPage/LoginButton'))

WebUI.maximizeWindow()

WebUI.delay(5)

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('Stripe/Billing'))

WebUI.delay(5)

WebUI.verifyTextPresent('per user/month, billed annually', false)

//Total Seats
String Tot_Seats_PlanDetails = WebUI.getText(findTestObject('Stripe/Total_Seats'))

int Total_Seats = Integer.parseInt(Tot_Seats_PlanDetails)

System.out.print(('Total Seats under plan details are : ' + Total_Seats) + ' ')

//Unused Seats
String Used_PlanDetails = WebUI.getText(findTestObject('Stripe/Used_Seats'))

int Used_Seats = Integer.parseInt(Used_PlanDetails)

System.out.print(('Used Seats under plan details are : ' + Used_Seats) + ' ')

//Remaining Seats
int remaining_seats = Total_Seats - Used_Seats

System.out.print(('Remaining Seats under plan details are : ' + remaining_seats) + ' ')

String payment_fre = WebUI.getText(findTestObject('Stripe/Payment_Frequency_PlanDetails'))

System.out.print(('Payment frequency is : ' + payment_fre) + ' ')

String Next_payment_Date = WebUI.getText(findTestObject('Stripe/Next_Payment_date'))

System.out.print(('Next Payment date is : ' + Next_payment_Date) + ' ')

String NPA = WebUI.getText(findTestObject('Stripe/Next_Payment_Amount'))

String NPA_numericPart1 = NPA.replaceAll('[^0-9]', '')

float NPA_integerPart1 = Integer.parseInt(NPA_numericPart1)

float Next_Amount = NPA_integerPart1 / 100

System.out.print(('Next Payment amount is : ' + Next_Amount) + ' ')

//Add-on: Countable Flex
String Tot_Used = WebUI.getText(findTestObject('Stripe/Total_Used_Till_Date'))

int Total_Flex_Used = Integer.parseInt(Tot_Used)

System.out.print(('Total Flex used till date= ' + Total_Flex_Used) + ' ')

String TC = WebUI.getText(findTestObject('Stripe/Total_Commitment'))

int total_commitment

int remaining_unused_flex

boolean commitmentMet

if (TC.equalsIgnoreCase('NA')) {
    print('User dont have any flex commitment ' //System.out.println('Total Commitment: ' + commitmentMet ? 'Commitment Met' : 'Commitment Not Met')
        )
} else {
    total_commitment = Integer.parseInt(TC)

    System.out.print(('Total Commitments= ' + total_commitment) + ' ')

    remaining_unused_flex = (total_commitment - Total_Flex_Used)

    commitmentMet = (total_commitment == Total_Flex_Used)
	println("Total Commitment: " + (commitmentMet ? "Commitment Met" : "Commitment Not Met"))

    if (commitmentMet) {
        System.out.println('Remaining Unused: NA')
    } else {
        System.out.println('Remaining Unused: ' + remaining_unused_flex)
    }
}

if ((payment_fre.contains('Quarterly') && (total_commitment == 24)) && (remaining_unused_flex < total_commitment)) {
    //Considering Free flex is used

    for (int i = 0; i < remaining_unused_flex; i++) {
        WebUI.callTestCase(findTestCase('Notes_Inside_Engagement/Create_Flex_Engagement_Compilation'), [:], FailureHandling.CONTINUE_ON_FAILURE //System.out.println('Total Commitment: ' + commitmentMet ? 'Commitment Met' : 'Commitment Not Met')
            )
    }
  
} else if (payment_fre.contains('Quarterly') && (total_commitment == 12) && (remaining_unused_flex < total_commitment)) {
   
    for (int i = 0; i < remaining_unused_flex; i++) {
        WebUI.callTestCase(findTestCase('Notes_Inside_Engagement/Create_Flex_Engagement_Compilation'), [:], FailureHandling.CONTINUE_ON_FAILURE)
    }
} else if (payment_fre.contains('Monthly') && (total_commitment == 24) && (remaining_unused_flex < total_commitment)) {
  

    for (int i = 0; i < remaining_unused_flex; i++) {
        WebUI.callTestCase(findTestCase('Notes_Inside_Engagement/Create_Flex_Engagement_Compilation'), [:], FailureHandling.CONTINUE_ON_FAILURE)
    }
} else if (payment_fre.contains('Monthly') && (total_commitment == 12) && (remaining_unused_flex < total_commitment)) {

    for (int i = 0; i < remaining_unused_flex; i++) {
        WebUI.callTestCase(findTestCase('Notes_Inside_Engagement/Create_Flex_Engagement_Compilation'), [:], FailureHandling.CONTINUE_ON_FAILURE)
    }
} else if (payment_fre.contains('Annually') && (total_commitment == 24) && (remaining_unused_flex < total_commitment)) {
   

    for (int i = 0; i < remaining_unused_flex; i++) {
        WebUI.callTestCase(findTestCase('Notes_Inside_Engagement/Create_Flex_Engagement_Compilation'), [:], FailureHandling.CONTINUE_ON_FAILURE)
    }
} else if (payment_fre.contains('Annually') && (total_commitment == 12) && (remaining_unused_flex < total_commitment)) {
    
    for (int i = 0; i < remaining_unused_flex; i++) {
        WebUI.callTestCase(findTestCase('Notes_Inside_Engagement/Create_Flex_Engagement_Compilation'), [:], FailureHandling.CONTINUE_ON_FAILURE)
    }
}

WebUI.delay(5)
WebUI.refresh()

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('Stripe/Billing'))

WebUI.delay(5)

WebUI.verifyTextPresent('per user/month, billed annually', false)

//Total Seats
String Tot_Seats_PlanDetails1 = WebUI.getText(findTestObject('Stripe/Total_Seats'))

int Total_Seats1 = Integer.parseInt(Tot_Seats_PlanDetails1)

System.out.print(('Total Seats under plan details are : ' + Total_Seats1) + ' ')

//Unused Seats
String Used_PlanDetails1 = WebUI.getText(findTestObject('Stripe/Used_Seats'))

int Used_Seats1 = Integer.parseInt(Used_PlanDetails1)

System.out.print(('Used Seats under plan details are : ' + Used_Seats1) + ' ')

//Remaining Seats
int remaining_seats1 = Total_Seats1 - Used_Seats1

System.out.print(('Remaining Seats under plan details are : ' + remaining_seats1) + ' ')

String payment_fre1 = WebUI.getText(findTestObject('Stripe/Payment_Frequency_PlanDetails'))

System.out.print(('Payment frequency is : ' + payment_fre1) + ' ')

String Next_payment_Date1 = WebUI.getText(findTestObject('Stripe/Next_Payment_date'))

System.out.print(('Next Payment date is : ' + Next_payment_Date1) + ' ')

String NPA1 = WebUI.getText(findTestObject('Stripe/Next_Payment_Amount'))

String NPA_numericPart2 = NPA1.replaceAll('[^0-9]', '')

float NPA_integerPart2 = Integer.parseInt(NPA_numericPart2)

float Next_Amount1 = NPA_integerPart2 / 100

System.out.print(('Next Payment amount is : ' + Next_Amount1) + ' ')

if (Next_Amount1 > Next_Amount) {
    print('Test Passed :Amount increased ')
} else {
    KeywordUtil.markFailed('Test Failed :Amount is not increased')
}

//Add-on: Countable Flex
String Tot_Used1 = WebUI.getText(findTestObject('Stripe/Total_Used_Till_Date'))

int Total_Flex_Used1 = Integer.parseInt(Tot_Used1)

System.out.print(('Total Flex used till date= ' + Total_Flex_Used1) + ' ')

String TC1 = WebUI.getText(findTestObject('Stripe/Total_Commitment'))

int total_commitment1

int remaining_unused_flex1

if (TC1.equalsIgnoreCase('NA')) {
    print('User dont have any flex commitment ' //System.out.println('Total Commitment: ' + commitmentMet ? 'Commitment Met' : 'Commitment Not Met')
        )
} else {
    total_commitment1 = Integer.parseInt(TC)

    System.out.print(('Total Commitments= ' + total_commitment1) + ' ')

    remaining_unused_flex1 = (total_commitment1 - Total_Flex_Used1)

    boolean commitmentMet1 = total_commitment1 == Total_Flex_Used1
	println("Total Commitment: " + (commitmentMet1 ? "Commitment Met" : "Commitment Not Met"))
	

    if (commitmentMet1) {
        System.out.println('Remaining Unused: NA')
    } else {
        System.out.println('Remaining Unused: ' + remaining_unused_flex1)
    }
}

