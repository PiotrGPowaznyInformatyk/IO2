
public class BasicSandwich implements Sandwich {
	protected double cost = 2.00;

	@Override
	public String getDescription() {
		return "Two slices of bread";
	}

	@Override
	public double getCost() {
		return cost;
	}

}
