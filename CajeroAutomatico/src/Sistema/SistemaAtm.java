/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author Ilsina
 */
public class SistemaAtm {
    
    public static double saldoactual;
    
    public SistemaAtm(){
        saldoactual=0;
    }
    
    public void depositar(double deposito){
        saldoactual += deposito;
        
    }
    public void retirar(double retiro){
        if(saldoactual>= retiro)
        {
            saldoactual -= retiro;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"[Error] Saldo insuficiente");
        }
    }
    
    public double obtenerSaldo(){
        return saldoactual;
    }
}
