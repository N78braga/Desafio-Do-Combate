package com.desafioCombate;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;

	public Champion() {

	}

	public Champion(String name, int life, int damage, int armor) {
		this.name = name;
		this.life = life;
		this.armor = armor;
		takeDamage(damage);
	}

	public String getName() {
		return name;
	}

	public int getLife() {
		return life;
	}

	public int getAttack() {
		return attack;
	}

	public int getArmor() {
		return armor;
	}

	public void takeDamage(int damage) {
		this.life = life - (damage - armor);

	}

	public String status(int game) {

		return 
				(game == 0)?(name + ": " + game + " de Vida (Morreu)"):(name + ": " + game + " de Vida");
				

	}

}
