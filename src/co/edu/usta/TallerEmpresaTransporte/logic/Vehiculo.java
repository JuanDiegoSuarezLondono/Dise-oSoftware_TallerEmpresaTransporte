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
public class Vehiculo {
    private float peso;
    private float tamaño;
    private int ID;
    
    public void setPeso(float myPeso){
        this.peso = myPeso;
    }
    
    public float getPeso() {
        return this.peso;
    }
    
    public void setTamaño(float myTamaño) {
        this.tamaño = myTamaño;
    }
    
    public float getTamaño() {
        return this.tamaño;
    }
    
    public void setId(int myId) {
        this.ID = myId;
    }
    
    public int getId() {
        return this.ID;
    }
    
    @Override
    public String toString() {
        return "Datos: " + "Id:" + this.ID + ", Peso:" + this.peso+", Tamaño:"+this.tamaño;
    }
}
