
public class Cono extends FiguraGeometrica{
	private double Radio;
	private double Height;
		
	public Cono(double height, double radius) {
		setHeight(height);
		setRadio(radius);
		this.setTipo(3);
	}
		
	
	public double getRadio() {
		return Radio;
	}
	public void setRadio(double radio) {
		Radio = radio;
	}
	public double getHeight() {
		return Height;
	}
	public void setHeight(double height) {
		Height= height;
	}
	
	/*
	 * Calculos de cono
	 */
	
	 public double calcularArea() {
			return (Math.PI * Math.sqrt(Math.pow(Radio, 2))+ Math.pow(Height, 2)*Radio +(Math.PI*Math.pow(Radio, 2)));
		}
	 public double calcularVolumen() {
		return ((Math.PI*Math.pow(Radio,3)*Height)/3); 
	 }
	 public String toString() {
			return ("Cono con radio: " + Radio + " y altura: " + Height);
		}
}
