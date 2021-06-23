package GeoPoo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
static Scanner lector=new Scanner(System.in);
	public static void main(String[] args) {
		double cilindro,radio,altura,nlados,medidasl;
		Scanner lec = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
	    boolean salir = false;
	    int opcion;
	    while (!salir) {
	    	System.out.println("porfavor elija que figara geometrica desea.");
	    	System.out.println("1. Cilindro");
	        System.out.println("2. Prisma");
	        System.out.println("3. Salir");
	        try{
	        	System.out.println("Igresar la opcion deseada: ");
	            opcion = lec.nextInt();
	            switch (opcion) {
	            case 1:
	            	System.out.println(" Favor de Ingrese el radio de las bases.");
	    			radio=lector.nextDouble();
	    			System.out.println("Favor de Ingrese la altura del cilindro.");
	    			cilindro=lector.nextDouble();
	    			CILINDROfigura obj=new CILINDROfigura(radio,cilindro);
	    			obj.Arealate();
	    			System.out.println();
	    			obj.Areatotal();
	    			System.out.println();
	    			obj.Volumen();
	    			System.out.println();
	    			break;
	            case 2:
	            	System.out.println("Favor de Ingrese la altura del prisma");
	    			altura=lector.nextDouble();
	    			System.out.println("Favor de Ingrese el numero de lados");
	    			nlados=lector.nextDouble();
	    			System.out.println("Favor de Ingrese el grosor de los lados");
	    			medidasl=lector.nextDouble();
	    			PRISMAfigura obj2=new PRISMAfigura(altura,nlados,medidasl);
	    			obj2.Arealate();
	    			System.out.println();
	    			obj2.Areatotal();
	    			System.out.println();
	    			obj2.Volumen();
	    			System.out.println();
	    			break;
	            case 3:
                    salir=true;
                    break;
                default:
                    System.out.println("Las opciones son entre 1 y 3");
	            }
	        
	        }catch(InputMismatchException e){
	            System.out.println("Debes escribir un numero");
	            sn.next();
	        }

	    }
	    System.out.println("Fin del menu");

	}
		
}
