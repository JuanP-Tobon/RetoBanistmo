package co.com.banistmo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FatcaCrsPage {
    public static final Target DOWNLOAD_PDF_BUTTON = Target.the("image to download pdf document").locatedBy("(//img[@alt='Descargar PDF'])[3]");
}
