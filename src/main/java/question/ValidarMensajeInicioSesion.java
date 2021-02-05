package question;

import interactions.ObtenerMensajesInicioSesion;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import utils.VariablesSesion;

@AllArgsConstructor
public class ValidarMensajeInicioSesion implements Question<String> {


    private final String mensaje;


    public static ValidarMensajeInicioSesion mensajeInicioSesion(String mensaje) {
        return new ValidarMensajeInicioSesion(mensaje);
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(ObtenerMensajesInicioSesion.segunTipoLoguin(mensaje));
        return actor.recall(VariablesSesion.MENSAJE_OBTENIDO.getMensaje());

    }

}
