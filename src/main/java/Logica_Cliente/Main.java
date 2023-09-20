/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;


import Logica_Negocio.Producto;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        //declarar variables 
        String Fecha="";
        String Nombre ="";
        String Codigo= "";
        String  Producto="";
        int Precio=0;
        int Dinero_cliente =0;
        int Descuento=0;
         
        
        //Creacion De Objetos 
        Producto objproducto = new Producto();
        
        //Fijacion De Informacion
        Scanner scan =new Scanner (System.in);
        
        //Pedir y Fijar Informacion De La Compra
        
        System.out.println("digite la fecha");
        Fecha = scan.nextLine();
        objproducto.setFecha(Fecha);
        
        System.out.println("digite el nombre del cliente");
        Nombre= scan.nextLine();
        objproducto.setNombre(Nombre);
        
        System.out.println("digite el codigo del producto ");
        Codigo = scan.nextLine();
        objproducto.setCodigo(Codigo);
        
         System.out.println("digite el nombre del producto");
        Producto= scan.nextLine();
        objproducto.setProducto(Producto);
        
         System.out.println("digite  el valor  del producto");
        Precio= scan.nextInt();
        objproducto.setPrecio(Precio);
        
        System.out.println("digite la cantidad de capital que entrega el cliente ");
        Dinero_cliente= scan.nextInt();
        objproducto.setDinero_cliente(Dinero_cliente);
        
         
        
         System.out.println("si tiene algun descuento diguitelo de lo contrario introduzca el 0 ");
        Descuento = scan.nextInt();
        objproducto.setDescuento(Descuento);
        

        
        //operacion
        int Comver = objproducto.getPrecio() * objproducto.getDescuento() / 100;
        int Devuelta= objproducto.getPrecio()- Comver;
        int  Comver2 = objproducto.getDinero_cliente() - Devuelta ;
        
        //imprecion de datos 
        System.out.println("la fecha  es :                          " + "\t"+objproducto.getFecha());
        System.out.println("el nombre del cliente es :              " + "\t"+objproducto.getNombre());
        System.out.println("el codigo del producto es :              " + "\t"+objproducto.getCodigo());
        System.out.println("el cocepto de la compra es :              " + "\t"+objproducto.getProducto());
        System.out.println("el descuento echo es de :               " + "\t"+ objproducto.getDescuento());
        System.out.println("el precio de la compra con descuento es : " + "\t" + Devuelta);
        System.out.println("su  cambio es :                         " + "\t"+ Comver2);
     
    }
    
}
