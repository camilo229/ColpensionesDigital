package interactions;

import static userinterface.PantallaGenerarOTPUserInterface.*;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import utils.VariablesSesion;

@AllArgsConstructor
public class ObtenerResultadoConsultaCliente implements Interaction {
  private final String consulta;

  public static ObtenerResultadoConsultaCliente segunTipoConsulta(String consulta) {
    return Tasks.instrumented(ObtenerResultadoConsultaCliente.class, consulta);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String ResultadoConsulta = "";
    if (LBL_RESULTADO_CONSULTA.resolveFor(actor).isVisible()) {
      ResultadoConsulta = "exitoso";
    } else {

      switch (consulta) {
        case "Campo Requerido*":
          if (LBL_CAMPOREQUERIDO_CREDITO.resolveFor(actor).isVisible()) {
            ResultadoConsulta = LBL_CAMPOREQUERIDO_CREDITO.resolveFor(actor).getText();
          } else ResultadoConsulta = LBL_CAMPOREQUERIDO_DOCUMENTO.resolveFor(actor).getText();

          break;
      }
    }
    actor.remember(VariablesSesion.MENSAJE_OBTENIDO.getMensaje(), ResultadoConsulta);
  }
}
