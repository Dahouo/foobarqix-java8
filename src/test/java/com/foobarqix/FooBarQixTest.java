
package com.foobarqix;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


/**
 * @author Arnaud Ahouo
 *
 */


@RunWith(Parameterized.class)
public class FooBarQixTest {
	@Parameters
	public static Collection<Object[]> getParams() {
		return Arrays.asList(new Object[][]{

			// Doit afficher le nombre par defaut
			{1, "1"},
			{92, "92"},

			// Doit afficher Foo ou Bar Qix base sur diviseur()
			{6, "Foo"},
			{9, "Foo"},
			{10, "Bar"},
			{20, "Bar"},
			{14, "Qix"},
			{28, "Qix"},

			// Doit afficher Foo ou Bar ou Qix base sur contenu()
			{23, "Foo"},
			{31, "Foo"},
			{52, "Bar"},
			{58, "Bar"},
			{17, "Qix"},
			{71, "Qix"},

			// Doit afficher une combinaison de texte base sur contenu()
			{352, "FooBar"},
			{3571, "FooBarQix"},

			// Doit afficher du texte de facon repetitive base sur contenu()
			{331, "FooFoo"},

			// Doit afficher un texte combin� de diviseur() et contenu()
			{15, "FooBarBar"},
			{35, "BarQixFooBar"},

			// Doit conserver l ordre de contenu
			{352, "FooBar"},
			{53, "BarFoo"},

			// Doit respecter les regles complementaires()
			{13, "Foo"},
			{15, "FooBarBar"},
			{21, "FooQix"},
			{33, "FooFooFoo"},
			{51, "FooBar"},
			{53, "BarFoo"}
		});
	}

	private FooBarQix testCase;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		testCase = new FooBarQix();
	}

	// parameters
	private int number;
	private String expected;

	public FooBarQixTest(int number, String expected) {
		this.number = number;
		this.expected = expected;
	}

	/**
	 * Test method for {@link FooBarQix#fooBarQix(int)}.
	 */
	@Test
	public void testFooBarQix() {
		String result = testCase.fooBarQix(number);
		assertEquals(expected, (result));

	}
}
