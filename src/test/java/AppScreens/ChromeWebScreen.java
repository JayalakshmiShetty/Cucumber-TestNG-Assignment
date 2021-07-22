package AppScreens;

import WebConnector.appiumWebConnector;

public class ChromeWebScreen  {
    appiumWebConnector wc = new appiumWebConnector();

public void enterName(String text) throws Exception {
    wc.PerformActionOnElement("Textbox_Name","Type",text);
}

public void selectPreferredCar(String text) throws Exception {
wc.PerformActionOnElement("Dropdown_Car","Click","");
wc.selectFromList("Dropdown_CarList", text);
}

	/*Then verify that the text "This is my way of saying hello" appears on the next screen
	And Verify that name is "Test" and preferred car is "mercedes" is available in the next screen
	When clicked on Here on the bottom of the page
 */




    public void tapOnHereLink() throws Exception {
        wc.PerformActionOnElement("Link_here","Click", "");

    }

public void tapOnButton(String btnSendname) throws Exception {
    wc.PerformActionOnElement(btnSendname,"Click", "");

    }
}
