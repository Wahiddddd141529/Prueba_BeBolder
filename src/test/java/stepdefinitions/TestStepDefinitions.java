package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.BuySteps;
import steps.LoginSteps;
import steps.ValidateStockSteps;

public class TestStepDefinitions {
    @Steps
    LoginSteps objLoginSteps;
    @Steps
    BuySteps objBuySteps;
    @Steps
    ValidateStockSteps objValidateStockSteps;
    @Given("un usuario ingresa a su cuenta")
    public void un_usuario_ingresa_a_su_cuenta() throws InterruptedException {
        objLoginSteps.Login();
    }
    @When("decide comprar una camiseta para su mujer talla L")
    public void decide_comprar_una_camiseta_para_su_mujer_talla_l() throws InterruptedException {
        objBuySteps.compraCamiseta();
    }
    @When("decide su vestido en talla M")
    public void decide_su_vestido_en_talla_m() throws InterruptedException {
        objBuySteps.compraVestido();
    }
    @When("valida la disponibilidad de los vestidos en color amarillo")
    public void valida_la_disponibilidad_de_los_vestidos_en_color_amarillo() throws InterruptedException {
        objValidateStockSteps.validarExistencias();
    }
    @When("agregar varios productos y comprueba el carrito")
    public void agregar_varios_productos_y_comprueba_el_carrito() throws InterruptedException {
        objValidateStockSteps.verCarrito();
    }

    @When("busca un producto inexistente")
    public void busca_un_producto_inexistente() throws InterruptedException {
        objValidateStockSteps.buscarProductos();
    }
    @Then("cierra sesion")
    public void cierra_sesion() {
        objLoginSteps.LogOff();
    }

}
