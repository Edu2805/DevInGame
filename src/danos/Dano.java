package danos;

import interfaces.Interfaces;

public class Dano implements Interfaces{

	private static int danoAoJogador = 100;
	private static String exibeStatusDano = "##########";

	public void exibeDano() {

		System.out.print("+++++++++++++++\n");
		System.out.print(" " + exibeStatusDano + " | " + danoAoJogador + "%\n");
		System.out.println("+++++++++++++++\n");

	}

	public void jogadorTomaDanoFlecha(boolean dano) {

		StringBuilder stringDano = new StringBuilder(exibeStatusDano);

		if (dano == true) {

			for (int i = stringDano.length() - 1; i >= 0;) {

				danoAoJogador -= 10;
				stringDano = stringDano.deleteCharAt(i);
				break;
			}
			System.out.print("+++++++++++++++\n");
			System.out.print(" " + stringDano + " | " + danoAoJogador + "%\n");
			System.out.println("+++++++++++++++\n");

		} else {
			danoAoJogador = 100;

		}

	}

	public void jogadorBebePocaoRecuperaDano(boolean recuperaDano) {

		StringBuilder stringDano = new StringBuilder(exibeStatusDano);

		if (recuperaDano == true) {

			for (int i = stringDano.length() - 1; i < stringDano.length();) {

				danoAoJogador += 10;
				stringDano = stringDano.deleteCharAt(i);
				break;
			}
			System.out.print("+++++++++++++++\n");
			System.out.print(" " + stringDano + " | " + danoAoJogador + "%\n");
			System.out.println("+++++++++++++++\n");

		} else {
			//danoAoJogador = 10;

		}

	}

	public int getDanoAoJogador() {
		return danoAoJogador;
	}

	public static String getExibeStatusDano() {
		return exibeStatusDano;
	}

	public static void setExibeStatusDano(String exibeStatusDano) {
		Dano.exibeStatusDano = exibeStatusDano;
	}

}
