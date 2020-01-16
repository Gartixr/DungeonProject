/**
 * Classe on generem el valor de les pocions 
 * 
 * @author Jonathan
 * @author Conrad
 * @author Adrian
 * @author Christian
 *
 */
public class Potion extends Item {
	private int baseHeal;
	private int baseSanity;
	final int MAX_VALUE = 2;
	
	/**
	 * Funció per generar les pocions 
	 *Pot generar una poció per recuperar salut o salut mental
	 * @param poti poció
	 */
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
	/**
	 * Funcio que retorna la curació base
	 * 
	 * @return baseHeal curació base
	 */
	public int getBaseHeal() {
		return baseHeal;
	}
	
	/**
	 * Funció que assigna la curació base
	 * 
	 * @param baseHeal assigna la curació base
	 */
	public void setBaseHeal(int baseHeal) {
		this.baseHeal = baseHeal;
	}

	/**
	 * Funció que retorna la salut mental base
	 * 
	 * @return baseSanity salut mental
	 */
	public int getBaseSanity() {
		return baseSanity;
	}
	
	/**
	 * Funció que assigna la salut mental base
	 * 
	 * @param baseSanity salut mental
	 */
	public void setBaseSanity(int baseSanity) {
		this.baseSanity = baseSanity;
	}
}