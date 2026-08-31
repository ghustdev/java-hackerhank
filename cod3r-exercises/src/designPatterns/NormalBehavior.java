package designPatterns;

public class NormalBehavior implements BotBehaviorStrategy{
	@Override
	public void mover() {
		System.out.println("Movimento normal");
	}
}
