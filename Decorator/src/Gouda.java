
public class Gouda extends SandwichDecorator{
	
	public Gouda(Sandwich newSandwich) {
		super(newSandwich);
		
		cost=0.15;
	}
	
	public String getDescription() {
		return thisSandwich.getDescription() + ", gouda";
	}
	public double getCost() {
		return thisSandwich.getCost() + cost;
	}
	
}
