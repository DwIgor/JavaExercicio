package LacoDecisao;

import java.util.Scanner;

/*Faça um programa que entre com três números e coloque em ordem crescente.*/
public class Ex2 {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual o pimeiro numero? ");
		n1=ler.nextInt();
		System.out.println("Qual o proximo numero? ");
		n2=ler.nextInt();
		System.out.println("Qual o outro numero? ");
		n3=ler.nextInt();
		
		  if (n3 > n1)
			    if (n1 > n2)
			    	System.out.println("A ordem crescente: "+ n2+","+n1+","+n3+"...");
			    else if (n2 < n3)
			    	System.out.println("A ordem crescente: "+ n1+","+n2+","+n3+"...");
			  if (n1 > n2)
			    if (n2 > n3)
			    	System.out.println("A ordem crescente: "+ n3+","+n2+","+n1+"...");
			    else if (n3 < n1)
			    	System.out.println("A ordem crescente: "+ n2+","+n3+","+n1+"...");
			  if (n1 < n2)
			    if (n3 < n1)
			    	System.out.println("A ordem crescente: "+ n3+","+n1+","+n2+"...");
			    else if (n3 < n2)
			    	System.out.println("A ordem crescente: "+ n1+","+n3+","+n2+"...");
			  
			  ler.close();
	}
	

}
