import java.util.ArrayList;

public class MotherDuck implements Subject{
	private ArrayList<Observer> observers;

	private boolean walkingStatus;
	
	public MotherDuck() {
		observers = new ArrayList<Observer>();
		walkingStatus=false;
	}

	
	@Override
	public void register(Observer o) {
		observers.add(o);
	}

	@Override
	public void unregister(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		  for(Observer observer : observers){
			  observer.update(walkingStatus);
		  }
	}
	
	
	public void walk() {
		System.out.println("Mother starts to walk.");
		walkingStatus=true;
		notifyObserver();
	}
	public void stop() {
		System.out.println("Mother stops walking.");
		walkingStatus=false;
		notifyObserver();
	}
	
	
	
	
	
	public ArrayList<Observer> getObservers() {
		return observers;
	}


	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}


	public boolean isWalkingStatus() {
		return walkingStatus;
	}


	public void setWalkingStatus(boolean walkingStatus) {
		this.walkingStatus = walkingStatus;
	}
}
