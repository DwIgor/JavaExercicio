package LacoDecisao;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar.
 *  Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/
public class Ex4 {

	public static void main(String[] args) {
		double num,raiz, quad;
		
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero? ");
		num=ler.nextInt();
		
		if (num %2==0)
		{
		    raiz = Math.sqrt(num);
			System.out.println(" O numero é par");
			System.out.println(" A raiz é "+raiz);
		}
		else if(num%2==1)
		{
			System.out.println(" O numero é impar");
			quad=num*num;
			System.out.println(" O numero ao quadrado é "+quad);
		}
		ler.close();

	}

}
