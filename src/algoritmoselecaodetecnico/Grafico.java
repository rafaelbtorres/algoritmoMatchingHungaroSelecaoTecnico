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

    public CategoryDataset createDataSet() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();


        dataSet.setValue(0.0, "Row 1", "Alegria");
        dataSet.setValue(100.0, "Row 1", "Brilho");
        dataSet.setValue(200.0, "Row 1", "Aço");
        dataSet.setValue(300.0, "Row 1", "Sentido?");

        dataSet.setValue(0.0, "Row 2", "Alegria");
        dataSet.setValue(50.0, "Row 2", "Brilho");
        dataSet.setValue(100.0, "Row 2", "Aço");
        dataSet.setValue(300.0, "Row 2", "Sentido?");

        dataSet.setValue(0.0, "Row 3", "Alegria");
        dataSet.setValue(90.0, "Row 3", "Brilho");
        dataSet.setValue(120.0, "Row 3", "Aço");
        dataSet.setValue(300.0, "Row 3", "Sentido?");

        dataSet.setValue(0.0, "Row 4", "Alegria");
        dataSet.setValue(10.0, "Row 4", "Brilho");
        dataSet.setValue(250.0, "Row 4", "Aço");
        dataSet.setValue(300.0, "Row 4", "Sentido?");

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

//    public ChartPanel criarGrafico(ArrayList<Pessoa> listaDePessoas){
    public ChartPanel criarGrafico() {
//        CategoryDataset dataSet = this.createDataSet(listaDePessoas);
        CategoryDataset dataSet = this.createDataSet();

        JFreeChart grafico = this.createLineChart(dataSet);

        ChartPanel painelDoGrafico = new ChartPanel(grafico);
        painelDoGrafico.setPreferredSize(new Dimension(400, 400));

        return painelDoGrafico;
    }

}