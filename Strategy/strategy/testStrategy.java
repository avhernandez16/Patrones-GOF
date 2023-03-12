//el patrón Strategy permite que un objeto tenga uno de varios algoritmos diferentes encapsulados y se puede 
//cambiar dinámicamente en tiempo de ejecución. En este ejemplo, el objeto Context tiene una estrategia diferente 
//que se proporciona en tiempo de ejecución para realizar la operación deseada en dos valores enteros
package strategy;

public class testStrategy {
	public static void main(String[] args) {
		//le paso por parametros que metodo deseo ejecutar
		Context context = new Context(new Add());
		context.executeStrategy(5, 3);
		
		context = new Context(new Subtract());
		context.executeStrategy(5, 3);
	}
}
