package tareaDEcurso;

public class Productos {
	int c;
	int s;
    double p;
    String n;
    
    Productos(int codigo, String producto, double precio, int stock){
        c = codigo;
        n = producto;
        p = precio;
        s = stock;
    }
    public void setStock(int stock){
        s = stock;
    }
    public int getCodigo(){
        return c;
    }
    public int getStock(){
        return s;
    }
    public void mostrarResultado(){
        System.out.println("---------------");
        System.out.println("Producto ="+n);
        System.out.println("Precio ="+p);
        System.out.println("Stock ="+s);
        System.out.println("---------------");

    }
    
}
