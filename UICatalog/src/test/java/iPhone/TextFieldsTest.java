package iPhone;

import TextFieldsPage.TextFields;
import UiCatalogPage.UiCatalog;
import navigate.NavigateUi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TextFieldsTest extends NavigateUi {

    TextFields textFields = new TextFields();

    @Test
    public void navigate()throws InterruptedException{
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getTextFields();
        textFields.writeTextToFields();

    }
}
