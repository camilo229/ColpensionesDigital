package task;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.InicioSesionColpensionesDigitalUserInterface.*;


@AllArgsConstructor
public class IniciarSesion implements Task {
    public final String nombreUsuario;
    public final String password;

    public static IniciarSesion enAppGyF(String nombreUsuario, String password) {
        return Tasks.instrumented(IniciarSesion.class, nombreUsuario, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TXT_USUARIO),
                Enter.theValue(nombreUsuario).into(TXT_USUARIO));
        actor.attemptsTo(Click.on(TXT_CONTRASENIA),
                Enter.theValue(password).into(TXT_CONTRASENIA));
        actor.attemptsTo(Click.on(BTN_INGRESAR));
    }
}
