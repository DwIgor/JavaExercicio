package Repeticao;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o.
 *Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
 * e as op��es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
 *Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o n�mero de pessoas calmas; 
o n�mero de mulheres nervosas; 
o n�mero de homens agressivos; 
o n�mero de outros calmos;
o n�mero de pessoas nervosas com mais de 40 anos; ok
o n�mero de pessoas calmas com menos de 18 anos.ok
*/
public class Ex4 {

	public static void main(String[] args) {
		int cont=0, id, pC=0, sexo, estado, jovemC=0, adN=0, mN=0, hA=0, oC=0;
		int sexoF=0, sexoM=0, sexoO=0;
		
		Scanner ler = new Scanner(System.in);
		
			
		while(cont<150)
		{ 
			System.out.println("Entre com uma idade: ");
			id=ler.nextInt();
			System.out.println("qual o seu sexo: 1-feminino 2-masculino 3-outros.");
			sexo=ler.nextInt();
			System.out.println("qual o estado da pessoa: 1-Calmo 2-Nervoso 3-Agressivo. ");
			estado=ler.nextInt();
			
			 
			 if(estado==1) {
			 	pC++;
			 	}
			if(sexo==1 && estado==2){
				mN++;
				}
			 if(sexo==2 && estado==3){
				hA++;
				}
			 if(sexo==3 && estado==1) {
				oC++;
				}
			 if(id<=18 && estado==1) {
				jovemC++;
				}
			 if(id>=40 && estado==2) {
				adN++;
				}			
			 if(sexo!=2 && sexo!=3){
				sexoF++;
				}
			 if(sexo!=3 && sexo!=1){
				sexoM++;
				}
			else {
				sexoO++;
				}	
			 cont++;
		}	
		ler.close();
	
		
		System.out.println("O numero de pessoas calma �: "+pC);
		System.out.println("O numero de mulheres nervosas �: "+mN);
		System.out.println("O numero de  homens agressivos �: "+hA);
		System.out.println("O numero de Outros calma �: "+oC);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos �: "+adN);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos �: "+jovemC);
		
		
	
	}

}
