package ApplicationPages;

import WebConnector.webconnector;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ControlgroupPage extends webconnector{
    webconnector  wc= new webconnector();



    public void switchToFrame() throws Exception {
        wc.PerformActionOnElement("Frame_DROP","WaitForElementDisplay", "");
        wc.PerformActionOnElement("Frame_DROP","SwitchToFrame", "");
    }

    public void selectVehicleFromDropdown(String carListElement,String carElement, String  text) throws Exception {
        wc.PerformActionOnElement(carElement,"Click", "");
        wc.PerformActionOnElement(carElement,"WaitForElementDisplay", "");
        wc.selectFromList(carListElement,text);
    }

    public void clickOnOptionsAutomaticAndInsurance() throws Exception {
        wc.PerformActionOnElement("Radio_AutomaticHorizontal","Click", "");
        wc.PerformActionOnElement("Chekcbox_InsuranceHorizontal","Click", "");
    }

    public void clickOnOptionsStandardAndInsurance() throws Exception {
        wc.PerformActionOnElement("Radio_Standard","Click", "");
        wc.PerformActionOnElement("Chekcbox_InsuranceVertical","Click", "");
    }

    public void inputNumberOfCarsForHorizontalView(String carCount)  throws Exception{
        wc.PerformActionOnElement("Textbox_#Of_Cars_Horizontal","Type",carCount);
    }

    public void inputNumberOfCarsForVerticalView(String carCount)  throws Exception{
        wc.PerformActionOnElement("Textbox_#Of_Cars_Vertical","Type",carCount);
    }



    public void clickOnBookNowForTrucks() throws Exception {
        wc.PerformActionOnElement("Btn_BooknowRental","Click","");
    }

}
