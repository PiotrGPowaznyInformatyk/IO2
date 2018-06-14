
public class Main {

	public static void main(String[] args) {
		Sandwich kanapeczka = new Ham(new Gouda(new BasicSandwich()));
		Sandwich kanapeczkaDruga = new Ham(new BasicSandwich());
		System.out.println(kanapeczka.getDescription());
		System.out.println(kanapeczka.getCost());
		System.out.println(kanapeczkaDruga.getDescription());
		System.out.println(kanapeczkaDruga.getCost());
	}

}
