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
            dataSet.setValue(medicoesComplexidade.get(i).getTempo(), "I5 Com complexidade", "" + medicoesComplexidade.get(i).getQuantidadeExecucoes());
        }
        for (int i = 0; i < medicoesSemComplexidade.size(); i++) {
            dataSet.setValue(medicoesSemComplexidade.get(i).getTempo(), "I5 Sem complexidade", "" + medicoesSemComplexidade.get(i).getQuantidadeExecucoes());
        }                
        return dataSet;

    }

    public JFreeChart createLineChart(CategoryDataset dataSet) {
        JFreeChart grafico = ChartFactory.createLineChart(
                "Algoritmo Matching Hungaro",
                "Tamanho de instância (n)",
                "Tempo de execução (t)",
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
