package stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.*;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.Abrir;

public class ConfiguracionInicial {

  @Before
  public void configurarActor() {
    setTheStage(new OnlineCast());
    theActorCalled("Camilo");
  }

  @Dado("que el actor desea abrir la pagina {string}")
  public void abrirUrl(String nombrePagina) {
    theActorInTheSpotlight().attemptsTo(Abrir.pagina(nombrePagina.toUpperCase()));
  }
}
