package interactions;

import static userinterface.InicioSesionColpensionesDigitalUserInterface.*;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import utils.VariablesSesion;

@AllArgsConstructor
public class ObtenerMensajesInicioSesion implements Interaction {

  private final String mensaje;

  public static ObtenerMensajesInicioSesion segunTipoLoguin(String mensaje) {
    return Tasks.instrumented(ObtenerMensajesInicioSesion.class, mensaje);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String mensajeObtenido = "";
    switch (mensaje) {
      case "Generación OTP":
        mensajeObtenido = BTN_GENERAR_OTP.resolveFor(actor).getText();

        break;
      case "Campo Requerido*":
        if (LBL_CAMPOVALIDACIONNOMBRE.resolveFor(actor).isVisible()) {
          mensajeObtenido = LBL_CAMPOVALIDACIONNOMBRE.resolveFor(actor).getText();
        } else mensajeObtenido = LBL_CAMPOVALIDACIONCONTRASENIA.resolveFor(actor).getText();

        break;
    }
    actor.remember(VariablesSesion.MENSAJE_OBTENIDO.getMensaje(), mensajeObtenido);
  }
}
