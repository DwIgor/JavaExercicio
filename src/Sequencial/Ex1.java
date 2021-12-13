package Sequencial;

import java.util.Scanner;

/*Faça um sistema que leia a idade de uma pessoa expressa 
 * em anos, meses e
 *  dias e mostre-a expressa apenas em dias. */
public class Ex1 {

	public static void main(String[] args) {
		int ano, mes, dia;
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual a sua idade em anos? ");
		ano=ler.nextInt();
		System.out.println(" Entre com o valor de meses? ");
		mes=ler.nextInt();
		System.out.println("Qual a sua idade em dias? ");
		dia=ler.nextInt();
		
		dia=(dia+(ano*365)+(mes*30));
		System.out.println("Sua idade em dias é: "+dia);
		
		
		
		ler.close();
		
	
	}
}
