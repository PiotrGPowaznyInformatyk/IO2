
public abstract class SandwichDecorator implements Sandwich{
	protected Sandwich thisSandwich;
	protected double cost;
	
	public SandwichDecorator(Sandwich newSandwich) {
		thisSandwich = newSandwich;
	}
	
	
	public String getDescription() {
		return thisSandwich.getDescription();
	}
	public double getCost() {
		return thisSandwich.getCost();
	}
}
