/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package herencia2;

public class Cuatriciclo extends Vehiculo {

    public Cuatriciclo(int cantRuedas, int kilometraje, String marca) {
        super(cantRuedas, kilometraje, marca);
    }

    @Override
    public Boolean tienePuertas() {
        return false;
    }

}
