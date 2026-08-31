package designPatterns;

public class Main {
	public static void main(String[] args) {
		// Singleton
		SingletonLazy singleton = SingletonLazy.getInstancia();
		System.out.println(singleton.getClass());
		
		// bot - Strategy
		BotBehaviorStrategy normal = new NormalBehavior();
		BotBehaviorStrategy fast = new FastBehavior();
		Bot bot = new Bot();
		bot.setBotBehaviorStrategy(normal);
		bot.mover();
		bot.setBotBehaviorStrategy(fast);
		bot.mover();
	}
}
