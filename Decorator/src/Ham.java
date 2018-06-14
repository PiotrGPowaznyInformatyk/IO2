
public class Ham extends SandwichDecorator{
	
	public Ham(Sandwich newSandwich) {
		super(newSandwich);
		
		cost=0.25;
	}
	
	public String getDescription() {
		return thisSandwich.getDescription() + ", ham";
	}
	public double getCost() {
		return thisSandwich.getCost() + cost;
	}
	
}
