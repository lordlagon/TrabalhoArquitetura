package Model;

//• O caixa aprova empréstimos de até R$ 500.

public class Caixa extends ResponsavelAprovacao {

	@Override
	public void aprova(Emprestimo emprestimo) {
		if (emprestimo.getValor()<500) {
			System.out.println("Emprestimo Aprovado pelo Caixa, no valor de R$ " + emprestimo.getValor()+",00");
		}
		else if(proximo != null) {
			proximo.aprova(emprestimo);
		}
		
	}

}
