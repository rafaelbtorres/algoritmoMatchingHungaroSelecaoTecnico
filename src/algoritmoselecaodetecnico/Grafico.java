/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoselecaodetecnico;

import java.awt.Dimension;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Mauricio Escobar
 */
public class Grafico {
//    public CategoryDataset createDataSet(ArrayList<Pessoa> listaDePessoas){

    public CategoryDataset createDataSet(ArrayList<Medicao> medicoesComplexidade, ArrayList<Medicao> medicoesSemComplexidade) {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();

        for (int i = 0; i < medicoesComplexidade.size(); i++) {
            dataSet.setValue(medicoesComplexidade.get(i).getTempo(), "I7 Com complexidade", "" + medicoesComplexidade.get(i).getQuantidadeExecucoes());
        }
        for (int i = 0; i < medicoesSemComplexidade.size(); i++) {
            dataSet.setValue(medicoesSemComplexidade.get(i).getTempo(), "I7 Sem complexidade", "" + medicoesSemComplexidade.get(i).getQuantidadeExecucoes());
        }        
//        dataSet.setValue(0.0, "I7 Com complexidade", "Alegria");
//        dataSet.setValue(100.0, "I7 Com complexidade", "Brilho");
//        dataSet.setValue(200.0, "I7 Com complexidade", "Aço");
//        dataSet.setValue(300.0, "I7 Com complexidade", "Sentido?");

//        dataSet.setValue(0.0, "Row 2", "Alegria");
//        dataSet.setValue(50.0, "Row 2", "Brilho");
//        dataSet.setValue(100.0, "Row 2", "Aço");
//        dataSet.setValue(300.0, "Row 2", "Sentido?");
//
//        dataSet.setValue(0.0, "Row 3", "Alegria");
//        dataSet.setValue(90.0, "Row 3", "Brilho");
//        dataSet.setValue(120.0, "Row 3", "Aço");
//        dataSet.setValue(300.0, "Row 3", "Sentido?");
//
//        dataSet.setValue(0.0, "Row 4", "Alegria");
//        dataSet.setValue(10.0, "Row 4", "Brilho");
//        dataSet.setValue(250.0, "Row 4", "Aço");
//        dataSet.setValue(300.0, "Row 4", "Sentido?");

//        for(Pessoa pessoa : listaDePessoas){
//            dataSet.addValue(pessoa.getIdade(), pessoa.getNome(), "");
//        }
        
        return dataSet;

    }

    public JFreeChart createLineChart(CategoryDataset dataSet) {
        JFreeChart grafico = ChartFactory.createLineChart(
                "Os guri do Mansilha",
                "",
                "Ceva chegando na mente",
                dataSet,
                PlotOrientation.VERTICAL,
                true,
                false,
                false);

        return grafico;
    }


    public ChartPanel criarGrafico(ArrayList<Medicao> medicoesComplexidade, ArrayList<Medicao> medicoesSemComplexidade) {

        CategoryDataset dataSet = this.createDataSet(medicoesComplexidade, medicoesSemComplexidade);

        JFreeChart grafico = this.createLineChart(dataSet);

        ChartPanel painelDoGrafico = new ChartPanel(grafico);
        painelDoGrafico.setPreferredSize(new Dimension(400, 400));

        return painelDoGrafico;
    }

}
