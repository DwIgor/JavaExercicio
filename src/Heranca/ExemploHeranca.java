package Heranca;

public class ExemploHeranca {
	public static void main(String[] args) {
		
		Professor p =new Professor();
		Aluno a = new Aluno();
		
		
		p.setNome("Yuri");
		p.setIdade(22);
		p.setSalario(3500.00);
		p.corrigirProva();
		
		
		a.setNome("Anderson");
		a.setMedia(8.50);
		
		
		/*System.out.println(p.getNome()+" "+p.getIdade());
	    System.out.println("O salario é: "+p.getSalario());*/
	}

}
