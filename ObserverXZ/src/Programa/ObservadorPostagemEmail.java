package Programa;
import java.util.Date;
import java.util.Set;


public class ObservadorPostagemEmail implements IObservadorPostagens  {

	
	private String enderecoEnvioEmail;
	
	private Date ultimaHoraPostagemConhecida;
	private String ultimaOrigemConhecida;
	private String ultimoDestinoConhecido;
	private boolean ultimoEstadoEntrega;
	private boolean itemEntregue;
	private PostagemCorreiosObservavel postagemObservada;
	private Set<IObservadorPostagens> caminho;
	private String caminhoatualizado;
	
	
	public ObservadorPostagemEmail(String enderecoEnvioEmail ) 
	{
		this.enderecoEnvioEmail =enderecoEnvioEmail;
	}
	
	private void atualizardados() {
		
		this.ultimaHoraPostagemConhecida = postagemObservada.getDataHoraPostagem();
		this.ultimaOrigemConhecida = postagemObservada.getOrigem();
		this.ultimoDestinoConhecido = postagemObservada.getDestino();
		
		ultimoEstadoEntrega = postagemObservada.isItemEntregue();
	}
	
	
	
	public void atualizar() {
		System.out.println("Enviando um email para " + enderecoEnvioEmail
				+ " com os seguintes conteúdos");
				if(ultimaHoraPostagemConhecida!=postagemObservada.getDataHoraPostagem()) {
				System.out.println("Por algum motivo a data e hora da postagem mudou para "
				+ postagemObservada.getDataHoraPostagem());
				}
				if(!ultimaOrigemConhecida.equals(postagemObservada.getOrigem())) {
				System.out.println("Por algum motivo a origem mudou para "
				+ postagemObservada.getOrigem());
				}
				if(!ultimoDestinoConhecido.equals(postagemObservada.getDestino())) {
				System.out.println("Por algum motivo o destino mudou para "
				+ postagemObservada.getDestino());
				}
		
				if(ultimoEstadoEntrega!=postagemObservada.isItemEntregue()) {
				if(postagemObservada.isItemEntregue() == true)
				System.out.println("Sua encomenda foi entregue!");
				}
				this.atualizardados();
	}

	public void setPostagemObservada(
			PostagemCorreiosObservavel postagemObservada) {
		this.postagemObservada = postagemObservada;
		this.atualizardados();
		
	}
	
	public String getEnderecoEnvioEmail() {
		return enderecoEnvioEmail;
	}

	public void setEnderecoEnvioEmail(String enderecoEnvioEmail) {
		this.enderecoEnvioEmail = enderecoEnvioEmail;
	}

	public Date getUltimaHoraPostagemConhecida() {
		return ultimaHoraPostagemConhecida;
	}

	public void setUltimaHoraPostagemConhecida(Date ultimaHoraPostagemConhecida) {
		this.ultimaHoraPostagemConhecida = ultimaHoraPostagemConhecida;
	}

	public String getUltimaOrigemConhecida() {
		return ultimaOrigemConhecida;
	}

	public void setUltimaOrigemConhecida(String ultimaOrigemConhecida) {
		this.ultimaOrigemConhecida = ultimaOrigemConhecida;
	}

	public String getUltimoDestinoConhecido() {
		return ultimoDestinoConhecido;
	}

	public void setUltimoDestinoConhecido(String ultimoDestinoConhecido) {
		this.ultimoDestinoConhecido = ultimoDestinoConhecido;
	}

	public boolean isUltimoEstadoEntrega() {
		return ultimoEstadoEntrega;
	}

	public void setUltimoEstadoEntrega(boolean ultimoEstadoEntrega) {
		this.ultimoEstadoEntrega = ultimoEstadoEntrega;
	}

	public boolean isItemEntregue() {
		return itemEntregue;
	}

	public void setItemEntregue(boolean itemEntregue) {
		this.itemEntregue = itemEntregue;
	}

	public PostagemCorreiosObservavel getPostagemObservada() {
		return postagemObservada;
	}


}
