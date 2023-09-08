
package tacotitosbar.controller;

import java.util.ArrayList;
import java.util.List;
import tacotitosbar.model.Producto;

public class ProductoController {
    //CRUD
    private List<Producto> Productos;
    //constructor del crud
    public ProductoController(){
            Productos = new ArrayList<>();
    }
    //metodo para crear un nuevo producto
    public void crearProducto(Producto producto){
        Productos.add(producto);
    }
    //metodo para leer un producto por id
    public Producto leerProducto(int id){
        for (Producto producto : Productos){
           if(producto.getIdProducto() == id){
              return producto;
              }
        }
        return null; //producto no encontrado
    }
    //metodo para actualizar productos
    public void actualizarProducto(int id, Producto nuevoProducto){
        for (int i = 0; i < Productos.size(); i++){
            if(Productos.get(i).getIdProducto()==id){
                Productos.set(i,nuevoProducto);
                return;
            }
        }
    }
    //metodo para eliminar un producto por id 
    public void eliminarProducto(int id){
        Productos.removeIf(Producto -> Producto.getIdProducto()==id);
    }
    //metodo para listar todos los productos
    public List<Producto> listarProductos(){
        return Productos;
    }
}
