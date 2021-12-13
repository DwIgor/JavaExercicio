package Matriz1;

import java.util.Scanner;

/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
 
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
*/
public class Ex3 {

	public static void main(String[] args) {
		
		int l=0, c=0,soma=0;
		int n1 [][] = new int [4][6];
		int n2 [][] = new int [4][6];
		int mat1 [][] = new int [4][6];
		int mat2 [][] = new int [4][6];
		Scanner ler = new Scanner(System.in);
		
		for (l=0;l<4;l++)
		{
			for(c=0;c<6;c++) 
			{
				System.out.println("Digite um numero");
				n1[l][c]=ler.nextInt();
				soma+=n1[l][c];
			}
		}
		for (l=0;l<4;l++)
		{
			for(c=0;c<6;c++) 
			{
				System.out.print(n2[l][c]+"\t");
				
			}	
			
		}
		for (l=0;l<4;l++)
		{
			for(c=0;c<6;c++) 
			{
				mat1[l][c] = n1[l][c] + n2[l][c];
			
			}
		}
		for (l=0;l<4;l++)
		{
			for(c=0;c<6;c++) 
			{
				mat2[l][c] = n1[l][c] - n2[l][c];
				
			}	
			
		}
		System.out.println("resposta da letra A: "+mat1[l][c] );
		System.out.println("resposta da letra B: "+mat2[l][c] );
	}
}
