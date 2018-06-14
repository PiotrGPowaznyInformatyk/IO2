
public class Human {
	//every human has it
	protected int weight, height;
	
	//some humans can heal
	public Heals healingType;

	
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if(weight > 0) {
			this.weight = weight;
		}else {
            System.out.println("Weight must be bigger than 0.");
		}
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if(height > 0) {
			this.height = height;
		}else {
            System.out.println("Height must be bigger than 0.");
		}
	}
	
	public void setHealingAbility(Heals healingType){
		this.healingType = healingType;
	}
	
	
	
	// Human class pushes the job to Heals class
	public String heal() {
		return healingType.heal();

	}
	


}
