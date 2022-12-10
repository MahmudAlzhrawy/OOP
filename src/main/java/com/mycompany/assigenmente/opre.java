/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assigenmente;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


/**
 *
 * @author Mahmud Alzhrawy
 */
public class opre {
  String name;
  public void setname(String s){
  this.name=s;
  }
    public void get(){
    
        System.out.println("1->Enter thh Blance withdrawal.");
         System.out.println("2->Enter thh Blance Deposit.");
          System.out.println("3->To Balance Inquiry.");
           System.out.println("4->Exite.");
    }
    private double amount;
    public void withdraw(double amt1){
        if(this.amount>=amt1){
         this.amount-=amt1;
          try{    
    File f=new File("client.txt");
    Scanner read=new Scanner(f);
 
    while(read.hasNextLine()){
        String name1=read.next();
        String num=read.next();
        String acc=read.next();
    if(name1.equals(this.name)){
        System.out.println("your current balance is "+amount);
        System.out.println("your num of account is "+acc);
    }
    }
     }catch(Exception ex){
     System.out.println("error");
     }
        }
        else
            System.out.println(" There is not enough balance!!");
    }
    public void deposit(double amt){
    this.amount+=amt;
       try{    
    File f=new File("client.txt");
    Scanner read=new Scanner(f);
    while(read.hasNextLine()){  
        String name1=read.next();
        double num=read.nextDouble();
        String acc=read.next();
    if(name1.equals(this.name)){
        num+=amount;
        System.out.println("your current balance is "+amount);
        System.out.println("your num of account is "+acc);
    }
    }
     }catch(Exception ex){
     System.out.println("error");
     }
     
    }
    public void getbalance(){
       try{    
    File f=new File("client.txt");
    Scanner read=new Scanner(f);
    while(read.hasNextLine()){  
        String name1=read.next();
        String num=read.next();
        String acc=read.next();
    if(name1.equals(this.name)){
        System.out.println("your current balance is "+amount);
    }
    }
     }catch(Exception ex){
     System.out.println("error");
     }
    }

    private String String(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String toString(double amount) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}