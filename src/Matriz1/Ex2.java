package Matriz1;

import java.util.Scanner;

/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor.
 *  A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.*/
public class Ex2 {

	public static void main(String[] args) {
		
			int vet[] = new int[10];
			int soma =0,valor=0,maior=0, x;
			float media=0;
			
		Scanner ler = new Scanner(System.in);
		
		 for (x=0;x<10;x++)
		 {
			 System.out.println("Digite um numero ");
			 vet[x]=ler.nextInt();
			 soma+=vet[x];
			 if (vet[x]==6);
			 {
				 maior++;
			 }
		 
		 }
		 media =soma/10;
		 System.out.println("A media �: "+media);
		 System.out.println("A maior pontua��o ocorreu: "+maior+"vezes");
	}

}
