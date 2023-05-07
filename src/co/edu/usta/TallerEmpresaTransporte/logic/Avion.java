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
public class Avion extends NoTerrestre{
    private int alturaMaxima;
    
    public void setAM(int myAlturaMaxima) {
        this.alturaMaxima = myAlturaMaxima;
    }
    
    public int getAM() {
        return this.alturaMaxima;
    }
    
    public String toString() {
        return super.toString()+", Altura Maxima: " + this.alturaMaxima;
    }
}
