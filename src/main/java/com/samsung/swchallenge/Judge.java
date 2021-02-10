package com.samsung.swchallenge;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Judge {

	static public void run(GRS solution) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		char[] value = new char[78];
		char[] position = new char[78];
		StringBuilder sb = new StringBuilder(16384 * 80 + 100);
		for (int tc=1; tc<=TC; ++tc) {
			String svalue = sc.next();
			value[svalue.length()] = 0;
			for (int i=0; i<svalue.length(); ++i) {
				value[i] = svalue.charAt(i);
			}
			solution.getPosition(value, position);
			for (int i=0; i<78; ++i) {
				if (position[i] == 0) break;
				sb.append(position[i]);
			}
			sb.append('\n');
		}
		System.out.print(sb.toString());
	}
}
