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
public class Computadora extends Productos //Herdamos de clases
implements MostrarDatos{ //Implementamos de clases
    
    private String Marca;
    private String Procesador;

    public Computadora(){
        super();
        this.Marca = "";
        this.Procesador = "";
    }
    public Computadora(String Marca, String Procesador) {
        this.Marca = Marca;
        this.Procesador = Procesador;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre:" + getNombre());
        System.out.println("Precio:" + getPrecio());
        System.out.println("Marca:" + Marca);
        System.out.println("Procesador:" + Procesador);
    }
    
    
}
