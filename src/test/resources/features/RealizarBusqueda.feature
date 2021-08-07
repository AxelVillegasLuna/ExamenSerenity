#language:es

@RealizarBusqueda
Característica: Funcionalidad de realizar una busqueda
  Como usuario deseo poder realizar una busqueda para obtener informacion especifica

  @Exito
  Esquema del escenario: Realizar busqueda exitosa
    Dado en la pagina principal
    Cuando busco el tipo de mascota <mascota>
    Entonces se visualiza una tabla de resultados
    Ejemplos:
      | mascota |
      | "Fish"  |