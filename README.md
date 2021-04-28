# Algoritmo Matching Húngaro - Seleção de Técnico

Tabela de conteúdos
=================
<!--ts-->
   * [Descrição do Projeto](#Descrição-do-Projeto)
   * [Instalação](#instalação)
   * [Como usar](#como-usar)
   * [Teste](#teste)
   * [Referências](#referências)
<!--te-->

## Descrição do Projeto

<p align="center"> Neste trabalho, propomos um algoritmo que permite a distribuição de atendimentos entre técnicos para atender enxurradas de demandas, com base na complexibilidade do serviço. A proposta envolve o algoritmo Matching Húngaro. Cada técnico possui uma capacidade de atendimento, e cada serviço possui uma complexibilidade. Esses valores são determinados pelo usuário.

## Instalação </p>

<p>É necessário instalar os seguintes componentes na estação de trabalho que pretende executar o projeto:
  
  * JDK (ambiente necessário para desenvolver e executar aplicativos em Java)
  
  * Git (para clonar o projeto para a sua estação de trabalho)
  
  * Netbeans IDE 11.3 (para executar a aplicação)
</p>

<p>https://www.java.com/pt-BR/download/help/windows_manual_download.html#download</p>
<p>https://netbeans.apache.org/download/archive/index.html</p>

### Clone este repositório
$ git clone <https://github.com/rafaelbtorres/algoritmoMatchingHungaroSelecaoTecnico.git>

## Como Usar

**Passo 1.** Clone o projeto "AlgoritmoSelecaoTecnico" em seu computador;

**Passo 2.** Adicione as bibliotecas ao projeto "AlgoritmoSelecaoTecnico", as bibliotecas estão localizadas dentro da pasta "docs" desse projeto, para isso é necessário abrir esse projeto no netbeans e selecionar as 3 bibliotecas:

* jcommon-1.0.23.jar
* jfreechar-1.0.19.jar
* swtgraphics2d.jar

<img alt="NextLevelWeek" title="#NextLevelWeek" src="https://github.com/rafaelbtorres/algoritmoMatchingHungaroSelecaoTecnico/blob/master/imgs/libs.jpg" />

**Passo 3.** Navegue até a pasta do projeto, acesse a pasta dist dentro do projeto e abra o cmd (para abrir o cmd, digite cmd na barra de endereço da pasta onde está o projeto clonado).

<img alt="NextLevelWeek" title="#NextLevelWeek" src="https://github.com/rafaelbtorres/algoritmoMatchingHungaroSelecaoTecnico/blob/master/imgs/executar.jpg" />

**Passo 4.** Digite o comando: java -jar algoritmoSelecaoDeTecnico.jar 1000 (caso não informe um valor correto no final, será aplicado um valor padrão 2000).

Logo abaixo, a Figura exibe o resultado da execução do comando encontrado no Passo 4, um gráfico resultante do Algoritmo Matching Hungaro relacionado a Seleção de Técnico para determinado número de chamados.
<img alt="NextLevelWeek" title="#NextLevelWeek" src="https://github.com/rafaelbtorres/algoritmoMatchingHungaroSelecaoTecnico/blob/master/imgs/executado.jpg" />

## Teste

<p>Na tabela abaixo, ilustramos um teste de mesa para demonstrar o resultado esperado na simulação. Em cinza destacam-se as complexidades de baixa dificudade em relação aos chamados, relacionada na mesma linha do técnico selecionado.</p>

<img alt="NextLevelWeek" title="#NextLevelWeek" src="https://github.com/rafaelbtorres/algoritmoMathingUngaroSelecaoTecnico/blob/master/imgs/testeDeMesa.png?raw=true" />

## Lista de Dependências

* Git
* JDK (ambiente necessário para desenvolver e executar aplicativos em Java)
* Netbeans


## Referências
<p>KUHN, H. W. The hungarian method for the assignment problem. Naval Research Logistics Quarterly, v. 2, n. 1-2, p. 83–97, 1955. Disponível em http://dx.doi.org/10.1002/nav.3800020109</p>

<p>Código fonte utilizado como base: https://www.sanfoundry.com/java-program-implement-hungarian-algorithm-bipartite-matching/ </p>


<p>Código fonte utilizado como complemento: https://github.com/aalmi/HungarianAlgorithm/blob/master/HungarianAlgorithm.java</p>


<p>Vídeo utilizado para entendimento do funcionamento do Algoritmo: https://www.youtube.com/watch?v=SAPG2T4Jbok</p>

