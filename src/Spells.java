
public class Spells extends Item {
	private int basePower;
	private final int MAX_VALUE = 3;

	public Spells(int basePower) {
		this.basePower = (int) (Math.random() * MAX_VALUE + 1);
	}

	public int getBasePower() {
		return basePower;
	}

	public void setBasePower(int basePower) {
		this.basePower = basePower;
	}
}
