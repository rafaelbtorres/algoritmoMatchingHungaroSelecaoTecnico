package algoritmoselecaodetecnico;

/**
 *
 * @author Rafael
 */

import java.awt.Color;
import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.NumberAxis3D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;


public class Grafico extends ApplicationFrame {

DefaultCategoryDataset _dataset;


    public Grafico(final String title, ArrayList<Medicao> medicoesComplexidade, ArrayList<Medicao> medicoesSemComplexidade) {


           super(title);

           final CategoryDataset dataSet1 = createDataSet1(medicoesComplexidade, medicoesSemComplexidade);

           // create the chart...
           final JFreeChart grafico = ChartFactory.createLineChart(
               "Algoritmo Matching Hungaro",
               "Tamanho de instância (n)",
               "Tempo de execução (t)",
               dataSet1,
               PlotOrientation.VERTICAL,
               true,             
               true,
               false
           );


        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

        // set the background color for the chart...
        grafico.setBackgroundPaint(new Color(0xCC, 0xFF, 0xCC));
//        chart.getLegend().setAnchor(Legend.SOUTH);

        // get a reference to the plot for further customisation...
        final CategoryPlot plot = grafico.getCategoryPlot();
        plot.setDomainAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
        plot.setRangeAxisLocation(AxisLocation.TOP_OR_LEFT);
        final CategoryItemRenderer renderer1 = plot.getRenderer();
        renderer1.setSeriesPaint(0, Color.red);
        renderer1.setSeriesPaint(1, Color.yellow);
        renderer1.setSeriesPaint(2, Color.green);
        final CategoryDataset dataset2 = createDataSet2(medicoesComplexidade, medicoesSemComplexidade);
//        final ValueAxis axis2 = new NumberAxis3D();
//        plot.setRangeAxis(1, axis2);
        plot.setDataset(1, dataset2);
//        plot.mapDatasetToRangeAxis(1, 1);
        
        final CategoryItemRenderer renderer2 = new LineAndShapeRenderer();
        renderer2.setSeriesPaint(0, Color.blue);
        plot.setRenderer(1, renderer2);

        plot.setDatasetRenderingOrder(DatasetRenderingOrder.REVERSE);
        // OPTIONAL CUSTOMISATION COMPLETED.

        // add the chart to a panel...
        final ChartPanel chartPanel = new ChartPanel(grafico);
        chartPanel.setPreferredSize(new java.awt.Dimension(1200, 600));
        setContentPane(chartPanel);
        
                this.pack();
        RefineryUtilities.centerFrameOnScreen(this);
        this.setVisible(true);

    }
  
   public CategoryDataset createDataSet1(ArrayList<Medicao> medicoesComplexidade, ArrayList<Medicao> medicoesSemComplexidade) {
        _dataset = new DefaultCategoryDataset();

        for (int i = 0; i < medicoesComplexidade.size(); i++) {
            _dataset.setValue(medicoesComplexidade.get(i).getTempo(), "I5 Com complexidade aproximado", "" + medicoesComplexidade.get(i).getQuantidadeExecucoes());
        }
        for (int i = 0; i < medicoesSemComplexidade.size(); i++) {
            _dataset.setValue(medicoesSemComplexidade.get(i).getTempo(), "I5 Sem complexidade aproximado", "" + medicoesSemComplexidade.get(i).getQuantidadeExecucoes());
        }                
        return _dataset;     
    }
      public CategoryDataset createDataSet2(ArrayList<Medicao> medicoesComplexidade, ArrayList<Medicao> medicoesSemComplexidade) {
        _dataset = new DefaultCategoryDataset();

        for (int i = 0; i < medicoesComplexidade.size(); i++) {
            _dataset.setValue(medicoesComplexidade.get(i).getTempo(), "I5 Com complexidade medido", "" + medicoesComplexidade.get(i).getQuantidadeExecucoes());
        }
        for (int i = 0; i < medicoesSemComplexidade.size(); i++) {
            _dataset.setValue(medicoesSemComplexidade.get(i).getTempo(), "I5 Sem complexidade medido", "" + medicoesSemComplexidade.get(i).getQuantidadeExecucoes());
        }                
        return _dataset;     
    }

 public ChartPanel criarGrafico(ArrayList<Medicao> medicoesComplexidade, ArrayList<Medicao> medicoesSemComplexidade) {

        CategoryDataset dataSet1 = this.createDataSet1(medicoesComplexidade, medicoesSemComplexidade);
        
        return null;
    }
private CategoryDataset createDataset3() {

        // row keys...
        final String series1 = "Fourth";

        // column keys...
        final String category1 = "Category 1";
        final String category2 = "Category 2";
        final String category3 = "Category 3";
        final String category4 = "Category 4";
        final String category5 = "Category 5";

        // create the dataset...
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(15.0, series1, category1);
        dataset.addValue(24.0, series1, category2);
        dataset.addValue(31.0, series1, category3);
        dataset.addValue(25.0, series1, category4);
        dataset.addValue(56.0, series1, category5);

        return dataset;

    } 
 }
