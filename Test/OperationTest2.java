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
public class OperationTest2 {
     @Test
    public void testEvalPlus() throws Exception 
    {
        System.out.println("Test fonction eval.PLUS");
        double operande1 = 4;
        double operande2 = -1;
        Operation monOperation = Operation.PLUS;
        double resultat_attendue = 3;
        double result = monOperation.eval(operande1, operande2);
        assertEquals(resultat_attendue, result, 3);
        //assertEquals(expResult, result, result);
        
    }
    
}
