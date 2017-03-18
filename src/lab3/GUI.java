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


public class GUI extends JFrame implements ActionListener{
    ArrayList<car> theCar = new ArrayList<car>();
    HashMap <String, car> map = new HashMap<>();
    private Container C;
    private JButton nCar;
    private JMenuBar bar = new JMenuBar();
    private JMenu file= new JMenu("File");
    private JMenuItem export= new JMenuItem("Export");
    private JButton nSuv;
    private JButton exit;
    private JButton search;
    private JButton bNm;
    private JButton IO = new JButton("Input File");
    private JButton cost;
    private JButton dump;
    private JButton ok = new JButton("ok");
    private JButton find = new JButton("search");
    private JButton Done = new JButton("Done");
    private JButton fin = new JButton("Done");
    private JButton reset= new JButton("Reset");
    private JButton back= new JButton("back");
    private JLabel header;
    private JTextField bm = new JTextField();
    private JTextField yrs = new JTextField();
    private JTextField money = new JTextField();
    private JTextField input = new JTextField();
    private JTextField keySearch = new JTextField();
    private JLabel bndm = new JLabel("Brand&Model:");
    private JLabel price = new JLabel("Enter price:");
    private JLabel year = new JLabel("Enter year:");
    private JLabel in = new JLabel("Enter Input file:");
    private JLabel Label1;
    private ImageIcon Firstimage;
    private JTextField seat = new JTextField();
    private JTextField tf = new JTextField();
    private JTextField tire = new JTextField();
    private JLabel numseat = new JLabel("Num of seats:");
    private JLabel Terrain = new JLabel("isAllTerrain:");
    private JLabel tBrand = new JLabel("Tire Brand:");
    private JTextArea commentTextArea;
    private JScrollPane scrollPane;
    
    
    public GUI() {
                Container C = this.getContentPane();
                //C.setBackground(Color.red);
		this.setTitle("Vehicle");
		this.setSize(600,640);
               
		C.setLayout(null);
                export.addActionListener(this);
                file.add(export);
                bar.add(file);
                this.setJMenuBar(bar);
                bndm.setBounds(50, 80, 125, 60);
                C.add(bndm);
                bndm.setVisible(false);
                year.setBounds(50, 130, 125, 60);
                C.add(year);
                year.setVisible(false);
                price.setBounds(50, 180, 125, 60);
                C.add(price);
                price.setVisible(false);
                
                bm.setBounds(140, 100, 130, 20);
                bm.addActionListener(this);
                C.add(bm);
                bm.setVisible(false);
                
                yrs.setBounds(140, 150, 130, 20);
                yrs.addActionListener(this);
                C.add(yrs);
                yrs.setVisible(false);
                
                input.setBounds(220, 150, 130, 20);
                input.addActionListener(this);
                C.add(input);
                input.setVisible(false);
                
                keySearch.setBounds(220, 150, 160, 20);
                keySearch.addActionListener(this);
                C.add(keySearch);
                keySearch.setVisible(false);
                
                in.setBounds(120, 150, 130, 20);
                //in.addActionListener(this);
                C.add(in);
                in.setVisible(false);
                
                money.setBounds(140, 200, 130, 20);
                money.addActionListener(this);
                C.add(money);
                money.setVisible(false);
                
                numseat.setBounds(325, 100, 130, 20);
                C.add(numseat);
                numseat.setVisible(false);
                Terrain.setBounds(325, 150, 130, 20);
                C.add(Terrain);
                Terrain.setVisible(false);
                tBrand.setBounds(325, 200, 130, 20);
                C.add(tBrand);
                tBrand.setVisible(false);
                
                seat.setBounds(420, 100, 130, 20);
                C.add(seat);
                seat.setVisible(false);
                tf.setBounds(420, 150, 130, 20);
                C.add(tf);
                tf.setVisible(false);
                tire.setBounds(420, 200, 130, 20);
                C.add(tire);
                tire.setVisible(false);
                
                reset.setBounds(110, 240, 100, 40);
                reset.addActionListener(this);
                C.add(reset);
                reset.setVisible(false);
                
                Done.setBounds(340, 240, 100, 40);
                Done.addActionListener(this);
                C.add(Done);
                Done.setVisible(false);
                
                fin.setBounds(340, 240, 100, 40);
                fin.addActionListener(this);
                C.add(fin);
                fin.setVisible(false);
                
                ok.setBounds(340, 240, 100, 40);
                ok.addActionListener(this);
                C.add(ok);
                ok.setVisible(false);
                
                find.setBounds(340, 240, 100, 40);
                find.addActionListener(this);
                C.add(find);
                find.setVisible(false);
                
                IO.setBounds(50, 510, 125, 60);
                IO.addActionListener(this);
                C.add(IO);
                IO.setVisible(true);
                
                
                
                
		header = new JLabel("Inventory System");
		header.setBounds(160, -50, 300, 200);
		header.setFont((new Font("Century Gothic", Font.ROMAN_BASELINE, 30)));
		C.add(header);
                //header.setVisible(false);
              
		//Button
		nCar = new JButton("New Car");
		nCar.setBounds(50, 100, 125, 60);
		nCar.addActionListener(this);
                C.add(nCar);
                
                nSuv = new JButton("New SUV");
		nSuv.setBounds(375, 100, 125, 60);
		nSuv.addActionListener(this);
                C.add(nSuv);
		
                search = new JButton("Search");
		search.setBounds(215, 100, 125, 60);
		search.addActionListener(this);
                C.add(search);
                
                bNm = new JButton("Brand&Model");
		bNm.setBounds(50, 200, 125, 60);
		bNm.addActionListener(this);
	        C.add(bNm);
                
                cost = new JButton("Average");
		cost.setBounds(375, 200, 125, 60);
		cost.addActionListener(this);
                C.add(cost);
		
                dump = new JButton("Data Dump");
		dump.setBounds(215, 200, 125, 60);
		dump.addActionListener(this);
                C.add(dump);
                
                exit = new JButton("Exit");
		exit.setBounds(215, 510, 125, 60);
		exit.addActionListener(this);
                C.add(exit);
                
                
		back.setBounds(380, 510, 125, 60);
		back.addActionListener(this);
                C.add(back);
                back.setVisible(false);
                
                commentTextArea = new JTextArea();
                commentTextArea.setBounds(100, 100, 50, 50);
                commentTextArea.setFont((new Font("Century Gothic", Font.ROMAN_BASELINE, 14)));
                commentTextArea.setEditable(false);
                //commentTextArea.addActionListener(this);
                scrollPane = new JScrollPane(commentTextArea); 
                scrollPane.setBounds(50, 300, 450, 200);
                C.add(scrollPane);
                Firstimage = new ImageIcon("anfischer_NOISE_white_I_02.jpg");
		Label1 = new JLabel(Firstimage);
		Label1.setBounds(0, 0, 600, 600);
		C.add(Label1);
		this.setVisible(true);
       
	}
    
