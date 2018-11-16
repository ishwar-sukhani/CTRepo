package exceptions;

public class LowBalException extends Exception

{
  public String toString()
  {
	  return "hello!! less than 1000 is not allowed";
  }
}
