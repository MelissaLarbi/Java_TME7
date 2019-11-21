package tme27;

public abstract class Robinet extends Reservoir {
	private static int nbServi = 0;

	public Robinet() {
		super(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
		double stat = Math.random();
		if (stat < 1 / 500) {
			RecuperationIngredientException e = new RecuperationIngredientException(
					"vérifiez que le robinet est bien ouvert");
		}
	}

}