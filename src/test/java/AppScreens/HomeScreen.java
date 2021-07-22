package AppScreens;

import WebConnector.appiumWebConnector;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeScreen {
    appiumWebConnector wc = new appiumWebConnector();


public void tapOnContinueAndOkButtons() throws Exception {
    wc.PerformActionOnElement("Button_Continue","Click","");
    //waitForCondition("WaitForElementDisplay","Button_Ok", 60);
    wc.PerformActionOnElement("Button_Ok","Click","");
//    MobileElement el1 = (MobileElement) FindAnElement("com.android.permissioncontroller:id/continue_button");
//    el1.click();
//    MobileElement el2 = (MobileElement) FindAnElement("android:id/button1");
//    el2.click();
}


    public String getToastMessage() throws Exception {
        String message= wc.FindAnElement("Get_ToastMessage").getText();
        return message;
    }

    public void tapOnEnButton() throws Exception {
        wc.PerformActionOnElement("Button_en","Click","");
    }

    public void clickOnChromeLogo() throws Exception {
        wc.PerformActionOnElement("Chrome_Logo","Click","");
    }

    public void tapOnNonoButton() throws Exception {
        wc.PerformActionOnElement("Button_Nono","Click","");
    }


}
