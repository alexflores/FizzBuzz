package FizzBuzzTDD;

public class FizzBuzztdd {
  public String generar(int numero)
  {
	  if(numero%3==0)
	  {
		  return "Fizz";
	  }
	  if(numero%5==0)
	  {
		  return "Buzz";
	  }
	  return Integer.toString(numero);
  }
}
