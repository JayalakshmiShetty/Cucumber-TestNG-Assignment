package AppScreens;

import WebConnector.appiumWebConnector;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterUserScreen {
    appiumWebConnector wc = new appiumWebConnector();
    public void registerUserWithDetails(List<String> languages) throws Exception {
    enterUserName(languages.get(0));
    enterEmail(languages.get(1));
    enterPassword(languages.get(2));
    enterPersonName(languages.get(3));
    selectProgrammingLanguage(languages.get(4));

    }
    public void enterUserName(String text) throws Exception {
        wc.PerformActionOnElement("Textbox_Username","Type",text);
    }
    public void enterEmail(String text) throws Exception {
        wc.PerformActionOnElement("Textbox_Email","Type",text);
    }

    public void enterPassword(String text) throws Exception {
        wc.PerformActionOnElement("Textbox_Password","Type",text);
    }

    public void enterPersonName(String text) throws Exception {
        wc.PerformActionOnElement("Textbox_RegName","Type",text);
    }

    public void selectProgrammingLanguage(String text) throws Exception {
        wc.PerformActionOnElement("Get_ProgrammingLanguage","Click","");
        wc.selectFromList("List_ProgrammingLanguages",text);
    }
    public void tapOnAcceptAddCheckbox() throws Exception {
        wc.PerformActionOnElement("Checkbox_AcceptAdds","Click", "");
    }

    public String getTextUser(WebElement element){
        return element.getText();
    }

}
