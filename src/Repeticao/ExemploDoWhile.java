package Repeticao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
	int n1, n2; /*podemos utilizar double ou float para resultados quebrados*/
		Scanner ler = new Scanner(System.in);
		
	do 
	{
		System.out.println("Entre com um valor para ser dividido: ");
		n1=ler.nextInt();/* caso utilize double nas variaveis precisa trocar por  "ler.nextdouble"*/
		System.out.println("Entre com o valor que ir� dividir: ");
		n2=ler.nextInt();
		if(n2==0)
		System.out.println("N�o h� divisao por 0");
	}while(n2!=0);
		{
			System.out.println("Oresultado da dvis�o �: "+n1/n2);
			System.out.println("Entre com um valor para ser dividido: ");
			n1=ler.nextInt();
			System.out.println("Entre com o valor que ir� dividir: ");
			n2=ler.nextInt();
		}
		ler.close();
		System.out.println("N�o h� divis�o por 0");
	}

	}


