package co.com.banistmo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class SwitchToPdf implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Set<String> theWindow = driver.getWindowHandles();
        for (String currentWindow : theWindow)
            driver.switchTo().window(currentWindow);
    }

    public static SwitchToPdf window(){
        return Tasks.instrumented(SwitchToPdf.class);
    }
}
