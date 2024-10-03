#language: es
@testfeature
Característica:  Product - Store
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items

  @test
  Escenario:  Validación del precio de un producto
    Dado estoy en la pagina de la tienda
    Y me logueo con mi usuario "<usuario>" y clave "<clave>"
    Cuando navego a la categoria "<categoria>" y subcategoria "<subcategoria>"
    Y agrego "<cantidad>" unidades del primer producto al carrito
    Entonces valido en el popup la confirmación del producto agregado
    Y valido en el popup que el monto total sea calculado correctamente
    Cuando finalizo la compra
    Entonces valido el titulo de la pagina del carrito
    Y vuelvo a validar el calculo de precios en el carrito

  Ejemplos:
    | usuario                             | clave              | categoria | subcategoria | cantidad |
    | franklin.asto.leon@gmail.com         | Franklin_2024#$    | Clothes   | Men          | 2        |
    | maria.perez@gmail.com                | Maria1234#$        | Clothes   | Women        | 1        |
    | juan.rodriguez@hotmail.com           | JuanPass456        | Shoes     | Men          | 3        |
