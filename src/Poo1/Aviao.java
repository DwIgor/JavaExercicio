package Poo1;

public class Aviao {

	//ATRIBUTOS
		String empresa;
		String cor;
		boolean partindo;
		
		//METODO COSTRUTOR	
		public Aviao()
		{
			this.empresa="Gol";
			this.cor="branco";
			this.partindo=true;
			
		}
		//METODO
		
			
	
		public void status() {
			System.out.println("o nome da empresa é "+this.empresa);
			System.out.println("E a idade  dele é :"+this.cor);
			System.out.println("Esta partindo para o destino? "+this.partindo);
		}
}
