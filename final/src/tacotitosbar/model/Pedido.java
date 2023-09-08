package tacotitosbar.model;

import java.util.Calendar;
import java.util.List;


public class Pedido {
    private Calendar horaApertura;
    private Calendar horaCierre;
    private Calendar fechaApertura;
    private Calendar fechaCierre;
    private boolean estadoPedido;
    private List<Producto> productos;
    private float precioActual;
    private int idPedido;
    
    //constructor
    public Pedido(Calendar horaApertura,Calendar horaCierre,Calendar fechaApertura,Calendar fechaCierre,boolean estadoPedido,List<Producto> productos,float precioActual,int idPedido){
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.horaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.estadoPedido = estadoPedido;
        this.productos = productos;
        this.precioActual = precioActual;
        this.idPedido = idPedido;
    }
    //getters
    public Calendar getHoraApertura(){
        return horaApertura;
    }
    public Calendar getHoraCierre(){
        return horaCierre;
    }
    public Calendar getFechaApertura(){
        return fechaApertura;
    }
    public Calendar getFechaCierre(){
        return fechaCierre;
    }
    public boolean getEstadoPedido(){
        return estadoPedido;
    }
    public List<Producto> getProducto(){
        return productos;
    } 
    public float getPrecioActual(){
        return precioActual;
    }
    public int getIdPedido(){
        return idPedido;
    }
    //setters 
    public void setNewHoraApertura(Calendar horaApertura){
        this.horaApertura = horaApertura;
    }
    public void setNewHoraCierre(Calendar horaCierre){
        this.horaCierre = horaCierre;
    }
    public void setNewFechaApertura(Calendar fechaApertura){
        this.fechaApertura = fechaApertura;
    }
    public void setNewFechaCierre(Calendar fechaCierre){
        this.fechaApertura = fechaCierre;
    }
    public void setNewEstadoPedido(boolean estadoPedido){
        this.estadoPedido = estadoPedido;
    }
    public void setNewProducto(List<Producto> productos){
        this.productos = productos;
    }
    public void setNewPrecioActual(float PrecioActual){
        this.precioActual = PrecioActual;
    }
    public void setNewIdPedido(int IdPedido){
        this.idPedido = IdPedido;
    }
}
