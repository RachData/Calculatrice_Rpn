/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetfinale_rpn;

import java.util.Stack;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author MAIGA
 */
public class TestPile 
 {
    @Test
        public void depiler() throws PilevideException, ManqueOperandeException{
        Stack <Double>pile =new Stack<>();
        //1er scenario la pile est vide et on depile deux fois de suite
        try {
            double a=pile.pop();
            double b=pile.pop();
            //Assert.assertNull("Depilement impossible", a);
        } catch (Exception e) 
        {
            System.err.println("Test echoue pile vide cas 1");
            
        }
             
        //2er scenario la pile contient un element et on depile deux fois de suite
        try {
            pile.push(4.0);
            double a1=pile.pop();
            double b1=pile.pop();
            // Assert.assertNull("Depilement impossible", b1);
        } catch (Exception e)          
        {
            System.err.println("Test echoue pile vide cas 2");
        }  
}
}
