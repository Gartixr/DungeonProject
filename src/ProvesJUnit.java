import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProvesJUnit {

	@Test
	void test() {
		Hero hero = new Hero("Hero");
		System.out.println("Hero nom : "+ hero.getName());
		System.out.println("Hero hp : "+ hero.getHp());
	}
	
	@Test
	void test1() {
		Hero hero1 = new Hero("Hero1");
		System.out.println("Hero1 loot : "+ hero1.loot().getName());
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
