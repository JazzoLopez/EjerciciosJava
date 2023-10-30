
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author jazzi
 */
public class OpreacionesBasicas {

    public static void main(String[] args) {
   
         int num1, num2, res;
        double resta;
        JOptionPane.showMessageDialog(null, "Suma ");
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
        res = num1 + num2;
        JOptionPane.showMessageDialog(null, "El resultado de la suma fue:  " + res);
        /**
         * *********************************************************************************
         */
        JOptionPane.showMessageDialog(null, "Resta");
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
        res = num1 - num2;
        JOptionPane.showMessageDialog(null, "El resultado de la resta fue:  " + res);
        /**
         * *********************************************************************************
         */
        JOptionPane.showMessageDialog(null, "Multiplicacion");
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
        res = num1 * num2;
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion fue:  " + res);
        /**
         * *********************************************************************************
         */
        JOptionPane.showMessageDialog(null, "Division");
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
        resta=(double)num1 / (double)num2;
        JOptionPane.showMessageDialog(null, "El resultado de la division fue:  " + resta);



    }
}
