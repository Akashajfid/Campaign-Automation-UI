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

Mobile.startApplication(GlobalVariable.base_url, true)

Mobile.tap(findTestObject('Test Object Spy/android.widget.TextView - MASUK'), 0)

Mobile.tapAtPosition(804, 1808)

Mobile.setText(findTestObject('New Regist/android.widget.EditText - Nama pengguna'), 'sterben12', 10)

Mobile.setText(findTestObject('New Regist/android.widget.EditText - Email'), 'ahmad91@mailnesia.com', 10)

Mobile.setEncryptedText(findTestObject('New Regist/android.widget.EditText - Kata sandi'), 'cCuFUAcgZa9dpB2MWAML2g==', 10)

Mobile.setEncryptedText(findTestObject('New Regist/android.widget.EditText - Konfirmasi kata sandi'), 'AqcDRHpy+yimkjCObTLkfnw2yzuxhx39', 
    10)

Mobile.tap(findTestObject('New Regist/android.widget.EditText - Kata sandi'), 0)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('New Regist/android.widget.TextView - Kata sandi tidak sama'), 'Kata sandi tidak sama')

Mobile.takeScreenshot()

Mobile.closeApplication()

