
package algoritmoselecaodetecnico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class GeradorWorkflow {
    Random RAND;
    int defaultN = 1800;
    int quantidadeChamados;
    int quantidadeTecnicos;
    ArrayList<Tecnico> tecnicos;
    ArrayList<Chamado> chamados;
    double [][] workflowComplexidade;
    double [][] workflowSemComplexidade;
    
    public GeradorWorkflow(){
        this.quantidadeChamados = defaultN;
        this.quantidadeTecnicos = defaultN;
        this.workflowComplexidade = new double [defaultN][defaultN];
        this.workflowSemComplexidade = new double [defaultN][defaultN];
        RAND = new Random();
        chamados = new ArrayList<>();
        tecnicos = new ArrayList<>();
        gerarComplexidadeChamados();
        gerarComplexidadeTecnicos();        
    }
    public GeradorWorkflow(int tamanhoDeN){
        this.quantidadeChamados = tamanhoDeN;
        this.quantidadeTecnicos = tamanhoDeN;
        this.workflowComplexidade = new double [tamanhoDeN][tamanhoDeN];
        this.workflowSemComplexidade = new double [tamanhoDeN][tamanhoDeN];        
        RAND = new Random();
        chamados = new ArrayList<>();
        tecnicos = new ArrayList<>();        
        gerarComplexidadeChamados();
        gerarComplexidadeTecnicos();        
    }    
    
    public HashMap<String, double[][]> gerarWorkflowComplexidade(){

        HashMap<String, double [][]> workflow = new HashMap<>();
        
        for (int i = 0; i < chamados.size()-1; i++) {
            for (int j = 0; j < tecnicos.size()-1; j++) {
                workflowComplexidade[i][j] = calculaComplexidade(chamados.get(i), tecnicos.get(j));
                workflowSemComplexidade[i][j] = getComplexidade();

            }
        }
        workflow.put("workflowComplexidade", workflowComplexidade);
        workflow.put("workflowSemComplexidade", workflowSemComplexidade);

        
        return workflow;
    }
    
    public double [][] gerarWorkflowSemComplexidade(){

        for (int i = 0; i < chamados.size()-1; i++) {
            for (int j = 0; j < tecnicos.size()-1; j++) {
                workflowSemComplexidade[i][j] = getComplexidade();
            }
        }
               
        return workflowComplexidade;
    }
    
    private int calculaComplexidade(Chamado chamado, Tecnico tecnico){
        
        int auxHistoricoAtendimento = 0;
        int auxRegiaoAtendimento = 0;
        int auxNivelConhecimento = 0;
        int auxReputacao = 0;
        int complexidade = 0;
        
        if (chamado.getHistoricoAtendimento() >= tecnico.getHistoricoAtendimento()) {
            auxHistoricoAtendimento = chamado.getHistoricoAtendimento() - tecnico.getHistoricoAtendimento();
        }
        else{
            auxHistoricoAtendimento = tecnico.getHistoricoAtendimento() - chamado.getHistoricoAtendimento();            
        }
        
        if (chamado.getNivelConhecimento() >= tecnico.getNivelConhecimento()) {
            auxNivelConhecimento = chamado.getNivelConhecimento() - tecnico.getNivelConhecimento();
        }
        else{
            auxNivelConhecimento = tecnico.getNivelConhecimento() - chamado.getNivelConhecimento();            
        }
        
        if(chamado.getRegiaoAtendimento() >= tecnico.getRegiaoAtendimento()){
            auxRegiaoAtendimento = chamado.getRegiaoAtendimento() - tecnico.getRegiaoAtendimento();
        }
        else{
            auxRegiaoAtendimento = tecnico.getRegiaoAtendimento() - chamado.getRegiaoAtendimento();

        }
        if (chamado.getReputacao() >= tecnico.getReputacao()) {
            auxReputacao = chamado.getReputacao() - tecnico.getReputacao();
        }
        else{
            auxReputacao = tecnico.getReputacao() - chamado.getReputacao();
            
        }
        
        complexidade = auxHistoricoAtendimento + auxNivelConhecimento + auxRegiaoAtendimento + auxReputacao;
        
        return complexidade;
    }
    private void gerarComplexidadeTecnicos(){
        
        for (int i = 0; i <= quantidadeTecnicos; i++) {
           Tecnico tecnico = new Tecnico(getComplexidade(), getComplexidade(), getComplexidade(), getComplexidade());
           tecnicos.add(tecnico);
        }
    }
    private void gerarComplexidadeChamados(){
        
        for (int i = 0; i <= quantidadeChamados; i++) {
           Chamado chamado = new Chamado(getComplexidade(), getComplexidade(), getComplexidade(), getComplexidade());
           chamados.add(chamado);
        }
    }    
    private int getComplexidade(){
        int result = RAND.nextInt((5 - 1) + 1) + 1;
     
     return result;   
    }
    
}
