
public class Triangle {
	public static void main(String[] args) {
		String data = "T";
		int levels = 7;
		int padding = levels-1;	
		
		// pyramid is seven levels tall
		for (int i = 0; i < levels; i++) {
			System.out.println(" ".repeat(padding) + data);
			data += "TT"; // add two characters to data string
			padding -= 1; // reduce padding on left side of pyramid
		}
	}
}