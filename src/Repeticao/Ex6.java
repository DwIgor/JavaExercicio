package Repeticao;

import java.util.Scanner;

/*Escrever um programa que receba vários números inteiros no teclado.
 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
public class Ex6 {

	public static void main(String[] args) {
		

		int num;
		double media=0, cont=0,soma=0;
		Scanner ler = new Scanner(System.in);
		
		do
		{
			System.out.println("digite um numero: ");
			num=ler.nextInt();
			cont++;
			if(num==0){
				System.out.println("Numero da sorte encontrado: programa encerrado!!");
			}
			else if(num%3==0){
				System.out.println("digite um numero: ");
				num=ler.nextInt();
				cont=cont+num;
				soma =soma+cont;
			}
		}while(num!=0);
			
			media=soma/cont;
		System.out.println("A media dos numero digitados são: "+media);
		ler.close();
		

		}

}
