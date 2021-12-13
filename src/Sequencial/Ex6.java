package Sequencial;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		float x1,y1,x2,y2,d;
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual o valor do ponto x1 ? ");
		x1=ler.nextInt();
		System.out.println("Qual o valor do ponto y1 ? ");
		y1=ler.nextInt();
		System.out.println("Qual o valor do ponto x2 ? ");
		x2=ler.nextInt();
		System.out.println("Qual o valor do ponto y2 ? ");
		y2=ler.nextInt();
		d= ((x2 - x1)*(x2 - x1) + (y2-y1)*(y2-y1));
		ler.close();
		System.out.println("a distancia é "+d);
	}

}
