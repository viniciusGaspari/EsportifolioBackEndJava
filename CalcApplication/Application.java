package CalcApplication;

public class Application {
	
	public int getCalc(String calculo, String x, String y) {
	
		
		double Op = 0;

		if (calculo.equalsIgnoreCase("soma")) {
			double num1 = Double.parseDouble(x);
			double num2 = Double.parseDouble(y);
			Op = num1 + num2;

		} else if (calculo.equalsIgnoreCase("menos")) {
			double num1 = Double.parseDouble(x);
			double num2 = Double.parseDouble(y);
			Op = num1 - num2;

		} else if (calculo.equalsIgnoreCase("multiplicacao")) {
			double num1 = Double.parseDouble(x);
			double num2 = Double.parseDouble(y);
			Op = num1 * num2;

		} else if (calculo.equalsIgnoreCase("divisao")) {
			double num1 = Double.parseDouble(x);
			double num2 = Double.parseDouble(y);
			Op = num1 / num2;
			
		}
		
		return (int) Op; 
		 
	}
}

