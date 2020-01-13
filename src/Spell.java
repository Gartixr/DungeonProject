/**
 * Calsse que genera un encanteri
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
public class Spell extends Item {
	private int basePower;
	private final int MAX_VALUE = 3;

	/**
	 * Funcio que genera un encanteri
	 * 
	 * @param int Poder base
	 */
	public Spell(int basePower) {
		this.basePower = (int) (Math.random() * MAX_VALUE + 1);
	}

	/**
	 * Funció que retorna el poder base
	 * 
	 * @return int Poder base
	 */
	public int getBasePower() {
		return basePower;
	}

	/**
	 * Funció d'assignació del poder base
	 * 
	 * @param int Poder base
	 */
	public void setBasePower(int basePower) {
		this.basePower = basePower;
	}
}
