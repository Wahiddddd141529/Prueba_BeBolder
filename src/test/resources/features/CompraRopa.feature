Feature: Compra Camiseta

  @CompraCamisetaL
  Scenario: Compra camiseta de mujer
    Given un usuario ingresa a su cuenta
    When decide comprar una camiseta para su mujer talla L
    Then cierra sesion

  @CompraVestidoM
  Scenario: Compra vestido con rayas
    Given un usuario ingresa a su cuenta
    When decide su vestido en talla M
    Then cierra sesion

    @ValidarExistencias
    Scenario: Validar la existencia de los vestido color amarillo
      Given un usuario ingresa a su cuenta
      When valida la disponibilidad de los vestidos en color amarillo
      Then cierra sesion

      @VerificarCarrito
      Scenario: Agregar mas de una prenda al carrito
        Given un usuario ingresa a su cuenta
        When agregar varios productos y comprueba el carrito
        Then cierra sesion

      @BusquedaErronea
      Scenario: Buscar un producto que no existe
      Given un usuario ingresa a su cuenta
      When busca un producto inexistente
      Then cierra sesion
