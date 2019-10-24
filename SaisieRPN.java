import java.util.Scanner;

public class SaisieRPN {
	/**
	 * rep: variable de saisie
	 * Moteur: instance du Moteur RPN
	 * saisie: saisie de l'utilisateur
	 */
	private Scanner rep=new Scanner(System.in);
	private MoteurRPN Moteur=new MoteurRPN();
	private String saisie=new String();
	
	/**
	 * Fonction d'interaction avec l'utilisateur et qui invoque le Moteur RPN
	 * @throws ClasseException : Exception qui g�re la division par zero
	 * @throws PilevideException : Exception qui g�re la pilevide
	 * @throws ManqueOperandeException : Exception qui g�re le manque 
	 * d'oprande pour effectuer un calcul
	 */
	public void reception() throws ClasseException,PilevideException,ManqueOperandeException
	{
		System.out.println("L'expression courante est: ");
		do{
			this.saisie=rep.nextLine();
			if(!this.saisie.equals("exit")){
					UseMoteur();
			}
		}while(!this.saisie.equals("exit"));
		
	}
	
	/**
	 * Fonction qui permet de verifier si utilisateur a saisie une operande ou un operateur
	 * et renvoi un booleen
	 * @param val : valeur saisie par utilisateur
	 * @return Renvoi Vrai si c'est une operande et Faux si non
	 */
	private boolean verifisaisie(String val){
		try{
			double test=Double.parseDouble(val);
		}
		catch(Exception e)
		{
			return false;
		} 
		return true;
		
	}
	
	/**
	 * Methode qui s'ocuppe des operations necessaire en fonction de la saisie de l'utilisateur
	 * @throws ClasseException : Exception qui g�re la division par zero
	 * @throws PilevideException
	 * @throws ManqueOperandeException : Exception qui g�re le manque
	 * d'oprande pour effectuer un calcul
	 */
	private void UseMoteur() throws ClasseException,PilevideException,ManqueOperandeException{
		if(verifisaisie(this.saisie)==false){
			try {
					if(this.saisie.equals("+")||this.saisie.equals("-")||this.saisie.equals("*")||this.saisie.equals("/")){
						Moteur.apply(this.saisie.charAt(0));
						affichage(this.saisie);
					}else{
						System.out.println("Erreur de saisie ");
					}
				} catch (Exception e) {
				
				}
		}else{
			Moteur.enregistrer(Double.parseDouble(saisie));
			affichage(this.saisie);
		}
		
	}
	
	/**
	 * Methode qui permet d'afficher l'expression courante
	 * @param saisi : operande saisie par utilisateur
	 */
    public void affichage(String saisi){
    	System.out.print("L'expression courante est:\t");
    	if(!Moteur.pile.isEmpty())
    		for(int i=0;i< Moteur.pile.size();i++){
    			System.out.print(Moteur.pile.elementAt(i)+"\t");
    		}
    }	

}
