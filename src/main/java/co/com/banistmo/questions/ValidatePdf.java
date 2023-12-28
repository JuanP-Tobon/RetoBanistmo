package co.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidatePdf implements Question<Boolean> {
    private String urlPdf;

    public ValidatePdf(String urlPdf) {
        this.urlPdf = urlPdf;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.recall("url").equals(urlPdf);
    }

    public static ValidatePdf with(String urlPdf) {
        return new ValidatePdf(urlPdf);
    }
}
