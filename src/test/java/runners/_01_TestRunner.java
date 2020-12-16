package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Runner Classlar ne için kullanılır: Belirli veya grupladığımı testleri toplu olarak çalıştırma imkanı veriri.
 * Bunun için;
 * 1- Java Class açılır.
 * 2- AbstractTestNGCucumberTests  extend alınır.Böylece RUN özelliği kazanır
 * 3- Class a   @CucumberOptions annotition ı eklenrek , buraya parametreleri verilerek kullanılır.
 * Genel olarak TestNG deki XML i olarak düşünebilirsiniz.
 *
 * SmokeTest : En genel manada ana unsurları test etme.
 * RegressionTest : Bütün birimleri uyumlu şekilde çalışma test
 */


/**
 * Aşağıdaki seçenekde tags eklendi içinde grup adına
 * sahip senaryolar çalıştıralacak sadece tüm senaryolardan
 * tags etiketi sınırlama yaptı sadece bu etikete veya grup adına sahip
 * olanlar çalışacak
 *
 * plugin kısmı ise basit rapor oluşturan kısım
 * "html:target/cucumber-report" : target klasörünün altında cucumber-report un
 * altında basit bir rapor oluşturacak.
 *
 * "json:target/cucumber.json" : aynı raporu JSON formatında oluşturacak.
 */


@CucumberOptions(
        features = {"src/test/java/featureFiles"},  // buraya feature files ın path i verilecek.
        glue = {"stepDefinitions"}, // Step definitions ın klasörü yazılıyor.
        dryRun = false ,// true olduğunda testi çalıştırma sadece feature lara ait steplerin varlığını kontrol eder.
        // false olduğunda ise testi çalıştırır.
        plugin = { //basit rapor oluşturan plugin
        "html:target/cucumber-report",
        "json:target/cucumber.json",
        "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
}
)


public class _01_TestRunner extends AbstractTestNGCucumberTests {
}
