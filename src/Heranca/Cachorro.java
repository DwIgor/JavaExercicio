package Heranca;

public class Cachorro extends Animal {

	private String raca;
	

	//METODO PROPRIO DO CACHORRO
	public void guarda() {
		System.out.println("Est� cuidadno da casa");
	}
	public void correr() {
		System.out.println("Est� correndo ");
		
		
		
		
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}

	
	
}
