package com.classofmay;

public class Champions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] states = new String[3][2];
		states[0][0] = "Clifornia";
		states[0][1] = "Sacramento";
		states[1][0] = "Oregon";
		states[1][1] = "Salem";
		states[2][0] = "Washington";
		states[2][1] = "Olympia";

		for (int i = 0; i < states.length; i++) {

			StringBuilder sb = new StringBuilder();

			sb.append("The capitol of ").append(states[2][0]) // 00
					.append(" is ").append(states[2][1]) // 01
					.append(".");

			System.out.println(sb);

		}

	}
}
