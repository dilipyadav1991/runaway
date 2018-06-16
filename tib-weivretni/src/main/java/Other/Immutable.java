package Other;

public class Immutable {
	private final int rollNum;

	public Immutable(int rollNum) {
		this.rollNum = rollNum;
	}

	public int getRollNum() {
		return rollNum;
	}

	public static void main(String[] args) {
		Immutable immutable = new Immutable(12);
		// immutable.rollNum = 10; //this line throws compiler error
	}
}
