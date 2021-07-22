package ApplicationPages;

import WebConnector.webconnector;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;


import java.io.IOException;

import static WebConnector.webconnector.driver;


public class HomePage{
	webconnector wc=new webconnector();

	public void goToHomePage() throws InvalidFormatException, IOException {
		String URL=wc.getSpecificColumnData("./src/test/testdata/data.xlsx","sheet1", "URL");
		driver.get(URL);
		wc.waitForCondition("PageLoad","",60);

	}
	public void loadWebBrowser(){
		wc.setUpDriver();
	}

	public void clickOnDroppableMenu() throws Exception {
		wc.PerformActionOnElement("Link_Droppable", "Click", "");
	}


	public void clickOnSelectableMenu() throws Exception {
		wc.PerformActionOnElement("Link_Selectable", "Click", "");
	}

	public void clickControlgroup() throws Exception {
		wc.PerformActionOnElement("Link_Controlgroup", "Click", "");
	}
}
