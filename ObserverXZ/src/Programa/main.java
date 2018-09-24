//André Xavier e Alexandre Faria
package Programa;

import java.util.Date;

import Observador.ObservadorPostagemEmail;
import Observador.ObservadorPostagemSMS;
import Postagem.PostagemConvencional;
import Postagem.PostagemSedex;

public class main {

	public static void main(String[] args) {
		
		PostagemConvencional postagemConvencional = new PostagemConvencional("Curitiba", "Florianópolis", false);
		ObservadorPostagemSMS obsSmsConv = new ObservadorPostagemSMS(25640);
		postagemConvencional.adicionarObservador(obsSmsConv);
		postagemConvencional.adicionarCaminho("Minas");
		postagemConvencional.setDataHoraPostagem(new Date());
		postagemConvencional.setDestino("Minas");
		postagemConvencional.setDataHoraPostagem(new Date());
		
		PostagemSedex postagemSedex = new PostagemSedex("Curitiba", "Florianópolis", false);
		ObservadorPostagemEmail obsEmailSedex = new ObservadorPostagemEmail("Andre Xavier");
		postagemSedex.adicionarObservador(obsEmailSedex);
		postagemSedex.adicionarCaminho("Joinville");
		postagemConvencional.setDataHoraPostagem(new Date());
		postagemSedex.setDestino("Joinville");
		postagemSedex.setDataHoraPostagem(new Date());
		
	}

}
