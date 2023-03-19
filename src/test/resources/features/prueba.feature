#Authors: yo y quien mas? historia de user
#@regresion
#Feature: Login exitoso con user y password
  #el usuario ingresa a la plataforma colorlib.com
  #Para hacerlo debe digitar user y password
  #@caso1
  #Scenario: login exitoso
    #Given El user acceda a la app colorlib.com
   # When El user ingresa con "user" "password" y da click en sign in
    #Then EL user vera en la pnatalla el dashboard

@regresion
Feature: Login exitoso con user y password
  el usuario ingresa a la plataforma colorlib.com
  Para hacerlo debe digitar user y password

  @caso1
  Scenario Outline: login exitoso
    Given El user acceda a la app colorlib.com
    When El user ingresa con user password y da click en sign in
      | <user> |  | <password> |
    And Diligenciamos el formulario de validacion
      | <Required> |  | <Select> |
    Then EL user vera en la pnatalla el dashboard
    Examples:
      | user    | password | Required | Select |
      | JesusOR | 123456   | yuca     | Tennis |


