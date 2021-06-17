package program;

import java.util.Locale;
import java.util.Scanner;
import Conversao.calculos;


public class Main {

	public static void main(String[] args) {
	 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		calculos calc = new calculos();
		
		System.out.print("Insira o valor do Dolar: ");
		calc.price = sc.nextDouble();
		System.out.print("Insira a quantidade que você irá comprar: $");
		calc.quantity = sc.nextDouble();
		System.out.printf("A quantidade que você irá gastar em Reais vai ser: R$ %.2f", calc.resultFinal());
		
		
		sc.close();

	}

}
