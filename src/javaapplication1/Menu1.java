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
public class Menu1 {
    Menu1(){
        Frame F = new Frame();
        MenuBar mb = new MenuBar();
        Menu m = new Menu("File");
        MenuItem m1 = new MenuItem("New Project");
        m.add(m1);
        mb.add(m);
        F.setMenuBar(mb);
        F.setLayout(null);
        F.setSize(100,100);
        F.setVisible(true);
        
        
    }
    public static void main(String args[]){
        new Menu1();
    }
}
