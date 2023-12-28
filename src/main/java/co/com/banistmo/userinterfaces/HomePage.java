package co.com.banistmo.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;


public class HomePage {
    public static final Target ACCEPT_COOKIES = Target.the("button to accept cookies").locatedBy("#btn-aceptar-cookies");
    public static final Target LEARNING_IS_EASY_LINK = Target.the("label with link to learning is easy component").locatedBy("li a[href='/wps/portal/banistmo/personas/aprender-es-facil']");
}
