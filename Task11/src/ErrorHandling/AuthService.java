package ErrorHandling;

public class AuthService {
	//public class Authenticate {
    // Dummy method to validate user credentials
    public void login(String username, String password) throws IncorrectPasswordException {
        // For simplicity, assume this is the correct password for the user
        String correctPassword = "correctpassword";
        
        if (!correctPassword.equals(password)) {
            throw new IncorrectPasswordException("The password you entered is incorrect.");
        }
        
        // Proceed with login if password is correct
        System.out.println("Login successful!");
    }
}


