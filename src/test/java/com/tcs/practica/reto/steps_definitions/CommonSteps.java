package com.tcs.practica.reto.steps_definitions;

import com.tcs.practica.reto.drivers.OwnWebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class CommonSteps {

	@After
	public void init() {
		OnStage.setTheStage(Cast.ofStandardActors());
		OnStage.theActorCalled("Chu Chu ua");
		OnStage.theActorInTheSpotlight()
				.can(BrowseTheWeb.with(OwnWebDriver.withChrome().enLaURL("https://www.elempleo.com/cross/")));
	}

	@Before
	public void before() {

	}
}
