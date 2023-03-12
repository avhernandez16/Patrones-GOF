import java.util.*;

public class ConcreteSubject implements Subject{
	
	private List<Observer> observers = new ArrayList<>();
	private int state;	
	
	//recibe el estado y llama al metodo que notifica a todos los observer
	public void setState(int state) {
		this.state = state;
		notifyObservers();
	}	

	public int getState() {
		return state;
	}



	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}
	
	
	//notifica a todos los observadores
	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update();
		}
		
	}

}
