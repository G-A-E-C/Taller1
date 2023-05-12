/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.SucursalControl;
import modelo.EnumMes;
import modelo.Sucursal;

/**
 *
 * @author mac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SucursalControl sc = new SucursalControl();
        System.out.println(sc.getPromedioMes(EnumMes.Mayo));
        for (int i = 0; i < sc.getSucursales().length; i++) {
            Sucursal sucursales = sc.getSucursales()[i];
            System.out.println(sucursales);
        }
        System.out.println(sc.getSucursales());
        
        Sucursal s = new Sucursal("uno");
        s.agregarVenta(EnumMes.Mayo, 25);
        s.agregarVenta(EnumMes.Enero, 37);
        System.out.println(s.getTotal());
        
        Sucursal s2 = new Sucursal("dos");
        s2.agregarVenta(EnumMes.Febrero, 20);
        s2.agregarVenta(EnumMes.Enero, 7);
        System.out.println(s2.getTotal());
        System.out.println(s2.ventasMes(EnumMes.Diciembre));
        
        double promedio = 0;
        
        promedio = promedio + s.ventasMes(EnumMes.Enero);
        promedio = promedio + s2.ventasMes(EnumMes.Enero);
        promedio = promedio/2;
        System.out.println(promedio);
    }
    
}
