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

Mobile.startApplication(GlobalVariable.base_url, false)

Mobile.comment('login')

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

Mobile.swipe(5, 1900, 5, 500)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.TextView - Challenge Saya'), 0)

Mobile.delay(10)

Mobile.comment('Section Create Data Challenge')

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.TextView - Buat Challenge'), 0)

Mobile.setText(findTestObject('Object Repository/Create Challenge/android.widget.EditText - Nama Penanggung Jawab'), 'Ahmad Rudi', 
    0)

Mobile.setText(findTestObject('Object Repository/Create Challenge/android.widget.EditText - champgmail.com'), 'ahmadrivaldhi88@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Create Challenge/android.widget.EditText - 0812345678910'), '085155001522', 
    0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.Button - Lanjut'), 0)

Mobile.comment('Section Challenge')

Mobile.setText(findTestObject('Object Repository/Create Challenge/android.widget.EditText - Pilih Campaign'), 'Auto2', 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.TextView - Judul'), 0)

Mobile.setText(findTestObject('Create Challenge/android.widget.EditText - Masukkan Judul untuk Challenge kamu'), 'PercobaanAuto45', 
    0)

Mobile.setText(findTestObject('Object Repository/Create Challenge/android.widget.EditText - Masukkan deskripsi untuk Challenge kamu'), 
    'Challenge Tentang auto2', 0)

Mobile.scrollToText('Foto Sampul')

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Create Challenge/android.widget.TextView - Izinkan hanya saat menggunakan apl ini'), 0)

Mobile.tap(findTestObject('Create Challenge/android.widget.TextView - Izinkan hanya saat menggunakan apl ini'), 0)

Mobile.tap(findTestObject('Create Challenge/android.widget.TextView - Izinkan hanya saat menggunakan apl ini'), 0)

Mobile.tap(findTestObject('Create Challenge/android.widget.ImageView'), 0)

Mobile.delay(10)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.ImageView (1)'), 0)

Mobile.scrollToText('Poster Challenge')

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.Button - Lanjut (1)'), 0)

Mobile.comment('Section Aksi')

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.CheckBox (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Create Challenge/android.widget.EditText - 0'), '7', 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.ImageView (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.ImageView (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.ImageView (6)'), 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.TextView - Foto'), 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.ImageView (7)'), 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.view.ViewGroup'), 0)

Mobile.scrollToText('Tujuan')

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.ImageView (8)'), 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.TextView - Dengan gestur tangan (.)'), 0)

Mobile.setText(findTestObject('Object Repository/Create Challenge/android.widget.EditText - masukkan detail gestur tangan'), 
    'tangan menyilang', 0)

Mobile.setText(findTestObject('Object Repository/Create Challenge/android.widget.EditText - Masukkan tujuan dari aksi kamu'), 
    'Bertujuan untuk kebaikan', 0)

Mobile.scrollToText('Contoh Caption')

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.ImageView (9)'), 0)

Mobile.tap(findTestObject('Create Challenge/android.widget.ImageView (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Create Challenge/android.widget.EditText - Masukkan caption untuk aksi kamu'), 
    'Caption tentang perjuangan', 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.Button - Simpan'), 0)

Mobile.comment('Section Donasi')

Mobile.tap(findTestObject('Create Challenge/android.widget.Button - Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.Button - Mengerti'), 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.CheckBox (2)'), 0)

Mobile.setText(findTestObject('Object Repository/Create Challenge/android.widget.EditText - Nama Pemilik Rekening'), 'Ahmad Rivaldhi', 
    0)

Mobile.setText(findTestObject('Object Repository/Create Challenge/android.widget.EditText - Bank (1)'), 'BCA', 0)

Mobile.setText(findTestObject('Object Repository/Create Challenge/android.widget.EditText - Cabang Bank'), 'KOTA MALANG', 
    0)

Mobile.setText(findTestObject('Object Repository/Create Challenge/android.widget.EditText - Nomor rekening'), '1234567890', 
    0)

Mobile.scrollToText('Periode Donasi')

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.ImageView (10)'), 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.TextView - Orang tua'), 0)

Mobile.setText(findTestObject('Object Repository/Create Challenge/android.widget.EditText - 0 (1)'), '100', 0)

Mobile.setText(findTestObject('Object Repository/Create Challenge/android.widget.EditText'), '5000', 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.TextView - DDMMYY'), 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.Button - OKE'), 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.TextView - DDMMYY (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.view.View - 30'), 0)

Mobile.tap(findTestObject('Create Challenge/android.widget.Button - OKE'), 0)

Mobile.scrollToText('Tambah Informasi')

Mobile.setText(findTestObject('Object Repository/Create Challenge/android.widget.EditText (1)'), '1000000', 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.TextView - DDMMYY (2)'), 0)

Mobile.tap(findTestObject('Create Challenge/android.widget.Button - OKE'), 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.TextView - DDMMYY (3)'), 0)

Mobile.tap(findTestObject('Create Challenge/android.widget.Button - OKE'), 0)

Mobile.setText(findTestObject('Object Repository/Create Challenge/android.widget.EditText - Deskripsi singkat mengenai penyaluran donasi'), 
    'Donasi akan disalurkan ke orang tua yang membutuhkan', 0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.TextView - Simpan'), 0)

Mobile.tap(findTestObject('Create Challenge/android.widget.Button - Lanjut'), 0)

Mobile.comment('Masuk Tnc')

Mobile.swipe(200, 1200, 100, -2000)

Mobile.swipe(200, 1200, 100, -2000)

Mobile.swipe(200, 1200, 100, -2000)

Mobile.swipe(200, 1200, 100, -2000)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Awal Pengisian Form Pengajuan')

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.CheckBox - Dengan ini Saya telah membaca, memahami, dan menyetujui Syarat  Ketentuan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Create Challenge/android.widget.TextView - Isi Sekarang'), 0)

Mobile.setText(findTestObject('Object Repository/Tambahan Create Challenge/android.widget.EditText - Nama'), 'Ahmad Rivaldhi', 
    0)

Mobile.setText(findTestObject('Object Repository/Tambahan Create Challenge/android.widget.EditText - Nomor HP'), '085155001522', 
    0)

Mobile.setText(findTestObject('Object Repository/Tambahan Create Challenge/android.widget.EditText - Email'), 'ahmadrivaldhi88@gmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/Tambahan Create Challenge/android.widget.CheckBox - Saya adalah Penanggung Jawab'), 
    0)

Mobile.setText(findTestObject('Object Repository/Tambahan Create Challenge/android.widget.EditText - Posisi'), 'Ketua Kader', 
    0)

Mobile.setText(findTestObject('Object Repository/Tambahan Create Challenge/android.widget.EditText - Alamat sesuai KTP'), 
    'Dijalanin dulu aja', 0)

Mobile.swipe(200, 1200, 100, -1000)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tambahan Create Challenge/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Tambahan Create Challenge/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Tambahan Create Challenge/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Tambahan Create Challenge/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Tambahan Create Challenge/android.widget.Button - Simpan'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tambahan Create Challenge/android.widget.Button - Kirim'), 0)

Mobile.tap(findTestObject('Object Repository/Tambahan Create Challenge/android.widget.TextView - Ya, Kirim'), 0)

Mobile.comment('Akhir Form Pengajuan')

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tambahan Create Challenge/android.widget.TextView - Lihat Status Verifikasi'), 
    0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Tambahan Create Challenge/android.widget.TextView - Challenge kamu sedang diperiksa (1)'), 
    'Challenge kamu sedang diperiksa')

Mobile.takeScreenshot()

Mobile.closeApplication()

