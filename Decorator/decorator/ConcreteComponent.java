package decorator;

public class ConcreteComponent implements Component {

	
	//La interfaz Component define la operación que se puede realizar sobre un objeto. La clase 
	//ConcreteComponent implementa la interfaz Component y proporciona la funcionalidad básica.
	@Override
	public void operation() {
		//realizo la operacion
		System.out.println("ConcreteComponent.operation()");
		
	}

}
