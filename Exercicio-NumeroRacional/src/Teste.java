/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31700721
 */
public class Teste {
    public static void main (String[] args) throws java.lang.Exception
	{
	NumeroRacional n1 = new Fracao (2,5);
	NumeroRacional n2 = new Decimal (2,5);
	System.out.println(n1.exibir()); //Deve exibir 2/5
	System.out.println(n2.exibir()); //Deve exibir 0.4

	Comparavel c1 = n1;
	Comparavel c2 = n2;
	System.out.println(c1.compara(c2));//Deve exibir: “2/5 é igual a 0.4”
  
	c2 = new Fracao (1,4);
	System.out.println(c1.compara(c2));//Deve exibir: “2/5 é menor que 1/4”


	}

}
