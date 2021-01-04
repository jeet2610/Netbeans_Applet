/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author jeet
 */
public class Hello extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    String s = "Applet in";
    public void init() {
        // TODO start asynchronous download of heavy resources
        s = s + "init";
    }
    public void start(){
        s = s + "start";
    }
    
    public void paint(Graphics g){
        s = s + "paint";
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);
        g.drawString("Hello World "+ s, 100, 100);
    }

public void stop()
{
    
}
    // TODO overwrite start(), stop() and destroy() methods
}
