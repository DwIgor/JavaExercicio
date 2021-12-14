package Poo1;

public class Cliente {

	//ATRIBUTOS
		 String nome;
		 int idade;	
		 boolean cadastrado;
		
		//METODO COSTRUTOR	
		public Cliente()
		{
			this.nome="Joao";
			this.idade=35;
			
		}
		//Metodos
		public void cadastro() {
			
			cadastrado=true;
		}
		
		public void semCadastro() {
			cadastrado=false;
		}

		public void acao() {
			if(cadastrado==true)
				System.out.println("Usuario registrado no Sistema");
			else 
				System.out.println("Cadastre o cliente!!!");
			
		}
		public void status() {
			System.out.println("o nopme do cliente é "+this.nome);
			System.out.println("E a idade  dele é :"+this.idade+"anos");
			System.out.println("Esta cadastrado no sistema da loja? "+this.cadastrado);
		}
}
