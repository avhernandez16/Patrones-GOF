//En este ejemplo, el cliente utiliza la clase Facade para realizar una 
//operación en el sistema complejo, sin necesidad de conocer los detalles de 
//las clases que forman parte del sistema.

package facade;

public class Client {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.operation();
	}
}
