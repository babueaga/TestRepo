package Test.Project1;

import java.io.IOException;

public class Except {

	public static void main(String[] args) throws IOException {

		try {
			throw new IOException();

		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}finally {
			System.out.println("I'm in finally");
		}
	}
}
