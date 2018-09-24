package padrao;



public interface AbstractFactory {
	
	public abstract Forma construir(EnumTipo tipo) throws Exception;
	
}
