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
public class CheckBoxGroup {
    CheckboxGroup(){
        
        Frame f = new Frame();
        CheckBoxGroup g1 = new CheckBoxGroup();
        CheckBox cb1 = new Checkbox("I agree",g1, true);
        CheckBox cb2 = new CheckBox("I disagree",g1,false);
        cb1.setBounds(100, 100, 100, 100);
        cb2.setBounds(100, 100, 100, 100);
        f.add(cb1);
        f.add(cb2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new CheckBoxGroup();
    }
}
