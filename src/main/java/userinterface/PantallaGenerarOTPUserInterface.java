package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PantallaGenerarOTPUserInterface {
    public static final Target BTN_OPC_GENERAR_OTP = Target.the("Opcion generar OTP").located(By.id("generate-otp"));
    public static final Target TXT_NUMERO_CREDITO = Target.the("numero credito cliente").located(By.id("creditNumber"));
    public static final Target TXT_NUMERO_DOCUMENTO = Target.the("numero documento cliente").located(By.id("identificationNumber"));
    public static final Target BTN_BUSCAR = Target.the("Boton consultar cliente").located(By.id("search"));
    public static final Target BTN_LIMPIAR = Target.the("Boton limpiar campos").located(By.id("clean"));


}
