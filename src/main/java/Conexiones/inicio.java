/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

import ventanas.RegistroProductos;
import ventanas.RegistroProveedor;

/**
 *
 * @author PC
 */
public class inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //RegistroProductos iniciar = new RegistroProductos();
        RegistroProveedor iniciar = new RegistroProveedor();
        iniciar.setVisible(true);
    }
    
}
