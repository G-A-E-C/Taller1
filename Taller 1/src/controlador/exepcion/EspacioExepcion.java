/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.exepcion;

/**
 *
 * @author mac
 */
public class EspacioExepcion extends Exception {

    /**
     * Creates a new instance of <code>EspacioExepcion</code> without detail
     * message.
     */
    public EspacioExepcion() {
        super("NO hay Espacio");
    }

    /**
     * Constructs an instance of <code>EspacioExepcion</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public EspacioExepcion(String msg) {
        super(msg);
    }
}
