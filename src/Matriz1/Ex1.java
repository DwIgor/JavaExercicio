package Matriz1;

import java.util.Scanner;

/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade 
 * e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. */
public class Ex1 {

	public static void main(String[] args) {
		
		
		
		int maior=0, valor=0,soma =0, x;;
		int vet[] = new int[5];
		
		
		Scanner ler = new Scanner(System.in);
		
		 for (x=0;x<5; x++) 
		 {
			 System.out.println("Digite um numero ");
			 vet[x]=ler.nextInt();
			 soma+=vet[x];
		 
		 }
		 for (x=0;x<5; x++) 
		 {
			 if(vet[x]>maior)
			 {
				 maior =vet[x];
			 }
		 }
		
		 	System.out.println("O maior valor � "+maior);
	}

}