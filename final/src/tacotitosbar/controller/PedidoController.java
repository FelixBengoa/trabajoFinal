package tacotitosbar.controller;

import java.util.ArrayList;
import java.util.List;
import tacotitosbar.model.Pedido;

public class PedidoController {
    //CRUD
    private List<Pedido> Pedidos;
    //constructor del CRUD
    public PedidoController(){
        this.Pedidos = new ArrayList<>();
    }
    //metodo para crear un nuevo producto
    public void crearPedido(Pedido oPedidos){
        this.Pedidos.add(oPedidos);
    }
    //metodo para leer un producto por id
    public Pedido leerPedido(int id){
        for(Pedido pedido : this.Pedidos){
            if(pedido.getIdPedido() == id){
                return pedido;
            }
        }
        return null; //no se encontro pedido
    }
    //metodo para actualizar pedido
    public void actualizarPedido(int id, Pedido nuevoPedido){
        for(int i = 0; i < this.Pedidos.size(); i++){
            if(this.Pedidos.get(i).getIdPedido() == id){
                this.Pedidos.set(i, nuevoPedido);
                return;
            }
        }
    }
    //metodo para eliminar producto por id
    public void eliminarPedido(int id){
        this.Pedidos.removeIf(Pedido -> Pedido.getIdPedido() == id);
    }
    //metodo para listar pedidos
    public List<Pedido> listarPedidos(){
        return Pedidos;
    }
    //metodo para visualizar pedido activo (NO CERRADO) de una mesa
    public void MostrarPedidoAbierto(){
        
    }
}
