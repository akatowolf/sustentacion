
package sustentacion;

import java.util.Scanner;

public class Producto {
    private Scanner lector;
    private String nombre;
    private double precio;
    private int cantidad, ventas;
    
    public void agregarProducto(){
        lector = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        nombre = lector.next();
        System.out.println("Ingrese la cantidad del producto: ");
        cantidad = lector.nextInt();
        System.out.println("Ingrese el precio del producto: ");
        precio = lector.nextDouble();
    }

    public String getNombre() {
        return nombre;
    }
    
    public void mostrar(){
        System.out.println("Producto: "+nombre+"\nPrecio: "+precio+"\nCantidad: "+cantidad);
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public double getPrecio() {
        return precio;
    }
    
  
    
    
}
