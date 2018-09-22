package xz;

public class Imagem implements Grafico{
	
	private int altura;
	private int largura;
	private String caminho;
	//private Byte binarioImagem;
	
	public Imagem(String caminho) {
		System.out.println("Construindo uma imagem Real ");
		this.caminho = caminho;
		//inicializar altura e largura
		altura = 0;
		largura = 0;
		//carregar binario
				
	}
	
	
	@Override
	public int getAltura() {
		return altura;
	}
	
	@Override
	public int getLargura() {
		return largura;
	}
	@Override
	public String getCaminho() {
		return caminho;
	}
	
	
	
	@Override
	public void desenharImagem() {
		System.out.println("Desenhando imagem");
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
