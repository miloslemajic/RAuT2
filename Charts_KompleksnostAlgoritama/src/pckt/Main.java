package pckt;

import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYSeries;


public class Main {

	public static void main(String[] args) {
		
		//charts
		double[] xData = new double[] {0.0, 1.0, 2.0};
		double[] yData = new double[] {0.0, 1.0, 5.0};
		
		XYChart chart1 = QuickChart.getChart("Sample Chart", "X", "Y", "y(x)", xData, yData);
		new SwingWrapper(chart1).displayChart();

		
		//asimptotska
		Function<Double, Double> g=(x) -> {return 1.1*x*x + 10. + Math.sin(x+1.5) *Math.pow(x, 1.5) + 300.0;};
	
		double x[] = new double[100];
		double y[] = new double[100];
		
		for (var i=0; i<100; ++i) {
			x[i] = (double)i;
			y[i] = g.doit(x[i]);
		}
		
		
		double x1[] = new double[100];
		double y1[] = new double[100];

		for(var i = 0; i < 100; ++i) {
		    x1[i] = (double)i;
		    y1[i] = x[i] * x[i];
		}
		
		double x2[] = new double[100];
		double y2[] = new double[100];

		for(var i = 0; i < 100; ++i) {
		    x2[i] = (double)i;
		    y2[i] = 1.3*x[i] * x[i];
		}

		XYChart chart2 = QuickChart.getChart("Funckija g", "X", "Y", "g(x)", x, y);
		XYSeries series1 = chart2.addSeries("Theta(f)", x1, y1);
		XYSeries series2 = chart2.addSeries("ThetaUp(f)", x2, y2);
		new SwingWrapper(chart2).displayChart();
		
		
		Function<Double, Double> g1 = (x3) -> { return x3*(1 + Math.sin(x3));};
		double x3[] = new double[100];
		double y3[] = new double[100];

		for(var i = 0; i < 100; ++i) {
		    x3[i] = (double)i;
		    y3[i] = g1.doit(x[i]);
		}

		XYChart chart3 = QuickChart.getChart("Sample Chart", "X", "Y", "y(x)", x3, y3);
		new SwingWrapper(chart3).displayChart();
		//itd, neke vise matematike
		
	}
}

