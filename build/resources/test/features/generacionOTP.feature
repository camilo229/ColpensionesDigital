#language:es
#jecheverry@qvision.com.co
Característica: Generacion OTP
  yo como analista de libranza
  deseo realizar la respectiva gestion
  para la autorizacion de credito por medio de OTP


  Antecedentes: Abrir una URL especifica
    Dado que el actor desea abrir la pagina 'colpensionesDigital'


 Esquema del escenario:Consnultar informacion del cliente
    Dado que el 'actor' inicia sesion aplicativo de colpensiones
    Y selecciona el modulo de generar OTP
    Cuando ingresa el '<numero_credito>' y '<numero_identificacion>' del cliente,
    Entonces se consulta los datos ingresados


    Ejemplos:
    |numero_credito                   |numero_identificacion|
    |correcto                         |correcto             |
    |nro solicitud incorrecto         |correcto             |
    |solicitud no corresponde a la cc |correcto             |
    |                                 |correcto             |
    |incorrecto                       |                     |
    |solicitud en esto finalizado     |correcto             |




    Escenario: Generar codigo OTP.
    Dado que el actor genero el codigo OTP .
    Cuando ingresa el codigo OTP en el campo '<Ingresar_OTP_generado>'
    Entonces el sistema valida el OTP y mutestra el '<mensaje_esperado>'

      |Ingresar_OTP_generado|mensaje_esperado|
      |Codigo Correcto      |                |
      |Codigo incorrecto    |                |
      |OTP no vigente       |                |



  Escenario: Cancelar operacion.
    Dado que el actor desea cancelar la autorizacion de credito
    Cuando ingresa al modulo de autorizacion de creditos selecciona la opcion Cancelar.
    Entonces el sistema limpia los datos ingresados y ---desactiva el codigo OTP generado anteriormente ---