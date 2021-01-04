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
public class NewApplet1 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init()
    {
        
        super.init();
        setSize(400,400);
    }
    
    public void paint(Graphics s)
    {
     s.drawOval(50, 50, 200, 200);
     s.drawString("JEET", 140, 150);
     s.setColor(Color.red);
    }

    // TODO overwrite start(), stop() and destroy() methods
}

