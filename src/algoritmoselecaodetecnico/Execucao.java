
package algoritmoselecaodetecnico;

import java.util.ArrayList;
import java.util.HashMap;

public class Execucao {

    public static void main(String[] args) {
//        HashMap logs = new HashMap();
//        Gravacao gravacao = new Gravacao();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Entre com a quantidade de chamados: ");
//        int chamados = sc.nextInt();
//        String qtdChamados = String.valueOf(chamados);
//        logs.put("qtdChamados", qtdChamados);
//
//        System.out.println("Entre com a quantidade de tecnicos: ");
//        int tecnicos = sc.nextInt();
//        String qtdTecnicos = String.valueOf(chamados);
//        logs.put("qtdTecnicos", qtdTecnicos);
//
//        System.out.println("Complete a matriz de divisão de complexidade:");
//        double[][] cost = new double[chamados][tecnicos];
//        String auxLog = "";
//
//        for (int i = 0; i < chamados; i++) {
//            for (int j = 0; j < tecnicos; j++) {
//                cost[i][j] = sc.nextDouble();
//
//                auxLog = auxLog + String.valueOf(cost[i][j]) + " ";
//            }
//            auxLog = auxLog + "\n";
//        }
//
//        logs.put("matriz", auxLog);
//
//        AlgortimoSelecaoDeTecnico hbm = new AlgortimoSelecaoDeTecnico(cost);
//        int[] result = hbm.passo1();
//        int tec = 0;
//        String saidaLog = "";
//
//        for (int ch = 0; ch < chamados; ++ch) {
//            System.out.println("O tecnico: " + tec++ + " irá atender ao chamado: " + result[ch]);
//            saidaLog = saidaLog + "O tecnico: " + tec + " irá atender ao chamado: " + result[ch] + "\n";
//        }
//        logs.put("saidas", saidaLog);
//        gravacao.grava(logs);
//        sc.close();

//        for (String arg : args) {
//            System.out.println(arg);
//        }
        GeradorWorkflow g = new GeradorWorkflow(10);

        HashMap<String, double [][]> workflow = g.gerarWorkflowComplexidade();
        
        g = null;
        System.gc();
        
        AlgortimoSelecaoDeTecnico hbm = new AlgortimoSelecaoDeTecnico(workflow.get("workflowComplexidade"));
        int [] result = hbm.passo1();
        
        int tec = 1;
        
        for (int ch = 0; ch < result.length; ++ch) {
            System.out.println("O tecnico: " + tec++ + " irá atender ao chamado: " + (result[ch]+1));
            //saidaLog = saidaLog + "O tecnico: " + tec + " irá atender ao chamado: " + result[ch] + "\n";
        }
    }
    
}
