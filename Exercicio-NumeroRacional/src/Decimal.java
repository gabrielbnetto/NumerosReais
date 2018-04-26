/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31700721
 */
public class Decimal extends NumeroRacional implements Comparavel{
    public Decimal(int num, int den){
        super(num,den);
    }
    public String exibir(){
        return "O decimal é:"+getNumerador()/getDenominador();
    }
    public String compara(Comparavel c){
        return this.
    }
}
