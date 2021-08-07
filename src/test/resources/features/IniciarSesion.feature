#language:es

@IniciarSesion
Característica: Funcionalidad de iniciar sesion

  @Fallo
  Esquema del escenario: Inicio de sesion con credenciales incorrectas
    Dado en la pagina principal
    Cuando inicio sesion con los valores <usuario> y <password>
    Entonces se visualiza el texto <mensaje>
    Ejemplos:
      | usuario         | password    | mensaje                                        |
      | "SheldonCooper" | "123456789" | "Invalid username or password. Signon failed." |