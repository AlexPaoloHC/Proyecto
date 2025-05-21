Feature: MercadoLibre
@busquedaProducto
  Scenario: Búsqueda de Productos
    Given estoy en la pagina de mercado libre
    When busco un producto "Televisores LED de 40 pulgadas "
    Then una lista de resultados
    And valido el primer titulo del resultado