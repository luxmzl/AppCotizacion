/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Ernesto Robles
 */
public class CotizaProducto {
    private double _precio,_iva,_subtotal,_totalAPagar;
    private int _cantidad;

    public CotizaProducto(int opcion) {
        _precio=(opcion==1)?300:
                (opcion==2)?150:
                (opcion==3)?10.5:0;
    }
  
    public void setCantidad(int _cantidad) {
        this._cantidad = _cantidad;
    }

    private void cotizar(){
        _subtotal=_cantidad*_precio;
        _iva=_subtotal*0.15;
        _totalAPagar=_subtotal+_iva;
    }

    @Override
    public String toString() {
        cotizar();
        return  "Los resultados de su cotización"+"\n"+
                "Precio: " + _precio + "\n" + 
                "Iva: " + _iva + "\n" +
                "Subtotal: " + _subtotal + "\n" + 
                "Total a Pagar: " + _totalAPagar;
    }  
    
}
