# JSF

Este projeto contém um projeto base para o desenvolvimento dos conteúdos e assuntos relacionados ao JSF.

## Aulas

*[Aula 1 - Conceitos Básicos ](https://github.com/ifpb-disciplinas-2021-2/ads-dac-jsf/commit/48d1201e70cb8e3d354f76993e42cd6fbe70a4e6)*

*[Aula 2 - Conversores e Validadores ](https://github.com/ifpb-disciplinas-2021-2/ads-dac-jsf/commit/57a2105f30c435fdbec6500882890e3c6829ca4f)*

*[Aula 3 - Templates ](https://github.com/ifpb-disciplinas-2021-2/ads-dac-jsf/commit/a37f69e6d9d3af12181d9ea0e33bd7447fb9038b)*


## Executando o projeto

Para executarmos o código precisamos realizar o clone do projeto. Posteriormente, na pasta raiz do projeto, executar os seguintes comandos (ou executar o _script_ `run.sh`):
* `mvn clean package`
* `docker image build -t ricardojob/app .`
* `docker container run -p 8081:8080 --name app ricardojob/app`

A aplicação está disponível no link: `http://localhost:8081/app/`. 

> Importante observar o mapeamento das portas feita no momento de iniciar o container. Com a configuração apresentada teremos o seguinte comportamento: quando uma requisição ocorrer para porta (8081) do __host__ (máquina com o docker instalado), a requisição será redirecionada à porta (8080) do container.

## Roteiro de estudos


Temos um roteiro de apoio para revisar os conteúdos apresentados. Neste [roteiro](https://docs.google.com/document/d/1qjF9LxVsnIU8R0Ad3z1T5acijp4RUB52BSF70p3cqPg/edit) temos **oito** requisitos que após serem implementados, temos revisado todos os principais conceitos do framework Java ServerFaces.
