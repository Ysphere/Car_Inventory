/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab3 extends JFrame{
    
    public static void main(String[] args) throws Exception {
        Scanner keyint = new Scanner(System.in);
        Scanner keyStr = new Scanner(System.in);
        ArrayList<car> theCar = new ArrayList<car>();
        HashMap <String, car> map = new HashMap<>();
        int choice;
        int numCar = 0;
        GUI base = new GUI();
  
        while(true) {   
            
            System.out.println("(1) Enter the info about a new vehicle(either acar or aSUV).");
            System.out.println("(2) Print out brand and model,delimitedby spaces,for all vehicles.");
            System.out.println("(3)  Print average vehicle cost, as well as total number of vehicles.");
            System.out.println("(4)  Read input file.");
            System.out.println("(5)  Standard Data dump.");
            System.out.println("(6)  File Data dump.");
            System.out.println("(7) Lookup via HashMap with brand, model, and year.");
            System.out.println("(8)  End program.");
            choice=keyint.nextInt();
            
            if(choice == 1) {
                car yourcar = new car();
                suv yoursuv = new suv();
                String key;
                System.out.println("User selects option (1)");
                System.out.println("Suv or regular car(s or c)");
                String sc = keyStr.nextLine();
                
                if(sc.equalsIgnoreCase("c")) {
                while(true) {
                            System.out.println("Please Enter vehicle Brand, Model");
                            String str = keyStr.nextLine();
                            if(str.contains(" ")){
                                String word[] = str.split("\\s+");
                                    yourcar.inbrand(word[0]);
                                    yourcar.inmod(word[1]);
                                    break;
                            }
                            else{
                              System.out.println("You did not fill one of the part!!"); 
                              continue;
                          }
                }
                yourcar.inyear();
                yourcar.inprice();

               
                key = yourcar.outbrand() + ", "+yourcar.outmod() + ", "+yourcar.outyear();
                key = key.toLowerCase();
                if(map.containsKey(key)){
                    System.out.println("duplication Found,input fails");
                    System.out.println();
                    continue;
               }
                map.put(key, yourcar);
                theCar.add(yourcar);
                System.out.println("Done");
                numCar++;
                }else if(sc.equalsIgnoreCase("s")){
                    while(true) {
                            System.out.println("Please Enter suv Brand, Model");
                            String str = keyStr.nextLine();
                            if(str.contains(" ")){
                                String word[] = str.split("\\s+");
                                    yoursuv.inbrand(word[0]);
                                    yoursuv.inmod(word[1]);
                                    break;
                            }
                            else{
                              System.out.println("You did not fill one of the part!!"); 
                              continue;
                          }
                        }

                yoursuv.inyear();
                yoursuv.inprice();
                
                System.out.println("Please Enter suv seats");
                int seat = keyint.nextInt();
                yoursuv.inSeats(seat);
                
                System.out.println("Is it all Terrain? ");
                String Terrain = keyStr.nextLine();
                yoursuv.tf(Terrain);
                
                System.out.println("Please Enter tire brand");
                String tire = keyStr.nextLine();
                yoursuv.inTire(tire);
                
                key = yoursuv.outbrand() + ", "+yoursuv.outmod() + ", "+yoursuv.outyear();
                key = key.toLowerCase();
                if(map.containsKey(key)){
                    System.out.println("duplication Found,input fails");
                    System.out.println();
                    continue;
               }
                map.put(key, yoursuv);
                theCar.add(yoursuv);
                System.out.println("Done");
                numCar++;
                }
            }else if(choice == 2){
                car carProduct;
  
                for(int i = 0; i<numCar; i++) {
                    carProduct = theCar.get(i);            
                    System.out.println("brand: " +carProduct.outbrand());
                    System.out.println("model: " +carProduct.outmod());
                    System.out.println();
                }
                 
            }else if(choice == 3){
                car carCost;
                int total = 0;
                System.out.println("Total car: " + numCar);
                for(int i = 0; i<numCar; i++) {
                    carCost = theCar.get(i);    
                    total = carCost.outprice() +total;
  
                }
                 System.out.println("Average cost: " + total/numCar);    
            }else if(choice == 4){
                
                System.out.println("Please enter the name of the input file:");
                String theFile = keyStr.nextLine();
                String[] item = new String[8];
                int k = 0;
                
                try{
                    File f = new File(theFile);
                    Scanner scanner = new Scanner(f);
                    while(scanner.hasNextLine()) {
                         //System.out.println(scanner.nextLine());
                         item[k] = scanner.nextLine();
                         k++;
                        }
                    } catch(Exception e) {
                        System.out.println("Could not open file.");
                    }
                
                for(int j = 0; j<k; j++) {
                    
                    if(item[j].contains(" ")){
                        String word[] = item[j].split("\\s+");
                            if(word[4].equals("0")) {
                                car cario = new car();
                                cario.inbrand(word[0]);
                                cario.inmod(word[1]);
                                 try {
                                    cario.checkYear((word[2]));

                                } catch(Exception e) {
                                    System.out.println(e);
                                    continue;
                                }
                                try {
                                    cario.check((word[3]));

                                } catch(Exception e) {
                                    System.out.println(e);
                                    continue;
                                }
                                
                                String keys = cario.outbrand() + ", "+cario.outmod() + ", "+cario.outyear();
                                keys = keys.toLowerCase();
                                if(map.containsKey(keys)){
                                    System.out.println("One duplication Found,car created fails");
                                    System.out.println();
                                    continue;
                               }
                                theCar.add(cario);
                                map.put(keys, cario);
                                numCar++;
                            }else{
                                suv s =new suv();
                                s.inbrand(word[0]);
                                s.inmod(word[1]);
                                 try {
                                    s.checkYear((word[2]));

                                } catch(Exception e) {
                                    System.out.println(e);
                                    continue;
                                }
                                 try {
                                    s.check((word[3]));

                                } catch(Exception e) {
                                    System.out.println(e);
                                    continue;
                                }
                                s.inSeats(Integer.parseInt(word[5]));
                                s.tf(word[6]);
                                s.inTire(word[7]);
                                
                                String keys = s.outbrand() + ", "+s.outmod() + ", "+s.outyear();
                                keys = keys.toLowerCase();
                                if(map.containsKey(keys)){
                                     System.out.println("One duplication Found,car created fails");
                                     System.out.println();
                                     continue;
                                }
                                theCar.add(s);
                                map.put(keys, s);
                                numCar++;
                            }
                            }
                    
                }
                 
            }else if(choice == 5){
                for(int i = 0; i<numCar; i++) {
                    String s = theCar.get(i).dataDump();
                    System.out.println(s);
                }
            }else if(choice == 6){
                try{
                    PrintWriter fileWriter = new PrintWriter("output.txt","UTF-8");
                    for(int i=0;i<numCar;i++){
                        fileWriter.println(theCar.get(i).dataDump());
                    }
                    System.out.println("Done");
                    fileWriter.close();
                }       catch(Exception e){
                        System.out.println("Failed to write");
                    }
            }else if(choice == 7){

                System.out.println("Enter the brand, model, and year of a car:");
                String input = keyStr.nextLine();
                input = input.toLowerCase();
                if (map.isEmpty()) {
                    System.out.println("no matched!");
                }else if(map.containsKey(input)){
                    car c = map.get(input);
                    System.out.println(c.dataDump());
                    System.out.println();   
                }else{
                    System.out.println("no matched!");
                }
                
            }
            else if(choice == 8){
                System.exit(0);
            }else{
                System.out.println("Not an option");
            }
            

        }
        
    }
    
}
