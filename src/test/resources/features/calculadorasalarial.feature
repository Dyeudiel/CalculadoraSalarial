Feature: Calculadora salarial
  Yo como usuario quiero poder calcular el costo mensual real mediante la calculadora 
  	que se encuentra en el portal del empleo

  Scenario: Calculadora salarial
    Given Estoy en la pagina principal de ElEmpleo.com
    And ingreso a la calculadora salarial
    When Calculo el coste mensual
    Then puedo conocer el ingreso promedio mensual
