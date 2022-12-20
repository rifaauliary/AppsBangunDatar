/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appsbangundatar;

/**
 *
 * @author Tri Rahayu Purwanti
 */
public class segitiga extends BangunDatar{
    public double alas;
    public double tinggi;
    
public segitiga(){
    
}

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    double luas() {
       return 2 * alas * tinggi;
    }

    @Override
    double keliling() {
        return alas + tinggi;
   }
    
}
