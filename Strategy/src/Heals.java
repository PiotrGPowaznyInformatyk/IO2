public interface Heals {
	String heal();
}

class canHeal implements Heals{

	@Override
	public String heal() {
		return "heals";
	}
	
}

class canNotHeal implements Heals{

	@Override
	public String heal() {
		return "can not heal";
	}
	
}