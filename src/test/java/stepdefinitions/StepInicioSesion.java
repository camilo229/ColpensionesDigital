package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;
import question.ValidarMensajeInicioSesion;
import task.IniciarSesion;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepInicioSesion {


    @Cuando("el usuario de libranza ingresa el {string} y el {string}")
    public void iniciar_sesion(String usuario, String password) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.enAppGyF(usuario, password));

    }

    @Entonces("podemos observar el mensaje {string}")
    public void validar_inicio_sesion(String mensaje) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMensajeInicioSesion.mensajeInicioSesion(mensaje), Matchers.equalToIgnoringCase(mensaje)));

    }
}
//      |correcto  |correcto   |autenticado      |
//      |incorrecto|correcto   |usuario incorrecto|
//      |correcto  |           |Campos vacios     |
//      |          |correcto   |campos vacios     |
//      |inactivo  |correcto   |usuario inactivo  |
//      |otro rol  |correcto   |Datos no validos  |
//      |          |           |campos vacios     |