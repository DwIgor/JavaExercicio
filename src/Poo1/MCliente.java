package Poo1;

public class MCliente {

	public static void main(String[] args) {


		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		
		c1.nome="Igor";
		c1.idade=27;
		c1.cadastrado=true;
		c1.cadastro();
		c1.status();


		

		c2.nome="Jonas";
		c2.idade=17;
		c2.cadastrado=false;
		c2.semCadastro();
		c2.status();
	}

}
