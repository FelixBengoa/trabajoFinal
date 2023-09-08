
package tacotitosbar.model;

import java.util.ArrayList;
import java.util.List;


public class Mesa {
    private int idMesa;
    private Pedido oPedido;
    //constructor
    public Mesa(int idMesa){
        this.idMesa = idMesa;
    }
    //getters
    public int getIdMesa(){
        return idMesa;
    }
    public Pedido getOpedido(){
        return oPedido;
    }
    //setters
    public void setNewIdMesa(int idMesa){
        this.idMesa = idMesa;
    }
    public void setNewOpedido(Pedido oPedido){
        this.oPedido = oPedido;
    }
    
}
