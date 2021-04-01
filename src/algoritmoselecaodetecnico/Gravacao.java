/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoselecaodetecnico;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Vagner <vequincozes@gmail.com>
 */

public class Gravacao {
    
    File diretorio = new File("\\Pasta logging");  
    
    File arquivo;
    FileWriter fw;
    BufferedWriter w;
    
    public Gravacao(){
        diretorio.mkdir();
    }
    
    public void grava(HashMap<String, String> logs){
        // data/hora atual
        LocalDateTime agora = LocalDateTime.now();

        // formatar a data
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm:ss");
        String dataFormatada = formatterData.format(agora);

        
        arquivo = new File ( "logging.txt");
        
        try{
            
            fw = new FileWriter(arquivo);
             w = new BufferedWriter(fw);
             
             w.write("Execução em: " + dataFormatada+ "\n\n");
            
             w.write("Quantidade de chamados inseridos: " + logs.get("qtdChamados") + "\n");
             w.write("Quantidade de técnicos inseridos: " + logs.get("qtdTecnicos")+ "\n\n");
             w.write("Matriz de complexidade:\n" + logs.get("matriz"));

             w.write("\n\n*** Saída ***\n");
             w.write(logs.get("saidas"));
             w.close();
             fw.close();
             
        }catch(IOException ex){
            
        }
    }
    

}
