package strategy;

public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		
		this.strategy = strategy;
	}
	
	//este metodo lo usa para enviar todo lo que este rotulado o implemente strategy
	public void executeStrategy(int a, int b) {
		strategy.execute(a, b);
	}

}
