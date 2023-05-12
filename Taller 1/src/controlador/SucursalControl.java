/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.exepcion.EspacioExepcion;
import modelo.EnumMes;
import modelo.Sucursal;
import modelo.Venta;

/**
 *
 * @author mac
 */
public class SucursalControl {
    private Sucursal[] sucursales;
    private Sucursal sucursal;
    private Venta venta;

     
    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    
    
    
    public SucursalControl(){
        sucursales = new Sucursal[4];
        for (int i = 0; i < sucursales.length; i++) {
            sucursales[i]= new Sucursal("Sucursal "+ (i+1));
        }
        
        
        /*for (Sucursal s: sucursales) {
            
            s.setVentas(new Venta[EnumMes.values().length]);
            for (int i = 0; i < EnumMes.values().length; i++) {
                Venta venta = new Venta();
                venta.setId(i+1);
                venta.setMes(EnumMes.values()[i]);
                venta.setValor(0.0);
                s.getVentas()[i] = venta;
            }
        }*/
    }
    public double getPromedioMes(EnumMes mes){
        double promedio = 0;
        for (Sucursal sucursale : sucursales) {
            promedio = promedio + sucursale.ventasMes(mes);
        }
        promedio = promedio/sucursales.length;
        return promedio;
    }
    
    public Sucursal getSucursal() {
        if (sucursal == null) {
            //sucursal = new Sucursal();
        }
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Sucursal[] getSucursales() {
        return sucursales;
    }

    public void setSucursales(Sucursal[] sucursales) {
        this.sucursales = sucursales;
    }
    
    public boolean registrar() throws EspacioExepcion{
        int pos = -1;
        int cont = -1;
        for (Sucursal s : sucursales) {
            cont++;
            if (s == null) {
                pos = cont;
                break;
            }
        }
        if (pos == -1) {
            throw new EspacioExepcion();
        }
        sucursal.setVenta(new Venta[EnumMes.values().length]);
            for (int i = 0; i < EnumMes.values().length; i++) {
                //Venta venta = new Venta();
                //venta.setId(i+1);
                venta.setMes(EnumMes.values()[i]);
                venta.setValor(0.0);
                sucursal.getVenta()[i] = venta;
            }
        sucursales[pos] = sucursal;
        return true;
    }
    public boolean guardarVentas(Integer posVenta, Double valor){
        
        return true;
    }
    
    
}
