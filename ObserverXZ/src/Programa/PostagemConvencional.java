package Programa;

public class PostagemConvencional extends PostagemCorreiosObservavel {
	
	private boolean embalagemFragil;

	public PostagemConvencional(String origem, String destino,
			boolean embalagemFragil) {
		super(origem,destino);
		this.embalagemFragil = embalagemFragil;
	}
	public boolean isEmbalagemFragil() {
	return embalagemFragil;
	}
	public void setEmbalagemFragil(boolean embalagemFragil) {
	this.embalagemFragil = embalagemFragil;
	//n�o precisamos notificar os observadores dessa mudan�a no nosso exemplo
	
	}

	


}
