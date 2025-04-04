package case4.solution;

public class LegacySystemAuthenticator implements PasswordAuthenticator {
    @Override
    public void authenticateWithPassword(String username, String password) {
        System.out.println("Autenticando com usuário e senha.");
    }
}