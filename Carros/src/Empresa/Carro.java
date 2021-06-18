package Empresa;

public class Carro {

	String Tipo;
	int Modelo;
	double Precio;
	double KmsConducidos;
	static String Propiedad;
	
	public Carro(String Tipo, int Modelo, double Precio, double KmsConducidos,String Propiedad) {
		this.Tipo = Tipo;
		this.Modelo = Modelo;
		this.Precio = Precio;
		this.KmsConducidos = KmsConducidos;
		this.Propiedad = Propiedad;
		System.out.println("Clase creada");
	}
	public Carro() {
		System.out.println("Clase 2 creada");
	}
	double CalcularPrecio() {
		double nuevoPrecio = Precio-(KmsConducidos*100);
		return nuevoPrecio;
	}
}
