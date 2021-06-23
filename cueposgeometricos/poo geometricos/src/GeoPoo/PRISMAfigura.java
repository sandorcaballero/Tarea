package GeoPoo;

public class PRISMAfigura extends FigurasGeometricas{
	
	private double altura;
	private double nlados;
	private double medidasl;
	public  PRISMAfigura(double altura, double nlados, double medidasl) {
		this.altura=altura;
		this.nlados=nlados;
		this.medidasl=medidasl;
		
	}
		public void Arealate() {
		System.out.println("El area lateral es: "+(altura*nlados*medidasl));
	}
	
		public void Areatotal() {
		double angulo=180/altura;
		double nd= 2*(Math.tanh(angulo));
		double ap=nlados/nd;
		double peri=medidasl*nlados;
		double Abase=(peri*ap)/2;
		double Atotal=altura+2*Abase;
		Atotal=Math.round(Atotal);
		System.out.println("El area total es: "+Atotal);
		}
		public void Volumen() {
		double ang=180/medidasl;
		double dna= 2*(Math.tanh(ang));
		double ap=nlados/dna;
		double p=medidasl*nlados;
		double Ab=(p*ap)/2;
		double volumen=Ab*altura;
		volumen=Math.round(volumen);
		System.out.println("El Volumen es: "+volumen);
	}


}
