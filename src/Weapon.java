public class Weapon extends Item {
	private int baseDmg;
	private final int MAX_VALUE = 3;

	public Weapon(int baseDmg) {
		this.baseDmg = (int) (Math.random() * MAX_VALUE + 1);
	}

	public int getBaseDmg() {
		return baseDmg;
	}

	public void setBaseDmg(int baseDmg) {
		this.baseDmg = baseDmg;
	}
}
