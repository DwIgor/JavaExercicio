package Matriz1;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		int vet[] = new int[5];/*podemos difinir o tamanho do array usando esse metodo*/
		
		//int vet[] = {12,3,68,9,6};
		int soma =0, x;
		Scanner ler = new Scanner(System.in);
		
		 for (x=0;x<=5; x++) {
			 System.out.println("Digite um numero ");
			 vet[x]=ler.nextInt();
			 soma+=vet[x];
		 }
		 
		 for (x=0;x<=5; x++) 
		 {
			 System.out.println(vet[x]+"\t");
		 }
		
		 	System.out.println("A soma do vetor é "+soma);
	}

}
