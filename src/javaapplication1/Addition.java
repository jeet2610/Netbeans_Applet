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
/*<html>
<body>
<applet code="Addtion">
<param name="number1" value="1">
<param name="number2" value="2">
</applet>
</body>
</html>
*/
public class Addition extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g){
        
        int number1 = Integer.parseInt(getParameter("number1"));
        int number2 = Integer.parseInt(getParameter("number2"));
        int sum = number1 + number2;
        g.drawString("Additon = "+ sum,100,100);
    }

    // TODO overwrite start(), stop() and destroy() methods
}
//Write an applet program to check given number is odd or even using param keyword