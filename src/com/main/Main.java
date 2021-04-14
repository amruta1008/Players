package com.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<String, String[]> map = new HashMap<String, String[]>();
		Scanner sc = new Scanner(System.in);
		gh: while (true) {
			System.out.println("enter the player name");
			String Pname = sc.nextLine();
			System.out.println("enter the wickets seperated by |");
			String str1 = sc.nextLine();
			String[] strar = str1.split("\\|");
			map.put(Pname, strar);
			System.out.println("Do you want to add another player(yes/no)");
			String anPlayer = sc.nextLine();
			if (anPlayer.equals("yes"))
				continue;
			else if (anPlayer.equals("no"))

				break gh;
		}

		fh: while (true) {
			System.out.println("enter the players to search");
			String str = sc.nextLine();
			if (map.containsKey(str)) {
				System.out.println("Player name:" + str);
				String[] strarr = map.get(str);
				System.out.println("Wickets:");
				for (String str1 : strarr)
					System.out.println(str1);
			} else {
				System.out.println("NO players found");
			}
			System.out.println("Do You want to search for annother player(Yes/No)");
			String anPlayer = sc.nextLine();
			if (anPlayer.equals("yes"))
				continue;
			else if (anPlayer.equals("no"))

				break fh;
		}

	}
}
