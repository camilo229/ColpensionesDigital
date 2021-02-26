# Colpensiones Digital

El proyecto se encuentra desarrollado utilizando Gradle como inyector de dependencias en su versión 6.5; se está utilizando Java como lenguaje de desarrollo y Screenplay como patrón de diseño.

Los escenarios están redactados con lenguaje Gherkin y se hace uso del framework de Cucumber.
 
La automatización se implementó en la versión 88.0.4324.190 de Google Chrome utilizando el chrome driver 88.0.4324.96.    

## Configuracion de Ruta del WebDriver
En el archivo **serenity.conf** se encuentra una configuración por defecto de esta ruta:
```
webdriver.chrome.driver = src/test/resources/drivers/chromedriver.exe
```
## Ejecución Todos los test y generación reporte
Para ejecutar todos los test del proyecto se puede usar el comando
```
gradle clean test aggregate
```
## Configurar IntelliJ para que navegue de los pasos del .feature a su respectivo StepDefinition

1. Ir a las siguietes opciones FILE -> SETTINGS -> PLUGINS
2. Ubicar el campo de busqueda y en la opción Show seleccionar "All Plugins" 
2.1 en la lupa Buscar: "Cucumber for Java" y verificar que este instalado.
2.2 Buscar el plugin "Gherkin" y verificar que este instalado.

3. Si el plugin de "Cucumber for Java" o "Gherkin" falta, Seleccionar en la parte inferior la opcion "Browse Repositories" e instalar ambos plugins.
4. Reiniciar IntelliJ y probar desde un .feature navegar al paso en el Definition.