package designPatterns;

public class Bot {
	private BotBehaviorStrategy botBehaviorStrategy;
	
	public void setBotBehaviorStrategy(BotBehaviorStrategy botBehaviorStrategy) {
		this.botBehaviorStrategy = botBehaviorStrategy;
	}
	
	public void mover() {
		botBehaviorStrategy.mover();
	}
}
