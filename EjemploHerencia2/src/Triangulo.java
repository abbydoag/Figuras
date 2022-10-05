
public class Triangulo extends FiguraGeometrica{
	
	private double Base;
	private double Altura;
	private double Lado1;
	private double Lado2;
	private double Lado3;
	
	public Triangulo(double base_, double altura_, double Lado_1, double Lado_2, double Lado_3) {
		setBase(base_);
		setAltura(altura_);
		setLado1(Lado_1);
		setLado2(Lado_2);
		setLado3(Lado_3);
		this.setTipo(2);
	}
	
	public double getLado1() {
		return Lado1;
	}

	public void setLado1(double lado1) {
		Lado1 = lado1;
	}

	public double getLado2() {
		return Lado2;
	}

	public void setLado2(double lado2) {
		Lado2 = lado2;
	}

	public double getLado3() {
		return Lado3;
	}

	public void setLado3(double lado3) {
		Lado3 = lado3;
	}
	public double getBase() {
		return Base;
	}
	public void setBase(double base) {
		this.Base = base;
	}
	
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		this.Altura = altura;
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	/*
	 * Calculos de triangulo
	 */
	 public double calcularPerimetro() {
		 return (Lado1+Lado2+Lado3);
	 }
	 public double calcularArea() {
		 return ((Base*Altura)/2.00);
	 }
	 
	 public String toString() {
			return ("Triangulo con base: " + Base + " y altura: " + Altura);
		}
	 
	
}
