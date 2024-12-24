import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Login_TC/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Stripe/User_Profile'))

WebUI.click(findTestObject('Stripe/Billing'))

WebUI.verifyTextPresent('Free Trial', false)

WebUI.click(findTestObject('Stripe/Subscribe_button'))

WebUI.verifyTextPresent('Please select the plan that best suits your needs', false)

WebUI.click(findTestObject('Stripe/Select_Plan_Accelerate'))

WebUI.verifyTextPresent('You are about to subscribe to the Accelerate Monthly Plan', false)

WebUI.click(findTestObject('Stripe/Confirm_on_Popup'))

WebUI.verifyTextPresent('Accelerate Monthly', false)

WebUI.verifyTextPresent('Supercharge Your Workflow', false)

'Flex Pricess  when user subscribing to monthly plan should be 599'
WebUI.verifyTextPresent('$599', false)

WebUI.scrollToElement(findTestObject('Stripe/Remove_Flex_Addon'), 0)

WebUI.scrollToElement(findTestObject('Stripe/Proceed_to_Checkout_Button'), 0)

WebUI.click(findTestObject('Stripe/Proceed_to_Checkout_Button'))

WebUI.delay(1)

WebUI.verifyTextPresent('Checkout', false)

String PPS = WebUI.getText(findTestObject('Stripe/Price_per_seat'))

String numericPart = PPS.replaceAll('[^0-9]', '')

float integerPart = Integer.parseInt(numericPart)

float price = integerPart / 100

System.out.print(price)

String value = WebUI.getAttribute(findTestObject('Stripe/No. of _Seat'), 'value')

int ns = Integer.parseInt(value)

System.out.print(('The no of seats ' + ns) + ' ')

String months = WebUI.getText(findTestObject('Stripe/No. Of_Months'))

int NOM = Integer.parseInt(months)

System.out.print(('The number of months= ' + NOM) + ' ')

float PlanCharges = (price * NOM) * ns

System.out.print(('Plan Charges are= ' + PlanCharges) + ' ')

String PC = WebUI.getText(findTestObject('Stripe/Plan_Charges'))

String Charge = PC.replaceAll('[^0-9]', '')

float integerPar = Integer.parseInt(Charge)

float PlanC = integerPar / 100

System.out.print(PlanC)

if (PlanCharges == PlanC) {
    System.out.print('Test Passed : Plan charges calculated correctly ')
} else {
    System.out.print('Test Failed : Plan charges calculated incorrectly ')
}

String CF = WebUI.getText(findTestObject('Stripe/Countable_Flex_Charge'))

String numericPart1 = CF.replaceAll('[^0-9]', '')

float integerPart1 = Integer.parseInt(numericPart1)

float FlexCharge = integerPart1 / 100

System.out.print(FlexCharge)

String ST = WebUI.getText(findTestObject('Stripe/Subtotal_New_Plan'))

String numericPart2 = ST.replaceAll('[^0-9]', '')

float integerPart2 = Integer.parseInt(numericPart2)

float Subtotalnc = integerPart2 / 100

System.out.print(Subtotalnc)

float SubtotalNewPlan = PlanCharges + FlexCharge

System.out.print('Subtotal is ' + SubtotalNewPlan)

//DiscountApplied
String Disc = WebUI.getText(findTestObject('Stripe/Discount_Applied_New_Plan'))

System.out.print('Discount ' + Disc)

String discAmt = Disc.replaceAll('[^0-9]', '')

float discNum = Integer.parseInt(discAmt)

float DiscountedAmount = discNum / 100

System.out.print('Discounted Amount is ' + DiscountedAmount)

float NetTotal = SubtotalNewPlan + DiscountedAmount

System.out.print('Net Total is ' + NetTotal)

//Tax
String taxn = WebUI.getText(findTestObject('Stripe/Tax_New_Plan'))

String taxper = taxn.replaceAll('[^0-9]', '')

float taxPercentage = Integer.parseInt(taxper)

System.out.print('Tax percentage is ' + taxPercentage)

float TaxCal = (NetTotal * taxPercentage) / 100

System.out.print('Tax should be :' + TaxCal)

//Total
float Total = NetTotal + TaxCal

System.out.print('Total Amount :' + Total)

String tot = WebUI.getText(findTestObject('Stripe/Total_New_Plan'))

String totnum = tot.replaceAll('[^0-9]', '')

float totval = Integer.parseInt(totnum)

float TotalNewPlan = totval / 100

System.out.print('Total New plan charges= ' + TotalNewPlan)

if (Total == TotalNewPlan) {
    System.out.print('Test Passed :Total is correct ')
} else {
    System.out.print('Test Failed :Total is incorrect ')
}

//WebUI.click(findTestObject('Stripe/Select_Payment_Frequency'))
//
//WebDriver driver = DriverFactory.getWebDriver()
//
//List<WebElement> Payements = driver.findElements(By.xpath('//div[@role=\'listbox\']/mat-option'))
//
//println(Payements.size())
//
//for (WebElement el : Payements) {
//	println(el.getText())
//}
//
//if (SubtotalNewPlan > 10000) {
//	Payements.size() == 3
//
//	println('Subtotal is Greater than 10000')
//} else {
//	if ((SubtotalNewPlan > 5000) && (SubtotalNewPlan < 10000)) {
//		Payements.size() == 2
//
//		println('Subtotal is Greater than 5000 and less than 10000')
//	} else {
//		Payements.size() == 1
//
//		println('Subtotal is less than 5000')
//	}
//}
//
//WebUI.click(findTestObject('Stripe/Quarterly_Payment_Frequency'))
//
//WebUI.setText(findTestObject('Stripe/No. of _Seat'), '10')
//
//WebUI.click(findTestObject('Stripe/Select_Payment_Frequency'))
//
//WebUI.delay(1)
//
//WebUI.click(findTestObject('Stripe/Select_Payment_Frequency'))
//
//WebUI.click(findTestObject('Stripe/Annually_Payment_Frequency'))
String Days_Left = WebUI.getText(findTestObject('Stripe/Days_Left_in_Month'))

