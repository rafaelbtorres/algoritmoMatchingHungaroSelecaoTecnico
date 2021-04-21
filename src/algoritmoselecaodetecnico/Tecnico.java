
package algoritmoselecaodetecnico;

public class Tecnico {

    private int nivelConhecimento;
    private int regiaoAtendimento;
    private int historicoAtendimento;
    private int reputacao;   

    public Tecnico(int nivelConhecimento, int regiaoAtendimento, int historicoAtendimento, int reputacao) {
        this.nivelConhecimento = nivelConhecimento;
        this.regiaoAtendimento = regiaoAtendimento;
        this.historicoAtendimento = historicoAtendimento;
        this.reputacao = reputacao;
    }

    public int getNivelConhecimento() {
        return nivelConhecimento;
    }

    public int getRegiaoAtendimento() {
        return regiaoAtendimento;
    }

    public int getHistoricoAtendimento() {
        return historicoAtendimento;
    }

    public int getReputacao() {
        return reputacao;
    }
    
    
}
