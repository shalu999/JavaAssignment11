package ErrorHandling;

public class Ass1AccessModifiers {
	public int variable=1;// public access Modifier
	

	public void mymethod() {
		System.out.println(variable);
	}
	
		public static void main(String[] args) {
			Ass1AccessModifiers sc=new Ass1AccessModifiers();
			sc.mymethod();
		
		}
	}


