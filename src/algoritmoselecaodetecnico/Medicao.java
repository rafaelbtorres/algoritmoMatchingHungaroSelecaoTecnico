/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoselecaodetecnico;

import java.text.DecimalFormat;

public class Medicao {
    private int quantidadeExecucoes;
    private float tempo;

    public Medicao(int quantidadeExecucoes, float tempo) {
        setQuantidadeExecucoes(quantidadeExecucoes);
        setTempo(tempo);
    }

    public int getQuantidadeExecucoes() {
        return quantidadeExecucoes;
    }

    public void setQuantidadeExecucoes(int quantidadeExecucoes) {
        this.quantidadeExecucoes = quantidadeExecucoes;
    }

    public float getTempo() {
        return tempo;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }
    
    public String formatarFloat(float numero){
        String retorno = "";
    DecimalFormat formatter = new DecimalFormat("#.00");
    try{
        retorno = formatter.format(numero);
    }catch(Exception ex){
        System.err.println("Erro ao formatar numero: " + ex);
    }
    return retorno;
}
    
}
