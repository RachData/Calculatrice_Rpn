/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetfinale_rpn;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author MAIGA
 */
public class TestParse {
    
    @Test
    	public void Testverifisaisie() throws Exception
        {
            try 
            {
                String val="4";
                double test=Double.parseDouble(val);			   
                Assert.assertNotSame("Le parse marche en merveille",test,4); 
            } catch (Exception e) 
            {
                System.out.println("exception gerer");
            }
           	                
	}    
}
