package Poo1;

public class PEletro {

	//ATRIBUTOS
	 String nome;
	 String marca;
	 double valor;	
	 boolean cadastrado;
	
	//METODO COSTRUTOR	
	public PEletro()
	{
		this.nome="Ps5";
		this.valor=3500.00;
		
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
			System.out.println("Produto registrado no Sistema");
		else 
			System.out.println("Cadastre o Produto!!!");
		
	}
	public void status() {
		System.out.println("O noome do Produto é "+this.nome);
		System.out.println("O valor  dele é :"+this.valor+"reais");
		System.out.println("Esta cadastrado no sistema do estoque? "+this.cadastrado);
	}
}
