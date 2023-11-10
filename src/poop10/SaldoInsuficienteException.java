/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author mariana
 */
public class SaldoInsuficienteException extends Exception{
    
    /**
     * Regresa el mensaje de "Saldo insuficiente"
     */
    public SaldoInsuficienteException(){
        super("Saldo insuficiente");
    }
    
}