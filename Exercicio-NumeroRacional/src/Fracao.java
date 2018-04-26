/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31700721
 */
public class Fracao extends NumeroRacional implements Comparavel{
    public Fracao(int num, int den){
        super(num,den);
    }
    public String exibir(){
        return "A fração é:"+getNumerador()+"/"+getDenominador();
    }
    public String compara(Comparavel c){
        return 
    }
}
