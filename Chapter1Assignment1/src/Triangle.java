
public class Triangle {
	public static void main(String[] args) {
		String data = "T";
		int padding = 6;	
		
		// pyramid is seven levels tall, so we set the limit to 6 (count starts at 0)
		for (int i = 0; i < 7; i++) {
			System.out.println(" ".repeat(padding) + data);
			data += "TT"; // add two characters to data string
			padding -= 1; // reduce padding on left side of pyramid
		}
	}
}