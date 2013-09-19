package FizzBuzzTest;

import static org.junit.Assert.*;

import org.junit.Test;

import FizzBuzzTDD.FizzBuzztdd;

public class TestFizzBuzz {

	@Test
	public void imprimeFizzParaNumero3() {
		FizzBuzztdd fb = new FizzBuzztdd();
		assertEquals("Fizz",fb.generar(3));
	}

}
