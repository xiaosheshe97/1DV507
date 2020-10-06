package Exercise4;

import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PieBarChart {
    public static void main(String[] args) throws IOException {
        File file = new File("integers.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        List<Integer> y1 = new ArrayList<>();

        String s = "";
        int n = 0;
        int c10 = 0;
        int c20 = 0;
        int c30 = 0;
        int c40 = 0;
        int c50 = 0;
        int c60 = 0;
        int c70 = 0;
        int c80 = 0;
        int c90 = 0;
        int c100 = 0;

        while ((s = br.readLine())!=null){
            try{
                n = Integer.parseInt(s);
                if (n<10){
                    c10 ++;
                }
                else if (n<20){
                    c20 ++;
                }
                else if (n<30){
                    c30 ++;
                }
                else if (n<40){
                    c40 ++;
                }
                else if (n<50){
                    c50 ++;
                }
                else if (n<60){
                    c60 ++;
                }
                else if (n<70){
                    c70 ++;
                }
                else if (n<80){
                    c80 ++;
                }
                else if (n<90){
                    c90 ++;
                }
                else if (n<100){
                    c100 ++;
                }
            }catch (RuntimeException e){
            }
        }
        y1.add(c10);
        y1.add(c20);
        y1.add(c30);
        y1.add(c40);
        y1.add(c50);
        y1.add(c60);
        y1.add(c70);
        y1.add(c80);
        y1.add(c90);
        y1.add(c100);


        CategoryChart chart1 = new CategoryChartBuilder().width(800).height(600).title("Integer Bar Chart").xAxisTitle("Intervals").yAxisTitle("Count").build();
        chart1.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
        chart1.getStyler().setHasAnnotations(true);

        chart1.addSeries("Integer Intervals", new ArrayList<String>(Arrays.asList(new String[] {"<10","<20","<30","<40","<50","<60","<70","<80", "<90","<100"})),
                y1);
        new SwingWrapper(chart1).displayChart();

        PieChart chart2 = new PieChartBuilder().width(600).height(400).title("Integer Pie Chart").build();
        Color[] sliceColors = new Color[] { new Color(0x533AC8),new Color(0x8CF0AD),new Color(0xC82C2D),
                new Color(0x6EC87B),new Color(0x32B7C8),new Color(0x1547C8),new Color(0xC6C822),
                new Color(0xC82CBE),new Color(0x520BC8),new Color(0x16C835)};
        chart2.getStyler().setSeriesColors(sliceColors);

        // Series
        chart2.addSeries("<10",c10);
        chart2.addSeries("<20", c20);
        chart2.addSeries("<30", c30);
        chart2.addSeries("<40", c40);
        chart2.addSeries("<50", c50);
        chart2.addSeries("<60", c60);
        chart2.addSeries("<70", c70);
        chart2.addSeries("<80", c80);
        chart2.addSeries("<90", c90);
        chart2.addSeries("<100",c100);

        chart2.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);

        new SwingWrapper(chart2).displayChart();

    }
}
