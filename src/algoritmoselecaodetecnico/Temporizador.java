
package algoritmoselecaodetecnico;

import java.util.ArrayList;

public class Temporizador {

    ArrayList<Medicao> medicoes;

    public Temporizador() {
        medicoes = new ArrayList<>();
    }

    public void addMedicao(int quantidadeExecucoes, long tempo){
        float tempoSegundos =  tempo / 1000F;
        Medicao medicao = new Medicao(quantidadeExecucoes, tempoSegundos);
        medicoes.add(medicao);
    }
    public ArrayList<Medicao> getMedicoes() {
        return medicoes;
    }

}
