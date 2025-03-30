
package pack;

public class Tienda {
    public static void main(String[] args) {
        Producto cableLan = new Producto();
        cableLan.setNombre("Cable lan");
        cableLan.setPrecio(90);
        cableLan.setCantidad(30);
        
        String nom1 = cableLan.getNombre();
        double pre1 = cableLan.getPrecio();
        int cant1 = cableLan.getCantidad();
        
        Producto tv = new Producto();
        tv.setNombre2("Television");
        tv.setPrecio2(7000);
        tv.setCantidad2(10);
        
        String nom2 = tv.getNombre2();
        double pre2 = tv.getPrecio2();
        int cant2 = tv.getCantidad2();
        
        Producto camaras = new Producto();
        camaras.setNombre3("Camara de vigilancia");
        camaras.setPrecio3(3000);
        camaras.setCantidad3(20);
        
        String nom3 = camaras.getNombre3();
        double pre3 = camaras.getPrecio3();
        int cant3 = camaras.getCantidad3();
        
        cableLan.operandos(cant1,cant2,cant3,pre1,pre2,pre3);
        tv.operandos(cant1, cant2, cant3, pre1, pre2, pre3);
        camaras.operandos(cant1, cant2, cant3, pre1, pre2, pre3);
        
        
        double totcable = cableLan.suma1();
        double tottv = tv.suma2();
        double totcam = camaras.suma3();
        
        System.out.println("producto 1: "+nom1+"\nsu precio individual es: "+pre1+"\nlos articulos en inventario son: "+cant1+"\nel total de todo es: "+totcable);
        System.out.println("\nproducto 2: "+nom2+"\nsu precio individual es: "+pre2+"\nlos articulos en inventario son: "+cant2+"\nel total de todo es: "+tottv);
        System.out.println("\nproducto 3: "+nom3+"\nsu precio individual es: "+pre3+"\nlos articulos en inventario son: "+cant3+"\nel total de todo es: "+totcam);
      
    }
    
}
