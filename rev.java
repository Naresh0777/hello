/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class rev {
    public static void main(String[] args) {
        int n,t;
      
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
      
       while(n!=0){
           t=n%10;
           n/=10;
           
                   
       
           System.out.print(t);
            
        }
        System.out.println();
    
        
    
}}
