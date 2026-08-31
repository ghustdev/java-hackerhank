package designPatterns;

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	// Versão Eager
	// private static SingletonLazy instancia = new SingletonLazy();
	
	// Versão Holder
//	private static class InstanceHolder {
//		public static SingletonLazy instancia = new SingletonLazy();
//	}
	
	private SingletonLazy() {
		super();
	};
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
