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
/*
<html>
<body>
<applet code="HelloWorld.class" width="300" hieght = "300">
<param name = "msg" value = "Welcome to Applet in Java">
</applet>
</body>
</html>
*/
public class HelloWorld extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }public void paint(Graphics g){
    g.drawString("Hello",100,100);
            }

    // TODO overwrite start(), stop() and destroy() methods
}

write an applet to perform addition of two numbers using param keyword.