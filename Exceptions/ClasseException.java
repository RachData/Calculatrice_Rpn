package Exceptions;

public class ClasseException extends Exception {
	private double a;
	public ClasseException(double va){
		a=va;
		System.out.println("Division par zero impossible");
		}
	public double vala(){
		return a;
	}
}
