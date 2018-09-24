package padrao;



public class FormasFactory implements AbstractFactory {


@Override
public Forma construir(EnumTipo tipo) throws Exception {
	switch(tipo)
	{
	case Retangulo:
		return new Retangulo();
	case Quadrado:
		return new Quadrado();
		
	case Triangulo:
		return new Triangulo();
		
		
	default:
		throw new Exception("A forma não seguiu os padrões");
	}
	
	
}
}
