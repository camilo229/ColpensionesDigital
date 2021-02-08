package task;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.PantallaGenerarOTPUserInterface.*;


@AllArgsConstructor
@Getter
public class ConsultaInformacionCliente implements Task {
    public final String numero_Credito;
    public final String numero_Documento;

    public static ConsultaInformacionCliente Consnultar(String numeroCredito, String numeroDocumento) {
        return Tasks.instrumented(ConsultaInformacionCliente.class, numeroCredito, numeroDocumento);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TXT_NUMERO_CREDITO),
                Enter.theValue(numero_Credito).into(TXT_NUMERO_CREDITO));
        actor.attemptsTo(Click.on(TXT_NUMERO_DOCUMENTO),
                Enter.theValue(numero_Documento).into(TXT_NUMERO_DOCUMENTO));
        actor.attemptsTo(Click.on(BTN_BUSCAR));

    }
}
