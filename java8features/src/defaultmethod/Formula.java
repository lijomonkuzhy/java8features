package defaultmethod;

/**
 * Interface with default method sqrt.Java8 introduce the default interface
 * methods. Concrete classes only have to implement the abstract method.Default
 * methods will be inherited to implementation class, still you can override the
 * default method as required.
 */
public interface Formula {
	public double calculate(int num);

	default double sqrt(int num) {

		return Math.sqrt(num);
	}

}
