/**
 * @(#)Calculadora.java
 *
 *
 * @author 
 * @version 1.00 2017/6/1
 */

public class Calculadora {
   private double numero1;
   private double numero2;     
   
    public Calculadora() {
    	numero1=numero2=0;
    }
    public double getNumero1(){
    	return numero1;
    }
    public void setNumero1(double  numero){
    	this.numero1= numero;
    }
    
    public double getNumero2(){
    	return numero2;
    }
    public void setNumero2(double  numero){
    	this.numero2= numero;
    }
    
}
