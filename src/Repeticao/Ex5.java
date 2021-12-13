package Repeticao;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)*/
public class Ex5 {

	public static void main(String[] args) {
	
		
		int num,soma=0;
		Scanner ler = new Scanner(System.in);
		
		do
		{
			System.out.println("digite um numero: ");
			num=ler.nextInt();
			soma =soma+num;
			if(num==0){
				System.out.println("Numero da sorte encontrado: programa encerrado!!");
			}
		}while(num!=0);
		System.out.println("A soma dos numero digitados são: "+soma);
		ler.close();
	}

}
