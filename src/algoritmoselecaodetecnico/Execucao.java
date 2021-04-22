
package algoritmoselecaodetecnico;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import org.jfree.data.category.CategoryDataset;

public class Execucao {

    public static void main(String[] args) {


        GeradorWorkflow g = new GeradorWorkflow(2000);
        Grafico grafico2 = new Grafico();
        HashMap<String, double [][]> workflow = g.gerarWorkflowComplexidade();
        
        g = null;
        System.gc();       
        Temporizador medicoesComplexidade = new Temporizador();
        Temporizador medicoesSemComplexidade = new Temporizador();
 
        
        int marcacao = (workflow.get("workflowComplexidade").length * 10) / 100;
        for (int i = marcacao; i <= workflow.get("workflowComplexidade").length; i = i +marcacao) {
            
            double [][] novoWorkflow =   Util.limitaWorkflow(i, workflow.get("workflowComplexidade"));         
            
            AlgortimoSelecaoDeTecnico hbm = new AlgortimoSelecaoDeTecnico(novoWorkflow);
            long tempoInicial = System.currentTimeMillis();
            
            
            int [] result = hbm.passo1();
            
            
            long tempoFinal = System.currentTimeMillis();
            medicoesComplexidade.addMedicao(i, (tempoFinal - tempoInicial));
        }
        
        for (int i = marcacao; i <= workflow.get("workflowSemComplexidade").length; i = i +marcacao) {
            
            double [][] novoWorkflow =   Util.limitaWorkflow(i, workflow.get("workflowSemComplexidade"));         
            
            AlgortimoSelecaoDeTecnico hbm = new AlgortimoSelecaoDeTecnico(novoWorkflow);
            long tempoInicial = System.currentTimeMillis();
            
            
            int [] result = hbm.passo1();
            
            
            long tempoFinal = System.currentTimeMillis();
            medicoesSemComplexidade.addMedicao(i, (tempoFinal - tempoInicial));
        }        
JanelaDoGrafico grafico = new JanelaDoGrafico(medicoesComplexidade.getMedicoes(), medicoesSemComplexidade.getMedicoes());
grafico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
grafico.setSize(600,600);
grafico.setVisible(true);
grafico.setTitle("Algoritmo de Seleção");


    }
    
}
