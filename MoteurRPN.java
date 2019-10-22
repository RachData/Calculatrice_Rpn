import Exceptions.*;

import java.util.Stack;

public class MoteurRPN 
{
	/**
	 * La Pile qui va stockée les operandes
	 */
    public Stack <Double> pile =new Stack<>();
    
    /**
     * Methode d'empilement des operandes
     * @param operande
     */
	public void enregistrer (double operande)
    {
        pile.push(operande);
    }
    
	/**
	 * Methode charger d'effectuer les calcules en fontion de l'operateur recu
	 * @param symbole : operateur saisie par l'utilisateur
	 * @return Renvoie le Resultat de l'operation
	 * @throws ClasseException : Exception qui gère la division par zero
	 * @throws PilevideException : Exception qui gère si la pile est vide
	 * @throws ManqueOperandeException : Exception qui gère le manque d'operande 
	 * pour effectuer l'operation
	 */
    public double apply  (char symbole) throws ClasseException, PilevideException,ManqueOperandeException
    //public void apply  (char symbole) throws ClasseException, PilevideException,ManqueOperandeException
     {
    	double a=0,b = 0;
    	try{
    		a= this.depiler();
        	b= this.depiler();
    	
			switch(symbole)
			 {
			    case '+': 
			        this.enregistrer(Operation.PLUS.eval(b, a));
			        return Operation.PLUS.eval(b, a);
			         
			    case '*':
			    	this.enregistrer(Operation.MULT.eval(b, a));
			    	return Operation.MULT.eval(b, a);
			         
			    case '-':
			    	this.enregistrer(Operation.MOINS.eval(b, a));
			    	return Operation.MOINS.eval(b, a);
			    
			    case '/':
			    	this.enregistrer(Operation.DIV.eval(b, a));
			    	return Operation.DIV.eval(b, a);
			 
			 }
		} catch (ClasseException e) {
	        this.enregistrer(e.vala());
	        this.enregistrer(0);
		}
    	catch( ManqueOperandeException e1 ){
    		this.enregistrer(a);
		};
         return 0;
     }

    public double depiler() throws PilevideException, ManqueOperandeException{
    	if(this.pile.isEmpty()){
    		throw new ManqueOperandeException() ;
    	}else{
    		return pile.pop();
    	}
	
    }
    

   
    
}

