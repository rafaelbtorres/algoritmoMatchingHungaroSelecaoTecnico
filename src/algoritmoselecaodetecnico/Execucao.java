
package algoritmoselecaodetecnico;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import org.jfree.data.category.CategoryDataset;

public class Execucao {

    public static void main(String[] args) {
    
        int _tamanhoN = 2000;
        
        if(args.length != 0){
            if (Util.isInt(args[0])) {
                _tamanhoN = Integer.valueOf(args[0]);                
            }
            else{
                System.out.println("## Seu parâmetro é inválido ##");
                System.out.println("Utilizando valor default: " + _tamanhoN);
            }

        }
        
        GeradorWorkflow g = new GeradorWorkflow(_tamanhoN);
        HashMap<String, double [][]> workflow = g.gerarWorkflowComplexidade();
        
        g = null;
        System.gc();       
        Temporizador medicoesComplexidade = new Temporizador();
        Temporizador medicoesSemComplexidade = new Temporizador();
 
        
        int marcacao = (workflow.get("workflowComplexidade").length * 5) / 100;
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

Grafico grafico = new Grafico("teste", medicoesComplexidade.getMedicoes(), medicoesSemComplexidade.getMedicoes());

    
    }
    
}
