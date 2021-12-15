package Heranca;

public class TestAnimal {

	public static void main(String[] args) {
	
		Cachorro c1 = new Cachorro();
		Cavalo ca1 = new Cavalo();
		Preguica p1 = new Preguica();
		
		
		
		c1.setNome("Satanas");
		c1.setPeso(10);
		c1.setRaca("pincther");
		
		ca1.setNome("Pé de Pano");
		ca1.setRaca("manga larga");
		ca1.setPeso(35);
		
		p1.setNome("Wanda");
		p1.setRaca("Preguiça Real");
		p1.setPeso(35);
		
		
		
		System.out.println("Nome: "+c1.getNome()+"\nPeso: "+c1.getPeso()+"kg"+"\nO que esta fazendo? ");
		c1.guarda();
		
		System.out.println("Nome: "+ca1.getNome()+"\nPeso: "+ca1.getPeso()+"kg"+"\nO que esta fazendo? ");
		ca1.deitado();
		
		System.out.println("Nome: "+p1.getNome()+"\nPeso: "+p1.getPeso()+"kg"+"\nO que esta fazendo? ");
		p1.dormindo();
	}
}
