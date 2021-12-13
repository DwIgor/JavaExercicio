package Sequencial;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		float media,n1,n2,n3;
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual o valor da primeira nota? ");
		n1=ler.nextInt();
		System.out.println("Qual o valor da segunda nota? ");
		n2=ler.nextInt();
		System.out.println("Qual o valor da terceira nota? ");
		n3=ler.nextInt();
		
		media=((n1*2)+(n2*3)+(n3*5))/10;
		ler.close();
		System.out.println("A media é: "+media);

	}

}
