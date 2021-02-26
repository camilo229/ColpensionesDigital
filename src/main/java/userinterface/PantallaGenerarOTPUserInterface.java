package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PantallaGenerarOTPUserInterface {
  public static final Target BTN_OPC_GENERAR_OTP =
      Target.the("Opcion generar OTP").located(By.id("generate-otp"));
  public static final Target TXT_NUMERO_CREDITO =
      Target.the("numero credito cliente").located(By.id("creditNumber"));
  public static final Target TXT_NUMERO_DOCUMENTO =
      Target.the("numero documento cliente").located(By.id("identificationNumber"));
  public static final Target BTN_BUSCAR =
      Target.the("Boton consultar cliente").located(By.id("search"));
  public static final Target BTN_LIMPIAR =
      Target.the("Boton limpiar campos").located(By.id("clean"));
  public static final Target LBL_CAMPOREQUERIDO_CREDITO =
      Target.the("Validacion campo credito")
          .located(
              By.xpath(
                  "/html/body/app-root/app-layout/app-generate-otp/form/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/small"));
  public static final Target LBL_CAMPOREQUERIDO_DOCUMENTO =
      Target.the("Validacion campo documento")
          .located(
              By.xpath(
                  "/html/body/app-root/app-layout/app-generate-otp/form/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/small"));
  public static final Target LBL_RESULTADO_CONSULTA =
      Target.the("Validacion resultado consulta")
          .located(
              By.xpath("/html/body/app-root/app-layout/app-generate-otp/form/div/table/tbody/tr"));
}
