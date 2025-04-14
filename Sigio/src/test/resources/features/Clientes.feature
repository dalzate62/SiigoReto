#language: es
Característica: Crear y Cancelar Usuario
  @CancelarUsuario
  Esquema del escenario: Cancelacion de crear un usuario nuevo
    Dado el usuario ingresa con <Correo> y <Contrasena> <ambiente>
    Cuando el usuario selecciona la funcionalidad de cliente
    Entonces el usuario valida la cancelacion de la creacion de otro usuario
    Ejemplos:
      |Correo                                 |Contrasena                      |ambiente   |
      |retoautomationsiigo@yopmail.com        |T4b4ck0ff1c3P455w0rd658*         |ambienteURL |

  @CrearUsuario
  Esquema del escenario: Crear un usuario nuevo
    Dado el usuario ingresa con <Correo> y <Contrasena> <ambiente>
    Cuando el usuario selecciona la funcionalidad de cliente
    Y se crea un usuario
    Entonces valida que el usuario este creado
    Ejemplos:
      |Correo                                 |Contrasena                      |ambiente   |
      |retoautomationsiigo@yopmail.com        |T4b4ck0ff1c3P455w0rd658*         |ambienteURL |