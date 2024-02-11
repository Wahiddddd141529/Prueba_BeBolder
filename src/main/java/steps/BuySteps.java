package steps;

import pageobjects.BuyPageObject;

public class BuySteps {
    BuyPageObject objBuyPageObject = new BuyPageObject();

    public void compraCamiseta() throws InterruptedException {
        objBuyPageObject.buyTShirt();
    }

    public void compraVestido() throws InterruptedException {
        objBuyPageObject.buyDress();
    }
}