    public void actionPerformed (ActionEvent e) {
        car yourcar = new car();
        suv yoursuv = new suv();
        String key;
        
        if(e.getSource()== exit) {
            System.exit(0);
        }else if(e.getSource() == nCar){
            nCar.setVisible(false);
            nSuv.setVisible(false);
            bNm.setVisible(false);
            search.setVisible(false);
            cost.setVisible(false);
            dump.setVisible(false);
            bm.setVisible(true);
            yrs.setVisible(true);
            money.setVisible(true);
            bndm.setVisible(true);
            year.setVisible(true);
            price.setVisible(true);
            reset.setVisible(true);
            Done.setVisible(true);
            back.setVisible(true);
            
             
        }else if(e.getSource() == nSuv){
            nCar.setVisible(false);
            nSuv.setVisible(false);
            bNm.setVisible(false);
            search.setVisible(false);
            cost.setVisible(false);
            dump.setVisible(false);
            bm.setVisible(true);
            yrs.setVisible(true);
            money.setVisible(true);
            bndm.setVisible(true);
            year.setVisible(true);
            price.setVisible(true);
            reset.setVisible(true);
            Done.setVisible(false);
            fin.setVisible(true);
            tf.setVisible(true);
            seat.setVisible(true);
            tire.setVisible(true);
            numseat.setVisible(true);
            Terrain.setVisible(true);
            tBrand.setVisible(true);
            back.setVisible(true);
        }else if(e.getSource() == dump){
            String s = "";
            if(theCar.size() ==0) {
                commentTextArea.setText("No Vehicle exist");
            }else{
            for(int i = 0; i<theCar.size(); i++) {
                     s = s.concat(theCar.get(i).dataDump());
                   s = s.concat("\n");
                }
            //System.out.println(s);
            commentTextArea.setText(s);
            }
                
        }else if(e.getSource() == bNm){
            String s = "";
            for(int i = 0; i<theCar.size(); i++) {
                     s = s.concat("Brand: "+theCar.get(i).outbrand());
                     s = s.concat("\n");
                     s = s.concat("Model: "+theCar.get(i).outmod());
                   s = s.concat("\n");
                   s = s.concat("\n");
                }
            commentTextArea.setText(s);
            
                
        }else if(e.getSource() == cost){
            int avg = 0;
            if(theCar.size() ==0) {
                commentTextArea.setText("No Vehicle exist");
            }else{
            for(int i = 0; i<theCar.size(); i++) {
                    avg = theCar.get(i).outprice()+avg;
                }
            commentTextArea.setText("Average is $" +Integer.toString(avg/theCar.size()));
            }
                
        }else if(e.getSource() == Done){
            String check ="Yes";
            if(bm.getText().contains(" ")){
               String word[] = bm.getText().split("\\s+");
               yourcar.inbrand(word[0]);
               yourcar.inmod(word[1]);
            }else{
                bm.setText("");
                check = "no";
            }
            try {
                yourcar.checkYear(yrs.getText());
            } catch(Exception b) {
                yrs.setText("");
                check ="no";
            }
             
            try {
                yourcar.check(money.getText());
            } catch(Exception b) {
                money.setText("");
                check ="no";
            }
           
            if(check.equals("Yes")){
                key = yourcar.outbrand() + ", "+yourcar.outmod() + ", "+yourcar.outyear();
                key = key.toLowerCase();
                if(map.containsKey(key)){
                    System.out.println("duplication Found,input fails");
                    commentTextArea.setText("duplication Found,input fails\n Click reset to start again");
               }else{
                    map.put(key, yourcar);
                    theCar.add(yourcar);
                    nCar.setVisible(true);
                    nSuv.setVisible(true);
                    bNm.setVisible(true);
                    search.setVisible(true);
                    cost.setVisible(true);
                    dump.setVisible(true);
                    bm.setVisible(false);
                    yrs.setVisible(false);
                    money.setVisible(false);
                    bndm.setVisible(false);
                    year.setVisible(false);
                    price.setVisible(false);
                    reset.setVisible(false);
                    Done.setVisible(false);
                    tf.setVisible(false);
                    seat.setVisible(false);
                    tire.setVisible(false);
                    numseat.setVisible(false);
                    Terrain.setVisible(false);
                    tBrand.setVisible(false);
                    commentTextArea.setText("Input Success");
                }
            }
            
        }else if(e.getSource() == fin){
            String check ="Yes";
            if(bm.getText().contains(" ")){
               String word[] = bm.getText().split("\\s+");
               yoursuv.inbrand(word[0]);
               yoursuv.inmod(word[1]);
            }else{
                bm.setText("");
                check = "no";
            }
            try {
                yoursuv.checkYear(yrs.getText());
            } catch(Exception b) {
                yrs.setText("");
                check ="no";
            }
             
            try {
                yoursuv.check(money.getText());
            } catch(Exception b) {
                money.setText("");
                check ="no";
            }
            try{
                yoursuv.inSeats(Integer.parseInt(seat.getText()));
            } catch(Exception b){
                seat.setText("");
                check ="no";
            }
                if(tf.getText().equalsIgnoreCase("true")||tf.getText().equalsIgnoreCase("false")
                        ||tf.getText().equalsIgnoreCase("t")||tf.getText().equalsIgnoreCase("f")){
                yoursuv.tf(tf.getText());
                }else{
                    tf.setText("");
                    check ="no";
                }
                if(tire.getText().isEmpty()){
                    check ="no";
                }else{
                yoursuv.inTire(tire.getText());
                }
            if(check.equals("Yes")){
                key = yoursuv.outbrand() + ", "+yoursuv.outmod() + ", "+yoursuv.outyear();
                key = key.toLowerCase();
                if(map.containsKey(key)){
                    System.out.println("duplication Found,input fails");
                    commentTextArea.setText("duplication Found,input fails\n Click reset to start again");
               }else{
                    map.put(key, yoursuv);
                    theCar.add(yoursuv);
                    nCar.setVisible(true);
                    nSuv.setVisible(true);
                    bNm.setVisible(true);
                    search.setVisible(true);
                    cost.setVisible(true);
                    dump.setVisible(true);
                    bm.setVisible(false);
                    yrs.setVisible(false);
                    money.setVisible(false);
                    bndm.setVisible(false);
                    year.setVisible(false);
                    price.setVisible(false);
                    reset.setVisible(false);
                    Done.setVisible(false);
                    tf.setVisible(false);
                    seat.setVisible(false);
                    tire.setVisible(false);
                    numseat.setVisible(false);
                    Terrain.setVisible(false);
                    tBrand.setVisible(false); 
                    fin.setVisible(false); 
                    commentTextArea.setText("Input Success");
                }
            }
            
        }
        else if(e.getSource() == reset){
            seat.setText("");
            tf.setText("");
            tire.setText("");
            bm.setText("");
            yrs.setText("");
            money.setText(""); 
            input.setText("");
        }else if(e.getSource() == export){
            try{
                    PrintWriter fileWriter = new PrintWriter("output.txt","UTF-8");
                    for(int i=0;i<theCar.size();i++){
                        fileWriter.println(theCar.get(i).dataDump());
                    }
                    commentTextArea.setText("Output Success");
                    fileWriter.close();
                }       catch(Exception b){
                    commentTextArea.setText("Failed to write");
                    }
            
        }
        else if(e.getSource() == IO){
            nCar.setVisible(false);
            nSuv.setVisible(false);
            bNm.setVisible(false);
            search.setVisible(false);
            cost.setVisible(false);
            dump.setVisible(false);
            reset.setVisible(true);
            input.setVisible(true);
            ok.setVisible(true);
            in.setVisible(true);
            back.setVisible(true);
            fin.setVisible(false);
        }else if(e.getSource() == search){
            nCar.setVisible(false);
            nSuv.setVisible(false);
            bNm.setVisible(false);
            search.setVisible(false);
            cost.setVisible(false);
            dump.setVisible(false);
            reset.setVisible(true);
            input.setVisible(false);
            ok.setVisible(false);
            in.setVisible(false);
            back.setVisible(true);
            fin.setVisible(false);
            keySearch.setVisible(true);
            find.setVisible(true);
        }else if(e.getSource() == find){
            
            String s ="";
                keySearch.getText().toLowerCase();
                if (map.isEmpty()) {
                    commentTextArea.setText("no matched!");
                    System.out.println("no matched!");
                }else if(map.containsKey(keySearch.getText().toLowerCase())){
                    car c = map.get(keySearch.getText().toLowerCase());
                    s = c.dataDump();
                   commentTextArea.setText(s);
                }else{
                    commentTextArea.setText("no matched!");
                    System.out.println("no matched!");
                }
                
            //System.out.println(s);
            
            nCar.setVisible(true);
            nSuv.setVisible(true);
            bNm.setVisible(true);
            search.setVisible(true);
            cost.setVisible(true);
            dump.setVisible(true);
            reset.setVisible(false);
            input.setVisible(false);
            ok.setVisible(false);
            in.setVisible(false);
            back.setVisible(false);
            fin.setVisible(false);
            keySearch.setVisible(false);
            find.setVisible(false);
        }else if(e.getSource() == back){
            nCar.setVisible(true);
            nSuv.setVisible(true);
            bNm.setVisible(true);
            search.setVisible(true);
            cost.setVisible(true);
            dump.setVisible(true);
            input.setVisible(false);
            ok.setVisible(false);
            in.setVisible(false);
            reset.setVisible(false);
            bm.setVisible(false);
            yrs.setVisible(false);
            money.setVisible(false);
            bndm.setVisible(false);
            year.setVisible(false);
            price.setVisible(false);
            reset.setVisible(false);
            Done.setVisible(false);
            tf.setVisible(false);
            seat.setVisible(false);
            tire.setVisible(false);
            numseat.setVisible(false);
            Terrain.setVisible(false);
            tBrand.setVisible(false); 
            fin.setVisible(false);
            back.setVisible(false);
            keySearch.setVisible(false);
            find.setVisible(false);
            
        }else if(e.getSource() == ok){
            String[] item = new String[8];
                int k = 0;
                String yes = "ok";
                try{
                    File f = new File(input.getText());
                    Scanner scanner = new Scanner(f);
                    while(scanner.hasNextLine()) {
                         //System.out.println(scanner.nextLine());
                         item[k] = scanner.nextLine();
                         k++;
                        }
                    } catch(Exception b) {
                        System.out.println("Could not open file.");
                        input.setText("");
                        yes = "no";
                    }
                if(yes.equals("ok")) {
                for(int j = 0; j<k; j++) {
                    
                    if(item[j].contains(" ")){
                        String word[] = item[j].split("\\s+");
                            if(word[4].equals("0")) {
                                car cario = new car();
                                cario.inbrand(word[0]);
                                cario.inmod(word[1]);
                                 try {
                                    cario.checkYear((word[2]));

                                } catch(Exception b) {
                                    System.out.println(b);
                                    continue;
                                }
                                try {
                                    cario.check((word[3]));

                                } catch(Exception b) {
                                    System.out.println(b);
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
                                //numCar++;
                            }else{
                                suv s =new suv();
                                s.inbrand(word[0]);
                                s.inmod(word[1]);
                                 try {
                                    s.checkYear((word[2]));

                                } catch(Exception b) {
                                    System.out.println(e);
                                    continue;
                                }
                                 try {
                                    s.check((word[3]));

                                } catch(Exception b) {
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
                                //numCar++;
                            }
                            }
                    
                }
                
                 int s = theCar.size();
            commentTextArea.setText("Done");

           nCar.setVisible(true);
            nSuv.setVisible(true);
            bNm.setVisible(true);
            search.setVisible(true);
            cost.setVisible(true);
            dump.setVisible(true);
            input.setVisible(false);
            ok.setVisible(false);
            in.setVisible(false);
            reset.setVisible(false);
            back.setVisible(false);
                }
        }
        
    }
}
