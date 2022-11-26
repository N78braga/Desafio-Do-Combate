package com.desafioCombatePrincial;


import java.util.Locale;
import java.util.Scanner;

import com.desafioCombate.Champion;

public class ChampionPrincipal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantity = 0;

		System.out.println("Digite os dados do primeiro Campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();

		System.out.println("");
		System.out.println("Digite os dados do segundo Campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		String name1 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life1 = sc.nextInt();
		System.out.print("Ataque: ");
		int attack1 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor1 = sc.nextInt();

		Champion champion = new Champion(name, life, attack1, armor);
		Champion champion1 = new Champion(name1, life1, attack, armor1);

		System.out.println("");
		System.out.print("Quantos turnos você deseja executar: ");
		quantity = sc.nextInt();
		System.out.println("");

		for (int i = 0; i < quantity; i++) {
			System.out.println("Resultado do turno " + (i + 1) + ":");
			
			int game = champion.getLife();
			int game1 = champion1.getLife();
			
		
			
			int gameLife = 0;
			if(champion.getAttack() < champion1.getArmor() || champion1.getAttack() < champion.getArmor()) {
				if(attack < armor1) {
					life1 --;
					game1 = life1;
				}
				if(attack1 < armor) {
					life --;
					game = life;
					
				}
			}
			
			if(game <= gameLife || game1 <= gameLife) {
				if(game <= gameLife) {
					game = gameLife;
					quantity = game;
				}
				if(game1 <= gameLife) {
					game1 = gameLife;
					quantity = game1;
				}
			
			}
		
			System.out.println("O valor do game: " + champion.status(game));
			System.out.println("O valor do game: " + champion1.status(game1));
			System.out.println("");
			champion = new Champion(name, game, attack1, armor);
			champion1 = new Champion(name1, game1, attack, armor1);

		}

		sc.close();

	}

}
