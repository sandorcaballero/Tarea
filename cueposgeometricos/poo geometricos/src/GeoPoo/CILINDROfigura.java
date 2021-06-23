package GeoPoo;

public class CILINDROfigura extends FigurasGeometricas {
	private double area;
	private double rac;
		public CILINDROfigura(double area, double rac) {
			this.area=area;
			this.rac=rac;
			
		}
		@Override
		public void Arealate() {
			double Pb=2*Math.PI*rac;
			double Alate=Pb*area;
			Alate=Math.round(Alate);
			System.out.println("El area lateral es: "+Alate);
			
		}
		
		public void Areatotal() {
			double Pb=2*Math.PI*rac;
			double Al=Pb*area;
			double Ab=Math.PI*Math.pow(rac,2);
			double At=Al+2*Ab;
			At=Math.round(At);
			System.out.println("El area total es: "+At);
		}
		
		public void Volumen() {
			double Ab=Math.PI*Math.pow(rac,2);
			double V=Ab*area;
			V=Math.round(V);
			System.out.println("El Volumen es: "+V);
		}

}
