package cuentas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ariel
 */
public class Main {

    public static void main(String[] args) {
       CCuenta cuenta1=new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);

        double saldoActual=0;
        float cantidad=0;
        operativa_cuenta(cuenta1,saldoActual,cantidad);
    }

    private static void operativa_cuenta(CCuenta cuenta1,double saldoActual,float cantidad)
    
    {
      
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
