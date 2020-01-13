/**
 * 
 * @author Jonatha
 * @author Conrad
 * @author Christian
 * @author Adrian
 *
 */

public class Armor extends Item {
	private int baseDafense;
	private final int MAX_VALUE = 3;
	
	/**
	 * Funcio per donar un valor de defensa a la armadura
	 * @param name nom de la armadura
	 * @param descrip descripcio de la armadura
	 */
	public Armor(String name, String descrip) {
		super.setName(name);
		super.setDescrip(descrip);
		this.baseDafense = (int) (Math.random() * MAX_VALUE + 1);
	}

	/**
	 * Funció que retorna la defensa de la armadura
	 * @return baseDafense defensa de la armadura
	 */
	public int getBaseDafense() {
		return baseDafense;
	}
	
	/**
	 * Funció que assigna la defensa a la armadura
	 * @param baseDafense defensa armadura
	 */
	public void setBaseDafense(int baseDafense) {
		this.baseDafense = baseDafense;
	}	
}
