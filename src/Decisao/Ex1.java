package LacoDecisao;

import java.util.Scanner;

/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
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
			System.out.println("O maior numero �: "+n1);
		} 
		else if(n2>n1 && n2>n3) {	
			System.out.println("O maior numero �: "+n2);
		}
		else {
			System.out.println("O maior numero �: "+n2);
		}
		ler.close();

	}

}
