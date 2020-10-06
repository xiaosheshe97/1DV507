package Exercise4;

import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.style.Styler;

import java.util.ArrayList;
import java.util.List;

public class SinMain {
    public static void main(String[] args) {
        List<Double> xData = new ArrayList<>();
        List<Double> yData = new ArrayList<>();

        for (double i = 0; i <= 2 * Math.PI; i = i + 0.1){
            xData.add(i);
            yData.add((1 + i/Math.PI)*Math.cos(i)*Math.cos(40*i));
        }

        XYChart chart = new XYChartBuilder().width(800).height(600).title("Sin").xAxisTitle("x").yAxisTitle("y").build();

        chart.getStyler().setChartTitleVisible(true);
        chart.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Line);
        chart.getStyler().setYAxisLabelAlignment(Styler.TextAlignment.Right);

        chart.addSeries("Sin", xData, yData);
        new SwingWrapper(chart).displayChart();

    }


}
