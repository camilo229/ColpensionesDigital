package stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;
import question.ValidarMensajeConsultaCliente;
import task.ConsultaInformacionCliente;
import task.IniciarSesion;
import task.LimpiarConsultaInformacionCliente;

public class StepGenerarOtp {

  @Dado("que el usuario de libranza se encuentra en el modulo de generar OTP")
  public void navegarAlModuloOTP() {

    theActorInTheSpotlight().attemptsTo(IniciarSesion.enAppGyF("user", "pass"));
  }

  @Cuando("ingresa el {string} y {string} del cliente")
  public void consultaCLiente(String numeroCredito, String numeroDocumento) {
    theActorInTheSpotlight()
        .attemptsTo(LimpiarConsultaInformacionCliente.Limpiar(numeroCredito, numeroDocumento));
    theActorInTheSpotlight()
        .attemptsTo(ConsultaInformacionCliente.Consnultar(numeroCredito, numeroDocumento));
  }

  @Entonces("podra validar los resultados de la {string}")
  public void ValidarBusqueda(String consulta) {
    theActorInTheSpotlight()
        .should(
            GivenWhenThen.seeThat(
                ValidarMensajeConsultaCliente.ResultadoConsulta(consulta),
                Matchers.equalToIgnoringCase(consulta)));
  }
}
