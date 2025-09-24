import java.util.Scanner;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class lypraryyyy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//        int y;
//        double x = 3.14;
//        float m = 3.1403938f;
//        String z = "Hallo Worllddddd";
//        boolean isPrime = true;
//       
//        
//        int xx = 18;
//        System.out.println("variabel " + x + " dan " + xx);
//       //System.out.println("float " + + "double ");
//        System.out.println(z);
//        System.out.println(isPrime);
//        System.out.println(m);
//       
//        
//        double a = 9;
//        double b = 65;
//        
//        double c = a-b;
//        double d = a*b;
//        double e = a/b;
//        double f = a+b;
//        double g = a%b;
//        
//        System.out.println("kurang " + c);
//        System.out.println("kali " + d);
//        System.out.println("bagi " + e);
//        System.out.println("tambah " + f);
//        System.out.println("sisa bagi " + g);
//        Scanner y = new Scanner (System.in);
//        System.out.print("Masukkan Hobi Anda :");
//        String HOBI = y.nextLine();
//        
//       
//        System.out.print("Masukkan lAGU FAVORIT Anda :");
//        String LAFAV = y.nextLine();
//        
//        
//        System.out.print("KENAPA HARUS ADA FISMEK :");
//        String YAREU = y.nextLine();
//        
//        
//        System.out.println("hobi saya adalah " + HOBI);
//        System.out.println("LAFAV saya adalah " + LAFAV);
//        System.out.println("GAU PUSING " + YAREU);
        
        
        String lagoe = JOptionPane.showInputDialog("Masukkan Lagu Indie Favoritmu !");
        String umur_loe = JOptionPane.showInputDialog("Umue loe berapa sihh ?");
        
        
        int umur_loe_i = Integer.parseInt(umur_loe);
        int Umur = 2025 - umur_loe_i;
        
        JOptionPane.showConfirmDialog(null,"Keluarkan Hasil");
        JOptionPane.showInternalMessageDialog(null, "Lagu Indie Favoritmu :" + lagoe + "\n Umur Loe :" + umur_loe_i);
        
        
                
    }
    
}