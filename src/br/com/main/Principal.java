/**
 * 
 */
package br.com.main;

import java.util.Scanner;

/**
 * @author etecja
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double peso;
		double altura;
		
		
		System.out.println("Qual o seu peso?");
		peso = scanner.nextDouble();
		
		System.out.println("Qual a sua altura?");
		altura = scanner.nextDouble();
		
		Calcular calcular = new Calcular();
		System.out.println("Resultado: " + calcular.calcularImc(peso, altura));
	
	
	}

}
