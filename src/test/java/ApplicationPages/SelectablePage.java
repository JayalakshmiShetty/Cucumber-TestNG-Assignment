package ApplicationPages;

import WebConnector.webconnector;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SelectablePage extends webconnector {
	webconnector wc=new webconnector();

public boolean verifyItemSelected(List<String> items) throws Exception {
	int count=0;
		List<WebElement> selectedList=driver.findElements(By.cssSelector("li[class$='selected']"));
		for(int i=0;i<selectedList.size();i++)
		{
			if(selectedList.get(i).getText().equalsIgnoreCase(items.get(i))){
				count=count+1;
			}
			if(count==3){
				return true;
			}
		}return false;

	}


	public void selectMultipleItems(List<String> items) throws Exception {
		PerformActionOnElement("Frame_DROP", "SwitchToFrame", "");
		selectMultipleItems(items,FindAllElements("List_Selectables"));
	}
}
