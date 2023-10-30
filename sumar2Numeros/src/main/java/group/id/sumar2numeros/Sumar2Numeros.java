/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package group.id.sumar2numeros;

import javax.swing.JOptionPane;

/**
 *
 * @author jazzi
 */
public class Sumar2Numeros {

    public static void main(String[] args) {
        int num1, num2, result;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        result = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+result);
    }
}
