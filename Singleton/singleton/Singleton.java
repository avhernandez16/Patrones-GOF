////la clase 
//Singleton tiene un constructor 
//privado para evitar que se creen 
//instancias de la clase desde 
//fuera de la misma. La única 
//forma de obtener una instancia 
//de la clase es a través del 
//método estático getInstance(), 
//que crea una única instancia de 
//la clase la primera vez que se 
//llama y la devuelve en 
//posteriores llamadas.

//crea un punto de acceso global a ella
package singleton;

public class Singleton {
	private static Singleton instance;
	
	private Singleton() {
		//constructor privado, no se pueden crear instancias desde afuera
	}

	public static Singleton getIntance() {
		if (instance == null) {
			instance = new Singleton();
			System.out.println("se creo una nueva instancia");
		}	
		
		return instance;
	}
	
	public void doSomething() {
		System.out.println("hacer algo");
	}
	

}
