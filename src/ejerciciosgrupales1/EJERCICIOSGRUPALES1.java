/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosgrupales1;

import java.util.Scanner;

/**
 *
 * @author Karoline
 */
public class EJERCICIOSGRUPALES1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n=new Scanner (System.in);
        int num;
        System.out.println("Introduzca un numero");
        num=n.nextInt ();
        
        
            if (num  < 0){
                
               num = num * num ;
                System.out.println("el cuadrado del numero es " +num );
            }
            else {
             if (num  > 0){
                
                num = num * num * num ;
                System.out.println("el cubo del numero es " +num );   
            
             }
            }
    }
}   
        
    
    

