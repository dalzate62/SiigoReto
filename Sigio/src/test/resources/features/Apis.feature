#language: es
Característica: envio de Apis

  @Get
  Esquema del escenario:El api consulta el listado de usuarios
    Dado el usuario inicia apis
    Cuando el usuario consulta el listado de usuarios <URL>
    Entonces valida el codigo de respuesta Get
    Ejemplos:
      | URL |
      | /api/users   |

  @Post
  Esquema del escenario: el api crea un nuevo usuario
    Dado el usuario inicia apis
    Cuando el usuario crea un nuevo usuario <URL> <Nombre> <Trabajo>
    Entonces valida el codigo de repuesta Post
    Ejemplos:
      | URL | Nombre | Trabajo |
      |    /api/users |    Josua    |    Ingeniero     |

  @Put
  Esquema del escenario: el api actualiza el usuario
    Dado el usuario inicia apis
    Cuando el usuario actualiza un usuario <URL> <Nombre> <Trabajo>
    Entonces valida el codigo de repuesta Put
    Ejemplos:
      |  URL  | Nombre | Trabajo |
      |   /api/users/2   |    Josua    |    Secretario     |

  @Delete
  Esquema del escenario:El api elimina el usuarios
    Dado el usuario inicia apis
    Cuando el usuario elimina el usuarios creado <URL>
    Entonces valida el codigo de respuesta Delete
    Ejemplos:
      | URL |
      | /api/users/2   |