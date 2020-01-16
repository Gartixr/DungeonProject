/**
 * Classe que genera una arma
 * 
 * @author Krull Van-Thack
 * 
 * @author Conrad Grau
 * @author Jonathan Sanchez
 * @author Adria Dumitrica
 * @author Cristian Rigau
 * 
 * @version 0.1
 *
 */
public class Weapon extends Item {
	private int baseDmg;
	private final int MAX_VALUE = 3;

	public Weapon(int baseDmg) {
		this.baseDmg = (int) (Math.random() * MAX_VALUE + 1);
	}

	public int getBaseDmg() {
		return baseDmg;
	}


	/**
	 * Funcio d'assignacio de dany base
	 * 
	 * @param int Dany base
	 */


	public void setBaseDmg(int baseDmg) {
		this.baseDmg = baseDmg;
	}
}