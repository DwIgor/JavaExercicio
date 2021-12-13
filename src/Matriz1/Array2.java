package Matriz1;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		/* int mat [][] = {{1,2,3},{4,6,7}}; matriz de 3-linha e 2-colunas*/

		int mat [][] = new int [3][3];
		int l,c,soma=0;
		
		Scanner ler = new Scanner(System.in);
		for (l=0;l<3;l++)
		{
			for(c=0;c<3;c++) 
			{
				System.out.println("Digite um numero");
				mat[l][c]=ler.nextInt();
				soma+=mat[l][c];
			}
		}
		for (l=0;l<3;l++)
		{
			for(c=0;c<3;c++) 
			{
				System.out.print(mat[l][c]+"\t");
				
			}	
			System.out.println();	
		}
		imprimir(soma);
	}
	
	public static void imprimir(int x) {
		System.out.println("A soma da matriz é"+x);
	}
	
	
}
