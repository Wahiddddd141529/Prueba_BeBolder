package steps;

import pageobjects.ValidateStockPageObject;

public class ValidateStockSteps {
    ValidateStockPageObject objValidateStockPageObject = new ValidateStockPageObject();

    public void validarExistencias() throws InterruptedException {
        objValidateStockPageObject.validateStocking();
    }

    public void verCarrito() throws InterruptedException {
        objValidateStockPageObject.addMoreThanOneProduct();
    }

    public void buscarProductos() throws InterruptedException {
        objValidateStockPageObject.searchProductNoExist();
    }
}
