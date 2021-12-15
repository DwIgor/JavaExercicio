package Heranca;

public class Cavalo extends Animal{

		private String raca;
		
	
		
		public Cavalo() {
			this.raca="pe de pano";
		}
	//METODO PROPRIO DO CAVALO
		public void deitado() {
			System.out.println("Esta no curral descansando");
			
		}


		public String getRaca() {
			return raca;
		}


		public void setRaca(String raca) {
			this.raca = raca;
		}

		

}
