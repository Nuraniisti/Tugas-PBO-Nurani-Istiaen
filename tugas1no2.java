/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1no2;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class tugas1no2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama ="";
        nama = JOptionPane.showInputDialog("Anda Sedang Belajar Apa ?");
        String pesan = ( "Belajar " + nama + " sangat mudah");
        JOptionPane.showMessageDialog(null, pesan);        
    }
}