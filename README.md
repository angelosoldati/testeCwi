# TESTE DE ANGELO SOLDATI

Para teste da Api foram criados 3 cenários de teste acertivos e 2 cenários de teste negativos, utilizando java + selenium + Junit4, utilizando a api publica sugerida: https://jsonplaceholder.typicode.com/ 

# Os testes sugeridos foram: 

1 - ValidarStatus
2 - ValidarHeader
3 - ValidarResposta
4 - TesteNegativoValidarStatus
5 - TesteNegativoValidarResposta

OBS: Os testes realizados tem o intuito de demonstrar conhecimentos básicos em automação, sendo assim, os códigos podem ser melhorados e componentizados caso forem implementados de forma real, por exemplo: No cenário 3 temos uma validação da resposta completa (string - Json ) porém podemos separar partes da resposta, e validar se um elemento está em numérico, outro em string, ou até mesmo um range de IDs permitidos, tudo varia de acordo com teste desejado. 

# Exemplo de BDD cenário 1

DADO que tenho acesso a api sugerida 
QUANDO fizer uma requisição
ENTÃO o status do serviço deve ser 200

Geradores de Relatórios: Para fazer testes de API com geração de relatórios pode ser utilizado o karate, com ele implementamos testes de API de uma forma simples e intuitiva. Também é possivel implementar em Java, porém é um pouco mais demorado, e por isso não foi implementado.

Data Provider: É importante para a criação de dados dos proprios testes, com java é de tranquila implementação, também possuo conhecimento neste componente. 

Integração Dados Teste: Já utilizei "Mongo" mas para outros projetos em java, acredito que seria tranquilo efetuar uma integração com os testes e uma base

# Não possuo conhecimento em: 

- Git LAB 
- Dockerfile
- JekinsFile
- Configuração de Integração Continua














