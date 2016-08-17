
package sustentacion;

import java.util.Scanner;

public class Sustentacion {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
       int vendido[] = new int[10];
       double ganancia[] = new double[10];
        int n, cont=0;
        Producto producto[] = new Producto[10];
        for(int i=0; i<producto.length;i++){
            producto[i] = new Producto();
        }
        System.out.println("BIENVENIDO A PELUCHITOS.COM");
        do{
            System.out.println("Presione:\n1.Agregar producto\n2.Buscar producto\n3.Eliminar producto\n"
                    + "4.Mostrar inventario\n5.Realizar venta\n6.Mostrar ganancias totales\n7.Salir");
            n=lector.nextInt();
            switch(n){
                case 1:
                    producto[cont].agregarProducto();
                    cont++;
                    System.out.println("El producto ha sido registrado");
                    break;
                case 2:
                    if(cont==0){
                        System.out.println("No hay productos registrados.");
                    }else{
                        System.out.println("Ingrese el nombre del producto: ");
                        String x;
                        x=lector.next();
                        for(int j=0; j<cont; j++){
                            if (producto[j].getNombre().equals(x)){
                                producto[j].mostrar();
                                break;
                                }else{
                                    System.out.println("El producto no está registrado");
                            }break;    
                        }
                    }
                    break;
                case 3:
                    if(cont==0){
                        System.out.println("No hay productos registrados.");
                    }else{
                        System.out.println("Ingrese el nombre del producto: ");
                        String x=lector.next(); 
                        for(int i=0; i<cont; i++){
                            if (producto[i].getNombre().equals(x)){ 
                                cont --;
                                System.out.println("El producto ha sido eliminado correctamente.");
                                for(int j=0; j<cont;j++){
                                    producto[j]=producto[(j+1)];
                                    break;  
                                }
                            }else {
                                System.out.println("El producto no está registrado.");
                                break;
                            }
                        }
                    }
                    break;
                case 4:
                    if(cont==0){
                        System.out.println("No hay productos registrados.");
                    }else{
                        for(int i=0; i<cont; i++){
                            int j=i+1;
                            System.out.println("Pruducto "+j);
                            producto[i].mostrar();
                        }
                    }
                    break;
                case 5:
                    if(cont==0){
                        System.out.println("No hay productos registrados.");
                    }else{
                        System.out.println("Ingrese el nombre del producto: ");
                        String y;
                        y=lector.next();
                        for(int j=0; j<cont; j++){
                            if (producto[j].getNombre().equals(y)){
                                System.out.println("Ingrese la cantidad del producto que desea comprar: ");
                                int q = lector.nextInt();
                                for(int k=0; k<=cont;k++){
                                    if(producto[k].getCantidad()>q){
                                        int cant2 = producto[k].getCantidad();
                                        double retroactivo = producto[k].getPrecio();
                                        cant2 = cant2-q;
                                        retroactivo=retroactivo*q;
                                        producto[k].setCantidad(cant2);
                                        vendido[k]=q;
                                        ganancia[k]=retroactivo;
                                        System.out.println("Su compra ha sido exitosa.");
                                    
                                    }else{
                                        System.out.println("La cantidad que desea comprar es superior a la existente.");
                                    }break;
                                }
                            }else{
                                System.out.println("El producto no está registrado");}
                        }
                        
                    }
                    break;
                case 6:
                    if(cont==0){
                        System.out.println("No hay productos registrados.");
                    }else{
                        for(int i=0;i<cont;i++){
                            int j=i+1;
                            System.out.println("Pruducto "+j);
                            producto[i].mostrar();
                            System.out.println("Cantidad vendida: "+vendido[i]);
                            System.out.println("La ganancia por este producto es:"+ganancia[i]);
                        }
                    }
                    break;
                case 7:
                    System.out.println("GRACIAS POR VISITAR PELUCHITOS.COM VUELVA PRONTO");
            }    
        
        }while(n!=7);
    }
}
