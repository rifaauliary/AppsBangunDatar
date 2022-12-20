/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appsbangundatar;

/**
 *
 * @author rifa
 */
public abstract class BangunDatar {
    private String namaBangunDatar;

    public String getNamaBangunDatar() {
        return namaBangunDatar;
    }

    public void setNamaBangunDatar(String namaBangunDatar) {
        this.namaBangunDatar = namaBangunDatar;
    }
    
    // method untuk menghitung luas bangun datar
    abstract double luas();
    
    // method untuk menghitung keliling bangun datar
    abstract double keliling(); 
}
