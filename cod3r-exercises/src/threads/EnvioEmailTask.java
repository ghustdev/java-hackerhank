package threads;

public class EnvioEmailTask implements Runnable {
	@Override
	public void run() {
		System.out.println("Enviando e-mail pela thread: " + Thread.currentThread().getName());
	}
}
