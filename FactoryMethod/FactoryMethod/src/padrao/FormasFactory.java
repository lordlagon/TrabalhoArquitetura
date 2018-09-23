package padrao;



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
		throw new Exception("A forma não seguiu os padrões");
	}
	
	
}
}
