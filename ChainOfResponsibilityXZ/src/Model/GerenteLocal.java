package Model;

//• O gerente local aprova empréstimos entre R$500 e R$10.000 (inclusive)

public class GerenteLocal extends ResponsavelAprovacao {
	@Override
	public void aprova(Emprestimo emprestimo) {
		if (emprestimo.getValor() <= 10000) {
			System.out.println("Emprestimo Aprovado pelo Gerente Local, no valor de R$ " + emprestimo.getValor()+",00");
		} else if (proximo != null) {
			proximo.aprova(emprestimo);
		}
	}
}
