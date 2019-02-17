package com.tcs.practica.reto.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/calculadorasalarial.feature"
, glue="com.tcs.practica.reto.steps_definitions"
, snippets = SnippetType.CAMELCASE)
public class CalculadoraSalarialRunner {

}
