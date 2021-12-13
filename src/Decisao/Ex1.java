package LacoDecisao;

import java.util.Scanner;

/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/
public class Ex1 {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual o pimeiro numero? ");
		n1=ler.nextInt();
		System.out.println("Qual o segundo numero? ");
		n2=ler.nextInt();
		System.out.println("Qual o terceiro numero? ");
		n3=ler.nextInt();

		if (n1 >n2 && n1 >n3){
			System.out.println("O maior numero é: "+n1);
		} 
		else if(n2>n1 && n2>n3) {	
			System.out.println("O maior numero é: "+n2);
		}
		else {
			System.out.println("O maior numero é: "+n2);
		}
		ler.close();

	}

}
