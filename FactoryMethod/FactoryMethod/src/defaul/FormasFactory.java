package defaul;



public class FormasFactory implements AbstractFactory {


@Override
public Forma construir(EnumTipo tipo) throws Exception {
	switch(tipo)
	{
	case Retan:
		return new Retan();
	case Quad:
		return new Quad();
		
	case Trian:
		return new Trian();
		
		
	default:
		throw new Exception("Essa forma n�o existe,digite novamente");
	}
	
	
}
}
