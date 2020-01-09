import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProvesJUnit {

	@Test
	void test() {
//		Instanciem un Hero
		Hero hero = new Hero("Hero");
		assertTrue(hero.getAgility() > 2 & hero.getAgility() < 11);
		assertTrue(hero.getHp() > 7 & hero.getHp() < 21);
		assertTrue(hero.getInfluence() > 2 & hero.getInfluence() < 14);
		assertTrue(hero.getLore() > 2 & hero.getLore() < 14);
		assertTrue(hero.getObservation() > 2 & hero.getObservation() < 14);
		assertEquals("Hero", hero.getName());
	}

	@Test
	void test1() {
		Hero hero1 = new Hero("Hero1");
		Mob mob1 = new Mob("Mob1", 5);
		hero1.attack(mob1);
		assertTrue(hero1.getHp() > 0);
		mob1.attack(hero1);
		hero1.die(hero1);
		mob1.die(mob1);
	}

	@Test
	void test2() {
		fail("Not yet implemented");
	}

	@Test
	void test3() {
		fail("Not yet implemented");
	}

	@Test
	void test4() {
		fail("Not yet implemented");
	}
}
