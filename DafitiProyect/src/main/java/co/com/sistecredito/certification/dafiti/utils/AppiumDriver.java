package co.com.sistecredito.certification.dafiti.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
public class AppiumDriver {
    public static AndroidDriver app() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        //ANDROID
        caps.setCapability("deviceName","emulator-5554");
        caps.setCapability("automationName","uiautomator2");
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","10.0");
        caps.setCapability("NoReset",true);
        caps.setCapability("appPackage","br.com.dafiti");
        caps.setCapability("appActivity","br.com.dafiti.activity.MaintenanceActivity");
        caps.setCapability("app","");
        /*

       //IOS
       caps.setCapability( "platformName", "iOS");
       caps.setCapability( "automationName", "XCUITest");
       caps.setCapability( "platformVersion", "15.5");
       caps.setCapability( "deviceName", "iPhone 13 Pro");
       caps.setCapability( "bundleId", "com.gtc.fleetmanagermobile");
       caps.setCapability( "udid", "00008110-0006682A226A801E");
       caps.setCapability( "noReset", "true");
         */

        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(
                new URL("http://0.0.0.0:4723/wd/hub"), caps);

        return driver;
    }
}
