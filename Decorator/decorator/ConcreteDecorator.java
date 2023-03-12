package decorator;

public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	public void operation() {
		//llama a la operacion que se esta ejecutando en la clase Decorator osea la ConcreteComponent
		super.operation();
		System.out.println("concreteDecorator.operation()");
	}
	
}
