package co.com.banistmo.tasks;

import co.com.banistmo.interactions.SwitchToPdf;
import co.com.banistmo.userinterfaces.FatcaCrsPage;
import co.com.banistmo.userinterfaces.HomePage;
import co.com.banistmo.userinterfaces.LearningIsEasyPage;
import co.com.banistmo.userinterfaces.LegalPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class NavigateToDucument implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.ACCEPT_COOKIES),
                Scroll.to(HomePage.LEARNING_IS_EASY_LINK).andAlignToBottom(),
                Click.on(HomePage.LEARNING_IS_EASY_LINK),
                Scroll.to(LearningIsEasyPage.LEGAL_SECTION_BUTTON).andAlignToBottom(),
                Click.on(LearningIsEasyPage.LEGAL_SECTION_BUTTON),
                Scroll.to(LegalPage.FATCA_AND_CRS_OPTION).andAlignToBottom(),
                Click.on(LegalPage.FATCA_AND_CRS_OPTION),
                Click.on(FatcaCrsPage.DOWNLOAD_PDF_BUTTON),
                SwitchToPdf.window()

        );

        actor.remember("url", Serenity.getWebdriverManager().getCurrentDriver().getCurrentUrl());
    }

    public static NavigateToDucument on() {
        return Tasks.instrumented(NavigateToDucument.class);
    }
}
