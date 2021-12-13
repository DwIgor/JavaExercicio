package Sequencial;

import java.util.Scanner;

/*Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: */
public class Ex4 {

	public static void main(String[] args) {
		int a,b,c,d,r,s;
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual o valor do primeiro numero? ");
		a=ler.nextInt();
		System.out.println("Qual o valor do segundo numero? ");
		b=ler.nextInt();
		System.out.println("Qual o valor do terceiro numero? ");
		c=ler.nextInt();
		 
		r=(a+b)*(a+b);
		s=(b+c)*(b+c);
		d=(r+s)/2;
		ler.close();
		System.out.println("O resultado da expressão é? "+d );
	}

}
