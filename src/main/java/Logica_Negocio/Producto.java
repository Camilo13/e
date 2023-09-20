/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author PC
 */
public class Producto {
    //variables
    public String Fecha;
    public String Nombre;
    public String Codigo;
    public String Producto;
    public int Precio;
    public int Dinero_cliente;
    public int Descuento;

   
    //Constructor No Parametrizado
    
    public Producto (){
    }
    
   //Constructor Prametrizado

    public Producto(String Fecha, String Nombre, String Producto, int Precio, int Dinero_cliente, int Descuento) {
        this.Fecha = Fecha;
        this.Nombre = Nombre;
        this.Producto = Producto;
        this.Precio = Precio;
        this.Dinero_cliente = Dinero_cliente;
        this.Descuento = Descuento;
    }
    //setter
   public void setFecha(String Fecha) {
        this.Fecha = Fecha;
      } 

    public void setNombre(String Nombre) {     
        this.Nombre = Nombre;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public void setDinero_cliente(int Dinero_cliente) {
        this.Dinero_cliente = Dinero_cliente;
    }

    //Setter
    public void setDescuento(int Descuento) {
        this.Descuento = Descuento;
    }

    //Getter

    public String getFecha() {
        return Fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getProducto() {
        return Producto;
    }

    public int getPrecio() {
        return Precio;
    }

    public int getDinero_cliente() {
        return Dinero_cliente;
    }

    public int getDescuento() {
        return Descuento;
    }
   
    
    
}
    



