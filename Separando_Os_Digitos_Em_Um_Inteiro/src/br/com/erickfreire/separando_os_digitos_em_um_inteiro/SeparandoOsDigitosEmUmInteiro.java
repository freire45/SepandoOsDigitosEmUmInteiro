package br.com.erickfreire.separando_os_digitos_em_um_inteiro;

import java.util.Scanner;

public class SeparandoOsDigitosEmUmInteiro {

	public static void main(String[] args) {
		int numero = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que separa os digitos de um número Inteiro:");
		System.out.print("Digite um número de 5 digitos: ");
		numero = entrada.nextInt();
		
		if(numero < 10000) {
			System.out.println("Número muito pequeno, inicie novamente o programa e digite o valor correto!");
		}
		
		if(numero > 99999) {
			System.out.println("Número muito grande, inicie novamente o prorgama e digite o valor correto!");
		}
		
		if(numero > 9999 && numero < 100000) {
			System.out.printf("O Número separado é: %d %d %d %d %d", numero/10000, 
					          (numero%10000) / 1000, (numero%1000) / 100, 
					          (numero%100) / 10, (numero%10) / 1);
		}
				
		
	}

}
