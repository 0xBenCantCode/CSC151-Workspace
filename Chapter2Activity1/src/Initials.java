
public class Initials {
	public static void main(String args[]) {
		char init1 = 'B';
		char init2 = 'A';
		char init3 = 'C';
		
		char seperator = '.';
		
		String initials = new StringBuilder()
				.append(init1)
				.append(seperator)
				.append(init2)
				.append(seperator)
				.append(init3)
				.toString();
		
		System.out.println(initials);
	}
}
