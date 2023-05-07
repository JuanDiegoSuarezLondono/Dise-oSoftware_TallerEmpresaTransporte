/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usta.TallerEmpresaTransporte.controller;

import co.edu.usta.TallerEmpresaTransporte.logic.Avion;
import co.edu.usta.TallerEmpresaTransporte.logic.Barco;
import co.edu.usta.TallerEmpresaTransporte.logic.Camion;

/**
 *
 * @author suare
 */
public class VehiculoControler {
    private Camion camion;
    private Avion avion;
    private Barco barco;
    
    public void setPesoCamion(String myPeso){
        this.camion.setPeso(Float.parseFloat(myPeso));
    }
    
    public String getPesoC() {
        return String.valueOf(this.camion.getPeso());
    }
    
    public void setPesoA(String myPeso){
        this.avion.setPeso(Float.parseFloat(myPeso));
    }
    
    public String getPesoA() {
        return String.valueOf(this.avion.getPeso());
    }
    
    public void setPesoB(String myPeso){
        this.barco.setPeso(Float.parseFloat(myPeso));
    }
    
    public String getPesoB() {
        return String.valueOf(this.barco.getPeso());
    }
    
    public void setTamañoC(String myTamaño) {
        this.camion.setTamaño(Float.parseFloat(myTamaño));
    }
    
    public String getTamañoc() {
        return String.valueOf(this.camion.getTamaño());
    }
    
    public void setTamañoA(String myTamaño) {
        this.avion.setTamaño(Float.parseFloat(myTamaño));
    }
    
    public String getTamañoA() {
        return String.valueOf(this.avion.getTamaño());
    }
    
    public void setTamañoB(String myTamaño) {
        this.barco.setTamaño(Float.parseFloat(myTamaño));
    }
    
    public String getTamañoB() {
        return String.valueOf(this.barco.getTamaño());
    }
    
    public void setIdC(String myId) {
        this.camion.setId(Integer.parseInt(myId));
    }
    
    public String getIdC() {
        return String.valueOf(this.camion.getId());
    } 
    
    public void setIdA(String myId) {
        this.avion.setId(Integer.parseInt(myId));
    }
    
    public String getIdA() {
        return String.valueOf(this.avion.getId());
    }
    
    public void setIdB(String myId) {
        this.barco.setId(Integer.parseInt(myId));
    }
    
    public String getIdB() {
        return String.valueOf(this.barco.getId());
    }
    
    public void setCDTA(String myCantidadDeTripulacion){
        this.avion.setCDT(Integer.parseInt(myCantidadDeTripulacion));
    }
    public String getCDTA() {
        return String.valueOf(this.avion.getCDT());
    }
    
    public void setCDTB(String myCantidadDeTripulacion){
        this.barco.setCDT(Integer.parseInt(myCantidadDeTripulacion));
    }
    public String getCDTB() {
        return String.valueOf(this.barco.getCDT());
    }
    
    public void setAM(String myAlturaMaxima) {
        this.avion.setAM(Integer.parseInt(myAlturaMaxima));
    }
    
    public String getAM() {
        return String.valueOf(this.avion.getAM());
    }
    
    public void setMaxRevoluciones(String myMaxRevoluciones){
        this.camion.setMaxRevoluciones(Integer.parseInt(myMaxRevoluciones));
    }
    
    public String getMaxRevoluciones() {
        return String.valueOf(this.camion.getMaxRevoluciones());
    }
    
    public void setNumRuedas(String myNumRuedas) {
        this.camion.setNumRuedas(Integer.parseInt(myNumRuedas));
    }
    
    public String getNumRuedas() {
        return String.valueOf(this.camion.getNumRuedas());
    }
    
    public void setNumEjes(String myNumEjes) {
        this.camion.setNumRuedas(Integer.parseInt(myNumEjes));
    }
    
    public String getNumEjes() {
        return String.valueOf(this.camion.getNumEjes());
    }
    
    public void datoC(){
        System.out.println(camion.toString());
    }
    
    public void datoA(){
        System.out.println(avion.toString());
    }
    
    public void datoB(){
        System.out.println(barco.toString());
    }
    
}
