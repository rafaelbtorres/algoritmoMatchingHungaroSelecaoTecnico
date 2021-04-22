
package algoritmoselecaodetecnico;

public class Util {
    
    public static double [][] limitaWorkflow(int limitador, double[][] workflow){
        
        double [][] aux = new double[limitador][limitador];
        for (int i = 0; i < limitador; i++) {
            for (int j = 0; j < limitador; j++) {
                aux [i][j] = workflow [i][j];
            }
        }
        
        return aux;
    }
}
