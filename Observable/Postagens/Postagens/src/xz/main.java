package xz;

import java.util.Date;

public class main {

	public static void main(String[] args) {
		
		
		//setando valores no tipo respctivo de envio
		PostagemConvencional postagemConvencional = new PostagemConvencional("Curitiba",
				"Florian�polis", false);
		
		//PostagemSedex postagemSedex = new PostagemSedex("Curitiba",
		//		"Florian�polis", false);
	
		//chamando os observadores existente
				ObservadorPostagemSMS observador1sms = new ObservadorPostagemSMS(12345);
				//ObservadorPostagemEmail observado1email = new ObservadorPostagemEmail("daniela");

				
				postagemConvencional.adicionarCaminho("alterar");
		//adicionando os observadores 		
				postagemConvencional.adicionarObservador(observador1sms);
			//	postagemSedex.adicionarObservador(observado1email);
			//setando valores de altera��o
				
				postagemConvencional.setDestino("Minas");
				
				
				//setando data e hora atual
				postagemConvencional.setDataHoraPostagem(new Date());
		}

}
