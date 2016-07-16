/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class pnz {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if(n==0){
            System.out.println("zero");}
        if(n>0)
        {  System.out.println("positive");}
        if(n<0){
            System.out.println("negative");}
    }
    
}
