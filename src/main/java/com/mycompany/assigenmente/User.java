/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assigenmente;

/**
 *
 * @author Mahmud Alzhrawy
 */
public class User {
    private String password;
     public String name;
    User(){
        System.out.println("Welcome In IGY Banck");
        password="00000";
        name="Unknowen";
    }
   
     public void setpass(String pass){
    this.password=pass;
    }
     public String getpass(){
    return password;
    }
     public void setname(String s){
     this.name=s;
     }
    public String getname(){
    return name;
    }
}
