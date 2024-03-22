#Author: fabriciopereiraleao@gmail.com

@regressivos
Feature: Seguro veicular
  Como dono de veiculo
  Quero assegurar meu veiculo
  Para proteger meu veiculo

Background: acessar aba de seguro
	Given acesse a aba de seguro veicular

  
  Scenario: Cotacao para seguro veicular
    When preencha o formulario enter vehicle data
    And preencha o formulario enter insurant data
    And preencha o formulario enter product data
    And escolher plano de seguro
    And enviar contacao
    Then cotacao enviada com sucesso
     
    
