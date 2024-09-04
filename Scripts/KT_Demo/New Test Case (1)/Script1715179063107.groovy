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

WebUI.callTestCase(findTestCase('RegressionTestCase-UAT-Env/LoginCountable'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.click(findTestObject('TEstingUpload/span_COM-AUT_Sheet_Select'))

WebUI.click(findTestObject('TEstingUpload/span_Trial Balance  Adj. Entries'))

WebUI.click(findTestObject('DraganddropObj/div_Document Repository'))

WebUI.click(findTestObject('DraganddropObj/img_menu_click'))

WebUI.click(findTestObject('DraganddropObj/span_PDF'))

WebUI.doubleClick(findTestObject('DraganddropObj/ContainerclickTo dismisslist'))

WebUI.click(findTestObject('Object Repository/trypdfedit/span_2023CompilationCOM-AUT-Dec312023Workin_e2e773'))

WebUI.switchToWindowUrl('https://uat.adinovis.com/file-preview/pdf/false/8dfe5a29-78e9-4864-b5c8-9e05837466ef/view')

WebUI.click(findTestObject('Object Repository/trypdfedit/span_Edit document'))

WebUI.click(findTestObject('Object Repository/trypdfedit/button_Save_preview-select'))

WebUI.click(findTestObject('Object Repository/trypdfedit/div_Select'))

WebUI.click(findTestObject('Object Repository/trypdfedit/button_Save_preview-select'))

WebUI.click(findTestObject('Object Repository/trypdfedit/div_comments)_CommentsView__commentsHighlig_ff0a70'))

WebUI.click(findTestObject('Object Repository/trypdfedit/div_comments)_CommentsView__commentsHighlig_ff0a70'))

WebUI.click(findTestObject('Object Repository/trypdfedit/li_Save_spectrum-Menu-item ContextMenuHeade_017c93'))

WebUI.click(findTestObject('Object Repository/trypdfedit/button_Save_verb-comment-stickynote'))

WebUI.click(findTestObject('Object Repository/trypdfedit/div_Add comments'))

WebUI.click(findTestObject('Object Repository/trypdfedit/div_comments)_CommentsView__commentsHighlig_ff0a70'))

WebUI.click(findTestObject('Object Repository/trypdfedit/span_Post'))

WebUI.click(findTestObject('Object Repository/trypdfedit/button_Save'))

WebUI.click(findTestObject('Object Repository/trypdfedit/span_Close edit mode'))

