package question;

import interactions.ObtenerResultadoConsultaCliente;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import utils.VariablesSesion;

@AllArgsConstructor

public class ValidarMensajeConsultaCliente implements Question<String> {

    private final String consulta;

    public static ValidarMensajeConsultaCliente ResultadoConsulta(String consulta) {
        return new ValidarMensajeConsultaCliente(consulta);
    }


    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(ObtenerResultadoConsultaCliente.segunTipoConsulta(consulta));
        return actor.recall(VariablesSesion.MENSAJE_OBTENIDO.getMensaje());
    }
}
