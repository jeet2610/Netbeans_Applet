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

</applet>
</body>
</html>
*/
public class NewApplet2 extends Applet {

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
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        int number1 = Integer.parseInt(getParameter("number1"));
        if(number1 % 2==0){
           g.drawString("Even",100,100);
        }
        else{
            g.drawString("Odd",100,100);
        }
    }
}
