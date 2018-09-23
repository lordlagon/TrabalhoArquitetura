package padrao;

import padrao.EnumTipo;

public class FormasFactory implements AbstractFactory {


@Override
public Forma construir(EnumTipo tipo) throws Exception {
	switch(tipo)
	{
	case RetanguloCalc:
		return new RetanguloCalc();
	case QuadradoCalc:
		return new QuadradoCalc();
		
	case TrianguloCalc:
		return new TrianguloCalc();
		
		
	default:
		throw new Exception("A forma não seguiu os padrões");
	}
	
	
}
}
