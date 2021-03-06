import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://jqueryui.com/datepicker/')

CustomKeywords.'com.jqueryui.widgets.Datepicker.pickDate'(findTestObject('jqueryui/widgets/datepicker/textbox'), '09/18/2019')

println WebUI.getAttribute(findTestObject('jqueryui/widgets/datepicker/textbox'), "value")

WebUI.verifyElementAttributeValue(findTestObject('jqueryui/widgets/datepicker/textbox'), "value", '09/18/2019', 0)

findTestObject('Object Repository/jqueryui/widgets/selectmenu/iframe')