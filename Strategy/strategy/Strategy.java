//Define una familia de algoritmos, encapsula uno de ellos y los hace intercambiables. Permite que un algoritmo varíe independientemente de los clientes que lo usan.

package strategy;

public interface Strategy {
	void execute(int a, int b);

}
