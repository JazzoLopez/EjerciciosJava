
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author jazzi
 */
public class SumarNumerosImpares {

    

    public static void main(String[] args) {
        int n, acumulador = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de numeros a sumar"));
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                acumulador = acumulador + i;
            }
           
        }
        JOptionPane.showMessageDialog(null, " el resultado de la suma fue:  " + acumulador);
    }


}
