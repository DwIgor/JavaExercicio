package Heranca;
/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos 
 *(observe a tabela), utilize os seus conhecimentos e distribua 
 * as características de forma que tudo o que for comum a todos os animais fique na classe Animal:*/
public class Animal {

	//ATRIBUTOS| SUPER CLASSE
	private String nome;
	private int idade;
	private double peso;
	private String funcao;
	
	
	

	public void aniversario() {
		
		idade++;
	}
	
	 public void emitirSom() {
		 System.out.println("Emitindo som: ");
	 }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	
		 
	
}
