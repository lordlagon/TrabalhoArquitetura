package padrao;

public class Quad implements Forma {

	public double area;

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
@Override
	public double calcular(double altura, double largura) {
		area = altura * largura;
		return area;
		
	}



}
