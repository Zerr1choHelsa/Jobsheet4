/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABSTRACT_CLASS;

/**
 *
 * @author WINDOWS 10
 */
public class Lingkaran extends bangunDatar {
    private double r;
    
    public Lingkaran(double r){
        this.r = r;
    }
    
    @Override
    public double hitungKeliling(){
        return 2 * 3.14 * r;
    }
    public double hitungLuas(){
        return 3.14 * r * r;
    }
}