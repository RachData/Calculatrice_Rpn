
public enum Operation {
	
	/**
	 * Les differents contantes pour les calculs
	 */
	PLUS('+') {
		@Override
		public double eval(double operande1, double operande2) {
			
			return operande1+operande2;
		}
	},
	MOINS('-') {
		@Override
		public double eval(double operande1, double operande2) {

			return operande1-operande2;
		}
	},
	MULT('*') {
		@Override
		public double eval(double operande1, double operande2) {

			return operande1*operande2;
		}
	},
	DIV('/')  {
		@Override
		public double eval(double operande1, double operande2) throws ClasseException {
			if(operande2==0){
				throw new ClasseException(operande1);
			}
			return operande1/operande2;
		}
	};
	
	/**
	 * Le symbole de l'operation
	 */
	private char symbole;
	/**
	 * Initiale la classe
	 * @param opera le symbole de l�op�ration
	 */
	Operation(char sym){
		this.symbole=sym;
	}
	/**
	 * Renvoie le resultat de l'evaluation de l'operation sur deux operandes
	 * 
	 * @return le resultat
	 */
	abstract double eval(double operande1, double operande2) throws ClasseException;
	
	
	

}
