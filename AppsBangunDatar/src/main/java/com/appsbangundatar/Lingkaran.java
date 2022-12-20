/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appsbangundatar;

/**
 *
 * @author berka
 */
public class Lingkaran extends BangunDatar{
    private double radius;
    public final double PHI = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double luas() {
        return PHI * radius * radius;
    }

    @Override
    double keliling() {
        return 2 * PHI * radius;
    }
    
    double luas(double radius, double PHI) {
        return PHI * radius * radius;
    }
    
    double keliling(double radius, double PHI) {
        return 2 * PHI * radius;
    }
}
