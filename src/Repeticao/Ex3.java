package Repeticao;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir:
 *Total de pessoas com menos de 21 anos.
 *Total de pessoas com mais de 50 anos. 
 *O programa termina quando idade for =-99. (WHILE)*/
public class Ex3 {

	public static void main(String[] args) {
		int id;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com uma idade: (-99 para o programa):");
		id=ler.nextInt();
		
		while(id!=-99)
		{
		
			System.out.println("Entre com uma idade: (-99 para o programa): ");
			id=ler.nextInt();
		
		}
		ler.close();
		System.out.println("Programa encerrado!!");

	}

}
