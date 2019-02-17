package com.tcs.practica.reto.steps_definitions;

import com.tcs.practica.reto.drivers.OwnWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

public class CalculadoraSalarialSteps {

	@Given("^Estoy en la pagina principal de ElEmpleo.com$")
	public void estoyEnLaPaginaPrincipalDeElEmpleoCom() {
		OnStage.theActorInTheSpotlight()
				.can(BrowseTheWeb.with(OwnWebDriver.withChrome().enLaURL("https://www.elempleo.com/cross/")));
	}

	@Given("^ingreso a la calculadora salarial$")
	public void ingresoALaCalculadoraSalarial() {
	}

	@When("^Calculo el coste mensual$")
	public void calculoElCosteMensual() {
	}

	@Then("^puedo conocer el ingreso promedio mensual$")
	public void puedoConocerElIngresoPromedioMensual() {
	}
}
