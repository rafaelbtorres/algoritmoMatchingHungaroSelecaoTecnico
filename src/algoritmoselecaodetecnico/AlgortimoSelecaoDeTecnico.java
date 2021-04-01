package algoritmoselecaodetecnico;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AlgortimoSelecaoDeTecnico {

    private final double[][] matrizDeComplexidade;
    private final int linhas, colunas, dim;
    private final double[] tecnicos, chamados;
    private final int[] minTecnicoParaChamado;
    private final double[] minValorDeChamado;
    private final int[] chamadoSelecionado, tecnicoSelecionado;
    private final int[] chaveTecSelectParaTrab;
    private final boolean[] chaveTecnicos;

    public AlgortimoSelecaoDeTecnico(double[][] matrizDeComplexidade) {
        /*
        * Inicia o algoritmo, instancia os indices minimos e chaves
        * verifica se a matriz é quadrada
         */
        this.dim = Math.max(matrizDeComplexidade.length, matrizDeComplexidade[0].length);
        this.linhas = matrizDeComplexidade.length;
        this.colunas = matrizDeComplexidade[0].length;
        this.matrizDeComplexidade = new double[this.dim][this.dim];
        for (int w = 0; w < this.dim; w++) {
            if (w < matrizDeComplexidade.length) {
                if (matrizDeComplexidade[w].length != this.colunas) {
                    throw new IllegalArgumentException("A Matriz não é Quadrada");
                }
                this.matrizDeComplexidade[w] = Arrays.copyOf(matrizDeComplexidade[w], this.dim);
            } else {
                this.matrizDeComplexidade[w] = new double[this.dim];
            }
        }
        tecnicos = new double[this.dim];
        chamados = new double[this.dim];
        minTecnicoParaChamado = new int[this.dim];
        minValorDeChamado = new double[this.dim];
        chaveTecnicos = new boolean[this.dim];
        chaveTecSelectParaTrab = new int[this.dim];
        chamadoSelecionado = new int[this.dim];
        Arrays.fill(chamadoSelecionado, -1);
        tecnicoSelecionado = new int[this.dim];
        Arrays.fill(tecnicoSelecionado, -1);
    }

    protected void calculaPrimeiraSolucaoFactivel() {
        /*
        * Busca por numeros minimos na matriz
        * verifica se a matriz já está simplificada
         */
        for (int j = 0; j < dim; j++) {
            chamados[j] = Double.POSITIVE_INFINITY;
        }
        for (int w = 0; w < dim; w++) {
            for (int j = 0; j < dim; j++) {
                if (matrizDeComplexidade[w][j] < chamados[j]) {
                    chamados[j] = matrizDeComplexidade[w][j];
                }
            }
        }
    }

    public int[] passo1() {
        /*
        * Passo 1:
        * Reduz a matriz para que em cada linha e coluna exista pelo menos um zero:
        * 1. subtrai cada mínimo de linha de cada elemento da linha
        * 2. subtrai cada mínimo de coluna de cada elemento da coluna
         */
        passo5();
        calculaPrimeiraSolucaoFactivel();
        aplicaMatching();
        int w = buscaTecnicoUnmatching();
        while (w < dim) {
            inicializaFase(w);
            passo2();
            w = buscaTecnicoUnmatching();
        }
        int[] result = Arrays.copyOf(chamadoSelecionado, linhas);
        for (w = 0; w < result.length; w++) {
            if (result[w] >= colunas) {
                result[w] = -1;
            }
        }
        return result;
    }

    protected void passo2() {
        /*
         * Passo 2:
         * marca cada 0 com um "quadrado", se não houver outros zeros marcados na mesma linha ou coluna
         */
        while (true) {
            int indiceMinimoTecnico = -1, indiceMinimoChamado = -1;
            double minSlackValue = Double.POSITIVE_INFINITY;
            for (int j = 0; j < dim; j++) {
                if (chaveTecSelectParaTrab[j] == -1) {
                    if (minValorDeChamado[j] < minSlackValue) {
                        minSlackValue = minValorDeChamado[j];
                        indiceMinimoTecnico = minTecnicoParaChamado[j];
                        indiceMinimoChamado = j;
                    }
                }
            }
            if (minSlackValue > 0) {
                atualizaMarcacoes(minSlackValue);
            }
            chaveTecSelectParaTrab[indiceMinimoChamado] = indiceMinimoTecnico;
            if (tecnicoSelecionado[indiceMinimoChamado] == -1) {
                int selectChamado = indiceMinimoChamado;
                int selectTecnico = chaveTecSelectParaTrab[selectChamado];
                while (true) {
                    int temp = chamadoSelecionado[selectTecnico];
                    match(selectTecnico, selectChamado);
                    selectChamado = temp;
                    if (selectChamado == -1) {
                        break;
                    }
                    selectTecnico = chaveTecSelectParaTrab[selectChamado];
                }
                return;
            } else {
                /*
                  * Passo 3:
                  * Busca o indice selecionado ('0') e retorna para a matriz
                 */
                int tecnico = tecnicoSelecionado[indiceMinimoChamado];
                chaveTecnicos[tecnico] = true;
                for (int j = 0; j < dim; j++) {
                    if (chaveTecSelectParaTrab[j] == -1) {
                        double slack = matrizDeComplexidade[tecnico][j]
                                - tecnicos[tecnico] - chamados[j];
                        if (minValorDeChamado[j] > slack) {
                            minValorDeChamado[j] = slack;
                            minTecnicoParaChamado[j] = tecnico;
                        }
                    }
                }
            }
        }
    }

    protected int buscaTecnicoUnmatching() {
        /*
        * Encontra indices que ainda não foram selecionados
         */
        int w;
        for (w = 0; w < dim; w++) {
            if (chamadoSelecionado[w] == -1) {
                break;
            }
        }
        return w;
    }

    protected void aplicaMatching() {
        /*
        * Passo 4
        * Aplica o matching dos indices selecionados
         */
        for (int w = 0; w < dim; w++) {
            for (int j = 0; j < dim; j++) {
                if (chamadoSelecionado[w] == -1
                        && tecnicoSelecionado[j] == -1
                        && matrizDeComplexidade[w][j] - tecnicos[w] - chamados[j] == 0) {
                    match(w, j);
                }
            }
        }
    }

    protected void inicializaFase(int w) {
        /*
        * Valida informações e verifica os indices da matriz
         */
        Arrays.fill(chaveTecnicos, false);
        Arrays.fill(chaveTecSelectParaTrab, -1);
        chaveTecnicos[w] = true;
        for (int j = 0; j < dim; j++) {
            minValorDeChamado[j] = matrizDeComplexidade[w][j] - tecnicos[w]
                    - chamados[j];
            minTecnicoParaChamado[j] = w;
        }
    }

    protected void match(int w, int j) {
        /*
        * Monta o match da coluna com a linha
         */
        chamadoSelecionado[w] = j;
        tecnicoSelecionado[j] = w;
    }

    protected void passo5() {
        /*
        *Passo 5:
        * 1. Encontra o menor valor descoberto na matriz.
        * 2. Subtrai de todos os valores descobertos
        * 3. Adiciona a todos os valores cobertos duas vezes
         */
        for (int w = 0; w < dim; w++) {
            double min = Double.POSITIVE_INFINITY;
            for (int j = 0; j < dim; j++) {
                if (matrizDeComplexidade[w][j] < min) {
                    min = matrizDeComplexidade[w][j];
                }
            }
            for (int j = 0; j < dim; j++) {
                matrizDeComplexidade[w][j] -= min;
            }
        }
        double[] min = new double[dim];
        for (int j = 0; j < dim; j++) {
            min[j] = Double.POSITIVE_INFINITY;
        }
        for (int w = 0; w < dim; w++) {
            for (int j = 0; j < dim; j++) {
                if (matrizDeComplexidade[w][j] < min[j]) {
                    min[j] = matrizDeComplexidade[w][j];
                }
            }
        }
        for (int w = 0; w < dim; w++) {
            for (int j = 0; j < dim; j++) {
                matrizDeComplexidade[w][j] -= min[j];
            }
        }
    }

    protected void atualizaMarcacoes(double slack) {
        /*
        * Redistribui as marcações em indices ainda não selecionados
         */
        for (int w = 0; w < dim; w++) {
            if (chaveTecnicos[w]) {
                tecnicos[w] += slack;
            }
        }
        for (int j = 0; j < dim; j++) {
            if (chaveTecSelectParaTrab[j] != -1) {
                chamados[j] -= slack;
            } else {
                minValorDeChamado[j] -= slack;
            }
        }
    }

    public static void main(String[] args) {

        HashMap logs = new HashMap();
        Gravacao gravacao = new Gravacao();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a quantidade de chamados: ");
        int chamados = sc.nextInt();
        String qtdChamados = String.valueOf(chamados);
        logs.put("qtdChamados", qtdChamados);

        System.out.println("Entre com a quantidade de tecnicos: ");
        int tecnicos = sc.nextInt();
        String qtdTecnicos = String.valueOf(chamados);
        logs.put("qtdTecnicos", qtdTecnicos);

        System.out.println("Complete a matriz de divisão de complexidade:");
        double[][] cost = new double[chamados][tecnicos];
        String auxLog = "";

        for (int i = 0; i < chamados; i++) {
            for (int j = 0; j < tecnicos; j++) {
                cost[i][j] = sc.nextDouble();

                auxLog = auxLog + String.valueOf(cost[i][j]) + " ";
            }
            auxLog = auxLog + "\n";
        }

        logs.put("matriz", auxLog);

        AlgortimoSelecaoDeTecnico hbm = new AlgortimoSelecaoDeTecnico(cost);
        int[] result = hbm.passo1();
        int tec = 0;
        String saidaLog = "";

        for (int ch = 0; ch < chamados; ++ch) {
            System.out.println("O tecnico: " + tec++ + " irá atender ao chamado: " + result[ch]);
            saidaLog = saidaLog + "O tecnico: " + tec + " irá atender ao chamado: " + result[ch] + "\n";
        }
        logs.put("saidas", saidaLog);
        gravacao.grava(logs);
        sc.close();
    }
}
