package programa;

import java.util.Scanner;

import padrao.EnumTipo;
import padrao.Forma;
import padrao.FormasFactory;
import padrao.Quadrado;
import padrao.Retangulo;
import padrao.Triangulo;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		double altura= 0;
		double largura = 0;

		FormasFactory factory = new FormasFactory();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite qual modelo deseja calular");
		System.out.println("1 - Para calcular Triangulo");
		System.out.println("2 - Para calcular Quadrado");
		System.out.println("3 - Para calcular Retrangulo");
		int tipo = entrada.nextInt();
		
		switch (tipo) {
		case 1:
			Triangulo t = new Triangulo();
			Forma trian = factory.construir(EnumTipo.Triangulo);
			
			System.out.println("Digite altura");
			altura = entrada.nextDouble();
			System.out.println("Digite largura");
			
			largura = entrada.nextDouble();
			
			trian.calcular(altura, largura);
			
			
			System.out.print("A area do triangulo é :" + t.calcular(altura, largura));
			break;
		case 2:
			Quadrado q = new Quadrado();
			Forma quad = factory.construir(EnumTipo.Quadrado);
			
			System.out.println("Digite altura");
			altura = entrada.nextDouble();
			System.out.println("Digite largura");
			
			largura = entrada.nextDouble();
			
			quad.calcular(altura, largura);
			
			
			System.out.print("A area do triangulo é :" + q.calcular(altura, largura));
			break;
		case 3:
			Retangulo r = new Retangulo();
			Forma retan = factory.construir(EnumTipo.Retangulo);
			
			System.out.println("Digite altura");
			altura = entrada.nextDouble();
			System.out.println("Digite largura");
			
			largura = entrada.nextDouble();
			
			retan.calcular(altura, largura);
			System.out.print("A area do Retangulo é :" + r.calcular(altura, largura) );
		break;

		default:
			break;
		}
		
	}

}
