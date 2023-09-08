
package tacotitosbar.model;


public class Item {
    
    private Producto idProducto;
    private Pedido idPedido;
    private int cantidadProducto;
    //constructor
    public Item(Producto idProducto,Pedido idPedido,int cantidadProducto){
        this.idProducto = idProducto;
        this.idPedido = idPedido;
        this.cantidadProducto = cantidadProducto;
    }
    //getter
    public Producto getIdProducto(){
        return idProducto;
    }
    public Pedido getIdPedido(){
        return idPedido;
    }
    public int getCantidadProducto(){
        return cantidadProducto;
    }
    //setter
    public void setNewIdProducto(Producto idProducto){
        this.idProducto = idProducto;
    }
    public void setNewIdPedido(Pedido idPedido){
        this.idPedido = idPedido;
    }
    public void setNewCantidadProducto(int cantidadProducto){
        this.cantidadProducto = cantidadProducto;
    }
}

