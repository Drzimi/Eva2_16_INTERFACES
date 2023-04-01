/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_16_interfaces;

/**
 *
 * @author invitado
 */
public class Eva2_16_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MostrarDatos obj = new MostrarDatos(); , no se puede instanciar una interfaz 
        Persona perso = new Persona("Juan" , 50);
        perso.imprimirDatos();
        Computadora compu = new Computadora();
    }
    
}
