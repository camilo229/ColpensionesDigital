#language:es
#jecheverry@qvision.com.co

Característica: realizar proceso de autenticacion en el plicativo de colensiones digital GyF
  yo como analista de libranza
  deseo autenticarme en el sistema colpensiones digital de GyF
  para garantizar que el sistema valide los datos ingresados contra el directorio activo


  Antecedentes: Abrir una URL especifica
    Dado que el actor desea abrir la pagina 'ColpensionesDigital'


  Esquema del escenario: Autenticarse en el aplicativo de colpensiones digital
    Cuando el usuario de libranza ingresa el '<user>' y el '<Password>'
    Entonces podemos observar el mensaje '<mensaje esperado>'

    Ejemplos:
      |user      |Password   |mensaje esperado|
      |112  |23321dd |Generación OTP|
      |     |asdas   |Campo Requerido*|
