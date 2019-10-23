/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetfinale_rpn;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author MAIGA
 */
public class OperationTest3 {
     @Test
    public void testEvalMoins() throws Exception 
    {
        System.out.println("Test fonction eval.Moins");
        double operande1 = -2;
        double operande2 = -2;
        Operation monOperation = Operation.MOINS;
        double resultat_attendue = 0;
        double result = monOperation.eval(operande1, operande2);
        assertEquals(resultat_attendue, result, 0);
        //assertEquals(expResult, result, result);
        
    }
    
}
