
package tacotitosbar.controller;

import java.util.ArrayList;
import java.util.List;
import tacotitosbar.model.Mesa;
import tacotitosbar.model.Pedido;


public class MesaController {
    //CRUD
    private List<Mesa> Mesas;
    //constructor
    public MesaController(){
        Mesas = new ArrayList<>();
    }
    //metodo para crear nueva mesa // preguntarle al profe por oPedido
    public void crearMesa(int idMesa){
        Mesa mesa = new Mesa(idMesa);
        Mesas.add(mesa);
    }
        //metodo para leer mesa por id
        public Mesa leerMesa(int Mesa){
            for (Mesa mesa : Mesas){
                if(mesa.getIdMesa() == Mesa){
                    return mesa;
                }
            }
            return null; // mesa no encontrada
        }
        //metodo para actualizar el pedido de una mesa
        public void actualizarPedido(int idMesa, Pedido nuevoPedido){
            Mesa mesa = leerMesa(idMesa);
            if(mesa != null){
                mesa.setNewOpedido(nuevoPedido);
            }
        }
        //metodo para eliminar mesa por id
        public void eliminarMesa(int idMesa){
            Mesas.removeIf(mesa -> mesa.getIdMesa() == idMesa);
        }
        //metodo para listar las mesas
        public List<Mesa> listarMesas(){
            return Mesas;
        }
    }