int DaysleftYear = Integer.parseInt(Days_Left)

System.out.print(('Days Left in month = ' + DaysleftYear) + ' ')

//double ProRatedNewPlanCharge = 0.00
//
//String PaymentOption = WebUI.getText(findTestObject('Stripe/Payment_Frequency_Option'))
//
//if (PaymentOption == 'Annually') {
//	ProRatedNewPlanCharge = (SubtotalNewPlan / 1)
//
//	System.out.print('Prorated new plan charge =' + ProRatedNewPlanCharge)
//} else {
//	if (PaymentOption == 'Quarterly') {
//		ProRatedNewPlanCharge = (SubtotalNewPlan / 4)
//
//		System.out.print('Prorated new plan charge =' + ProRatedNewPlanCharge)
//	} else {
//		ProRatedNewPlanCharge = (SubtotalNewPlan / 12)
//
//		System.out.print('Prorated new plan charge =' + ProRatedNewPlanCharge)
//	}
//}
//Pro Rated New Plan Charge:
String PNPC = WebUI.getText(findTestObject('Stripe/Pro Rated New Plan Charge_Check'))

String PNPC_Numbers = PNPC.replaceAll('[^0-9]', '')

double PNPC_integerPart = Integer.parseInt(PNPC_Numbers)

double Protated_Charge = PNPC_integerPart / 100

System.out.print(Protated_Charge)

//if (ProRatedNewPlanCharge == Protated_Charge) {
//	System.out.print('Test Passed: Prorated plan charged verified')
//} else {
//	System.out.print('Test Failed')
//}
//Pro Rated Old Plan Charge/Refund:
String POPR = WebUI.getText(findTestObject('Stripe/Pro_Rated_Old_Plan'))

String POPR_Numbers = POPR.replaceAll('[^0-9]', '')

double POPR_integerPart = Integer.parseInt(POPR_Numbers)

double Protated_Old_Charge = POPR_integerPart / 100

System.out.print(Protated_Old_Charge)

//Subtotal_RHS
double subtotal_rhs = Protated_Charge + Protated_Old_Charge

System.out.print('Subtotal_RHS= ' + subtotal_rhs)

double Tax_RHS = (subtotal_rhs * taxPercentage) / 100

//Tax_RHS
System.out.print('Tax_RHS= ' + Tax_RHS)

String Tax_check = WebUI.getText(findTestObject('Stripe/Tax_RHS_Check'))

String Tax_check_Numbers = Tax_check.replaceAll('[^0-9]', '')

double Tax_check_integerPart = Integer.parseInt(Tax_check_Numbers)

double Tax_RHS_Checkout = Tax_check_integerPart / 100

System.out.print(Tax_RHS_Checkout)

if (Tax_RHS == Tax_RHS_Checkout) {
    System.out.print('Test Passed :Tax Matching ')
} else {
    System.out.print(((('Test Failed :Tax not matching- Actual Tax is : ' + Tax_RHS) + ' But its showing ') + Tax_RHS_Checkout) + 
        ' on checkout page')
}

//Total_RHS
double Total_RHS = subtotal_rhs + Tax_RHS

System.out.print('Total_RHS= ' + Total_RHS)

String Tot_RHS = WebUI.getText(findTestObject('Stripe/Total_RHS_Check'))

String Tot_RHS_Numbers = Tot_RHS.replaceAll('[^0-9]', '')

double Tot_RHS_integerPart = Integer.parseInt(Tot_RHS_Numbers)

double Total_RHS_Check = Tot_RHS_integerPart / 100

System.out.print(Total_RHS_Check)

if (Total_RHS == Total_RHS_Check) {
    System.out.print('Test Passed: Total Verified')
} else {
    System.out.print('Test Failed')
}

double AmountDueNowCheck = Total_RHS_Check

System.out.print('Amount Due Now=' + AmountDueNowCheck)

WebUI.click(findTestObject('Stripe/Select_Payment_Method'))

String Amount_Payment = WebUI.getText(findTestObject('Stripe/Amount_Due_Now_PaymentPage'))

String Amount_Payment_Numbers = Amount_Payment.replaceAll('[^0-9]', '')

double Amount_Payment_integerPart = Integer.parseInt(Amount_Payment_Numbers)

double Amount_Due_Now_On_Payment_Page = Amount_Payment_integerPart / 100

System.out.print(Amount_Due_Now_On_Payment_Page)

if (AmountDueNowCheck == Amount_Due_Now_On_Payment_Page) {
    System.out.print('Test Passed: Amount Matched')
} else {
    System.out.print(((((('Test Failed: Amount MisMatched ' + 'Amount Due now on Checkout page=') + AmountDueNowCheck) + 
        ' ') + 'Amount due now on payment page=') + Amount_Due_Now_On_Payment_Page) + ' ')
}

WebUI.switchToFrame(findTestObject('Stripe/Secure_Payment_Frame'), 5)

WebUI.delay(5)

WebUI.setText(findTestObject('Stripe/Card_Number_Payment_Page'), '4242424242424242')

WebUI.setText(findTestObject('Stripe/Expiration_Date_Payment'), '1225')

WebUI.setText(findTestObject('Stripe/CVV_Code'), '123')

WebUI.delay(5)

WebUI.click(findTestObject('Stripe/Pay_Now'))

