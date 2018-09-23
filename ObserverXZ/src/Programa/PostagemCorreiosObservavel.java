package Programa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class PostagemCorreiosObservavel {
	private Date dataHoraPostagem;
	private String origem;
	private String destino;
	private String Caminho;
	private Set<IObservadorPostagens> observadores;
	private boolean itemEntregue;
	
	private ArrayList<String> caminhos = new ArrayList<String>();

	public ArrayList<String> getCaminhos() {
		return caminhos;
	}

	public PostagemCorreiosObservavel(String origem, String destino) {
		dataHoraPostagem = new Date();
		observadores = new HashSet<IObservadorPostagens>();
		this.origem = origem;
		this.destino = destino;
		itemEntregue = false;
	}

	public void adicionarObservador(IObservadorPostagens observador) {
		observadores.add(observador);
		observador.setPostagemObservada(this);
	}
	public void adicionarCaminho(String Caminho) {
		caminhos.add(Caminho);
		this.notificar();
	}
	

	public String getCaminho() {
		return Caminho;
	}

	public void setCaminho() {
		this.Caminho= Caminho;
		this.notificar();
		
	}
	
	public void removerObservador(IObservadorPostagens observador) {
		observadores.remove(observador);
	}

	public void notificar() {
		for (IObservadorPostagens o : observadores) {
			o.atualizar();
		}
	}

	public Date getDataHoraPostagem() {
		return dataHoraPostagem;
	}

	public void setDataHoraPostagem(Date dataHoraPostagem) {
		this.dataHoraPostagem = dataHoraPostagem;
		this.notificar();
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
		this.notificar();
	}

	public boolean isItemEntregue() {
		return itemEntregue;
	}

	public void setItemEntregue(boolean itemEntregue) {
		this.itemEntregue = itemEntregue;
		this.notificar();
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
		this.notificar();
	}





}
