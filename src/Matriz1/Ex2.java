package Matriz1;

import java.util.Scanner;

/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
 *  A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.*/
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
		 System.out.println("A media é: "+media);
		 System.out.println("A maior pontuação ocorreu: "+maior+"vezes");
	}

}
