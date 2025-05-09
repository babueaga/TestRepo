package Test.Project1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
 public static void main(String args[]) {
	 
	 String name = "18";
	 int age = 13;
	 int convertedInt = Integer.valueOf(name);
	 System.out.println(convertedInt);
	 
	 String convertedString = String.valueOf(age);
	 System.out.println(convertedString);
	 
 }
}
