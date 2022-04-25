package controle;
import java.util.Scanner;
import dominio.Retangulo;

public class ControleRetangulo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o valor da base: ");
		int base = leia.nextInt();
		System.out.println("Insira o valor da altura; ");
		int altura = leia.nextInt();
		leia.close();
		
		Retangulo calc = new Retangulo(base, altura);
		
		System.out.println("Resultados\n");
		System.out.println("Área: " + calc.calcularArea());
		System.out.println("Perímetro: " + calc.calcularPerimetro());
		
	}

}
