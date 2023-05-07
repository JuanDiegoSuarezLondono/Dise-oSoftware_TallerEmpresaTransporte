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
public class Camion extends Vehiculo{
    private int maxRevoluciones;
    private int numRuedas;
    private int numEjes;
    
    public void setMaxRevoluciones(int myMaxRevoluciones){
        this.maxRevoluciones = myMaxRevoluciones;
    }
    
    public int getMaxRevoluciones() {
        return this.maxRevoluciones;
    }
    
    public void setNumRuedas(int myNumRuedas) {
        this.numRuedas = myNumRuedas;
    }
    
    public int getNumRuedas() {
        return this.numRuedas;
    }
    
    public void setNumEjes(int myNumEjes) {
        this.numEjes = myNumEjes;
    }
    
    public int getNumEjes() {
        return this.numEjes;
    }
    
    @Override
    public String toString() {
        return super.toString()+", Maxi Revoluciones: " + this.maxRevoluciones+", Numero Ruedas: " + this.numRuedas+", Numero de Ejes: " + this.numEjes;
    }
}
