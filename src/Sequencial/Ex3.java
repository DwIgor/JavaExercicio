package Sequencial;

import java.util.Scanner;

/*Fa�a um sistema que leia o tempo de dura��o de um evento
 *  em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
public class Ex3 {

	public static void main(String[] args) {
		int h,m,s;
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual a dura��o do evento em Segundos? ");
		s=ler.nextInt();
		h=(s/3600);
		m=(s%3600)/60;
		s=(s%3600)%60;
		
		ler.close();
		
		
		System.out.printf(" O tempo do evento foi de: "+ h +" horas "+ m + " minutos ", " e "+ s +" segundos ");

		
	}

}
