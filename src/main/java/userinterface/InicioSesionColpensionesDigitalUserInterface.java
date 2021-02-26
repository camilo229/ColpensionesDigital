package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InicioSesionColpensionesDigitalUserInterface {

  public static final Target TXT_USUARIO = Target.the("Nombre usuario").located(By.id("user"));
  public static final Target TXT_CONTRASENIA =
      Target.the("Constrasenia usuario").located(By.id("password"));
  public static final Target BTN_INGRESAR =
      Target.the("botoon ingresar").located(By.id("eventLogin"));
  public static final Target BTN_GENERAR_OTP =
      Target.the("Validar boton").located(By.id("generate-otp"));
  public static final Target LBL_CAMPOVALIDACIONNOMBRE =
      Target.the("Validar campo usuario")
          .located(
              By.xpath(
                  "/html/body/app-root/app-layout/app-login/form/div/div/div/div[2]/div[1]/div[2]/small"));
  public static final Target LBL_CAMPOVALIDACIONCONTRASENIA =
      Target.the("Validar campo constrasenia")
          .located(
              By.xpath(
                  "/html/body/app-root/app-layout/app-login/form/div/div/div/div[2]/div[1]/div[2]/small"));
}
