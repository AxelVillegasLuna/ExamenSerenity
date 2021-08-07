#language:es

@RealizarCompra
Característica: Funcionalidad de realizar una compra
  Como usuario deseo poder realizar una compra para poder tener una mascota

  @MasterCard
  Esquema del escenario: Realizar compra de una mascota con Tarjeta MasterCard
    Dado en la pagina principal
    Cuando inicio sesion con los valores <usuario> y <password>
    Entonces ingrese correctamente a mi usuario
    Cuando busco el tipo de mascota <tipo_mascota>
    Cuando realizo los pasos para comprar una mascota <mascota> con una tarjeta <tipo_tarjeta> cuyo numero es <nro_tarjeta>
    Entonces se visualiza el mensaje <mensaje>
    Ejemplos:
      | usuario        | password | tipo_mascota | mascota                       | tipo_tarjeta | nro_tarjeta        | mensaje                                     |
      | "testserenity" | "123456" | "Fish"       | "Fresh Water fish from China" | "MasterCard" | "5151741914248443" | "Thank you, your order has been submitted." |