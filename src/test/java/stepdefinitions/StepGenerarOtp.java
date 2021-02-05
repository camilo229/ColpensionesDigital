package stepdefinitions;

import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import task.ConsultaInformacionCliente;
import task.IniciarSesion;
import task.LimpiarConsultaInformacionCliente;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepGenerarOtp {

    @Dado("que el usuario de libranza se encuentra en el modulo de generar OTP")
    public void navegarAlModuloOTP() {

        theActorInTheSpotlight().attemptsTo(IniciarSesion.enAppGyF("hola", "como"));
    }

    @Cuando("ingresa el {string} y {string} del cliente")
    public void consultaCLiente(String numeroCredito, String numeroDocumento) {
        theActorInTheSpotlight().attemptsTo(LimpiarConsultaInformacionCliente.Limpiar(numeroCredito, numeroDocumento));
        theActorInTheSpotlight().attemptsTo(ConsultaInformacionCliente.cliente(numeroCredito, numeroDocumento));

    }


    @Entonces("se consulta los datos ingresados")
    public void se_consulta_los_datos_ingresados() {

    }

}
