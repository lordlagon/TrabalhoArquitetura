package defaul;

import java.util.Scanner;

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
			Trian t = new Trian();
			Forma trian = factory.construir(EnumTipo.Trian);
			
			System.out.println("Digite altura");
			altura = entrada.nextDouble();
			System.out.println("Digite largura");
			
			largura = entrada.nextDouble();
			
			trian.calcular(altura, largura);
			
			
			System.out.print("A area do triangulo é :" + t.calcular(altura, largura));
			break;
		case 2:
			Quad q = new Quad();
			Forma quad = factory.construir(EnumTipo.Quad);
			
			System.out.println("Digite altura");
			altura = entrada.nextDouble();
			System.out.println("Digite largura");
			
			largura = entrada.nextDouble();
			
			quad.calcular(altura, largura);
			
			
			System.out.print("A area do triangulo é :" + q.calcular(altura, largura));
			break;
		case 3:
			Retan r = new Retan();
			Forma retan = factory.construir(EnumTipo.Retan);
			
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
