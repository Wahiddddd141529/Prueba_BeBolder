package pageobjects;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ValidateStockPageObject extends PageObject {

    public String nameOfProduct;
    By filterSizeS = By.xpath("//input[@name='layered_id_attribute_group_1']");
   By filterColorYellow = By.xpath("//input[@name='layered_id_attribute_group_16']");
   By filterConditionNew = By.xpath("//input[@name='layered_condition_new']");
   By dressPintedChiffon = By.xpath("//h5//a[@title='Printed Chiffon Dress'  and @itemprop='url']");
   By stockWarning = By.xpath("//span[contains(text(), 'This product is no longer in stock with those attributes but is available with others.')]");
   By imgBlouse = By.xpath("//a[@itemprop='url' and @title='Blouse' and @class='product-name']");
   By btnWhite = By.xpath("//a[@title='White']");
   By imgSummerDress = By.xpath("//h5//a[@title='Printed Summer Dress' and @itemprop='url']");
   By btnBlue = By.xpath("//a[@title='Blue']");
   By btnCart = By.xpath("//a[@title='View my shopping cart']");
   By btnContinueShopping = By.xpath("//span[@title='Continue shopping']");
   By txtSearch = By.xpath("//input[@name='search_query']");
   By btnSearch = By.xpath("//button[@name='submit_search']");
   By warningProduct = By.xpath("//p[contains(text(), 'No results were found for your search')]");
    public By getFilterSizeS() {
        return filterSizeS;
    }

    public By getFilterColorYellow() {
        return filterColorYellow;
    }

    public By getFilterConditionNew() {
        return filterConditionNew;
    }

    public By getDressPintedChiffon() {
        return dressPintedChiffon;
    }

    public By getStockWarning() {
        return stockWarning;
    }

    public By getImgBlouse() {
        return imgBlouse;
    }

    public By getBtnWhite() {
        return btnWhite;
    }

    public By getImgSummerDress() {
        return imgSummerDress;
    }

    public By getBtnBlue() {
        return btnBlue;
    }

    public By getBtnCart() {
        return btnCart;
    }

    public By getBtnContinueShopping() {
        return btnContinueShopping;
    }

    public By getTxtSearch() {
        return txtSearch;
    }

    public By getBtnSearch() {
        return btnSearch;
    }

    public By getWarningProduct() {
        return warningProduct;
    }

    BuyPageObject objBuyPageObject = new BuyPageObject();
    public void validateStocking() throws InterruptedException {
        getDriver().get("http://www.automationpractice.pl/index.php?id_category=3&controller=category");
        Thread.sleep(1500);
        getDriver().findElement(getFilterSizeS()).click();
        Thread.sleep(1500);
        getDriver().findElement(getFilterColorYellow()).click();
        Thread.sleep(1500);
        getDriver().findElement(getFilterConditionNew()).click();
        Serenity.takeScreenshot();
        getDriver().findElement(getDressPintedChiffon()).click();
        Serenity.takeScreenshot();
        Thread.sleep(3000);
        if(getDriver().findElement(getStockWarning()).getText().equals("This product is no longer in stock with those attributes but is available with others.")){
            System.out.println("No hay existencias del producto");
        }
        Serenity.takeScreenshot();
        Thread.sleep(8000);
    }

    public void addMoreThanOneProduct() throws InterruptedException {
        getDriver().get("http://www.automationpractice.pl/index.php?id_category=7&controller=category");
        getDriver().findElement(getImgBlouse()).click();
        if(getDriver().findElement(getStockWarning()).getText().equals("This product is no longer in stock with those attributes but is available with others.")){
           getDriver().findElement(getBtnWhite()).click();
        }
        getDriver().findElement(objBuyPageObject.getAddToCart()).click();
        getDriver().findElement(getBtnContinueShopping()).click();
        getDriver().get("http://www.automationpractice.pl/index.php?id_category=8&controller=category");
        Thread.sleep(1500);
        getDriver().findElement(getImgSummerDress()).click();
        Thread.sleep(1500);
        getDriver().findElement(getBtnBlue()).click();
        getDriver().findElement(objBuyPageObject.getTxtQuantity()).clear();
        getDriver().findElement(objBuyPageObject.getTxtQuantity()).sendKeys("5");
        Thread.sleep(3000);
        getDriver().findElement(objBuyPageObject.getAddToCart()).click();
        Thread.sleep(2000);
        getDriver().findElement(getBtnContinueShopping()).click();
        getDriver().findElement(getBtnCart()).click();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(5000);
    }

    public void searchProductNoExist() throws InterruptedException {
        getDriver().findElement(getTxtSearch()).sendKeys("Boxer");
        getDriver().findElement(getBtnSearch()).click();
        Thread.sleep(1500);
        if(getDriver().findElement(getWarningProduct()).getText().equals("No results were found for your search")){
            System.out.println("El producto no existe");
        }
        Thread.sleep(5000);
    }
}
