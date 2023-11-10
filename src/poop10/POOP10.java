/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author Mariana Daniela Hernandez Perez
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------>Actividades del laboraorio<------");
        System.out.println("------- Primera Activdad---------");
        System.out.println("Hola mundo");
        String mensajes [] = {"primero", "segundo","tercero"};
        try{
        for (int i=0; i<=3; i++)
        System.out.println(mensajes[i]);
        
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error sale del arreglo");
            System.out.println(e.getMessage());
        }
        System.out.println("Hola mundo 2");
        System.out.println("-------Segunda actividad ----------");//
        try{
            double x;
            x = 0/0;
            System.out.println(x);
        } catch( ArithmeticException e){
            System.out.println("Error divicion entre cero");
            System.out.println(e.getMessage());
        } 
        System.out.println("-------Segunda actividad .2----------");
        
        try{
            double x;
            x = 0/0;
            System.out.println(x);
        } catch( ArrayIndexOutOfBoundsException e){
            System.out.println("Error divicion entre cero");
            System.out.println(e.getMessage());
        }catch( ArithmeticException e){
            System.out.println("Error divicion entre cero");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Error: excepcion general");
        }
        
        
        System.out.println("Hola mundo 3");
        System.out.println("-------tercera actividad ----------");
        double division;
        try{
            division = metodoDivicion(6,0f);
            System.out.println(division);
        }catch( ArithmeticException e){
            System.out.println("Error divicion entre cero");
            System.out.println(e.getMessage());
        }
        
        System.out.println("------>Actividad del cajero<------");
        
        Cuenta cuenta = new Cuenta();

        try{
            cuenta.depositar(2000);
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.depositar(200);
            cuenta.retirar(100);
        }catch (SaldoInsuficienteException e){
            e.printStackTrace();
        }
        
        System.out.println("Fin de todo el programa ");
        
    }
     /**
     * Divide dos números y devuelve el resultado. Si el segundo número es cero, se lanza una excepción `ArithmeticException`.
     *
     * @param a El primer número.
     * @param b El segundo número.
     * @return El resultado de la división.
     * @throws ArithmeticException Si el segundo número es cero.
     */
    private static double metodoDivicion(float f, double d) throws ArithmeticException{
        //throw new UnsupportedOperationException("Metodo no soprtado."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return f/d;
    }
    
    
}
