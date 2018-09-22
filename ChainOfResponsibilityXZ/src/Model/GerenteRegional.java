package Model;
//• O gerente regional aprova empréstimos entre R$10.000 e R$50.000 (inclusive)

public class GerenteRegional extends ResponsavelAprovacao{
	@Override
	public void aprova(Emprestimo emprestimo) {
		if (emprestimo.getValor()<=50000) {
			System.out.println("Emprestimo Aprovado pelo Gerente Regional, no valor de R$ " + emprestimo.getValor()+",00");
		}
		else if(proximo != null) {
			proximo.aprova(emprestimo);
		}
		
	}
}
