package Repeticao;
/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
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
		System.out.println("A quantidade de numeros impares são:"+imp);
		System.out.println("A quantidade de numeros pares são:"+par);
	}

}
