//Proporciona una interfaz unificada para un conjunto de interfaces de un subsistema. Define una interfaz de alto nivel que hace que el subsistema se más fácil de usar.

package facade;

public class Facade {
	private Subsystem1 subsystem1;
	private Subsystem2 subsystem2;
	
	
	public Facade() {
		this.subsystem1 = new Subsystem1();
		this.subsystem2 = new Subsystem2();
	}
	
	public void operation() {
		subsystem1.operation1();
		subsystem2.operation2();
	}

}
