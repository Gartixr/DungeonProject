
public class Potion extends Item {
	private int baseHeal;
	private int baseSanity;
	final int MAX_VALUE = 2;
	
	// 0 = Life 1 = Sanity
	public Potion(int poti) {
		switch (poti) {
		case 0:
			baseHeal = (int) (Math.random() * MAX_VALUE + 1);
			break;
		case 1:
			baseSanity = (int) (Math.random() * MAX_VALUE + 1);
			break;
		}
	}

	public int getBaseHeal() {
		return baseHeal;
	}

	public void setBaseHeal(int baseHeal) {
		this.baseHeal = baseHeal;
	}

	public int getBaseSanity() {
		return baseSanity;
	}

	public void setBaseSanity(int baseSanity) {
		this.baseSanity = baseSanity;
	}
}