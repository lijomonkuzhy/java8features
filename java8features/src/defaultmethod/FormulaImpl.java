package defaultmethod;

/**
 * Implementation class for Formul Interface.No need to override the default
 * methods.
 */
public class FormulaImpl implements Formula {

	public static void main(String[] args) {
		int num = 10;
		System.out.println("Sqr using sqr(): " + new FormulaImpl().sqrt(num));
		System.out.println("Sqr using calculate(): "
				+ new FormulaImpl().calculate(num));

	}

	@Override
	public double calculate(int num) {
		// TODO Auto-generated method stub
		return num * num;
	}

	//You can also override the default method
	@Override
	public double sqrt(int num) {

		return num * num * num;
	}

}
