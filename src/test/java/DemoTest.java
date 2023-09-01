import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.android.AndroidDriver;


public class DemoTest {

    WebDriver driver;
    String mHost="http://localhost:4723";
    // String mHost="http://127.0.0.1:4723";

    @BeforeClass
    public void setUp() throws MalformedURLException {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<Test Start>>>>>>>>>>>>>>>>>>>>");

        // DesiredCapabilities iosCapabilities = new DesiredCapabilities();
        // iosCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        // iosCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.2");
        // iosCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhoneX");
        // System.out.println("<<<<<<<<<<<<<<<<<<<<<<Set .app file>>>>>>>>>>>>>>>>>>>>");
        // iosCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/apps/Runner.app");
        // iosCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUItest");
        // iosCapabilities.setCapability(MobileCapabilityType.NO_RESET, "true");

        // iosCapabilities.setCapability("wdaStartupRetries", "4");
        // iosCapabilities.setCapability("iosInstallPause","8000" );
        // iosCapabilities.setCapability("wdaStartupRetryInterval", "20000");
        // iosCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3600);

        // System.out.println("<<<<<<<<<<<<<<<<<<<<<<Set iosCapabilities start>>>>>>>>>>>>>>>>>>>>");
        // driver= new IOSDriver(new URL(mHost), iosCapabilities);
        // System.out.println("<<<<<<<<<<<<<<<<<<<<<<Set iosCapabilities Done >>>>>>>>>>>>>>>>>>>>");


 DesiredCapabilities androidCapabilities = new DesiredCapabilities();
 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 6"); // Replace with your device's name
        iosCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        androidCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/apps/GusiAndroid.apk");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<Added .apk file>>>>>>>>>>>>>>>>>>>>");
        androidCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        androidCapabilities.setCapability(MobileCapabilityType.NO_RESET, "true");

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<Set androidCapabilities start>>>>>>>>>>>>>>>>>>>>");
        driver= new AndroidDriver(new URL(mHost), androidCapabilities);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<Set androidCapabilities Done >>>>>>>>>>>>>>>>>>>>");


  

    @Test
    public void test_Appium() {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<Between Test>>>>>>>>>>>>>>>>>>>>");
    }
    @AfterClass
    public void tearDown()    {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<Test End>>>>>>>>>>>>>>>>>>>>");
        driver.quit();
    }
}
