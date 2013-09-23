package FizzBuzzTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import FizzBuzzTDD.FizzBuzztdd;

public class TestFizzBuzz {
	private FizzBuzztdd fb;
	
	@Before
	public void setup() {
		fb = new FizzBuzztdd();
	}
	
	@Test
	public void generaFizzSiNumeroEs3() {
		assertEquals("Fizz",fb.generar(3));
	}
	
	@Test
	public void generaElMismoNumeroSiNoEs3()
	{
		assertEquals("4",fb.generar(4));
	}

}
