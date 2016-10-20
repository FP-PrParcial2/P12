/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppproblema012;
import java.util.*;
/**
 *
 * @author karen
 */
public class PPProblema012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double M ,S=0;
      
    int arr[]= new int [10];
       Scanner entrada= new Scanner(System.in);
       for(int i=0; i<10; i++){
           System.out.println("Introduce el número:" + (i + 1) + ": ");
           arr[i]=entrada.nextInt();
           S= S + arr[i];
       }
       M=S/10;
        System.out.println("\nLa suma es:" + S);
        System.out.println("\n La media es:" + M);
        
    }
}
