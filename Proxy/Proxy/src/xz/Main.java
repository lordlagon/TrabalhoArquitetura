package xz;

public class Main {

	public static void main(String[] args) {
		
		Grafico g = new ImagemProxy("~/imgs/imagem.png");
		
		System.out.println(g.getAltura());
		System.out.println(g.getLargura());
		System.out.println(g.getCaminho());
		
		g.desenharImagem();
		
	}
	
}
