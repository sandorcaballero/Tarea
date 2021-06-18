package Empresa;

public class CarroMain {

	public static void main(String[] args) {
		Carro Automovil = new Carro("BMW",2018,200000,500,"Danilo");
		//Automovil.Tipo = "BMW";
		//Automovil.Modelo = 2018;
		//Automovil.Precio = 200000;
		//Automovil.KmsConducidos = 500;
		System.out.println("precio Actual del vehiculo: "+Automovil.CalcularPrecio());
		System.out.println("Propietario del vehiculo 1: "+Automovil.Propiedad);
		Carro OtroAutomovil = new Carro();
		OtroAutomovil.Tipo = "Toyota";
		OtroAutomovil.Modelo = 2015;
		OtroAutomovil.Precio = 150000;
		OtroAutomovil.KmsConducidos = 350;
		OtroAutomovil.Propiedad = "Danilo";
		System.out.println("precio Actual del otro vehiculo: "+OtroAutomovil.CalcularPrecio());
		System.out.println("Propietario del vehiculo 2: "+OtroAutomovil.Propiedad);
	}

}
