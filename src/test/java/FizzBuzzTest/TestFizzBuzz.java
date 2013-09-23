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
	
	@Test
	public void generaFizzSiEsMultiploDe3()
	{
		assertEquals("Fizz",fb.generar(6));
	}
	
	@Test 
	public void generaBuzzSiNumero5(){
		assertEquals("Buzz",fb.generar(5));
	}
	
	@Test
	public void generaBuzzSiEsMultiplo5(){
		assertEquals("Buzz",fb.generar(10));
	}
	
	@Test
	public void generaFizzBuzzPara15(){
		assertEquals("FizzBuzz",fb.generar(15));
	}
	
	@Test
	public void generaFizzBuzzParaMultiploDe3y5(){
		assertEquals("FizzBuzz",fb.generar(30));
		assertEquals("FizzBuzz", fb.generar(60));
	}
	
	@Test
	public void generaElNumeroSiNoEsMultiploDe3Ni5(){
		assertEquals("7", fb.generar(7));
		assertEquals("8", fb.generar(8));
	}

}
