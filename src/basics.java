import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Preference\"]").click();
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"6. Advanced preferences\"]").click();
		driver.findElementById("android:id/checkbox").click();
//		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
//		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
		
	}

}
