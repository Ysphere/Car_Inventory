/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.*;
public class car {
    private int year;
    private String brand;
    String model;
    private int price;
    
    public void inyear(){
        boolean valid;
        Scanner keyboard =  new Scanner(System.in);
        do {
            valid = true;
            System.out.print("Please enter Year: \n");
            String number = keyboard.nextLine();
            try {
                checkYear(number);
            } catch (Exception e) {
                System.out.println("Invalid input, your input car is greater than 30 yrs old");
                valid = false;
            }
        } while (!valid);
    }
    
    public void checkYear(String x) throws Exception{
        int p = Integer.parseInt(x);
         if(p> 1986){
            year = p;
         }else{
             throw new Exception("Invalid input, your input car is greater than 30 yrs old");
         }
     }
   
    public void inbrand(String name){
        brand= name;
    }
    public void inmod(String name) {
        model= name;
    }
     
    public void check(String pl) throws Exception{
        int p = Integer.parseInt(pl);
         if(p>= 5000){
            price = p;
         }else{
             throw new Exception("Your input must be 5000 or above");
         }
     }
     public void inprice(){
        boolean valid;
        Scanner keyboard =  new Scanner(System.in);
        do {
            valid = true;
            System.out.print("Please enter vehicle cost: \n");
            String number = keyboard.nextLine();
            try {
                check(number);
            } catch (Exception e) {
                System.out.println(e);
                valid = false;
            }
        } while (!valid);
    }
     
    public String outbrand(){
        String name= brand;
        return name;
    }
   
    public String outmod()
    {
        String name= model;
        return name;
    }
    
    public int outprice(){
        int number = price;
        return number;
    }
    
    public int outyear() {
        int number = year;
        return number;
    }
    
    public String dataDump() {
        String str = "Car: "+ brand + " " + model +" " +year+" "+price + " ";
        return str;
    }
}
