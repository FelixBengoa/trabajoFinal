
package tacotitosbar.model;

public class Producto {
    private String nombre;
    private String descripcion;
    private float costo;
    private float precio;
    private boolean elaborado;
    private int idProducto;
    private int stock;
    //constructor
    public Producto(String nombre, String descripcion, float costo,float precio,boolean elaborado, int idProducto,int stock){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.precio = precio;
        this.elaborado = elaborado;
        this.idProducto = idProducto;
        this.stock = stock;
    }
    //getters
    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public float getCosto(){
        return costo;
    }
    public float getPrecio(){
        return precio;
    }
    public boolean getElaborado(){
        return elaborado;
    }
    public int getIdProducto(){
        return idProducto;
    }
    public int getStock(){
        return stock;
    }
    //setters
    public void setNewNombre(String Nombre){
        this.nombre = Nombre;
    }
    public void setNewDescripcion(String Descripcion){
        this.descripcion = Descripcion;
    }
    public void setNewCosto(float Costo){
        this.costo = Costo;
    }
    public void setNewPrecio(float Precio){
        this.precio = Precio;
    }
    public void setNewElaborado(boolean elaborado){
        this.elaborado = elaborado;
    }
    public void setNewIdPedido(int IdProducto){
        this.idProducto = IdProducto;
    }
    public void setNewStock(int Stock){
        this.stock = Stock;
    }
}
