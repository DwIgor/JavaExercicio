package LacoDecisao;

import java.util.Scanner;

/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
*/
public class Ex3 {

	public static void main(String[] args) {
		int id;
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual sua idade? ");
		id=ler.nextInt();
		
		if (id >10 && id<14)
		{
			System.out.println("Você esta na clase Infantil");
		}
			else if(id>15 && id<17)
			{
				System.out.println("Você esta na clase Juvenil");
			}
			else if (id >18 && id<25){
				System.out.println("Você esta na clase Adulta");
			}
		ler.close();
	}

}
