import Exceptions.*;

public class Calculatrice_Rpn {

	public static void main(String[] args) throws PilevideException,ManqueOperandeException {
		// TODO Auto-generated method stub
		SaisieRPN cal = new SaisieRPN();
		try{
			cal.reception();
		}catch(Exception e){
			
		}
		
		System.out.println("FIN");
		
	}

}
