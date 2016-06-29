package priority;

public abstract class Letter {
	
	protected int number;
	protected int priority;
	
	public abstract void plus();

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
	
	
}
