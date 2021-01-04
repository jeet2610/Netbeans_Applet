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
public class GUI extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g)
    {
        
        g.draw3DRect(50, 50, 100, 100, true);
      
    }
    
    // TODO overwrite start(), stop() and destroy() methods
}
