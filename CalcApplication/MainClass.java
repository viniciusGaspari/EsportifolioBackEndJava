package CalcApplication;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		NameApplication name = new NameApplication();
		Application ap = new Application();
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Olá, como você se chama?");
			name.setName(scan.nextLine());
			name.showName();
			System.out.println("\nEste projeto é para o meu esportifólio aplicando o meu conhecimento"
					+ " basico no java backend");
			System.out.println("\nInsira operações aritméticas básicas para algum cálculo");
			System.out.println("\nSoma, Menos, Multiplicação e Divisão");
			String wishYes;

			do {
				System.out.println("\nSelecione a operação aritmética e depois insira dois números");

				//ap.getCalc(scan.next(), scan.next().replace(",", "."), scan.next().replace(",", "."));
				System.out.println(ap.getCalc(scan.next(), scan.next().replace(",", "."), scan.next().replace(",", ".")));
				System.out.println("\nDeseja continuar com outra operação?");
				wishYes = scan.next();
			} while (wishYes.equalsIgnoreCase("sim"));
						
			} catch (Exception e) {
				System.err.println("Houve algum erro de inserção de atributo");
			} finally {
				System.out.println("Operação finalizada");
			}
	}
}
