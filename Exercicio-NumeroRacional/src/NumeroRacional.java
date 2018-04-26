/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31700721
 */
public abstract class NumeroRacional {
    private int num;
    private int den;
    public NumeroRacional(int num, int den){
        this.num = num;
        this.den = den;
    }
    public int getNumerador(){
        return num;
    }
    public int getDenominador(){
        return den;
    }
    public abstract String exibir();
}
