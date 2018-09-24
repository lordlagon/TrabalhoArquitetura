//Alunos: André Xavier e Alexandre de Faria

package Programa;
import java.util.Scanner;

import Model.Caixa;
import Model.Emprestimo;
import Model.GerenteGeral;
import Model.GerenteLocal;
import Model.GerenteRegional;
import Model.ResponsavelAprovacao;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ResponsavelAprovacao caixa = new Caixa();
			ResponsavelAprovacao gLocal = new GerenteLocal();
			ResponsavelAprovacao gRegional = new GerenteRegional();
			ResponsavelAprovacao gGeral = new GerenteGeral();
			
			caixa.setProximo(gLocal);
			gLocal.setProximo(gRegional);
			gRegional.setProximo(gGeral);
			
			
			System.out.println("Digite o valor do empréstimo: ");
			Scanner entrada = new Scanner(System.in);
			Emprestimo emprestimo = new Emprestimo(entrada.nextInt());
			caixa.aprova(emprestimo);
	}

}
