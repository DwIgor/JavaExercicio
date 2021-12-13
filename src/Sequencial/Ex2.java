package Sequencial;

import java.util.Scanner;

/*Faça um sistema que leia a idade de uma pessoa expressa em dias
 *  e mostre-a expressa em anos, meses e dias. */
public class Ex2 {
	public static void main(String[] args) {
		
		int ano, mes, dias;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual a sua idade em dias? ");
		dias=ler.nextInt();
		ano=(dias/365);
		mes=(dias%365)%30;
		dias=(dias%365)%30;
		ler.close();
		System.out.println("A sua idade em anos é: "+ano+" anos "+mes+" meses "+dias+" dias ");
		
	
	
	}
}
