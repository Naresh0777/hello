
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class string {
    public static void main(String[] args) {
        
    String s1;
       Scanner s=new Scanner(System.in);
        
        s1=s.nextLine();
        String rev= new StringBuffer(s1).reverse().toString();
        System.out.println(rev);
    }
}
