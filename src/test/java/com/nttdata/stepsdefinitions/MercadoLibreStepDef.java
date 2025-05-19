package com.nttdata.stepsdefinitions;

import com.nttdata.steps.MercadoLibreStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.nttdata.core.DriverManager.getDriver;

public class MercadoLibreStepDef {

        MercadoLibreStep mercadoLibre;
        WebDriver driver;

        @Before(order = 0)
        public void setUp(){
                //Se ejecutara automaticamente
                System.setProperty("webdriver.http.factory","jdk-http-client");
                System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");

                //crear el driver
                driver = new ChromeDriver();

                //max
                driver.manage().window().maximize();
        }


        @Given("estoy en la pagina de mercado libre")
        public void estoyEnLaPaginaDeMercadoLibre() throws InterruptedException {
                mercadoLibre = new MercadoLibreStep (driver);
                mercadoLibre.navegarA("https://www.mercadolibre.com.pe/");

                Thread.sleep(10000);
        }

        @When("busco un producto {string}")
        public void buscoUnProducto(String arg0) {
        }

        @Then("una lista de resultados")
        public void unaListaDeResultados(){
        }

        @And("valido el primer titulo del resultado")
        public void validoElPrimerTituloDelResultado (){
        }
}
