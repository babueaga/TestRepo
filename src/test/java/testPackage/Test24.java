package testPackage;


public class Test24 {

	public static void main(String[] args) {
	
		
		String str = "I am a test#$5 engineer";
		StringBuilder build = new StringBuilder();
		char c;
		for(int i = str.length()-1; i >= 0; i--) {
			c=str.charAt(i);
			if(Character.isLowerCase(c)) {
				build.append(c);
				//System.out.print(c);
			}
		}
		System.out.println(build);
	}
}
