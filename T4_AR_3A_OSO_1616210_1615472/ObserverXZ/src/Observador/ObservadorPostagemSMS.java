package Observador;

import java.util.Date;
import java.util.Set;

import Postagem.PostagemCorreiosObservavel;

public class ObservadorPostagemSMS implements IObservadorPostagens {

	private PostagemCorreiosObservavel postagemObservada;
	private int numeroEnvioSMS;
	
	private Date ultimaHoraPostagemConhecida;
	private String ultimaOrigemConhecida;
	private String ultimoDestinoConhecido;
	private boolean ultimoEstadoEntrega;
	private Set<IObservadorPostagens> caminhos;
	private String Caminho;

	public ObservadorPostagemSMS(int numeroEnvioSMS) {
		super();
		this.numeroEnvioSMS = numeroEnvioSMS;
	}

	public void setPostagemObservada(PostagemCorreiosObservavel postagemObservada) {
		this.postagemObservada = postagemObservada;
		this.atualizarDados();
	}

	public void atualizar() {
		System.out.println("Enviando um SMS para " + numeroEnvioSMS + " com os seguintes conte�dos");
		if (ultimaHoraPostagemConhecida != postagemObservada.getDataHoraPostagem()) {
			System.out.println(
					"Por algum motivo a data e hora da postagem mudou para " + postagemObservada.getDataHoraPostagem());
		}
		if (!ultimaOrigemConhecida.equals(postagemObservada.getOrigem())) {
			System.out.println("Por algum motivo a origem mudou para " + postagemObservada.getOrigem());
		}
		if (!ultimoDestinoConhecido.equals(postagemObservada.getDestino())) {
			System.out.println("Por algum motivo o destino mudou para " + postagemObservada.getDestino());
		}

		System.out.println("Sua encomenda esta passando por "
				+ postagemObservada.getCaminhos().get(postagemObservada.getCaminhos().size() - 1));

		if (ultimoEstadoEntrega != postagemObservada.isItemEntregue()) {
			if (postagemObservada.isItemEntregue() == true)
				System.out.println("Sua encomenda foi entregue!");
		}
		this.atualizarDados();
	}

	private void atualizarDados() {
		this.ultimaHoraPostagemConhecida = postagemObservada.getDataHoraPostagem();
		this.ultimaOrigemConhecida = postagemObservada.getOrigem();
		this.ultimoDestinoConhecido = postagemObservada.getDestino();
		ultimoEstadoEntrega = postagemObservada.isItemEntregue();
	}

	public Set<IObservadorPostagens> getCaminhos() {
		return caminhos;
	}

	public void setCaminhos(Set<IObservadorPostagens> caminhos) {
		this.caminhos = caminhos;
	}

	public String getCaminho() {
		return Caminho;
	}

	public void setCaminho(String caminho) {
		Caminho = caminho;
	}

}
