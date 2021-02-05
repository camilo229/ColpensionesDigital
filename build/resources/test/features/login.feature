#language:es
#jecheverry@qvision.com.co

Característica: realizar proceso de autenticacion en el plicativo de giros y finanzas
  yo como analista de libranza
  deseo autenticarme en el sistema de colpensiones digital
  para validar el usuario y contraseña


  Antecedentes: Abrir una URL especifica
    Dado que el actor desea abrir la pagina 'colpensionesDigital'


  Esquema del escenario: Autenticar de manera incorrecta
    Dado que el actor esta en el login del el aplicativo
    Cuando  ingresa el '<user>' y el '<Password>' de manera incorrecta
    Entonces  debemos observar el mensaje '<mensaje esperado>'

    Ejemplos:
      |user      |Password   |mensaje esperado           |
      |correcto  |incorrecta |Contraseña errada          |
      |incorrecta|correcta   |usuario no esta registrado |
      |          |correcto   |Campos vacios              |
      |Correcto  |           |Campos vacios              |
      |          |           |Campos vacios              |
      |Inactivo  |Correcta   |Usuario no valido          |


