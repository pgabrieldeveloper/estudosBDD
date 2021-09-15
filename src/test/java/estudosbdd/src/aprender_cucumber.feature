
Feature: Aprender Cucumber
Como um aluno 
Eu quero aprender a utilizar o cucumber
Para automatizar processos de automatizacao

Scenario: Deve executar especificao
	Given que criei o arquivo corretamente
	When executa lo
	Then a especificacao deve finalizar com sucesso

Scenario: Deve incrmentar 3 ao contador
	Given que o valor do contador e 15
	When quando encrementar 5
	Then o valor do contador sera 20

Scenario: deve calcular atraso na entrega
	Given  dado que a data de entrega é dia 10/05/2021
	When a entrega atrazar em 2 dias
	Then a entrega sera efetuada em 12/05/2021