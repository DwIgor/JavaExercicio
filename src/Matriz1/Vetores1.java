package Matriz1;

import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int [] arrayUm= {12,3,5,68,9,6,73,44,465,3,4,5,6,7};
		int [] arrayDois= {43,22,33,11,3,76,89,44,3,2};
		float [] nota=new float[5];
		
		
		//tamanho do array
		if (arrayDois.length>8)
		{
			System.out.println("Tamanho do arrayDois - maior que 8!");
			
			
		}else
		{
			System.out.println("Tamanho do arrayDois- menor que 8!");
		}
		System.out.println("\nTamanho do ArrayDois ="+arrayUm.length);
		
		//utilização do for-each
		String[] cars ={"Volvo", "","Ford","Mazda"};
	
		for (String i : cars)
		{
			System.out.println(i);
		}
		for (int i=0;i<5;i++)
		{
			System.out.println("Entre com uma nota:");
			nota[i]=ler.nextFloat();
		}
		for (int i=0;i<5;i++)
		{
			System.out.println("Nota "+i+1+"="+nota[i]);
		}
	}

}
