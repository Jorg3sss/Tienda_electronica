
package pack;


public class Producto {
    
    private int operando1,operando3,operando5;
    private double operando2,operando4,operando6;
    
    public void operandos(int cant1, int cant2, int cant3, double pre1, double pre2, double pre3){
        operando1 = cant1;
        operando2 = pre1;
        operando3 = cant2;
        operando4 = pre2;
        operando5 = cant3;
        operando6 = pre3;
    }
    
    public double suma1(){
        return operando1*operando2;
    }
    
    public double suma2(){
        return (operando4*operando3);
    }
    
    public double suma3(){
        return operando5*operando6;
    }
    
    public void hola(){
        double j =  operando5*operando6;
        j =  operando5*operando6;
        j =  operando5*operando6;
        System.out.println("Hola");
    }
    
     public double resta(){
         return operando2 - operando1;
     }
     
     public double resta2(){
         return operando2 - operando3;
     }
     
     public double resta3(){
         return operando2 - operando3;
     }
    
    private String nombre,nombre2,nombre3;
    private double precio,precio2,precio3;
    private int cantidad,cantidad2,cantidad3;
    
    public String getNombre(){
        return nombre;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public int getCantidad(){
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre2() {
        return nombre2;
    }

    public double getPrecio2() {
        return precio2;
    }

    public int getCantidad2() {
        return cantidad2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public void setPrecio2(double precio2) {
        this.precio2 = precio2;
    }

    public void setCantidad2(int cantidad2) {
        this.cantidad2 = cantidad2;
    }

    public String getNombre3() {
        return nombre3;
    }

    public double getPrecio3() {
        return precio3;
    }

    public int getCantidad3() {
        return cantidad3;
    }

    public void setNombre3(String nombre3) {
        this.nombre3 = nombre3;
    }

    public void setPrecio3(double precio3) {
        this.precio3 = precio3;
    }

    public void setCantidad3(int cantidad3) {
        this.cantidad3 = cantidad3;
    }
    
}
