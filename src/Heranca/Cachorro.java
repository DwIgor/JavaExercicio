package Heranca;

public class Cachorro extends Animal {

	private String raca;
	

	//METODO PROPRIO DO CACHORRO
	public void guarda() {
		System.out.println("Está cuidadno da casa");
	}
	public void correr() {
		System.out.println("Está correndo ");
		
		
		
		
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}

	
	
}
