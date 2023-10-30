
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author jazzi
 */
public class IdentificaParImpar  {


    public static void main(String[] args) {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero que sera evaluado"));
        if (n % 2 == 1) {
            JOptionPane.showMessageDialog(null, "El numero " + n + " Es impar");
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + n + " Es par");


        }
    }
}
