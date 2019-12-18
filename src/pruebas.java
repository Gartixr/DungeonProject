
public class pruebas {

	public static void main(String[] args) {


		int torn = 0;
		int combates = 0;
		int win= 0;
//				
//		System.out.println("Vida monstre: " + mob.getHp());
//        System.out.println("Vida heroi: " + hero.getHp());
	
        for (int i = 0; i < 100; i++) {

    		Hero hero = new Hero("Hero");
    		Mob mob = new Mob("Mob", 0);
				
		while (!hero.die(hero) && !mob.die(mob)) {
			if (torn % 2 == 0) {
				hero.attack(mob);

			} else {
				mob.attack(hero);

			}
			if(mob.die(mob)) {
				win++;
			}
			torn++;
		}
        }
        System.out.println("Partidas ganadas " + win);

	}

}
