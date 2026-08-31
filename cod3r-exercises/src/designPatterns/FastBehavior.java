package designPatterns;

public class FastBehavior implements BotBehaviorStrategy {
	@Override
	public void mover() {
		System.out.println("Movimento rapido");
	}
}
