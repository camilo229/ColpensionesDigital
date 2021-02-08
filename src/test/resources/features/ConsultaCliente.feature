#language:es
#jecheverry@qvision.com.co

Característica: consulta cliente para autorizacion de envio de formulario al colpensiones
  yo como usuario analista de libranza
  deseo consultar un cliente para el proceso generacion del codigo OTP
  para garantizar que se realice la consulta del cliente correctamente


  Antecedentes: Abrir una URL especifica
    Dado que el actor desea abrir la pagina 'ColpensionesDigital'


  Esquema del escenario:Consultar informacion del cliente
    Dado que el usuario de libranza se encuentra en el modulo de generar OTP
    Cuando ingresa el '<numero credito>' y '<numero identificacion>' del cliente
    Entonces podra validar los resultados de la '<consulta>'

    Ejemplos:
      | numero credito | numero identificacion | consulta         |
      | 3423           | 43245                 | exitoso          |
    #  |                | 233                   | Campo Requerido* |
     # | 1231           |                       | Campo Requerido* |



