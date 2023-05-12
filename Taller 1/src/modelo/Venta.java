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
public class Venta {
    private double valor;
    private EnumMes mes;
    
    public Venta(double valor, EnumMes mes) {
        this.valor = valor;
        this.mes = mes;
    }

    
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public EnumMes getMes() {
        return mes;
    }

    public void setMes(EnumMes mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Venta{" + "valor=" + valor + '}';
    }
    
    
}
