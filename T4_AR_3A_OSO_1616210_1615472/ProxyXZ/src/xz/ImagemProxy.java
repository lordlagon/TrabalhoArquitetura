package xz;

public class ImagemProxy implements Grafico{

	private int altura;
	private int largura;
	private String caminho;
	private Imagem imagem;
	
	public ImagemProxy(String caminho) {
		System.out.println("Construindo um proxy para imagem");
		this.caminho = caminho;
		//inicializar altura e largura
		altura = 0;
		largura = 0;
	}
	
	
	@Override
	public int getAltura() {
		if (imagem == null)
			return altura;
		else
			return imagem.getAltura();
	}

	@Override
	public int getLargura() {
		if (imagem == null)
			return largura;
		else
			return imagem.getLargura();
	}

	@Override
	public String getCaminho() {
		if (imagem == null)
			return caminho;
		else
			return imagem.getCaminho();
	}

	
	
	@Override
	public void desenharImagem() {
		if(imagem == null)
			imagem = new Imagem(caminho);
		imagem.desenharImagem();
	}
	
	
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
}
