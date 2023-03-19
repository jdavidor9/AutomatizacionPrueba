package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target TXT_USER = Target.the("Campo de texto para el usuario").
            located(By.id("user-name"));

    public static final Target TXT_PASSWORD = Target.the("Campo de texto para el Password").
            located(By.id("password"));

    public static final Target BTN_LOGIN = Target.the("boton para el login").
            located(By.xpath("//*[@id='login']/form/button"));

    public static final Target lbl_producto= Target.the("boton para el login").
            located(By.xpath("/html/body/div[1]/div[3]/div/div/div/ul[2]/li[1]/a"));

    public static final Target TXT_USERLOGIN= Target.the("Campo de texto para el user").
            located(By.xpath("//*[@id='login']/form/input[1]"));

    public static final Target TXT_USERPASS= Target.the("Campo de texto para el pass").
            located(By.xpath("//*[@id='login']/form/input[2]"));

}
