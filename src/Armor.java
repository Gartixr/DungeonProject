
public class Armor extends Item {
	private int baseDafense;
	private final int MAX_VALUE = 3;
	
	public Armor(String name, String descrip) {
		this.baseDafense = (int) (Math.random() * MAX_VALUE + 1);
	}

	public int getBaseDafense() {
		return baseDafense;
	}

	public void setBaseDafense(int baseDafense) {
		this.baseDafense = baseDafense;
	}	
}
