/**
 * import textio package, TextIO class
 */
import textio.TextIO;

/**
 * @author Osman Sarper Kucuk
 *
 */
public class CS1103_Week1_ExerciseForJournal {

	/**
	 * Returns the larger of the two roots of the quadratic equation
	 * A*x*x + B*x + C = 0, provided it has any roots.  If A == 0 or
	 * if the discriminant, B*B - 4*A*C, is negative, then an exception
	 * of type IllegalArgumentException is thrown.
	 * 
	 * @param A, B, C
	 * @throws IllegalArgumentException
	 */
	static public double root( double A, double B, double C )
	                              throws IllegalArgumentException {
	    if (A == 0) {
	      throw new IllegalArgumentException("A can't be zero.");
	    }
	    else {
	       double disc = B*B - 4*A*C;
	       if (disc < 0)
	          throw new IllegalArgumentException("Discriminant (B*B - 4*A*C) < zero.");
	       return  (-B + Math.sqrt(disc)) / (2*A);
	    }
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Your program should allow the user to specify values for A, B, and C. --DONE
		
		double userInputA;
		double userInputB;
		double userInputC;
		String Answer;
		
		do {
		
		System.out.print("Specify value for A: ");
		userInputA = TextIO.getlnInt();
		
		System.out.print("Specify value for B: ");
		userInputB = TextIO.getlnInt();
		
		System.out.print("Specify value for C: ");
		userInputC = TextIO.getlnInt();
		System.out.println("");
		
		//It should call the subroutine to compute a solution of the equation. --DONE
		//If no error occurs, it should print the root. --OK
		//However, if an error occurs, your program should catch that error and print an error message.
		
		
		
		try {
			
			double root = root (userInputA, userInputB, userInputC);
			System.out.println("larger of the two roots of the quadratic equation: "+ root);
			
		}
		
		catch (IllegalArgumentException i) {
			
			System.out.println("ERROR MESSAGE: ONE OF THE PRECONDITIONS VIOLATED: \n" +"1- A can't be zero.\n"+ "2- Discriminant (B*B - 4*A*C) < zero.");
			
		}
		
		//After processing one equation, the program should ask whether the user wants to enter another equation.
		//The program should continue until the user answers no.
		
		System.out.println("");
		System.out.print("Do you want to enter another equation? type 'y' for yes 'n' for no: ");
		
		
		Answer = TextIO.getlnString();
		
		System.out.println("");
		
		}while (Answer.matches("Y|y"));
	
		
	}

}
