//// Decorador es un patrón de diseño estructural 
//que permite añadir funcionalidades a un objeto 
//dinámicamente sin cambiar su estructura básica.

package decorator;

public abstract class Decorator implements Component{
	//como es abstracta no esta obligada a sobreescribir el metodo
	
	protected Component component;
	
	//constructor con el componente, obliga a crear un constructor
	public Decorator(Component component) {
		this.component = component;
	}
	
	public void operation() {
		//llama a la clase que este implementado el metodo osea ConcreteComponent
		component.operation();
	}
}
