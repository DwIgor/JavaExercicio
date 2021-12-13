package Sequencial;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		float A,B,C,D,E,F,x,y;
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual o valor de A ? ");
		A=ler.nextInt();
		System.out.println("Qual o valor de A ? ");
		B=ler.nextInt();
		System.out.println("Qual o valor de A ? ");
		C=ler.nextInt();
		System.out.println("Qual o valor de A ? ");
		D=ler.nextInt();
		System.out.println("Qual o valor de A ? ");
		E=ler.nextInt();
		System.out.println("Qual o valor de A ? ");
		F=ler.nextInt();

		x=((C*E)-(B*F) / (A*E)-(B*D));
		y=((A*F)-(C*D) / (A*E)-(B*D));
		ler.close();
		System.out.println("Este é o valor de X e de Y " + x + y);
	}

}
