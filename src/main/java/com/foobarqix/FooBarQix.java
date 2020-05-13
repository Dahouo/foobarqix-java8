package com.foobarqix;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.*;
import static java.lang.Character.getNumericValue;


/**
 *
 * @author Arnaud Ahouo
 *
 */

public final class FooBarQix {
	/** Fixons le minimum */
	static final int MIN = 1;
	/** Fixons le maximum */
	static final int MAX = 100;

	/** Fixons les regles. */
	private static Map<Integer, String> RULES;

	Map<Integer, String> fooBarQix() {
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(3, "Foo");
		map.put(5, "Bar");
		map.put(7, "Qix");

		RULES = Collections.unmodifiableMap(map);

		return RULES;
	}

	/** Methode construction de la chaine de caractere .*/
	public String fooBarQix(int number) {
		Map<Integer, String> RULES = fooBarQix();

		String result = diviseur(number, RULES);
		String str = String.valueOf(number);
		result += contenu(RULES, str);
		return result.isEmpty() ? str : result;
	}

	// Regle de contenu
	private String contenu(Map<Integer, String> x, String str) {
		return str.chars()
			.mapToObj(c -> x.getOrDefault(getNumericValue(c), ""))
			.collect(Collectors.joining());
	}

	// Regle de divisibilite
	private String diviseur(int number, Map<Integer, String> y) {
		return y.keySet().stream()
			.filter(x -> number % x == 0)
			.map(y::get)
			.collect(Collectors.joining());
	}


	public static void main(String[] args) {
		FooBarQix tst = new FooBarQix();

		for (int i = FooBarQix.MIN; i <= FooBarQix.MAX; i++) {
			System.out.println(tst.fooBarQix(i).isEmpty()? String.valueOf(i) : tst.fooBarQix(i));
		}
	}
}

