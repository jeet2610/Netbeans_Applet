/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.applet.Applet;
import java.awt.*;
import java.util.Random;
/**
 *
 * @author jeet
 */
public class Prac3 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void paint(Graphics g) {
        Random rand = new Random();
        
        int x=10;
        for(int i =0;i<10;i++){
               int redValue = rand.nextInt(255);
    int greenValue = rand.nextInt(255);
    int blueValue = rand.nextInt(255);
   Color clr = new Color(redValue, greenValue, blueValue);
         //  g.drawOval(x,y=y+50,50,50);
           g.setColor(clr);
           g.fillRect(x = x+50, 100,50 , 80);
           
                   }
        
        //To change body of generated methods, choose Tools | Templates.
    }
}
