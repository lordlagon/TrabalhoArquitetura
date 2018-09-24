package padrao;

public class Triangulo implements Forma {

	public double area;

	@Override
	public double calcular(double altura, double largura) {
		area = ((largura *altura) /2);
		return area = getArea();
		
		
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public double getArea() {
		return area;
	}

}
