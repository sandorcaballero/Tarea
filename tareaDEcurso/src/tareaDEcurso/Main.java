package tareaDEcurso;
import java.util.Scanner;
import java.util.Vector;





public class Main {
	static Scanner lector = new Scanner(System.in);
	static String nombre;
	static double precio;
	static int opcion,stock,codigo;	
	static Scanner reinicio = new Scanner(System.in);
	public static void main(String[] args) {

        Productos pro;
        Vector vproductos = new Vector();
        
          
            try {
        	
        	do{
            System.out.println("Inventario De Productos ");
            System.out.println( "");
            System.out.println("-1-Registrar Producto.");
            System.out.println("-2-Registrar Venta.");
            System.out.println("-3-Ver productos.");
            System.out.println("-4-Salir del inventario");
            opcion = lector.nextInt();
            
            
            switch(opcion){
                case 1:
                    	 System.out.print("Ingresar Codigo Del Producto: ");
                     codigo = lector.nextInt();
                     
                     System.out.print("Ingresar Nombre Del Producto: ");
                     nombre = lector.next();
                     System.out.print("Ingresar Precio Del Producto: ");
                     precio = lector.nextDouble();
                     System.out.print("Ingresar La Cantidad De Producto Existente(Stock): ");
                     stock = lector.nextInt();
                     pro = busquedas(codigo, vproductos);
                     if(pro==null){
                        vproductos.addElement(new Productos(codigo,nombre,precio,stock));
                        System.out.println("----------------------------------------");
                        
                        System.out.println("Producto agregado");
                        
                        System.out.println("----------------------------------------");
                     }
                     else
                         System.out.print("ya existe este producto");
                         
                    break;
                    
                case 2:  
                     System.out.print("Favor ingresar Codigo del producto: ");
                     codigo = lector.nextInt();
                     pro = busquedas(codigo,vproductos);
                     if(pro!=null){
                         if(pro.getStock() > 0){ 
                            pro.setStock(pro.getStock() - 1);
                            System.out.print("La Venta se realizo con exito");
                            pro.mostrarResultado();
                         }
                         else
                             System.out.print("Sin stock");
                     }
                     else 
                        System.out.print("Producto inexistente");
                     
                    break;
                    
                case 3:
                     System.out.print("Favor ingresar codigo: ");
                     codigo = lector.nextInt();
                     pro = busquedas(codigo,vproductos);
                     if(pro!=null)
                        pro.mostrarResultado();
                     else 
                        System.out.print("Producto inexistente");                     
                    break;
                    
                case 4:
                    break;
                    
                default: System.out.println("favor ingresar opcion de menu");
            }       
        }while(opcion!= 4);
        	break;
				
			} catch (Exception e) {
				
				System.out.println("no ingresaste la opcion correcta");
				System.out.println("porfavor ingrese una opcion indicada");
			} 
    
          
        
	}
	
	
	
	
	 private static Productos busquedas(int codigo, Vector productos){
	        boolean b = false;
	        Productos p,retornP = null;
	        for(int x = 0; x < productos.size(); x++){ 
	            p = (Productos) productos.elementAt(x);
	            if(p.getCodigo() == codigo)
	                retornP = p;
	        }
	        return retornP;
	    }
        
        
    
		
	

}

	



	


