/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author mac
 */
public class Sucursal {
    private String Nombre;
    private Venta[] ventas;
    private double total;

    public Sucursal(String Nombre) {
        this.Nombre = Nombre;
        this.ventas = new Venta[12];
        int cont = 0;
        for (EnumMes value : EnumMes.values()) {
            this.ventas[cont] = new Venta(0d, value);
            cont++;
        }
    }
    
    public void calcularTotal(){
        total = 0d;
        for(Venta venta : ventas){
            total = total + venta.getValor();
        }
    }
    public void agregarVenta(EnumMes mes, double valor){
        for (Venta venta : getVenta()) {
            if (venta.getMes() == mes) {
                venta.setValor(valor);
            }
        }
        this.calcularTotal();
    }
    
    public double ventasMes(EnumMes mes){
        double valorD = 0;
        for (Venta venta : getVenta()){
            if(venta.getMes()==mes){
                valorD = venta.getValor();
            }
        }
        return valorD;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Venta[] getVenta() {
        return ventas;
    }

    public void setVenta(Venta[] venta) {
        this.ventas = venta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    
    @Override
    public String toString() {
        return "Sucursal{" + "Nombre=" + Nombre + '}';
    }
    
    
}
