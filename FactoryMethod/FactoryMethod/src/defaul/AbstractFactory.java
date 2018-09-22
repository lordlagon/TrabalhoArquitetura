package defaul;

import defaul.EnumTipo;

public interface AbstractFactory {
	public abstract Forma construir(EnumTipo tipo) throws Exception;
}
