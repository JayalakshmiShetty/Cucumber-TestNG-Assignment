package ApplicationPages;

import WebConnector.webconnector;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class DroppablePage extends webconnector {
	webconnector wc=new webconnector();

	//This is used to drag the object and drop to target
	public void dragAndDrop(String drag,String drop) throws Exception {
		wc.PerformActionOnElement("Frame_DROP","SwitchToFrame", "");
		wc.dragAndDrop("Draggable", "Droppable");
	}

	public WebElement getDroppableElement() throws Exception {
		return FindAnElement("Droppable");
	}
}
