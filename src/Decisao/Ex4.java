package LacoDecisao;

import java.util.Scanner;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar.
 *  Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/
public class Ex4 {

	public static void main(String[] args) {
		double num,raiz, quad;
		
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero? ");
		num=ler.nextInt();
		
		if (num %2==0)
		{
		    raiz = Math.sqrt(num);
			System.out.println(" O numero � par");
			System.out.println(" A raiz � "+raiz);
		}
		else if(num%2==1)
		{
			System.out.println(" O numero � impar");
			quad=num*num;
			System.out.println(" O numero ao quadrado � "+quad);
		}
		ler.close();

	}

}
