package Model;
//• O gerente geral aprova empréstimos entre R$50.000 e R$100.000 (inclusive)


public class GerenteGeral extends ResponsavelAprovacao {
	@Override
	public void aprova(Emprestimo emprestimo) {
		if (emprestimo.getValor()<=100000) {
			System.out.println("Emprestimo Aprovado pelo Gerente Geral, no valor de R$ " + emprestimo.getValor()+",00");
		}
		else {
			System.out.println("O emprestimo no valor de R$ " + emprestimo.getValor()+",00 Não Foi Aprovado.");
		}
		
	}
}
