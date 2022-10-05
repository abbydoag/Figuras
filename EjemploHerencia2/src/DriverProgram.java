import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Abby Donis
 *
 */
public class DriverProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Programa de figuras gemetricas");
		Scanner in = new Scanner(System.in);
		ArrayList<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();
		
		int opt = 1;
		
		do {
			
			System.out.println("Seleccione la figura");
			System.out.println("1. Circulo");
			System.out.println("2. Rectangulo");
			System.out.println("3. Triangulo");
			System.out.println("4. Cono");
			System.out.println("5. Mostrar");
			System.out.println("6. Salir");
			
			opt = Integer.parseInt(in.nextLine());
			
			switch (opt) {
			case 1:{
				
				System.out.println("Ingrese el radio");
				double elRadio = Double.parseDouble(in.nextLine());
				figuras.add(new Circulo(elRadio));
				
			}break;
			
			case 2:{
				System.out.println("Ingrese base");
				double laBase = Double.parseDouble(in.nextLine());
				System.out.println("Ingrese altura");
				double laAltura = Double.parseDouble(in.nextLine());
				figuras.add(new Rectangulo(laBase, laAltura));
			}break;
			
			case 3:{
				System.out.println("Ingrese lado 1");
				double Lado_1 = Double.parseDouble(in.nextLine());
				System.out.println("Ingrese lado 2");
				double Lado_2 = Double.parseDouble(in.nextLine());
				System.out.println("Ingrese lado 3");
				double Lado_3 = Double.parseDouble(in.nextLine());
				System.out.println("Ingrese base");
				double base_ = Double.parseDouble(in.nextLine());
				System.out.println("Ingrese altura");
				double altura_ = Double.parseDouble(in.nextLine());
				figuras.add(new Triangulo(Lado_1,Lado_2,Lado_3, base_, altura_));
			}break;
			case 4:{
				System.out.println("Ingrese altura");
				double height = Double.parseDouble(in.nextLine());
				System.out.println("Ingrese radio");
				double radius = Double.parseDouble(in.nextLine());
				figuras.add(new Cono(height,radius));
			}break;
			case 5:{
				MostrarFiguras(figuras);
			}break;
			
			case 6:{
				
			}break;
			
			default:{
				System.out.println();
			}break;
			
			}
			
		}while(opt != 5);
		

	}
	
	public static void MostrarFiguras(ArrayList<FiguraGeometrica> _figuras) {
		
		for (FiguraGeometrica figura: _figuras) {
			System.out.println("*-*-*-*-*-*~~*-*-*-*-*-*~~*-*-*-*-*-*");
			System.out.println(figura.toString());
			System.out.println("Perimetro: " + figura.calcularPerimetro());
			
			figura.toString();
			System.out.println("Area: " + figura.calcularArea());
			
			figura.toString();
			System.out.println("Volumen: "+figura.calcularVolumen());
		}
	}

}
