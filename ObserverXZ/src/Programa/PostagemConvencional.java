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
	//não precisamos notificar os observadores dessa mudança no nosso exemplo
	
	}

	


}
