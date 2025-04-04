package case4.solution;

public class WebSystemAuthenticator implements PasswordAuthenticator, TokenAuthenticator {
    @Override
    public void authenticateWithPassword(String username, String password) {
        System.out.println("Autenticando com usuário e senha.");
    }

    @Override
    public void authenticateWithToken(String token) {
        System.out.println("Autenticando com token.");
    }
}