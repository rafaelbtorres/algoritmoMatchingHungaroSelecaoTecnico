# Algoritmo Matching Húngaro - Seleção de Técnico

Tabela de conteúdos
=================
<!--ts-->
   * [Descrição do Projeto](#Descrição-do-Projeto)
   * [Instalação](#instalação)
   * [Como usar](#como-usar)
   * [Teste](#teste)
<<<<<<< HEAD
   * [Referências](#referências)
<!--te-->

## Descrição do Projeto

   <p align="center">O projeto de seleção de técnico, envolve o algoritmo Matching Húngaro, para relacionar técnicos aos serviços de complexidade baixa, com base na capacidade de cada técnico, consiste em valores determinados pelo usuário, assim como a complexidade do serviço.</p>
<p>No artigo (Kuhn, 1955) é mostrado que idéias presentes no trabalho de dois matemáticos húngaros podem ser exploradas para se obter um método diferente para resolver o Problema de Alocação. Este método ficou posteriormente conhecido como Kuhn-Munkres ou Algoritmo Húngaro.</p>
<p>Geralmente, empresas de informática lidam com problemas de alocação de serviço, com alta demanda. É mais acessível para um cliente, solicitar serviços de suporte técnico, por meio de serviços de terceiros, podendo assim, localizar o técnico com maior capacidade de resolver a sua necessidade, diretamente em uma aplicação que retorne o técnico com melhor status desejado, com base no serviço solicitado.</p>

## Instalação

<p>Para executar o projeto, é necessário ter o JAVA e o Netbeans IDE 11.3, instalados na estação de trabalho que pretende executar.</p>
<p>https://www.java.com/pt-BR/download/help/windows_manual_download.html#download</p>

## Como Usar

<p>Após baixar o projeto e abrí-lo no Netbeans IDE 11.3, execute o arquivo "AlgoritmoSelecaoDeTecnico.java", a execução pode ser realizada por meio da seleção do arquivo e logo após, pressione a tecla "F6".</p>

<img alt="NextLevelWeek" title="#NextLevelWeek" src="https://github.com/rafaelbtorres/algoritmoMathingUngaroSelecaoTecnico/blob/main/img/hungaro1.jpg?raw=true" />

<p>Agora que executou o projeto, informe incialmente a quantidade de chamados e tecla "Enter" para confirmar na aplicação. A seguir, adicione a quantidade de técnicos e "Enter" para confirmar. Por fim, informaremos na aplicação, a complexidade que cada técnico é caracterizado para solucionar cada chamado. No imagem abaixo, entramos com 5 chamados, 5 técnicos e informamos em formato de matriz a complexidade da cada técnico perante aos chamados designados. Assim que finalizar a complexidade na matriz, confirme com "Enter", a aplicação irá trazer como resultado, a alocação de chamados para cada técnico que estiver caracterizado com valor de complexidade mais baixo que os demais técnicos.</p>

<img alt="NextLevelWeek" title="#NextLevelWeek" src="https://github.com/rafaelbtorres/algoritmoMathingUngaroSelecaoTecnico/blob/main/img/hungaro2.jpg?raw=true" />

## Teste

<p>Na tabela abaixo, teste de mesa realizado para determinar o resultado esperado na simulação. Em cinza destacam-se as complexidades de baixa dificudade em relação aos chamados, relacionada na mesma linha do técnico selecionado.</p>

<img alt="NextLevelWeek" title="#NextLevelWeek" src="https://github.com/rafaelbtorres/algoritmoMathingUngaroSelecaoTecnico/blob/main/img/testeDeMesa.png?raw=true" />

## Referências
<p>KUHN, H. W. The hungarian method for the assignment problem. Naval Research Logistics Quarterly, v. 2, n. 1-2, p. 83–97, 1955. Disponível em http://dx.doi.org/10.1002/nav.3800020109</p>
=======
   * [Lista de Dependências](#lista-de-dependências)
   * [Referências](#referências)
<!--te-->

## Descrição do Projeto

<p align="center"> Neste trabalho, propomos um algoritmo que permite a distribuição de atendimentos entre técnicos para atender enxurradas de demandas, com base na complexibilidade do serviço. A proposta envolve o algoritmo Matching Húngaro. Cada técnico possui uma capacidade de atendimento, e cada serviço possui uma complexibilidade. Esses valores são determinados pelo usuário.

## Instalação </p>

### Clone este repositório
$ git clone <https://github.com/rafaelbtorres/algoritmoMatchingHungaroSelecaoTecnico.git>

<p>Para executar o projeto, é necessário ter o JDK (ambiente necessário para desenvolver e executar aplicativos em Java), o Git (para clonar o projeto para a sua estação de trabalho) e o Netbeans IDE 11.3 (para executar a aplicação), instalados na estação de trabalho que pretende executar o projeto.</p>
<p>https://www.java.com/pt-BR/download/help/windows_manual_download.html#download</p>
<p>https://netbeans.apache.org/download/archive/index.html</p>

## Como Usar

<p>Após clonar o projeto, execute o arquivo "AlgoritmoSelecaoDeTecnico.java". Para executar, basta selecionar o arquivo e pressionar a tecla "F6".</p>

<img alt="NextLevelWeek" title="#NextLevelWeek" src="https://github.com/rafaelbtorres/algoritmoMathingUngaroSelecaoTecnico/blob/main/hungaro1.jpg?raw=true" />

**Passo 1.** Informe a quantidade de chamados e tecle "Enter".

**Passo 2.** Informe a quantidade de técnicos e tecle "Enter" para confirmar.

**Passo 3.** Complete a matriz de divisão de complexidade, informando a complexibilidade que cada técnico é caracterizado para solucionar cada chamado. 
Obs: No exemplo da imagem abaixo, entramos com 5 chamados e 5 técnicos. Ademais, informamos em formato de matriz a complexidade da cada técnico perante aos chamados designados.

**Passo 4.** Verifique o resultado da aplicação: O resultado da-se pela alocação de chamados para cada técnico que estiver caracterizado com valor de complexidade mais baixo que os demais técnicos.

<img alt="NextLevelWeek" title="#NextLevelWeek" src="https://github.com/rafaelbtorres/algoritmoMathingUngaroSelecaoTecnico/blob/main/hungaro2.jpg?raw=true" />

## Teste

<p>Na tabela abaixo, teste de mesa realizado para determinar o resultado esperado na simulação. Em cinza destacam-se as complexidades de baixa dificudade em relação aos chamados, relacionada na mesma linha do técnico selecionado.</p>

<img alt="NextLevelWeek" title="#NextLevelWeek" src="https://github.com/rafaelbtorres/algoritmoMathingUngaroSelecaoTecnico/blob/main/testeDeMesa.png?raw=true" />

## Lista de Dependências

<ul>
  <li>Git</li>
  <li>JDK (ambiente necessário para desenvolver e executar aplicativos em Java)</li>
  <li>Netbeans</li>
</ul>

## Referências
<p>KUHN, H. W. The hungarian method for the assignment problem. Naval Research Logistics Quarterly, v. 2, n. 1-2, p. 83–97, 1955. Disponível em http://dx.doi.org/10.1002/nav.3800020109</p>

<p>Código fonte utilizado como base: https://www.sanfoundry.com/java-program-implement-hungarian-algorithm-bipartite-matching/ </p>


<p>Código fonte utilizado como complemento: https://github.com/aalmi/HungarianAlgorithm/blob/master/HungarianAlgorithm.java</p>


<p>Vídeo utilizado para entendimento do funcionamento do Algoritmo: https://www.youtube.com/watch?v=SAPG2T4Jbok</p>
>>>>>>> origin/master
