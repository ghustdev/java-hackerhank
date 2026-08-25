package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutor {
	public static void main(String[] args) {
		// Cria um pool com apenas 10 threads do SO que serão reutilizadas
		ExecutorService pool = Executors.newFixedThreadPool(10);
		
		// Envia as 10.000 tarefas para a fila do pool
		for (int i = 0; i < 10; i++) {
			pool.execute(new EnvioEmailTask());
		}
		
		// Fecha o pool após processar tudo
		pool.shutdown();
	}
}