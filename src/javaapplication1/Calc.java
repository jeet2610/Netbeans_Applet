/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.awt.*;

/**
 *
 * @author jeet
 */
public class Calc {
    Calc(){
        BorderLayout b1l=new BorderLayout();
        Frame f=new Frame();
        TextField textline=new TextField("");
        Panel p=new Panel();
        Button b0=new Button("0");
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("4");
        Button b5=new Button("5");
        Button b6=new Button("6");
        Button b7=new Button("7");
        Button b8=new Button("8");
        Button b9=new Button("9");  
        Button b00=new Button("00");
        Button bdecimal=new Button(".");
        Button baddition=new Button("+");
        Button bsubtract=new Button("-");
        Button bmultiplication=new Button("x");
        Button bdivision=new Button("%");
        Button total = new Button("=");
        Button clr = new Button("Clear");
        f.setLayout(b1l);
        f.add(textline,"North");
        p.add(clr,"North");
        
        p.add(b0);
        p.add(b00);
        p.add(b9);
        p.add(b8);
        p.add(b7);
       
       
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bsubtract);        
        p.add(bmultiplication);

        
        p.add(bdecimal);
        p.add(baddition);
        p.add(bdivision);
        
        f.add(p,"Center");
        f.add(total,"South");
        p.setLayout(new GridLayout(6,3,2,2));
        f.setSize(200,300);
        f.setVisible(true);
       
    }
    public static void main(String args[]){
        new Calc();
    }
}



