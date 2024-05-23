package ErrorHandling;

public class Ass3ArrayIndexException {

	public static void main(String[] args) {

		int a[] = new int[5];
		try {
			a[5] = 7;

		} catch (ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
		}

	}

}
