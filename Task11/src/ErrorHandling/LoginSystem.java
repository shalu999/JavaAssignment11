package ErrorHandling;

public class LoginSystem {

	public static void main(String[] args) {
		AuthService authService = new AuthService();
        String username = "user1";  // Username is not used in this simplified example
        String password = "123";  // This should be input from the user
        
        try {
            authService.login(username, password);
        } catch (IncorrectPasswordException e) {
            System.out.println(e.getMessage());
        }
    }





	}


