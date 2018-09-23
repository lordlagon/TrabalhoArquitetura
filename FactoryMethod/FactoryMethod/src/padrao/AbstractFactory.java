package padrao;

import padrao.EnumTipo; 

public interface AbstractFactory {
	
	
	public abstract Forma construir(EnumTipo tipo) throws Exception;
	
	
}
