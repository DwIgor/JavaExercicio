package Matriz1;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int n1, n2,x;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		n1=ler.nextInt();
		System.out.println("Digite um numero: ");
		n2=ler.nextInt();
		x=calculo(n1,n2);
		imprime(x);
		fim();

	}

	public static int calculo(int a, int b)
	{
		int soma;
		soma=a+b;
		return soma;
	}
	public static  void imprime(int x)
	{
		System.out.println("A soma é: "+x);
	}
	public static void  fim()
	{
		System.out.println("\n Fim do programa.");
	}
}
