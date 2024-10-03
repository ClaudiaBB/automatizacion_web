package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CategorySteps;
import com.nttdata.steps.InventorySteps;
import com.nttdata.steps.LoginSteps;
import com.nttdata.steps.StoreSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;


public class LoginStepsDef {

    private WebDriver driver;


    private InventorySteps inventorySteps(WebDriver driver) {
        return new InventorySteps(driver);
    }

    @Dado("estoy en la pagina de la tienda")
    public void estoy_en_la_pagina_de_la_tienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/iniciar-sesion?back=https%3A%2F%2Fqalab.bensg.com%2Fstore%2Fpe%2F");
        screenShot();
    }

    @Y("me logueo con mi usuario {string} y clave {string}")
    public void me_logueo_con_mi_usuario_y_clave(String user, String password) {
        LoginSteps loginSteps = new LoginSteps(driver);
        loginSteps.typeUser(user);
        loginSteps.typePassword(password);
        loginSteps.login();
        screenShot();
    }

    @Cuando("navego a la categoria {string} y subcategoria {string}")
    public void navego_a_la_categoria_y_subcategoria(String category, String subcategory) {
        CategorySteps categoryStep = new CategorySteps(driver);
        if (category.equals("Clothes")) {
            categoryStep.category();
        }
        if (subcategory.equals("Men")) {
            categoryStep.subcategory();
        }
        screenShot();
    }

    @Y("agrego {string} unidades del primer producto al carrito")
    public void agrego_unidades_del_primer_producto_al_carrito(String unit) {
        StoreSteps storeSteps = new StoreSteps(driver);
        storeSteps.store();
        storeSteps.unit(unit);
        storeSteps.addCar();
        screenShot();
    }

    @Entonces("valido en el popup la confirmación del producto agregado")
    public void valido_en_el_popup_la_confirmacion_del_producto_agregado() {
        StoreSteps storeSteps = new StoreSteps(driver);
        String title = storeSteps.validatePopup();

        screenShot();

        Assertions.assertTrue(title.equals("Producto añadido correctamente a su carrito de compra"), "Producto añadido correctamente a su carrito de compra");
    }

    @Y("valido en el popup que el monto total sea calculado correctamente")
    public void valido_en_el_popup_que_el_monto_total_sea_calculado_correctamente() {
        StoreSteps storeSteps = new StoreSteps(driver);
        Double price = Double.parseDouble(storeSteps.price());
        int quantity = Integer.parseInt(storeSteps.quantity());
        Double total = Double.parseDouble(storeSteps.subTotal());
        boolean isTotal = (price * quantity == total);

        screenShot();

        Assertions.assertTrue(isTotal, "calculado correctamente");
    }

    @Cuando("finalizo la compra")
    public void finalizo_la_compra() {
        StoreSteps storeSteps = new StoreSteps(driver);
        storeSteps.finalizeS();

        screenShot();
    }

    @Entonces("valido el titulo de la pagina del carrito")
    public void valido_el_titulo_de_la_pagina_del_carrito() {
        StoreSteps storeSteps = new StoreSteps(driver);
        String title = storeSteps.titlePage();

        screenShot();
        Assertions.assertTrue(title.equals("Carrito"), "titulo correcto");
    }

    @Y("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvo_a_validar_el_calculo_de_precios_en_el_carrito() {
        StoreSteps storeSteps = new StoreSteps(driver);


    }

}
