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
public class checkbox {
    checkbox(){
    Frame f = new Frame();
    Checkbox cb1 = new Checkbox("I agree",true);
    cb1.setBounds(100,100,100,50);
    f.add(cb1);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
}
    public static void main(String args[]){
    new checkbox();
    }
}
