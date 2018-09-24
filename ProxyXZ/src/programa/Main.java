package programa;

import xz.Grafico;
import xz.ImagemProxy;

//Alunos: André Xavier e Alexandre de Faria
public class Main {

	public static void main(String[] args) {
		
		Grafico g = new ImagemProxy("~/imgs/imagem.png");
		
		System.out.println(g.getAltura());
		System.out.println(g.getLargura());
		System.out.println(g.getCaminho());
		
		g.desenharImagem();
		
	}
	
}
