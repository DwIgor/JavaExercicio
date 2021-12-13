package Matriz1;

import java.util.Scanner;

/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
 *  e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.*/
public class Ex4 {

	public static void main(String[] args) {
		int mat [][] = new int [3][3];
		int l, c, soma=0, somat=0;
		
		Scanner ler = new Scanner(System.in);
		for (l=0;l<4;l++)
		{
			for(c=0;c<6;c++) 
			{
				System.out.println("Digite um numero");
				mat[l][c]=ler.nextInt();
				
			}
		}
		for (l=0;l<4;l++)
		{
			for(c=0;c<6;c++) 
			{
				System.out.println("["+mat[l][c]+"]");
				
				
			}
			
			System.out.println("\t");
			
		}
		
		somat=mat[0][0]+mat[1][0]+mat[2][0]+mat[0][1]+mat[0][2]+mat[1][1]+mat[1][2]+mat[2][1]+mat[2][2];
		soma = mat[0][0]+mat[1][1]+mat[2][2];
		System.out.println("A soma total é:"+somat);
		System.out.println("A soma dos valores em diagonal é:"+soma);
		
		
	}

}
