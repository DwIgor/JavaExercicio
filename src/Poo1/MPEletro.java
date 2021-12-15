package Poo1;

public class MPEletro {

	public static void main(String[] args) {
		
		PEletro p1 =new PEletro();
		PEletro p2 =new PEletro();
		
		p1.nome="Notebook";
		p1.valor=3000.00;
		p1.cadastrado=true;
		p1.acao();
		p1.cadastro();
		p1.status();


		

		p2.nome="celular";
		p2.valor=2000.00;
		p2.cadastrado=false;
		p2.semCadastro();
		p2.status();

	}

}
