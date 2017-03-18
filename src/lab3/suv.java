/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.*;
public class suv extends car{
    private int numSeats;
    private String tireBrand;
    private Boolean isallTerrain;
    
     public void inSeats(int numSeats){
        this.numSeats = numSeats;
    }
     public void inTire(String tireBrand) {
        this.tireBrand= tireBrand;
    }
     
     public String outTire()
    {
        String t= tireBrand;
        return t;
    }
     
     public boolean tf(String x) {
         if(x.equalsIgnoreCase("true")){
            return true;
         }else{
             return false;
         }
     }
    
    public int outseats(){
        int s = numSeats;
        return s;
    }
    
    @Override
    public String dataDump() {
        String str = "SUV: " + model + " "+ tireBrand;
        return str;
    }
}


