
package proyectone;

/**
 *
 * @author Sergioaldm
 */
import java.util.Scanner;

public class Proyectone {
    
    public static class Producto{

        Scanner entradaAux = new Scanner (System.in);
        private int cantidad, vendidas=0;
        private String nombre;
        private double precio;
        
        public Producto(){
        nombre="nulllllllnnnl";
        precio=0;
        cantidad =0;
        }
        
        public void rein(){
        nombre="nulllllllnnnl";
        precio=0;
        cantidad =0;
        }
        
        public void crear(){
            System.out.println("Por Favor ingrese el NOMBRE del producto:");
            nombre=entradaAux.nextLine();
            System.out.println("Por Favor ingrese la CANTIDAD de producto en unidades:");
            cantidad=entradaAux.nextInt();
            System.out.println("Por Favor ingrese el PRECIO del producto:");
            precio=entradaAux.nextDouble();    
        }

        public int getVendidas() {
            return vendidas;
        }

        public void setVendidas(int vendidas) {
            this.vendidas = vendidas;
        }
        
        
        
        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }
    
    
    
    }
    
    public static void main(String[] args) {
        Scanner entradaEs = new Scanner (System.in);
        int n,aux0, aux3=1,aux5,uno=0;
        String busqueda, aux1, aux4;
        double aux2,aux6,aux7=0;
        Producto total[]=new Producto[100];
        for (int i=0; i < total.length; i++){
        total[i]=new Producto();
        }
        for(int k=0; k<100;){
        System.out.println("TiendaSoft V1.0");
        System.out.println("PROGRAMA PARA LLEVAR A CABO LA CONTABILIDAD");
        System.out.println("---PELUCHITOS.COM---");
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Agregar Producto");
        System.out.println("2. Buscar Producto");
        System.out.println("3. Eliminar Producto");
        System.out.println("4. Mostrar Inventario");
        System.out.println("5. Realizar Venta");
        System.out.println("6. Mostrar Ganancias Totales");
        System.out.println("7. Salir");
        System.out.println("Por favor ingrese la opción deseada:");
        n=entradaEs.nextInt();
        switch (n){
            case 1:
                for(int i=0;i<100;){
                    aux0=total[i].getCantidad();
                    uno=i;
                    if(aux0==0){total[i].crear();
                    break;}
                    else{i++;}                   
                }
                if(uno==100){System.out.println("Error, no se pueden almacenar mas productos es el sistema");};
            break;
                
            case 2:
                 System.out.println("Por favor introdusca el nombre del producto:");
                 busqueda=entradaEs.nextLine();
                for(int i=0;i<100;i++ ){
                    aux1=total[i].getNombre();  
                    if(busqueda.equals(aux1)){
                        aux1=total[i].getNombre();
                        System.out.println(aux1);
                        aux0=total[i].getCantidad();
                        System.out.println(aux0+" Unidades");
                        aux2=total[i].getPrecio();
                        System.out.println("$"+aux2);
                        aux3=1;
                        
                        }
                    else{aux3=0;}
                }
            if(aux3==0){System.out.println("El producto no existe");}
            else{System.out.println("Operacion exitosa");}
            break;
                
            case 3:
                System.out.println("Por favor introdusca el nombre del producto:");
                 busqueda=entradaEs.nextLine();
                for(int i=0;i<100;i++ ){
                    aux1=total[i].getNombre();  
                    if(busqueda.equals(aux1)){
                        total[i].rein();
                        aux3=1;                       
                        }
                    else{aux3=0;}
                }
            if(aux3==0){System.out.println("El producto no existe");}
            else{System.out.println("Operacion exitosa");}
            break;
                
            case 4:
                 for(int i=0;i<100;i++ ){
                    aux1=total[i].getNombre();  
                    aux4="nulllllllnnnl";
                    if (aux1.equals(aux4)) {                       }
                    else{
                     aux1=total[i].getNombre();
                        System.out.println(aux1);
                        aux0=total[i].getCantidad();
                        System.out.println(aux0+" Unidades");
                        aux2=total[i].getPrecio();
                        System.out.println("$"+aux2);
                        
                    }
                }
            break;
                
            case 5:
                System.out.println("Por favor introdusca el nombre del producto:");
                busqueda=entradaEs.nextLine();
                for(int i=0;i<100;i++ ){
                    aux1=total[i].getNombre();  
                    if(busqueda.equals(aux1)){
                        System.out.println("Por favor digite el número de productos a vender:");
                        aux0=entradaEs.nextInt();
                        aux5=total[i].getCantidad();
                        aux5=aux5-aux0;
                        if (aux5<0){System.out.println("No hay suficientes unidades de ese producto");}
                        else{
                            total[i].setCantidad(aux5);
                            aux5=total[i].getVendidas();
                            aux5=aux5+aux0;
                            total[i].setVendidas(aux5);
                        }
                        aux3=1;
                        
                        }
                    else{aux3=0;}
                }
            if(aux3==0){System.out.println("El producto no existe");}
            else{System.out.println("Operacion exitosa");}
            break;
                
            case 6:
                for(int i=0;i<100;i++ ){
                    aux1=total[i].getNombre();  
                    aux4="nulllllllnnnl";
                    if (aux1.equals(aux4)) { aux6=0;}
                    else{
                    aux0=total[i].getVendidas();
                    aux2=total[i].getPrecio();
                    aux6=aux2*aux0;
                    System.out.println(aux1);
                    System.out.println(aux0+" Productos vendidos");
                    System.out.println("$"+aux6);
    
                    }
                    aux7=aux7+aux6;
                }
            System.out.println("El Total de Ganancias Alcanzado es:");
            System.out.println("$"+aux7);
            break;
                
            default: 
                System.out.println("Error. Por favor verifique el numero ingresado");
            break;

        }
        
    }
    
    } 
}
