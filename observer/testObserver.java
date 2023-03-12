
//Define una dependencia de uno-a-muchos entre objetos, de forma que cuando un objeto cambia de estado se notifica y actualizan automáticamente todos los objetos.


public class testObserver {
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		
		ConcreteObserver observer1 = new ConcreteObserver(subject);
		ConcreteObserver observer2 = new ConcreteObserver(subject);
		//ConcreteObserver observer3 = new ConcreteObserver(subject);
		
		subject.setState(1);
		//subject.setState(2);
		//subject.setState(3);
		
		subject.removeObserver(observer2);
		
		subject.setState(4);
		
	}
}
