package introducao;

import java.util.Scanner;

public class CalcMedia {

	public static void main(String[] args) {
		int n1, n2, media;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o Primeiro numero: ");
		n1=ler.nextInt();
		System.out.println("Digite o Segundo numero: ");
		n2=ler.nextInt();
		media =(n1+n2)/2;
		System.out.println("A media é: "+media);
		
		ler.close();
	}

}
