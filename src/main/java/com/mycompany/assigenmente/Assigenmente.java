/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.assigenmente;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Mahmud Alzhrawy
 */
public class Assigenmente {

    public static void main(String[] args) {
        User op=new User();
      
          Scanner input=new Scanner(System.in);
        System.out.println("\t\t USER INFORMATION");
        System.out.println("=========================================");
        
         opre c=new opre();
        System.out.println("password: ");
        int j=0;
        String z="Mon808080";
         for(int i=1;i<=5;i++){ 
            String pass=input.nextLine();
           if(z.equals(pass)){
                System.out.println("Your Name: ");
                    String name=input.next();
                   JOptionPane.showMessageDialog(null,  "Hi M.R "+name);
                   op.setname(name);
                   c.setname(name);
                           break;
            }
           else{
                System.out.println("Wrong Password ");
                if(i==5){
                   System.out.println("Your Card will be nonvalid");
                    j=5;
                }
            } 
        }       
          
        while(j!=5){
            
            
            System.out.println("========================================");
              c.get();
            System.out.println("\t\t Enter your choise!:");
            int num =input.nextInt();
            if(num==1){
                System.out.println("\tEnter The amount you want to withdraw:");
                double amt1=input.nextDouble();
                System.out.println("Hi M.R: "+op.getname());
                c.withdraw(amt1);
                System.out.println("=======================================");
            }
            else if(num==2){
             System.out.println("\tEnter The amount you want to deposit:");
                double amt=input.nextDouble();
                System.out.println("Hi M.R: "+op.getname());
                c.deposit(amt);
                System.out.println("========================================");
            }
            else if(num==3){
               c.getbalance();
                System.out.println("========================================");
            }
            else if(num==4){
            break;
            }
            else{
                   System.out.println("\tWrong choice!!");
                   System.out.println("=======================================5");
                   }
        }
    }
}
