/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author mariana
 */
public class Cuenta {
    private double saldo;

    public Cuenta(){
        saldo=0;
    }
    
    /**
     * Metodo para depositar dinero en la cuenta 
     * @param monto monto a depositar
     */
    public void depositar(double monto){
        System.out.println("Depositando "+ monto);
        saldo += monto;
    }
    
    /**
     * Metodo para retirar dinero de la cuenta
     * @param monto monto es la cantidad de dinaero para retirar 
     * @throws SaldoInsuficienteException excepcion que sale por si se quiere 
     * retirar mas dinero del que se tienen en la cuenta 
     */
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Retirando " +monto);
        if(saldo<monto)
            throw new SaldoInsuficienteException();
        else
            saldo -=monto;
    }
    
    /**
     * Metodo get para saber el saldo de la cuenta
     * @return el saldo
     */
    public double getSaldo(){
        return saldo;
    }
    
}