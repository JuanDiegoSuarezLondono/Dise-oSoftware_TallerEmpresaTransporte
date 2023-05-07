/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.TallerEmpresaTransporte.logic;

/**
 *
 * @author suare
 */
public class NoTerrestre extends Vehiculo{
    
    private int cantidadDeTripulacion;    
    
    public void setCDT(int myCantidadDeTripulacion){
        this.cantidadDeTripulacion = myCantidadDeTripulacion;
    }
    public int getCDT() {
        return this.cantidadDeTripulacion;
    }
    
    @Override
    public String toString() {
        return super.toString()+", Cantidad de Tripulacion: " + this.cantidadDeTripulacion;
    }
}
