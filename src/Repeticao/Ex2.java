package Repeticao;
/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
public class Ex2 {

	public static void main(String[] args) {
		int num, imp=0, par=0;
		
		
		for(num=0;num <10;num++){
			if (num%2==0){
				imp++;
			}
			else {
				par++;
			}			
		}
		System.out.println("A quantidade de numeros impares s�o:"+imp);
		System.out.println("A quantidade de numeros pares s�o:"+par);
	}

}
