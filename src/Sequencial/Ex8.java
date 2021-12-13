package Sequencial;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		float custoC, custoF,percentagemD,impostos;
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual o valor de A ? ");
		custoF=ler.nextInt();
		percentagemD= (custoF*28)/100;
		impostos = (custoF*45)/100;
		custoC = custoF+percentagemD+impostos;

		ler.close();
		System.out.println("O custo para o consumidor é: "+custoC);
	}

}
