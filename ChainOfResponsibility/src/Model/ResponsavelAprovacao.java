package Model;

public abstract class ResponsavelAprovacao {
	protected ResponsavelAprovacao proximo;
	
	public void setProximo(ResponsavelAprovacao proximo) {
		this.proximo =  proximo;
	}
	
	public abstract void aprova(Emprestimo emprestimo);
}
