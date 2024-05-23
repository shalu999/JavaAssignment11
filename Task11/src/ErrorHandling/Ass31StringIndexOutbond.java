package ErrorHandling;

public class Ass31StringIndexOutbond {

	public static void main(String[] args) {
		String str = "welcome";
		try {
			System.out.println(str.charAt(7));
		} catch (StringIndexOutOfBoundsException aw) {
			aw.printStackTrace();

		}
	}

}
