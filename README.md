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

<p>Após clonar o projeto, execute o arquivo "AlgoritmoSelecaoDeTecnico.java". Para executar, basta selecionar o arquivo e pressionar a tecla "F6".</p>

<img alt="NextLevelWeek" title="#NextLevelWeek" src="https://github.com/rafaelbtorres/algoritmoMathingUngaroSelecaoTecnico/blob/master/imgs/hungaro1.jpg?raw=true" />

**Passo 1.** Informe a quantidade de chamados e tecle "Enter".

**Passo 2.** Informe a quantidade de técnicos e tecle "Enter" para confirmar.

**Passo 3.** Complete a matriz de divisão de complexidade, informando a complexibilidade que cada técnico é caracterizado para solucionar cada chamado. 
Obs: No exemplo da imagem abaixo, entramos com 5 chamados e 5 técnicos. Ademais, informamos em formato de matriz a complexidade da cada técnico perante aos chamados designados.

**Passo 4.** Verifique o resultado da aplicação: O resultado da-se pela alocação de chamados para cada técnico que estiver caracterizado com valor de complexidade mais baixo que os demais técnicos.

<img alt="NextLevelWeek" title="#NextLevelWeek" src="https://github.com/rafaelbtorres/algoritmoMathingUngaroSelecaoTecnico/blob/master/imgs/hungaro2.jpg?raw=true" />

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
>>>>>>> origin/master
