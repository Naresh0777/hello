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
public class factorial {
    public static void main(String[] args) {
        int n,f;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        f=1;
        for(int i=1;i<=n;i++){
            f=f*i;}
            System.out.println(f);
            
        }
    }
    

