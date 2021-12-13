package Repeticao;

import java.util.Scanner;

/* Wilhe é usado quando não sabe ate onde vai */
public class ExemploWhile {

	public static void main(String[] args) {
	
		int n1, n2; /*podemos utilizar double ou float para resultados quebrados*/
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um valor para ser dividido: ");
		n1=ler.nextInt();/* caso utilize double nas variaveis precisa trocar por  "ler.nextdouble"*/
		System.out.println("Entre com o valor que irá dividir: ");
		n2=ler.nextInt();
		while(n2!=0)
		{
			System.out.println("Oresultado da dvisão é: "+n1/n2);
			System.out.println("Entre com um valor para ser dividido: ");
			n1=ler.nextInt();
			System.out.println("Entre com o valor que irá dividir: ");
			n2=ler.nextInt();
		}
		ler.close();
		System.out.println("Não há divisão por 0");
	}

}
