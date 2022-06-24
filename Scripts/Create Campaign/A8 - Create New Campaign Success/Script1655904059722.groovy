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

Mobile.comment('login')

Mobile.startApplication(GlobalVariable.base_url, true)

Mobile.tap(findTestObject('Test Object Spy/android.widget.TextView - MASUK'), 0)

Mobile.tap(findTestObject('Object Repository/Test Object Spy/New Folder/android.widget.TextView - Masuk'), 0)

Mobile.setText(findTestObject('Object Repository/Test Object Spy/New Folder/android.widget.EditText - Nama pengguna atau Email'), 
    'ruditest', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Test Object Spy/New Folder/android.widget.EditText - Kata sandi'), 
    'AqcDRHpy+ygNFLHeKvGdeQ==', 0)

Mobile.tap(findTestObject('Object Repository/Test Object Spy/New Folder/android.widget.TextView - Masuk (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Test Object Spy/New Folder/android.widget.TextView - Izinkan hanya saat menggunakan apl ini'), 
    0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(963, 2200)

Mobile.tap(findTestObject('Object Repository/Test Barusan/android.widget.TextView - Campaign Saya'), 0)

Mobile.tap(findTestObject('Object Repository/new create campaign/android.widget.TextView - Buat Campaign'), 0)

Mobile.tap(findTestObject('Object Repository/new create campaign/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/new create campaign/android.widget.TextView - Indonesia'), 0)

Mobile.tap(findTestObject('Object Repository/new create campaign/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/new create campaign/android.widget.TextView - Adiwerna'), 0)

Mobile.tap(findTestObject('Object Repository/new create campaign/android.widget.Button - Lanjut'), 0)

Mobile.setText(findTestObject('Object Repository/new create campaign/android.widget.EditText - Campaign Hashtag'), 'PercobaanAuto45', 
    0)

Mobile.setText(findTestObject('Object Repository/new create campaign/android.widget.EditText - Masukkan tujuan dari Campaign kamu'), 
    'Percobaan kedua', 0)

Mobile.setText(findTestObject('Object Repository/new create campaign/android.widget.EditText - Masukkan deskripsi dari Campaign kamu'), 
    'Percobaan kedua ini', 0)

Mobile.scrollToText('Foto Sampul')

Mobile.tap(findTestObject('Object Repository/new create campaign/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/new create campaign/android.widget.TextView - Izinkan hanya saat menggunakan apl ini'), 
    0)

Mobile.tap(findTestObject('new create campaign/android.widget.TextView - Izinkan hanya saat menggunakan apl ini'), 0)

Mobile.tap(findTestObject('new create campaign/android.widget.TextView - Izinkan hanya saat menggunakan apl ini'), 0)

Mobile.tap(findTestObject('Create Campaign/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/new create campaign/android.widget.ImageView (3)'), 0)

Mobile.tapAtPosition(76, 2050)

Mobile.tapAtPosition(76, 2050)

Mobile.tap(findTestObject('Object Repository/Tes Barusan 3/android.widget.Button - Buat Campaign'), 0)

Mobile.tap(findTestObject('Object Repository/Tes Barusan 3/android.widget.TextView - Ya, Kirim'), 0)

Mobile.tap(findTestObject('Object Repository/Tes Barusan 3/android.widget.TextView - Lihat Status Verifikasi'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Tes Barusan 3/android.widget.TextView - Campaign kamu sedang diperiksa'), 
    'Campaign kamu sedang diperiksa')

Mobile.takeScreenshot('', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

